package dk.sdu.bdd.xtext.web.services;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.web.server.IServiceContext;
import org.eclipse.xtext.web.server.InvalidRequestException;
import org.eclipse.xtext.web.server.XtextServiceDispatcher;
import org.eclipse.xtext.web.server.model.IWebResourceSetProvider;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;

import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;

import dk.sdu.bdd.xtext.services.BddDslGrammarAccess;

import dk.sdu.bdd.xtext.web.services.blockly.blocks.Block;
import dk.sdu.bdd.xtext.web.services.blockly.blocks.BlockFeatures;
import dk.sdu.bdd.xtext.web.services.blockly.blocks.BlockFeatures.StatementTypes;
import dk.sdu.bdd.xtext.web.services.blockly.blocks.arguments.Argument;
import dk.sdu.bdd.xtext.web.services.blockly.blocks.arguments.Fields.FieldDropdown;
import dk.sdu.bdd.xtext.web.services.blockly.blocks.arguments.Inputs.InputArgument;
import dk.sdu.bdd.xtext.web.services.blockly.blocks.arguments.Inputs.InputStatement;
import dk.sdu.bdd.xtext.web.services.blockly.blocks.arguments.Inputs.InputValue;
import dk.sdu.bdd.xtext.web.services.blockly.toolbox.Category;
import dk.sdu.bdd.xtext.web.services.blockly.toolbox.CategoryItem;
import dk.sdu.bdd.xtext.web.services.blockly.toolbox.CategoryToolBox;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Inject;

public class AstServiceDispatcher extends XtextServiceDispatcher {
	@Inject
	private IWebResourceSetProvider resourceSetProvider;
	
	@Inject
	private BddDslGrammarAccess grammarAccess;
	
	private BlockFeatures blockFeatures;
	private CategoryToolBox toolBox;
	private ArrayList<Block> blockArray;
	
	@Override
	protected ServiceDescriptor createServiceDescriptor(String serviceType, IServiceContext context){
		if (serviceType != null) {
			switch (serviceType) {
				case "ast":
					return getAstService(context);
				case "blocks":
					return getBlocksService(context);
				default:
					return super.createServiceDescriptor(serviceType, context);
			}
		} 
		else {
			throw new InvalidRequestException("The service type '" + serviceType + "' is not supported.");
		}
	}
	
	ServiceDescriptor getAstService(IServiceContext context) {
		
		String resource = context.getParameter("resource");
		ResourceSet resourceSet = resourceSetProvider.get(resource, context);
		
		EList<Resource> list = resourceSet.getResources();
		
		AstServiceProvider provider = new AstServiceProvider();
		
		ServiceDescriptor serviceDescriptor = new ServiceDescriptor();		
		serviceDescriptor.setService(() -> {
			return new AstServiceResult(provider.getAst(list));
	     });
		return serviceDescriptor;

	}
	
	ServiceDescriptor getBlocksService(IServiceContext context) {
		blockFeatures = new BlockFeatures();
				
		//TODO: Better categories
		//setup toolbox
		toolBox = new CategoryToolBox();	
				
		Category general = new Category("General");
		toolBox.addCategory(general);
		
		blockArray = new ArrayList<>();
		blockArray.addAll(parseGrammar(grammarAccess.getGrammar(), general));
		
		blockArray = handleDuplicateBlocks(blockArray);
		
		Iterator<Block> blockIterator =  blockArray.iterator();
		
		while(blockIterator.hasNext()) {
			Block block = blockIterator.next();
			block.addAllPrevious(blockFeatures.getFeature(block.getType(), StatementTypes.previousStatement));
			block.addAllNext(blockFeatures.getFeature(block.getType(), StatementTypes.nextStatement));
			ArrayList<String> outputs = blockFeatures.getFeature(block.getType(), StatementTypes.output);
			
			if (outputs != null && block.getPreviousStatement() == null && block.getNextStatement() == null) {
				block.setOutput(outputs.get(0));
			}
			
			if (block.getPreviousStatement() == null && block.getOutput() == null && 
					!block.getMessage0().contains("model")) {
				general.popCategoryItem(block.getType());
				blockIterator.remove();
				continue;
			}
						
			Category cat = block.getBlockCategory();
			ArrayList<CategoryItem> catContents = cat.getContents();
			
			
			if (catContents != null &&
					!block.getType().contains("subBlock")) {
				
				general.popCategoryItem(block.getType());
				
				Category existingCategory = null;
				
				for (Category c : toolBox.getContents()) {
		            if (cat.getName().equals(c.getName())) {
		                existingCategory = c;
		                break;
		            }
		        }
				
				boolean blockExistsInContents = false;
				for (CategoryItem i : cat.getContents())
				{
					if (i.getType().equals(block.getType()))
						blockExistsInContents = true;
				}
				
				if (!blockExistsInContents)
					cat.addCategoryItem(new CategoryItem(block.getType()));
				
				if (existingCategory == null)
					toolBox.addCategory(cat);
				else
					for (CategoryItem i : cat.getContents())
						existingCategory.addCategoryItem(i);
			}
		}
		
		for (Category c : toolBox.getContents()) {
            c.setContents(handleDuplicateCategoryItems(c, blockArray));        
        }
		
		ObjectMapper objectMapper = new ObjectMapper();
		//remove all fields that are null;
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		
		try {
			String blockarr = objectMapper.writeValueAsString(blockArray);
			String toolboxstr = objectMapper.writeValueAsString(toolBox);
			System.out.println(blockarr);
			System.out.println(toolboxstr);
			
			ServiceDescriptor serviceDescriptor = new ServiceDescriptor();		
			serviceDescriptor.setService(() -> {
		        return new BlockServiceResult(blockarr, toolboxstr);
		     });
			return serviceDescriptor;
		} catch (JsonProcessingException e) {
 			ServiceDescriptor serviceDescriptor = new ServiceDescriptor();		
			serviceDescriptor.setService(() -> {
		        return new BlockServiceResult("err", "err");
		     });
			e.printStackTrace();
			return serviceDescriptor;
		}
	}
	
	ArrayList<Block> parseGrammar(Grammar grammar, Category categoryContent) {
		ArrayList<Block> blockArray = new ArrayList<>();
		EList<AbstractRule> rules = grammar.getRules();

		for (AbstractRule rule : rules) {
			System.out.println("rule: " + rule.getName());
			if (rule instanceof ParserRule) {
				ParserRule parserRule = (ParserRule) rule;
				Block newBlock = new Block(rule.getName());
				Block block = parseRule(parserRule, newBlock);
				// TODO: rule specific code
				if(rule.getName().equals("Model")) {
					block.setOutput(null);
				}
				blockArray.add(block);
				categoryContent.addCategoryItem(new CategoryItem(block.getType()));
				System.out.println("rule contents: \n" + dump(rule, "    ")); 
			}
		}
		return blockArray;
	}
	
	//Parse a rule and return a Blockly Block representing the Rule
	private Block parseRule(ParserRule rule, Block block) {
		TreeIterator<EObject> iterator =  rule.eAllContents();
				
		while(iterator.hasNext()) {
			EObject next = iterator.next();
			boolean prune = parseLoop(next, block);
			
			if (prune) {
				iterator.prune();
			}
		}
			
		return block;
	}
	
	private boolean parseLoop(EObject obj, Block block) {
		
		if (obj instanceof Group) {
			Group group = (Group) obj;
			if (group.getCardinality() == null) {
				//continue walking the tree;
				return false;
			} 
			return parseGroup(group, block);
		} 
		if (obj instanceof Assignment) {
			Assignment assign = (Assignment) obj;
			return parseAssignment(assign, block);
		}
		
		if (obj instanceof Keyword) {
			Keyword keyWord = (Keyword) obj;
			return parseKeyword(keyWord, block);
		} 
		
		if (obj instanceof RuleCall) {
			RuleCall rule = (RuleCall) obj;
			return parseRuleCall(rule, block);			
		}
		
		if (obj instanceof Alternatives) {			
			Alternatives alternatives = (Alternatives) obj;
			return parseAlternatives(alternatives, block);
			
		}
		if (obj instanceof CrossReference) {
			CrossReference ref = (CrossReference) obj;
			return parseCrossReference(ref, block);
		}
		return false;
	}

	private boolean parseAlternatives(Alternatives alternatives, Block block) {
		
		FieldDropdown dropDown = new FieldDropdown("alternativs");
		ArrayList<Class> alternativeContents = getDropDownArgumentOptions(alternatives, dropDown);		
	
		//use a dropdown menu to select between alternatives
		if (alternatives.getCardinality() == null) {
			if (alternativeContents.size() == 1 && alternativeContents.get(0) == Keyword.class) {
				block.addArgument(dropDown);
			} else {
				InputValue inputValue = new InputValue("alternatives_statement");
				EList<EObject> contents = alternatives.eContents();
				for (int i = 0; i < contents.size(); i++) {
					EObject item = contents.get(i);
					if (item instanceof Assignment) {
						AbstractRule rule = getRuleFromAssignment(contents.get(i));
						inputValue.addCheck(rule.getName());
						blockFeatures.addStatement(rule.getName(), rule.getName(), StatementTypes.output);
					}
					if (item instanceof Keyword) {
						Keyword keyWord = (Keyword) contents.get(i);
						inputValue.addCheck(keyWord.getValue());
						Block subBlock = new Block("subBlock_" + block.getType() + "_" + keyWord.getValue());
						subBlock.addMessage(keyWord.getValue());
						subBlock.setOutput(keyWord.getValue());
						Category cat = block.getBlockCategory();
						cat.addCategoryItem(new CategoryItem(subBlock.getType()));
						subBlock.setBlockCategory(cat);
						blockArray.add(subBlock);
					}
					if (item instanceof Group) {
						Group gr = (Group) contents.get(i);
						createSubblock(gr, block, inputValue);
					}
					if (item instanceof RuleCall) {
						RuleCall ruleCall = (RuleCall) contents.get(i);
						AbstractRule rule = ruleCall.getRule();
						inputValue.addCheck(rule.getName());
						blockFeatures.addStatement(rule.getName(), rule.getName(), StatementTypes.output);

					}
				}
				block.addArgument(inputValue);
			}
		} else if (alternatives.getCardinality().equals("*")) {
			InputStatement inputStatement = new InputStatement("alternatives_statement");
			EList<EObject> contents = alternatives.eContents();
			for (int i = 0; i < contents.size(); i++) {
				if (contents.get(i) instanceof Assignment) {
					AbstractRule rule = getRuleFromAssignment(contents.get(i));
					inputStatement.addCheck(rule.getName());
					blockFeatures.addStatement(rule.getName(), block.getType(), StatementTypes.previousStatement);
					for (int j = 0; j < contents.size(); j++) {
						blockFeatures.addStatement(
								rule.getName(), 
								getRuleFromAssignment(contents.get(j)).getName(), 
								StatementTypes.previousStatement
								);
						blockFeatures.addStatement(
								rule.getName(), 
								getRuleFromAssignment(contents.get(j)).getName(), 
								StatementTypes.nextStatement
								);
					}
				}
			}
			block.addArgument(inputStatement);
		} else if (alternatives.getCardinality().equals("?")) {
			dropDown.addOption(" ");
			block.addArgument(dropDown);
		}
		
		return true;
	}
	
	private AbstractRule getRuleFromAssignment(EObject obj) {
		Assignment assign = (Assignment) obj;
		RuleCall ele = (RuleCall) assign.getTerminal();
		return ele.getRule();
	}
	/*
	 * Returns the type of the contents of the array; 
	 */
	private ArrayList<Class> getDropDownArgumentOptions(Alternatives alternatives, FieldDropdown dropDown) {
		ArrayList<Class> contents = new ArrayList<>();
		
		for (EObject content : alternatives.eContents()) {
			if (content instanceof Keyword) {
				Keyword keyWord = (Keyword) content;
				dropDown.addOption(keyWord.getValue());
				if (!contents.contains(Keyword.class)) {
					contents.add(Keyword.class);
				}
			}
			
			if(content instanceof Group) {
				String option = "";
				EList<EObject> groupContent = content.eContents();
				
				for (EObject groupMember : groupContent) {
					if (groupMember instanceof Keyword) {
						Keyword keyWord = (Keyword) groupMember;
						option = option.concat(keyWord.getValue() + " ");
						if (!contents.contains(Keyword.class)) {
							contents.add(Keyword.class);
						}
					}
				}
				if (option != "") {
					dropDown.addOption(option);
				}
			}
			if (content instanceof RuleCall) {
				RuleCall call = (RuleCall) content;
				AbstractRule rule = call.getRule();
				
				dropDown.addRule(rule.getName());
				if (!contents.contains(RuleCall.class)) {
					contents.add(RuleCall.class);
				}
			}
			if (content instanceof Assignment) {
				Assignment assign = (Assignment) content;
				RuleCall ruleCall = (RuleCall) assign.getTerminal();
				AbstractRule rule =  ruleCall.getRule();
				dropDown.addRule(rule.getName());
				if (!contents.contains(Assignment.class)) {
					contents.add(Assignment.class);
				}
			}
		}
		return contents;
	}
	
	private boolean parseAssignment (Assignment assignment, Block block) {
		if (assignment.getCardinality() == null) {
			AbstractElement assignmentContent = assignment.getTerminal();
			if (assignmentContent instanceof RuleCall) {
				RuleCall rule = (RuleCall) assignmentContent;
				parseRuleCall(rule, block);
			}
			if (assignmentContent instanceof Alternatives) {
				Alternatives alt = (Alternatives) assignmentContent;
				parseAlternatives(alt, block);
			}
			if (assignmentContent instanceof CrossReference) {
				CrossReference ref = (CrossReference) assignmentContent;
				parseCrossReference(ref, block);
			}
		} else if (assignment.getCardinality().equals("?")) {
			AbstractElement assignmentContent = assignment.getTerminal();
			if (assignmentContent instanceof RuleCall) {
				RuleCall rule = (RuleCall) assignmentContent;
				createInputFromAbstractRule(rule.getRule(), block);
			}
		}

		return true;
	}
	
	private void createInputFromAbstractRule(AbstractRule rule, Block block) {
		InputValue argument = new InputValue("name_" + rule.getName());
		argument.addCheck(rule.getName());
		block.addArgument(argument);
		blockFeatures.addStatement(rule.getName(), rule.getName(), StatementTypes.output);
	}

	private boolean parseRuleCall(RuleCall rule, Block block) {
		AbstractRule ruleContent = rule.getRule();
		if (ruleContent instanceof ParserRule) {
			ParserRule parseRule = (ParserRule) ruleContent;
			parseRule(parseRule, block);
		}
		if (ruleContent instanceof TerminalRule) {
			createInputFromAbstractRule(ruleContent, block);
		}
		return false;
	}

	private boolean parseKeyword(Keyword keyWord, Block block) {
		
		if (keyWord.getCardinality() == null) {
			block.addMessage(keyWord.getValue() + " ");
		}
		else if (keyWord.getCardinality().equals("?")) {

		}
		return false;
	}

	private boolean parseGroup(Group group, Block block) {
		FieldDropdown argument = new FieldDropdown("optionalGroup");
		for (AbstractElement groupMember : group.getElements() ) {
			if (groupMember instanceof Keyword) {
				Keyword keyWord = (Keyword) groupMember;
				argument.addOption(keyWord.getValue() + " ");
			}
		}
		
		if (group.getCardinality().equals("?") || group.getCardinality().equals("*")) {
			if (block.getArgs0().size() > 0 && block.lastIsArg()) {
				Argument arg = block.getArgs0().get(block.getArgs0().size() - 1);
				if (arg instanceof InputStatement) {
					InputStatement in_val = (InputStatement) arg;
					createSubblock(group, block, in_val); 
					return true;
				}
			}
			InputStatement in_val = new InputStatement(block.getType() + "_input_" + block.getArgCount());
			block.addArgument(in_val);
			createSubblock(group, block, in_val); 
		}
		return true;
	}

	private void createSubblock(Group group, Block block, InputArgument in_val) {
		EList<EObject> contents = group.eContents();
		StringBuilder sb = new StringBuilder();
		contents.forEach((item) -> {
			if (item instanceof Keyword) {
				sb.append("_" + ((Keyword) item).getValue());
			}
		});
		//create sub block
		String block_id = "subBlock_" + block.getType() + sb.toString();
		Block subBlock = new Block(block_id);
		
		if (in_val instanceof InputStatement) {
			subBlock.addPreviousStatement(block_id);
			if (group.getCardinality() == null) {
				
			}
			else if (group.getCardinality().equals("*") ) {
				//we should be able to connect two instances of the block type
				subBlock.addNextStatement(block_id);
			} else if (group.getCardinality().equals("?")) {

			}
			//Get the check of the inputstatement
			ArrayList<String> vals = in_val.getCheck();
			if (vals.size() > 0) {
				//Get the last element
				String val = vals.get(vals.size() - 1);
				//Make it connect to the last block in the inputstatement
				subBlock.addPreviousStatement(val);
				//Make the last block in the inputstatement connect to the new subblock
				blockFeatures.addStatement(val, subBlock.getType(), StatementTypes.nextStatement);
			}
			
			//create input for the subblock
			in_val.addCheck(block_id);
		}
		
		if (in_val instanceof InputValue) {
			subBlock.setOutput(block_id);
			in_val.addCheck(block_id);
		}
		
		
		Category blockCat = block.getBlockCategory();
		blockCat.addCategoryItem(new CategoryItem(block_id));
		//do not make categories for subblocks
		subBlock.setBlockCategory(blockCat);
		
		//populate the subblock
		TreeIterator<EObject> it = group.eAllContents();
		while (it.hasNext()) {
			//System.out.println("populating subblock " + item);
			boolean prune = parseLoop(it.next(), subBlock);
			if (prune) {
				it.prune();
			}
		}
		blockArray.add(subBlock);
	}
	
	private boolean parseCrossReference(CrossReference ref, Block block) {
		
		//Get the type that the CrossReference refers to
		//TypeRef typeRef = ref.getType();
		//System.out.println(((GeneratedMetamodel) typeRef.getMetamodel()).getName());
		;
		AbstractElement terminal = ref.getTerminal();
		if (terminal instanceof RuleCall) {
			RuleCall rule = (RuleCall) terminal;
			//TODO: Make it such that only an reference (defined by the rule) to a type (defined by the TypeRef) can be placed in the field
			if (rule.getRule() instanceof TerminalRule) {
				TerminalRule ter = (TerminalRule) rule.getRule();
				InputValue val = new InputValue(block.getType() + "_" + ter.getName());
				val.addCheck(ter.getName());
				block.addArgument(val);
				
			}
			System.out.println("rule " + rule);
			System.out.println(rule.getRule());
			System.out.println(rule.getArguments());
			System.out.flush();
		}
		
		return true;
	}
	
	public static String dump(EObject mod_, String indent) {
		System.out.println("dumping...");
		
	    var res = indent + mod_.toString().replaceFirst(".*[.]impl[.](.*)Impl[^(]*", "$1 ");
	    
	    for (EObject a :mod_.eCrossReferences()) {
	        res +=  "-> " + a.toString().replaceFirst(".*[.]impl[.](.*)Impl[^(]*", "$1 ");
	    }
	    res += "\n";
	    for (EObject f :mod_.eContents()) {
	        res += dump(f, indent+"    ");
	    }
	    
	    return res;
	}
	
	public static ArrayList<CategoryItem> handleDuplicateCategoryItems(Category oldCategory, ArrayList<Block> blockDefinitions) 
	{
		ArrayList<CategoryItem> newCategoryItems = new ArrayList<>(); 
		
		int index = 0;
        for (CategoryItem i : oldCategory.getContents())
        {
        	if (!newCategoryItems.stream().anyMatch(ci -> ci.getType().equals(i.getType())))
        	{
        		index = 0;
            	newCategoryItems.add(i);
        	}
        	else
        	{
        		String newType = i.getType() + index;
        		if (blockDefinitions.stream().anyMatch(b -> b.getType().equals(newType))) // only add it if we have a block definition for it.
        		{
        			i.setType(newType);
        			newCategoryItems.add(i);
        			index++;
        		}
        	}
        }
        
        return newCategoryItems; 
	}
	
	public static ArrayList<Block> handleDuplicateBlocks(ArrayList<Block> oldBlocks) 
    { 
		System.out.println("helloooooooo");
		
		ArrayList<Block> newBlocks = new ArrayList<>(); 

		int index = 0;
        for (Block b : oldBlocks)
        {
            if (!newBlocks.stream().anyMatch(nb -> nb.getType().equals(b.getType())))
            {
            	
            	index = 0;            	
            	newBlocks.add(b);
            }
            else if (!newBlocks.stream().anyMatch(nb -> blocksHaveEqualArgs(nb, b)))
			{
            	Block blockToAdd = new Block(b.getTooltip() + index);
        		b.setTooltip(b.getTooltip() + index);
        		b.setType(b.getType() + index);
        		b.setColour(blockToAdd.getColour());
        		newBlocks.add(b);
			}
        } 

        return newBlocks; 
    }
	
	public static boolean blocksHaveEqualArgs(Block b1, Block b2)
	{
		if (b1.getArgCount() != b2.getArgCount())
			return false;
		
		for (int i = 0; i < b1.getArgs0().size(); i++)
		{
			Argument argument1 = b1.getArgs0().get(i);
			Argument argument2 = b2.getArgs0().get(i);
			
			if (!argument1.getType().equals(argument2.getType()) || !argument1.getName().equals(argument2.getName()))
				return false;
			
			if (!(argument1 instanceof InputArgument && argument2 instanceof InputArgument))
				return false;
			
			InputArgument inputArgument1 = (InputArgument) argument1;
			InputArgument inputArgument2 = (InputArgument) argument2;
			
			// make sure the check arrays are the same	
			if (inputArgument1.getCheck().size() != inputArgument2.getCheck().size())
				return false;
			
			for (int j = 0; j < inputArgument1.getCheck().size(); j++)
			{
				String check1 = inputArgument1.getCheck().get(j);
				String check2 = inputArgument2.getCheck().get(j);
				
				if (!check1.equals(check2))
					return false;
			}
		}		
		
		return true;
	}
}