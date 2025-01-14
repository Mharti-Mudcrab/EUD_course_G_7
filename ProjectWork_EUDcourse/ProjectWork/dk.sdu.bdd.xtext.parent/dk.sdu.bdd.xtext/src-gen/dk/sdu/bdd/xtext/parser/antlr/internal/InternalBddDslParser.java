package dk.sdu.bdd.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.bdd.xtext.services.BddDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBddDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'using'", "'declarative'", "'entity'", "'-'", "'is'", "','", "'{'", "'actions:'", "'states:'", "'properties:'", "'}'", "'imperative'", "'and'", "'the'", "'['", "']'", "'on'", "'of'", "'in'", "'from'", "'to'", "'into'", "'for'", "'with'", "'out'", "'off'", "'up'", "'down'", "'/'", "'Scenario:'", "'Given'", "'When'", "'Then'", "'which'", "'means'", "'all'", "'are'", "'not'", "'pause'", "'And'", "'#'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalBddDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBddDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBddDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBddDsl.g"; }



     	private BddDslGrammarAccess grammarAccess;

        public InternalBddDslParser(TokenStream input, BddDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BddDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBddDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBddDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBddDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBddDsl.g:71:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) ) | ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) ) | ( (lv_scenarios_5_0= ruleScenario ) ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_modelRefs_2_0 = null;

        EObject lv_declarativeEntityDef_3_0 = null;

        EObject lv_imperativeEntityDef_4_0 = null;

        EObject lv_scenarios_5_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:77:2: ( ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) ) | ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) ) | ( (lv_scenarios_5_0= ruleScenario ) ) )* ) )
            // InternalBddDsl.g:78:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) ) | ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) ) | ( (lv_scenarios_5_0= ruleScenario ) ) )* )
            {
            // InternalBddDsl.g:78:2: ( (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) ) | ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) ) | ( (lv_scenarios_5_0= ruleScenario ) ) )* )
            // InternalBddDsl.g:79:3: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) ) ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) ) | ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) ) | ( (lv_scenarios_5_0= ruleScenario ) ) )*
            {
            // InternalBddDsl.g:79:3: (otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBddDsl.g:80:4: otherlv_0= 'model' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0_0());
            			
            // InternalBddDsl.g:84:4: ( (lv_name_1_0= RULE_ID ) )
            // InternalBddDsl.g:85:5: (lv_name_1_0= RULE_ID )
            {
            // InternalBddDsl.g:85:5: (lv_name_1_0= RULE_ID )
            // InternalBddDsl.g:86:6: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            						newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getModelRule());
            						}
            						setWithLastConsumed(
            							current,
            							"name",
            							lv_name_1_0,
            							"org.eclipse.xtext.common.Terminals.ID");
            					

            }


            }


            }

            // InternalBddDsl.g:103:3: ( ( (lv_modelRefs_2_0= ruleModelRef ) ) | ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) ) | ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) ) | ( (lv_scenarios_5_0= ruleScenario ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 12:
                    {
                    alt1=1;
                    }
                    break;
                case 13:
                    {
                    alt1=2;
                    }
                    break;
                case 23:
                    {
                    alt1=3;
                    }
                    break;
                case 41:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalBddDsl.g:104:4: ( (lv_modelRefs_2_0= ruleModelRef ) )
            	    {
            	    // InternalBddDsl.g:104:4: ( (lv_modelRefs_2_0= ruleModelRef ) )
            	    // InternalBddDsl.g:105:5: (lv_modelRefs_2_0= ruleModelRef )
            	    {
            	    // InternalBddDsl.g:105:5: (lv_modelRefs_2_0= ruleModelRef )
            	    // InternalBddDsl.g:106:6: lv_modelRefs_2_0= ruleModelRef
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getModelRefsModelRefParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_modelRefs_2_0=ruleModelRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"modelRefs",
            	    							lv_modelRefs_2_0,
            	    							"dk.sdu.bdd.xtext.BddDsl.ModelRef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBddDsl.g:124:4: ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) )
            	    {
            	    // InternalBddDsl.g:124:4: ( (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef ) )
            	    // InternalBddDsl.g:125:5: (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef )
            	    {
            	    // InternalBddDsl.g:125:5: (lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef )
            	    // InternalBddDsl.g:126:6: lv_declarativeEntityDef_3_0= ruleDeclarativeEntityDef
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getDeclarativeEntityDefDeclarativeEntityDefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_declarativeEntityDef_3_0=ruleDeclarativeEntityDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"declarativeEntityDef",
            	    							lv_declarativeEntityDef_3_0,
            	    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBddDsl.g:144:4: ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) )
            	    {
            	    // InternalBddDsl.g:144:4: ( (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef ) )
            	    // InternalBddDsl.g:145:5: (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef )
            	    {
            	    // InternalBddDsl.g:145:5: (lv_imperativeEntityDef_4_0= ruleImperativeEntityDef )
            	    // InternalBddDsl.g:146:6: lv_imperativeEntityDef_4_0= ruleImperativeEntityDef
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getImperativeEntityDefImperativeEntityDefParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_imperativeEntityDef_4_0=ruleImperativeEntityDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"imperativeEntityDef",
            	    							lv_imperativeEntityDef_4_0,
            	    							"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalBddDsl.g:164:4: ( (lv_scenarios_5_0= ruleScenario ) )
            	    {
            	    // InternalBddDsl.g:164:4: ( (lv_scenarios_5_0= ruleScenario ) )
            	    // InternalBddDsl.g:165:5: (lv_scenarios_5_0= ruleScenario )
            	    {
            	    // InternalBddDsl.g:165:5: (lv_scenarios_5_0= ruleScenario )
            	    // InternalBddDsl.g:166:6: lv_scenarios_5_0= ruleScenario
            	    {

            	    						newCompositeNode(grammarAccess.getModelAccess().getScenariosScenarioParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_scenarios_5_0=ruleScenario();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"scenarios",
            	    							lv_scenarios_5_0,
            	    							"dk.sdu.bdd.xtext.BddDsl.Scenario");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleModelRef"
    // InternalBddDsl.g:188:1: entryRuleModelRef returns [EObject current=null] : iv_ruleModelRef= ruleModelRef EOF ;
    public final EObject entryRuleModelRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelRef = null;


        try {
            // InternalBddDsl.g:188:49: (iv_ruleModelRef= ruleModelRef EOF )
            // InternalBddDsl.g:189:2: iv_ruleModelRef= ruleModelRef EOF
            {
             newCompositeNode(grammarAccess.getModelRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelRef=ruleModelRef();

            state._fsp--;

             current =iv_ruleModelRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelRef"


    // $ANTLR start "ruleModelRef"
    // InternalBddDsl.g:195:1: ruleModelRef returns [EObject current=null] : (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleModelRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBddDsl.g:201:2: ( (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalBddDsl.g:202:2: (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalBddDsl.g:202:2: (otherlv_0= 'using' ( (otherlv_1= RULE_ID ) ) )
            // InternalBddDsl.g:203:3: otherlv_0= 'using' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelRefAccess().getUsingKeyword_0());
            		
            // InternalBddDsl.g:207:3: ( (otherlv_1= RULE_ID ) )
            // InternalBddDsl.g:208:4: (otherlv_1= RULE_ID )
            {
            // InternalBddDsl.g:208:4: (otherlv_1= RULE_ID )
            // InternalBddDsl.g:209:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getModelRefAccess().getModelRefModelCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelRef"


    // $ANTLR start "entryRuleDeclarativeEntityDef"
    // InternalBddDsl.g:224:1: entryRuleDeclarativeEntityDef returns [EObject current=null] : iv_ruleDeclarativeEntityDef= ruleDeclarativeEntityDef EOF ;
    public final EObject entryRuleDeclarativeEntityDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeEntityDef = null;


        try {
            // InternalBddDsl.g:224:61: (iv_ruleDeclarativeEntityDef= ruleDeclarativeEntityDef EOF )
            // InternalBddDsl.g:225:2: iv_ruleDeclarativeEntityDef= ruleDeclarativeEntityDef EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeEntityDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeEntityDef=ruleDeclarativeEntityDef();

            state._fsp--;

             current =iv_ruleDeclarativeEntityDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarativeEntityDef"


    // $ANTLR start "ruleDeclarativeEntityDef"
    // InternalBddDsl.g:231:1: ruleDeclarativeEntityDef returns [EObject current=null] : (otherlv_0= 'declarative' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '-' this_ID_4= RULE_ID )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleStateDef ) ) (otherlv_16= ',' ( (lv_states_17_0= ruleStateDef ) ) )* )? (otherlv_18= 'properties:' ( (lv_properties_19_0= rulePropertyDef ) ) (otherlv_20= ',' ( (lv_properties_21_0= rulePropertyDef ) ) )* )? otherlv_22= '}' ) ;
    public final EObject ruleDeclarativeEntityDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token this_ID_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_actions_11_0 = null;

        EObject lv_actions_13_0 = null;

        EObject lv_states_15_0 = null;

        EObject lv_states_17_0 = null;

        EObject lv_properties_19_0 = null;

        EObject lv_properties_21_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:237:2: ( (otherlv_0= 'declarative' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '-' this_ID_4= RULE_ID )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleStateDef ) ) (otherlv_16= ',' ( (lv_states_17_0= ruleStateDef ) ) )* )? (otherlv_18= 'properties:' ( (lv_properties_19_0= rulePropertyDef ) ) (otherlv_20= ',' ( (lv_properties_21_0= rulePropertyDef ) ) )* )? otherlv_22= '}' ) )
            // InternalBddDsl.g:238:2: (otherlv_0= 'declarative' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '-' this_ID_4= RULE_ID )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleStateDef ) ) (otherlv_16= ',' ( (lv_states_17_0= ruleStateDef ) ) )* )? (otherlv_18= 'properties:' ( (lv_properties_19_0= rulePropertyDef ) ) (otherlv_20= ',' ( (lv_properties_21_0= rulePropertyDef ) ) )* )? otherlv_22= '}' )
            {
            // InternalBddDsl.g:238:2: (otherlv_0= 'declarative' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '-' this_ID_4= RULE_ID )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleStateDef ) ) (otherlv_16= ',' ( (lv_states_17_0= ruleStateDef ) ) )* )? (otherlv_18= 'properties:' ( (lv_properties_19_0= rulePropertyDef ) ) (otherlv_20= ',' ( (lv_properties_21_0= rulePropertyDef ) ) )* )? otherlv_22= '}' )
            // InternalBddDsl.g:239:3: otherlv_0= 'declarative' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '-' this_ID_4= RULE_ID )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleStateDef ) ) (otherlv_16= ',' ( (lv_states_17_0= ruleStateDef ) ) )* )? (otherlv_18= 'properties:' ( (lv_properties_19_0= rulePropertyDef ) ) (otherlv_20= ',' ( (lv_properties_21_0= rulePropertyDef ) ) )* )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarativeEntityDefAccess().getDeclarativeKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeclarativeEntityDefAccess().getEntityKeyword_1());
            		
            // InternalBddDsl.g:247:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBddDsl.g:248:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBddDsl.g:248:4: (lv_name_2_0= RULE_ID )
            // InternalBddDsl.g:249:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDeclarativeEntityDefAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarativeEntityDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBddDsl.g:265:3: (otherlv_3= '-' this_ID_4= RULE_ID )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBddDsl.g:266:4: otherlv_3= '-' this_ID_4= RULE_ID
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getDeclarativeEntityDefAccess().getHyphenMinusKeyword_3_0());
                    			
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    				newLeafNode(this_ID_4, grammarAccess.getDeclarativeEntityDefAccess().getIDTerminalRuleCall_3_1());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:275:3: (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalBddDsl.g:276:4: otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getDeclarativeEntityDefAccess().getIsKeyword_4_0());
                    			
                    // InternalBddDsl.g:280:4: ( (otherlv_6= RULE_ID ) )
                    // InternalBddDsl.g:281:5: (otherlv_6= RULE_ID )
                    {
                    // InternalBddDsl.g:281:5: (otherlv_6= RULE_ID )
                    // InternalBddDsl.g:282:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclarativeEntityDefRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_6, grammarAccess.getDeclarativeEntityDefAccess().getSuperEntitiesDeclarativeEntityDefCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalBddDsl.g:293:4: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalBddDsl.g:294:5: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDeclarativeEntityDefAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalBddDsl.g:298:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalBddDsl.g:299:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalBddDsl.g:299:6: (otherlv_8= RULE_ID )
                    	    // InternalBddDsl.g:300:7: otherlv_8= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDeclarativeEntityDefRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getDeclarativeEntityDefAccess().getSuperEntitiesDeclarativeEntityDefCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getDeclarativeEntityDefAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalBddDsl.g:317:3: (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBddDsl.g:318:4: otherlv_10= 'actions:' ( (lv_actions_11_0= ruleActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )*
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getDeclarativeEntityDefAccess().getActionsKeyword_6_0());
                    			
                    // InternalBddDsl.g:322:4: ( (lv_actions_11_0= ruleActionDef ) )
                    // InternalBddDsl.g:323:5: (lv_actions_11_0= ruleActionDef )
                    {
                    // InternalBddDsl.g:323:5: (lv_actions_11_0= ruleActionDef )
                    // InternalBddDsl.g:324:6: lv_actions_11_0= ruleActionDef
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getActionsActionDefParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_actions_11_0=ruleActionDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_11_0,
                    							"dk.sdu.bdd.xtext.BddDsl.ActionDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:341:4: (otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalBddDsl.g:342:5: otherlv_12= ',' ( (lv_actions_13_0= ruleActionDef ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDeclarativeEntityDefAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalBddDsl.g:346:5: ( (lv_actions_13_0= ruleActionDef ) )
                    	    // InternalBddDsl.g:347:6: (lv_actions_13_0= ruleActionDef )
                    	    {
                    	    // InternalBddDsl.g:347:6: (lv_actions_13_0= ruleActionDef )
                    	    // InternalBddDsl.g:348:7: lv_actions_13_0= ruleActionDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getActionsActionDefParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_actions_13_0=ruleActionDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDeclarativeEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_13_0,
                    	    								"dk.sdu.bdd.xtext.BddDsl.ActionDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBddDsl.g:367:3: (otherlv_14= 'states:' ( (lv_states_15_0= ruleStateDef ) ) (otherlv_16= ',' ( (lv_states_17_0= ruleStateDef ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBddDsl.g:368:4: otherlv_14= 'states:' ( (lv_states_15_0= ruleStateDef ) ) (otherlv_16= ',' ( (lv_states_17_0= ruleStateDef ) ) )*
                    {
                    otherlv_14=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getDeclarativeEntityDefAccess().getStatesKeyword_7_0());
                    			
                    // InternalBddDsl.g:372:4: ( (lv_states_15_0= ruleStateDef ) )
                    // InternalBddDsl.g:373:5: (lv_states_15_0= ruleStateDef )
                    {
                    // InternalBddDsl.g:373:5: (lv_states_15_0= ruleStateDef )
                    // InternalBddDsl.g:374:6: lv_states_15_0= ruleStateDef
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getStatesStateDefParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_states_15_0=ruleStateDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_15_0,
                    							"dk.sdu.bdd.xtext.BddDsl.StateDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:391:4: (otherlv_16= ',' ( (lv_states_17_0= ruleStateDef ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalBddDsl.g:392:5: otherlv_16= ',' ( (lv_states_17_0= ruleStateDef ) )
                    	    {
                    	    otherlv_16=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getDeclarativeEntityDefAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalBddDsl.g:396:5: ( (lv_states_17_0= ruleStateDef ) )
                    	    // InternalBddDsl.g:397:6: (lv_states_17_0= ruleStateDef )
                    	    {
                    	    // InternalBddDsl.g:397:6: (lv_states_17_0= ruleStateDef )
                    	    // InternalBddDsl.g:398:7: lv_states_17_0= ruleStateDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getStatesStateDefParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_states_17_0=ruleStateDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDeclarativeEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"states",
                    	    								lv_states_17_0,
                    	    								"dk.sdu.bdd.xtext.BddDsl.StateDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBddDsl.g:417:3: (otherlv_18= 'properties:' ( (lv_properties_19_0= rulePropertyDef ) ) (otherlv_20= ',' ( (lv_properties_21_0= rulePropertyDef ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalBddDsl.g:418:4: otherlv_18= 'properties:' ( (lv_properties_19_0= rulePropertyDef ) ) (otherlv_20= ',' ( (lv_properties_21_0= rulePropertyDef ) ) )*
                    {
                    otherlv_18=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getDeclarativeEntityDefAccess().getPropertiesKeyword_8_0());
                    			
                    // InternalBddDsl.g:422:4: ( (lv_properties_19_0= rulePropertyDef ) )
                    // InternalBddDsl.g:423:5: (lv_properties_19_0= rulePropertyDef )
                    {
                    // InternalBddDsl.g:423:5: (lv_properties_19_0= rulePropertyDef )
                    // InternalBddDsl.g:424:6: lv_properties_19_0= rulePropertyDef
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getPropertiesPropertyDefParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_properties_19_0=rulePropertyDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_19_0,
                    							"dk.sdu.bdd.xtext.BddDsl.PropertyDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:441:4: (otherlv_20= ',' ( (lv_properties_21_0= rulePropertyDef ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==17) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalBddDsl.g:442:5: otherlv_20= ',' ( (lv_properties_21_0= rulePropertyDef ) )
                    	    {
                    	    otherlv_20=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getDeclarativeEntityDefAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalBddDsl.g:446:5: ( (lv_properties_21_0= rulePropertyDef ) )
                    	    // InternalBddDsl.g:447:6: (lv_properties_21_0= rulePropertyDef )
                    	    {
                    	    // InternalBddDsl.g:447:6: (lv_properties_21_0= rulePropertyDef )
                    	    // InternalBddDsl.g:448:7: lv_properties_21_0= rulePropertyDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getDeclarativeEntityDefAccess().getPropertiesPropertyDefParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_properties_21_0=rulePropertyDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDeclarativeEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_21_0,
                    	    								"dk.sdu.bdd.xtext.BddDsl.PropertyDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getDeclarativeEntityDefAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarativeEntityDef"


    // $ANTLR start "entryRuleImperativeEntityDef"
    // InternalBddDsl.g:475:1: entryRuleImperativeEntityDef returns [EObject current=null] : iv_ruleImperativeEntityDef= ruleImperativeEntityDef EOF ;
    public final EObject entryRuleImperativeEntityDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeEntityDef = null;


        try {
            // InternalBddDsl.g:475:60: (iv_ruleImperativeEntityDef= ruleImperativeEntityDef EOF )
            // InternalBddDsl.g:476:2: iv_ruleImperativeEntityDef= ruleImperativeEntityDef EOF
            {
             newCompositeNode(grammarAccess.getImperativeEntityDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeEntityDef=ruleImperativeEntityDef();

            state._fsp--;

             current =iv_ruleImperativeEntityDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeEntityDef"


    // $ANTLR start "ruleImperativeEntityDef"
    // InternalBddDsl.g:482:1: ruleImperativeEntityDef returns [EObject current=null] : (otherlv_0= 'imperative' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '-' this_ID_4= RULE_ID )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleImperativeActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleImperativeStateDef ) ) (otherlv_16= ',' ( (lv_states_17_0= ruleImperativeStateDef ) ) )* )? (otherlv_18= 'properties:' ( (lv_properties_19_0= ruleImperativePropertyDef ) ) (otherlv_20= ',' ( (lv_properties_21_0= ruleImperativePropertyDef ) ) )* )? otherlv_22= '}' ) ;
    public final EObject ruleImperativeEntityDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token this_ID_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_actions_11_0 = null;

        EObject lv_actions_13_0 = null;

        EObject lv_states_15_0 = null;

        EObject lv_states_17_0 = null;

        EObject lv_properties_19_0 = null;

        EObject lv_properties_21_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:488:2: ( (otherlv_0= 'imperative' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '-' this_ID_4= RULE_ID )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleImperativeActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleImperativeStateDef ) ) (otherlv_16= ',' ( (lv_states_17_0= ruleImperativeStateDef ) ) )* )? (otherlv_18= 'properties:' ( (lv_properties_19_0= ruleImperativePropertyDef ) ) (otherlv_20= ',' ( (lv_properties_21_0= ruleImperativePropertyDef ) ) )* )? otherlv_22= '}' ) )
            // InternalBddDsl.g:489:2: (otherlv_0= 'imperative' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '-' this_ID_4= RULE_ID )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleImperativeActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleImperativeStateDef ) ) (otherlv_16= ',' ( (lv_states_17_0= ruleImperativeStateDef ) ) )* )? (otherlv_18= 'properties:' ( (lv_properties_19_0= ruleImperativePropertyDef ) ) (otherlv_20= ',' ( (lv_properties_21_0= ruleImperativePropertyDef ) ) )* )? otherlv_22= '}' )
            {
            // InternalBddDsl.g:489:2: (otherlv_0= 'imperative' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '-' this_ID_4= RULE_ID )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleImperativeActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleImperativeStateDef ) ) (otherlv_16= ',' ( (lv_states_17_0= ruleImperativeStateDef ) ) )* )? (otherlv_18= 'properties:' ( (lv_properties_19_0= ruleImperativePropertyDef ) ) (otherlv_20= ',' ( (lv_properties_21_0= ruleImperativePropertyDef ) ) )* )? otherlv_22= '}' )
            // InternalBddDsl.g:490:3: otherlv_0= 'imperative' otherlv_1= 'entity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '-' this_ID_4= RULE_ID )? (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )? otherlv_9= '{' (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleImperativeActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )* )? (otherlv_14= 'states:' ( (lv_states_15_0= ruleImperativeStateDef ) ) (otherlv_16= ',' ( (lv_states_17_0= ruleImperativeStateDef ) ) )* )? (otherlv_18= 'properties:' ( (lv_properties_19_0= ruleImperativePropertyDef ) ) (otherlv_20= ',' ( (lv_properties_21_0= ruleImperativePropertyDef ) ) )* )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImperativeEntityDefAccess().getImperativeKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getImperativeEntityDefAccess().getEntityKeyword_1());
            		
            // InternalBddDsl.g:498:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalBddDsl.g:499:4: (lv_name_2_0= RULE_ID )
            {
            // InternalBddDsl.g:499:4: (lv_name_2_0= RULE_ID )
            // InternalBddDsl.g:500:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_2_0, grammarAccess.getImperativeEntityDefAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativeEntityDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBddDsl.g:516:3: (otherlv_3= '-' this_ID_4= RULE_ID )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBddDsl.g:517:4: otherlv_3= '-' this_ID_4= RULE_ID
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getImperativeEntityDefAccess().getHyphenMinusKeyword_3_0());
                    			
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_7); 

                    				newLeafNode(this_ID_4, grammarAccess.getImperativeEntityDefAccess().getIDTerminalRuleCall_3_1());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:526:3: (otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalBddDsl.g:527:4: otherlv_5= 'is' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getImperativeEntityDefAccess().getIsKeyword_4_0());
                    			
                    // InternalBddDsl.g:531:4: ( (otherlv_6= RULE_ID ) )
                    // InternalBddDsl.g:532:5: (otherlv_6= RULE_ID )
                    {
                    // InternalBddDsl.g:532:5: (otherlv_6= RULE_ID )
                    // InternalBddDsl.g:533:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImperativeEntityDefRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_6, grammarAccess.getImperativeEntityDefAccess().getSuperEntitiesImperativeEntityDefCrossReference_4_1_0());
                    					

                    }


                    }

                    // InternalBddDsl.g:544:4: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==17) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalBddDsl.g:545:5: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getImperativeEntityDefAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalBddDsl.g:549:5: ( (otherlv_8= RULE_ID ) )
                    	    // InternalBddDsl.g:550:6: (otherlv_8= RULE_ID )
                    	    {
                    	    // InternalBddDsl.g:550:6: (otherlv_8= RULE_ID )
                    	    // InternalBddDsl.g:551:7: otherlv_8= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getImperativeEntityDefRule());
                    	    							}
                    	    						
                    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getImperativeEntityDefAccess().getSuperEntitiesImperativeEntityDefCrossReference_4_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getImperativeEntityDefAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalBddDsl.g:568:3: (otherlv_10= 'actions:' ( (lv_actions_11_0= ruleImperativeActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalBddDsl.g:569:4: otherlv_10= 'actions:' ( (lv_actions_11_0= ruleImperativeActionDef ) ) (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )*
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getImperativeEntityDefAccess().getActionsKeyword_6_0());
                    			
                    // InternalBddDsl.g:573:4: ( (lv_actions_11_0= ruleImperativeActionDef ) )
                    // InternalBddDsl.g:574:5: (lv_actions_11_0= ruleImperativeActionDef )
                    {
                    // InternalBddDsl.g:574:5: (lv_actions_11_0= ruleImperativeActionDef )
                    // InternalBddDsl.g:575:6: lv_actions_11_0= ruleImperativeActionDef
                    {

                    						newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getActionsImperativeActionDefParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_actions_11_0=ruleImperativeActionDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_11_0,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeActionDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:592:4: (otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==17) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalBddDsl.g:593:5: otherlv_12= ',' ( (lv_actions_13_0= ruleImperativeActionDef ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getImperativeEntityDefAccess().getCommaKeyword_6_2_0());
                    	    				
                    	    // InternalBddDsl.g:597:5: ( (lv_actions_13_0= ruleImperativeActionDef ) )
                    	    // InternalBddDsl.g:598:6: (lv_actions_13_0= ruleImperativeActionDef )
                    	    {
                    	    // InternalBddDsl.g:598:6: (lv_actions_13_0= ruleImperativeActionDef )
                    	    // InternalBddDsl.g:599:7: lv_actions_13_0= ruleImperativeActionDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getActionsImperativeActionDefParserRuleCall_6_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_actions_13_0=ruleImperativeActionDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getImperativeEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actions",
                    	    								lv_actions_13_0,
                    	    								"dk.sdu.bdd.xtext.BddDsl.ImperativeActionDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBddDsl.g:618:3: (otherlv_14= 'states:' ( (lv_states_15_0= ruleImperativeStateDef ) ) (otherlv_16= ',' ( (lv_states_17_0= ruleImperativeStateDef ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBddDsl.g:619:4: otherlv_14= 'states:' ( (lv_states_15_0= ruleImperativeStateDef ) ) (otherlv_16= ',' ( (lv_states_17_0= ruleImperativeStateDef ) ) )*
                    {
                    otherlv_14=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getImperativeEntityDefAccess().getStatesKeyword_7_0());
                    			
                    // InternalBddDsl.g:623:4: ( (lv_states_15_0= ruleImperativeStateDef ) )
                    // InternalBddDsl.g:624:5: (lv_states_15_0= ruleImperativeStateDef )
                    {
                    // InternalBddDsl.g:624:5: (lv_states_15_0= ruleImperativeStateDef )
                    // InternalBddDsl.g:625:6: lv_states_15_0= ruleImperativeStateDef
                    {

                    						newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getStatesImperativeStateDefParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_states_15_0=ruleImperativeStateDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_15_0,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeStateDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:642:4: (otherlv_16= ',' ( (lv_states_17_0= ruleImperativeStateDef ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==17) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalBddDsl.g:643:5: otherlv_16= ',' ( (lv_states_17_0= ruleImperativeStateDef ) )
                    	    {
                    	    otherlv_16=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getImperativeEntityDefAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalBddDsl.g:647:5: ( (lv_states_17_0= ruleImperativeStateDef ) )
                    	    // InternalBddDsl.g:648:6: (lv_states_17_0= ruleImperativeStateDef )
                    	    {
                    	    // InternalBddDsl.g:648:6: (lv_states_17_0= ruleImperativeStateDef )
                    	    // InternalBddDsl.g:649:7: lv_states_17_0= ruleImperativeStateDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getStatesImperativeStateDefParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_states_17_0=ruleImperativeStateDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getImperativeEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"states",
                    	    								lv_states_17_0,
                    	    								"dk.sdu.bdd.xtext.BddDsl.ImperativeStateDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalBddDsl.g:668:3: (otherlv_18= 'properties:' ( (lv_properties_19_0= ruleImperativePropertyDef ) ) (otherlv_20= ',' ( (lv_properties_21_0= ruleImperativePropertyDef ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBddDsl.g:669:4: otherlv_18= 'properties:' ( (lv_properties_19_0= ruleImperativePropertyDef ) ) (otherlv_20= ',' ( (lv_properties_21_0= ruleImperativePropertyDef ) ) )*
                    {
                    otherlv_18=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getImperativeEntityDefAccess().getPropertiesKeyword_8_0());
                    			
                    // InternalBddDsl.g:673:4: ( (lv_properties_19_0= ruleImperativePropertyDef ) )
                    // InternalBddDsl.g:674:5: (lv_properties_19_0= ruleImperativePropertyDef )
                    {
                    // InternalBddDsl.g:674:5: (lv_properties_19_0= ruleImperativePropertyDef )
                    // InternalBddDsl.g:675:6: lv_properties_19_0= ruleImperativePropertyDef
                    {

                    						newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getPropertiesImperativePropertyDefParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_properties_19_0=ruleImperativePropertyDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeEntityDefRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_19_0,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativePropertyDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:692:4: (otherlv_20= ',' ( (lv_properties_21_0= ruleImperativePropertyDef ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==17) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalBddDsl.g:693:5: otherlv_20= ',' ( (lv_properties_21_0= ruleImperativePropertyDef ) )
                    	    {
                    	    otherlv_20=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getImperativeEntityDefAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalBddDsl.g:697:5: ( (lv_properties_21_0= ruleImperativePropertyDef ) )
                    	    // InternalBddDsl.g:698:6: (lv_properties_21_0= ruleImperativePropertyDef )
                    	    {
                    	    // InternalBddDsl.g:698:6: (lv_properties_21_0= ruleImperativePropertyDef )
                    	    // InternalBddDsl.g:699:7: lv_properties_21_0= ruleImperativePropertyDef
                    	    {

                    	    							newCompositeNode(grammarAccess.getImperativeEntityDefAccess().getPropertiesImperativePropertyDefParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_properties_21_0=ruleImperativePropertyDef();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getImperativeEntityDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"properties",
                    	    								lv_properties_21_0,
                    	    								"dk.sdu.bdd.xtext.BddDsl.ImperativePropertyDef");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getImperativeEntityDefAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeEntityDef"


    // $ANTLR start "entryRuleImperativeActionDef"
    // InternalBddDsl.g:726:1: entryRuleImperativeActionDef returns [EObject current=null] : iv_ruleImperativeActionDef= ruleImperativeActionDef EOF ;
    public final EObject entryRuleImperativeActionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeActionDef = null;


        try {
            // InternalBddDsl.g:726:60: (iv_ruleImperativeActionDef= ruleImperativeActionDef EOF )
            // InternalBddDsl.g:727:2: iv_ruleImperativeActionDef= ruleImperativeActionDef EOF
            {
             newCompositeNode(grammarAccess.getImperativeActionDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeActionDef=ruleImperativeActionDef();

            state._fsp--;

             current =iv_ruleImperativeActionDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeActionDef"


    // $ANTLR start "ruleImperativeActionDef"
    // InternalBddDsl.g:733:1: ruleImperativeActionDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID )? | this_ID_4= RULE_ID ) (otherlv_5= '[' ( (lv_preposition_6_0= rulePREP ) ) otherlv_7= ']' )? (otherlv_8= 'the' ( (lv_argument_9_0= RULE_ID ) ) )? ) ;
    public final EObject ruleImperativeActionDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_ID_3=null;
        Token this_ID_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_argument_9_0=null;
        AntlrDatatypeRuleToken lv_preposition_6_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:739:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID )? | this_ID_4= RULE_ID ) (otherlv_5= '[' ( (lv_preposition_6_0= rulePREP ) ) otherlv_7= ']' )? (otherlv_8= 'the' ( (lv_argument_9_0= RULE_ID ) ) )? ) )
            // InternalBddDsl.g:740:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID )? | this_ID_4= RULE_ID ) (otherlv_5= '[' ( (lv_preposition_6_0= rulePREP ) ) otherlv_7= ']' )? (otherlv_8= 'the' ( (lv_argument_9_0= RULE_ID ) ) )? )
            {
            // InternalBddDsl.g:740:2: ( ( (lv_name_0_0= RULE_ID ) ) ( ( (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID )? | this_ID_4= RULE_ID ) (otherlv_5= '[' ( (lv_preposition_6_0= rulePREP ) ) otherlv_7= ']' )? (otherlv_8= 'the' ( (lv_argument_9_0= RULE_ID ) ) )? )
            // InternalBddDsl.g:741:3: ( (lv_name_0_0= RULE_ID ) ) ( ( (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID )? | this_ID_4= RULE_ID ) (otherlv_5= '[' ( (lv_preposition_6_0= rulePREP ) ) otherlv_7= ']' )? (otherlv_8= 'the' ( (lv_argument_9_0= RULE_ID ) ) )?
            {
            // InternalBddDsl.g:741:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBddDsl.g:742:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBddDsl.g:742:4: (lv_name_0_0= RULE_ID )
            // InternalBddDsl.g:743:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getImperativeActionDefAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativeActionDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBddDsl.g:759:3: ( ( (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID )? | this_ID_4= RULE_ID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EOF||LA22_0==17||(LA22_0>=20 && LA22_0<=22)||(LA22_0>=24 && LA22_0<=26)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalBddDsl.g:760:4: ( (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID )?
                    {
                    // InternalBddDsl.g:760:4: ( (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==24) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==25) ) {
                        int LA21_2 = input.LA(2);

                        if ( (LA21_2==RULE_ID) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalBddDsl.g:761:5: (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID
                            {
                            // InternalBddDsl.g:761:5: (otherlv_1= 'and' | otherlv_2= 'the' )
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==24) ) {
                                alt20=1;
                            }
                            else if ( (LA20_0==25) ) {
                                alt20=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 20, 0, input);

                                throw nvae;
                            }
                            switch (alt20) {
                                case 1 :
                                    // InternalBddDsl.g:762:6: otherlv_1= 'and'
                                    {
                                    otherlv_1=(Token)match(input,24,FOLLOW_3); 

                                    						newLeafNode(otherlv_1, grammarAccess.getImperativeActionDefAccess().getAndKeyword_1_0_0_0());
                                    					

                                    }
                                    break;
                                case 2 :
                                    // InternalBddDsl.g:767:6: otherlv_2= 'the'
                                    {
                                    otherlv_2=(Token)match(input,25,FOLLOW_3); 

                                    						newLeafNode(otherlv_2, grammarAccess.getImperativeActionDefAccess().getTheKeyword_1_0_0_1());
                                    					

                                    }
                                    break;

                            }

                            this_ID_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                            					newLeafNode(this_ID_3, grammarAccess.getImperativeActionDefAccess().getIDTerminalRuleCall_1_0_1());
                            				

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:778:4: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_14); 

                    				newLeafNode(this_ID_4, grammarAccess.getImperativeActionDefAccess().getIDTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:783:3: (otherlv_5= '[' ( (lv_preposition_6_0= rulePREP ) ) otherlv_7= ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBddDsl.g:784:4: otherlv_5= '[' ( (lv_preposition_6_0= rulePREP ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getImperativeActionDefAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalBddDsl.g:788:4: ( (lv_preposition_6_0= rulePREP ) )
                    // InternalBddDsl.g:789:5: (lv_preposition_6_0= rulePREP )
                    {
                    // InternalBddDsl.g:789:5: (lv_preposition_6_0= rulePREP )
                    // InternalBddDsl.g:790:6: lv_preposition_6_0= rulePREP
                    {

                    						newCompositeNode(grammarAccess.getImperativeActionDefAccess().getPrepositionPREPParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_preposition_6_0=rulePREP();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeActionDefRule());
                    						}
                    						set(
                    							current,
                    							"preposition",
                    							lv_preposition_6_0,
                    							"dk.sdu.bdd.xtext.BddDsl.PREP");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getImperativeActionDefAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:812:3: (otherlv_8= 'the' ( (lv_argument_9_0= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalBddDsl.g:813:4: otherlv_8= 'the' ( (lv_argument_9_0= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getImperativeActionDefAccess().getTheKeyword_3_0());
                    			
                    // InternalBddDsl.g:817:4: ( (lv_argument_9_0= RULE_ID ) )
                    // InternalBddDsl.g:818:5: (lv_argument_9_0= RULE_ID )
                    {
                    // InternalBddDsl.g:818:5: (lv_argument_9_0= RULE_ID )
                    // InternalBddDsl.g:819:6: lv_argument_9_0= RULE_ID
                    {
                    lv_argument_9_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_argument_9_0, grammarAccess.getImperativeActionDefAccess().getArgumentIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImperativeActionDefRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"argument",
                    							lv_argument_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeActionDef"


    // $ANTLR start "entryRuleActionDef"
    // InternalBddDsl.g:840:1: entryRuleActionDef returns [EObject current=null] : iv_ruleActionDef= ruleActionDef EOF ;
    public final EObject entryRuleActionDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionDef = null;


        try {
            // InternalBddDsl.g:840:50: (iv_ruleActionDef= ruleActionDef EOF )
            // InternalBddDsl.g:841:2: iv_ruleActionDef= ruleActionDef EOF
            {
             newCompositeNode(grammarAccess.getActionDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionDef=ruleActionDef();

            state._fsp--;

             current =iv_ruleActionDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionDef"


    // $ANTLR start "ruleActionDef"
    // InternalBddDsl.g:847:1: ruleActionDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID )? (otherlv_4= '[' ( (lv_preposition_5_0= rulePREP ) ) otherlv_6= ']' )? (otherlv_7= 'the' ( (lv_argument_8_0= RULE_ID ) ) )? ) ;
    public final EObject ruleActionDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_ID_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_argument_8_0=null;
        AntlrDatatypeRuleToken lv_preposition_5_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:853:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID )? (otherlv_4= '[' ( (lv_preposition_5_0= rulePREP ) ) otherlv_6= ']' )? (otherlv_7= 'the' ( (lv_argument_8_0= RULE_ID ) ) )? ) )
            // InternalBddDsl.g:854:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID )? (otherlv_4= '[' ( (lv_preposition_5_0= rulePREP ) ) otherlv_6= ']' )? (otherlv_7= 'the' ( (lv_argument_8_0= RULE_ID ) ) )? )
            {
            // InternalBddDsl.g:854:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID )? (otherlv_4= '[' ( (lv_preposition_5_0= rulePREP ) ) otherlv_6= ']' )? (otherlv_7= 'the' ( (lv_argument_8_0= RULE_ID ) ) )? )
            // InternalBddDsl.g:855:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID )? (otherlv_4= '[' ( (lv_preposition_5_0= rulePREP ) ) otherlv_6= ']' )? (otherlv_7= 'the' ( (lv_argument_8_0= RULE_ID ) ) )?
            {
            // InternalBddDsl.g:855:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBddDsl.g:856:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBddDsl.g:856:4: (lv_name_0_0= RULE_ID )
            // InternalBddDsl.g:857:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_0_0, grammarAccess.getActionDefAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBddDsl.g:873:3: ( (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            else if ( (LA26_0==25) ) {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==RULE_ID) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalBddDsl.g:874:4: (otherlv_1= 'and' | otherlv_2= 'the' ) this_ID_3= RULE_ID
                    {
                    // InternalBddDsl.g:874:4: (otherlv_1= 'and' | otherlv_2= 'the' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==24) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==25) ) {
                        alt25=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalBddDsl.g:875:5: otherlv_1= 'and'
                            {
                            otherlv_1=(Token)match(input,24,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getActionDefAccess().getAndKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:880:5: otherlv_2= 'the'
                            {
                            otherlv_2=(Token)match(input,25,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getActionDefAccess().getTheKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    				newLeafNode(this_ID_3, grammarAccess.getActionDefAccess().getIDTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:890:3: (otherlv_4= '[' ( (lv_preposition_5_0= rulePREP ) ) otherlv_6= ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBddDsl.g:891:4: otherlv_4= '[' ( (lv_preposition_5_0= rulePREP ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionDefAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalBddDsl.g:895:4: ( (lv_preposition_5_0= rulePREP ) )
                    // InternalBddDsl.g:896:5: (lv_preposition_5_0= rulePREP )
                    {
                    // InternalBddDsl.g:896:5: (lv_preposition_5_0= rulePREP )
                    // InternalBddDsl.g:897:6: lv_preposition_5_0= rulePREP
                    {

                    						newCompositeNode(grammarAccess.getActionDefAccess().getPrepositionPREPParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_preposition_5_0=rulePREP();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionDefRule());
                    						}
                    						set(
                    							current,
                    							"preposition",
                    							lv_preposition_5_0,
                    							"dk.sdu.bdd.xtext.BddDsl.PREP");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,27,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionDefAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalBddDsl.g:919:3: (otherlv_7= 'the' ( (lv_argument_8_0= RULE_ID ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalBddDsl.g:920:4: otherlv_7= 'the' ( (lv_argument_8_0= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getActionDefAccess().getTheKeyword_3_0());
                    			
                    // InternalBddDsl.g:924:4: ( (lv_argument_8_0= RULE_ID ) )
                    // InternalBddDsl.g:925:5: (lv_argument_8_0= RULE_ID )
                    {
                    // InternalBddDsl.g:925:5: (lv_argument_8_0= RULE_ID )
                    // InternalBddDsl.g:926:6: lv_argument_8_0= RULE_ID
                    {
                    lv_argument_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_argument_8_0, grammarAccess.getActionDefAccess().getArgumentIDTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getActionDefRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"argument",
                    							lv_argument_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionDef"


    // $ANTLR start "entryRulePREP"
    // InternalBddDsl.g:947:1: entryRulePREP returns [String current=null] : iv_rulePREP= rulePREP EOF ;
    public final String entryRulePREP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePREP = null;


        try {
            // InternalBddDsl.g:947:44: (iv_rulePREP= rulePREP EOF )
            // InternalBddDsl.g:948:2: iv_rulePREP= rulePREP EOF
            {
             newCompositeNode(grammarAccess.getPREPRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePREP=rulePREP();

            state._fsp--;

             current =iv_rulePREP.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePREP"


    // $ANTLR start "rulePREP"
    // InternalBddDsl.g:954:1: rulePREP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'on' | kw= 'of' | kw= 'in' | kw= 'from' | kw= 'to' | kw= 'into' | kw= 'for' | kw= 'with' | kw= 'out' | kw= 'off' | kw= 'up' | kw= 'down' )? ;
    public final AntlrDatatypeRuleToken rulePREP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBddDsl.g:960:2: ( (kw= 'on' | kw= 'of' | kw= 'in' | kw= 'from' | kw= 'to' | kw= 'into' | kw= 'for' | kw= 'with' | kw= 'out' | kw= 'off' | kw= 'up' | kw= 'down' )? )
            // InternalBddDsl.g:961:2: (kw= 'on' | kw= 'of' | kw= 'in' | kw= 'from' | kw= 'to' | kw= 'into' | kw= 'for' | kw= 'with' | kw= 'out' | kw= 'off' | kw= 'up' | kw= 'down' )?
            {
            // InternalBddDsl.g:961:2: (kw= 'on' | kw= 'of' | kw= 'in' | kw= 'from' | kw= 'to' | kw= 'into' | kw= 'for' | kw= 'with' | kw= 'out' | kw= 'off' | kw= 'up' | kw= 'down' )?
            int alt29=13;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalBddDsl.g:962:3: kw= 'on'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getOnKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:968:3: kw= 'of'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getOfKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:974:3: kw= 'in'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getInKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalBddDsl.g:980:3: kw= 'from'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getFromKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalBddDsl.g:986:3: kw= 'to'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getToKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalBddDsl.g:992:3: kw= 'into'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getIntoKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalBddDsl.g:998:3: kw= 'for'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getForKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalBddDsl.g:1004:3: kw= 'with'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getWithKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalBddDsl.g:1010:3: kw= 'out'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getOutKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalBddDsl.g:1016:3: kw= 'off'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getOffKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalBddDsl.g:1022:3: kw= 'up'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getUpKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalBddDsl.g:1028:3: kw= 'down'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPREPAccess().getDownKeyword_11());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePREP"


    // $ANTLR start "entryRuleStateDef"
    // InternalBddDsl.g:1037:1: entryRuleStateDef returns [EObject current=null] : iv_ruleStateDef= ruleStateDef EOF ;
    public final EObject entryRuleStateDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateDef = null;


        try {
            // InternalBddDsl.g:1037:49: (iv_ruleStateDef= ruleStateDef EOF )
            // InternalBddDsl.g:1038:2: iv_ruleStateDef= ruleStateDef EOF
            {
             newCompositeNode(grammarAccess.getStateDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateDef=ruleStateDef();

            state._fsp--;

             current =iv_ruleStateDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateDef"


    // $ANTLR start "ruleStateDef"
    // InternalBddDsl.g:1044:1: ruleStateDef returns [EObject current=null] : ( ( (lv_postive_0_0= ruleStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleStateName ) ) )? ) ;
    public final EObject ruleStateDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_postive_0_0 = null;

        EObject lv_negative_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1050:2: ( ( ( (lv_postive_0_0= ruleStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleStateName ) ) )? ) )
            // InternalBddDsl.g:1051:2: ( ( (lv_postive_0_0= ruleStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleStateName ) ) )? )
            {
            // InternalBddDsl.g:1051:2: ( ( (lv_postive_0_0= ruleStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleStateName ) ) )? )
            // InternalBddDsl.g:1052:3: ( (lv_postive_0_0= ruleStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleStateName ) ) )?
            {
            // InternalBddDsl.g:1052:3: ( (lv_postive_0_0= ruleStateName ) )
            // InternalBddDsl.g:1053:4: (lv_postive_0_0= ruleStateName )
            {
            // InternalBddDsl.g:1053:4: (lv_postive_0_0= ruleStateName )
            // InternalBddDsl.g:1054:5: lv_postive_0_0= ruleStateName
            {

            					newCompositeNode(grammarAccess.getStateDefAccess().getPostiveStateNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_postive_0_0=ruleStateName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateDefRule());
            					}
            					set(
            						current,
            						"postive",
            						lv_postive_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.StateName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1071:3: (otherlv_1= '/' ( (lv_negative_2_0= ruleStateName ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==40) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalBddDsl.g:1072:4: otherlv_1= '/' ( (lv_negative_2_0= ruleStateName ) )
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getStateDefAccess().getSolidusKeyword_1_0());
                    			
                    // InternalBddDsl.g:1076:4: ( (lv_negative_2_0= ruleStateName ) )
                    // InternalBddDsl.g:1077:5: (lv_negative_2_0= ruleStateName )
                    {
                    // InternalBddDsl.g:1077:5: (lv_negative_2_0= ruleStateName )
                    // InternalBddDsl.g:1078:6: lv_negative_2_0= ruleStateName
                    {

                    						newCompositeNode(grammarAccess.getStateDefAccess().getNegativeStateNameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_negative_2_0=ruleStateName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStateDefRule());
                    						}
                    						set(
                    							current,
                    							"negative",
                    							lv_negative_2_0,
                    							"dk.sdu.bdd.xtext.BddDsl.StateName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateDef"


    // $ANTLR start "entryRuleStateName"
    // InternalBddDsl.g:1100:1: entryRuleStateName returns [EObject current=null] : iv_ruleStateName= ruleStateName EOF ;
    public final EObject entryRuleStateName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateName = null;


        try {
            // InternalBddDsl.g:1100:50: (iv_ruleStateName= ruleStateName EOF )
            // InternalBddDsl.g:1101:2: iv_ruleStateName= ruleStateName EOF
            {
             newCompositeNode(grammarAccess.getStateNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateName=ruleStateName();

            state._fsp--;

             current =iv_ruleStateName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateName"


    // $ANTLR start "ruleStateName"
    // InternalBddDsl.g:1107:1: ruleStateName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'off' ) this_ID_3= RULE_ID )? ) ;
    public final EObject ruleStateName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1113:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'off' ) this_ID_3= RULE_ID )? ) )
            // InternalBddDsl.g:1114:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'off' ) this_ID_3= RULE_ID )? )
            {
            // InternalBddDsl.g:1114:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'off' ) this_ID_3= RULE_ID )? )
            // InternalBddDsl.g:1115:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'off' ) this_ID_3= RULE_ID )?
            {
            // InternalBddDsl.g:1115:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBddDsl.g:1116:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBddDsl.g:1116:4: (lv_name_0_0= RULE_ID )
            // InternalBddDsl.g:1117:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getStateNameAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBddDsl.g:1133:3: ( (otherlv_1= 'and' | otherlv_2= 'off' ) this_ID_3= RULE_ID )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==24||LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalBddDsl.g:1134:4: (otherlv_1= 'and' | otherlv_2= 'off' ) this_ID_3= RULE_ID
                    {
                    // InternalBddDsl.g:1134:4: (otherlv_1= 'and' | otherlv_2= 'off' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==24) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==37) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalBddDsl.g:1135:5: otherlv_1= 'and'
                            {
                            otherlv_1=(Token)match(input,24,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getStateNameAccess().getAndKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:1140:5: otherlv_2= 'off'
                            {
                            otherlv_2=(Token)match(input,37,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getStateNameAccess().getOffKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				newLeafNode(this_ID_3, grammarAccess.getStateNameAccess().getIDTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateName"


    // $ANTLR start "entryRulePropertyDef"
    // InternalBddDsl.g:1154:1: entryRulePropertyDef returns [EObject current=null] : iv_rulePropertyDef= rulePropertyDef EOF ;
    public final EObject entryRulePropertyDef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDef = null;


        try {
            // InternalBddDsl.g:1154:52: (iv_rulePropertyDef= rulePropertyDef EOF )
            // InternalBddDsl.g:1155:2: iv_rulePropertyDef= rulePropertyDef EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyDef=rulePropertyDef();

            state._fsp--;

             current =iv_rulePropertyDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyDef"


    // $ANTLR start "rulePropertyDef"
    // InternalBddDsl.g:1161:1: rulePropertyDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_ID_1= RULE_ID )? ) ;
    public final EObject rulePropertyDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1167:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_ID_1= RULE_ID )? ) )
            // InternalBddDsl.g:1168:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_ID_1= RULE_ID )? )
            {
            // InternalBddDsl.g:1168:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_ID_1= RULE_ID )? )
            // InternalBddDsl.g:1169:3: ( (lv_name_0_0= RULE_ID ) ) (this_ID_1= RULE_ID )?
            {
            // InternalBddDsl.g:1169:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBddDsl.g:1170:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBddDsl.g:1170:4: (lv_name_0_0= RULE_ID )
            // InternalBddDsl.g:1171:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropertyDefAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBddDsl.g:1187:3: (this_ID_1= RULE_ID )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalBddDsl.g:1188:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				newLeafNode(this_ID_1, grammarAccess.getPropertyDefAccess().getIDTerminalRuleCall_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyDef"


    // $ANTLR start "entryRuleImperativeStateDef"
    // InternalBddDsl.g:1197:1: entryRuleImperativeStateDef returns [EObject current=null] : iv_ruleImperativeStateDef= ruleImperativeStateDef EOF ;
    public final EObject entryRuleImperativeStateDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeStateDef = null;


        try {
            // InternalBddDsl.g:1197:59: (iv_ruleImperativeStateDef= ruleImperativeStateDef EOF )
            // InternalBddDsl.g:1198:2: iv_ruleImperativeStateDef= ruleImperativeStateDef EOF
            {
             newCompositeNode(grammarAccess.getImperativeStateDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeStateDef=ruleImperativeStateDef();

            state._fsp--;

             current =iv_ruleImperativeStateDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeStateDef"


    // $ANTLR start "ruleImperativeStateDef"
    // InternalBddDsl.g:1204:1: ruleImperativeStateDef returns [EObject current=null] : ( ( (lv_postive_0_0= ruleImperativeStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleImperativeStateName ) ) )? ) ;
    public final EObject ruleImperativeStateDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_postive_0_0 = null;

        EObject lv_negative_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1210:2: ( ( ( (lv_postive_0_0= ruleImperativeStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleImperativeStateName ) ) )? ) )
            // InternalBddDsl.g:1211:2: ( ( (lv_postive_0_0= ruleImperativeStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleImperativeStateName ) ) )? )
            {
            // InternalBddDsl.g:1211:2: ( ( (lv_postive_0_0= ruleImperativeStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleImperativeStateName ) ) )? )
            // InternalBddDsl.g:1212:3: ( (lv_postive_0_0= ruleImperativeStateName ) ) (otherlv_1= '/' ( (lv_negative_2_0= ruleImperativeStateName ) ) )?
            {
            // InternalBddDsl.g:1212:3: ( (lv_postive_0_0= ruleImperativeStateName ) )
            // InternalBddDsl.g:1213:4: (lv_postive_0_0= ruleImperativeStateName )
            {
            // InternalBddDsl.g:1213:4: (lv_postive_0_0= ruleImperativeStateName )
            // InternalBddDsl.g:1214:5: lv_postive_0_0= ruleImperativeStateName
            {

            					newCompositeNode(grammarAccess.getImperativeStateDefAccess().getPostiveImperativeStateNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_postive_0_0=ruleImperativeStateName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeStateDefRule());
            					}
            					set(
            						current,
            						"postive",
            						lv_postive_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeStateName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1231:3: (otherlv_1= '/' ( (lv_negative_2_0= ruleImperativeStateName ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalBddDsl.g:1232:4: otherlv_1= '/' ( (lv_negative_2_0= ruleImperativeStateName ) )
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getImperativeStateDefAccess().getSolidusKeyword_1_0());
                    			
                    // InternalBddDsl.g:1236:4: ( (lv_negative_2_0= ruleImperativeStateName ) )
                    // InternalBddDsl.g:1237:5: (lv_negative_2_0= ruleImperativeStateName )
                    {
                    // InternalBddDsl.g:1237:5: (lv_negative_2_0= ruleImperativeStateName )
                    // InternalBddDsl.g:1238:6: lv_negative_2_0= ruleImperativeStateName
                    {

                    						newCompositeNode(grammarAccess.getImperativeStateDefAccess().getNegativeImperativeStateNameParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_negative_2_0=ruleImperativeStateName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeStateDefRule());
                    						}
                    						set(
                    							current,
                    							"negative",
                    							lv_negative_2_0,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeStateName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeStateDef"


    // $ANTLR start "entryRuleImperativeStateName"
    // InternalBddDsl.g:1260:1: entryRuleImperativeStateName returns [EObject current=null] : iv_ruleImperativeStateName= ruleImperativeStateName EOF ;
    public final EObject entryRuleImperativeStateName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeStateName = null;


        try {
            // InternalBddDsl.g:1260:60: (iv_ruleImperativeStateName= ruleImperativeStateName EOF )
            // InternalBddDsl.g:1261:2: iv_ruleImperativeStateName= ruleImperativeStateName EOF
            {
             newCompositeNode(grammarAccess.getImperativeStateNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeStateName=ruleImperativeStateName();

            state._fsp--;

             current =iv_ruleImperativeStateName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeStateName"


    // $ANTLR start "ruleImperativeStateName"
    // InternalBddDsl.g:1267:1: ruleImperativeStateName returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'off' ) this_ID_3= RULE_ID )? ) ;
    public final EObject ruleImperativeStateName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_ID_3=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1273:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'off' ) this_ID_3= RULE_ID )? ) )
            // InternalBddDsl.g:1274:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'off' ) this_ID_3= RULE_ID )? )
            {
            // InternalBddDsl.g:1274:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'off' ) this_ID_3= RULE_ID )? )
            // InternalBddDsl.g:1275:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= 'and' | otherlv_2= 'off' ) this_ID_3= RULE_ID )?
            {
            // InternalBddDsl.g:1275:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBddDsl.g:1276:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBddDsl.g:1276:4: (lv_name_0_0= RULE_ID )
            // InternalBddDsl.g:1277:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_0_0, grammarAccess.getImperativeStateNameAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativeStateNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBddDsl.g:1293:3: ( (otherlv_1= 'and' | otherlv_2= 'off' ) this_ID_3= RULE_ID )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==24||LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalBddDsl.g:1294:4: (otherlv_1= 'and' | otherlv_2= 'off' ) this_ID_3= RULE_ID
                    {
                    // InternalBddDsl.g:1294:4: (otherlv_1= 'and' | otherlv_2= 'off' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==24) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==37) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalBddDsl.g:1295:5: otherlv_1= 'and'
                            {
                            otherlv_1=(Token)match(input,24,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getImperativeStateNameAccess().getAndKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalBddDsl.g:1300:5: otherlv_2= 'off'
                            {
                            otherlv_2=(Token)match(input,37,FOLLOW_3); 

                            					newLeafNode(otherlv_2, grammarAccess.getImperativeStateNameAccess().getOffKeyword_1_0_1());
                            				

                            }
                            break;

                    }

                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				newLeafNode(this_ID_3, grammarAccess.getImperativeStateNameAccess().getIDTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeStateName"


    // $ANTLR start "entryRuleImperativePropertyDef"
    // InternalBddDsl.g:1314:1: entryRuleImperativePropertyDef returns [EObject current=null] : iv_ruleImperativePropertyDef= ruleImperativePropertyDef EOF ;
    public final EObject entryRuleImperativePropertyDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativePropertyDef = null;


        try {
            // InternalBddDsl.g:1314:62: (iv_ruleImperativePropertyDef= ruleImperativePropertyDef EOF )
            // InternalBddDsl.g:1315:2: iv_ruleImperativePropertyDef= ruleImperativePropertyDef EOF
            {
             newCompositeNode(grammarAccess.getImperativePropertyDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativePropertyDef=ruleImperativePropertyDef();

            state._fsp--;

             current =iv_ruleImperativePropertyDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativePropertyDef"


    // $ANTLR start "ruleImperativePropertyDef"
    // InternalBddDsl.g:1321:1: ruleImperativePropertyDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (this_ID_1= RULE_ID )? ) ;
    public final EObject ruleImperativePropertyDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1327:2: ( ( ( (lv_name_0_0= RULE_ID ) ) (this_ID_1= RULE_ID )? ) )
            // InternalBddDsl.g:1328:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_ID_1= RULE_ID )? )
            {
            // InternalBddDsl.g:1328:2: ( ( (lv_name_0_0= RULE_ID ) ) (this_ID_1= RULE_ID )? )
            // InternalBddDsl.g:1329:3: ( (lv_name_0_0= RULE_ID ) ) (this_ID_1= RULE_ID )?
            {
            // InternalBddDsl.g:1329:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBddDsl.g:1330:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBddDsl.g:1330:4: (lv_name_0_0= RULE_ID )
            // InternalBddDsl.g:1331:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_0_0, grammarAccess.getImperativePropertyDefAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativePropertyDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBddDsl.g:1347:3: (this_ID_1= RULE_ID )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalBddDsl.g:1348:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    				newLeafNode(this_ID_1, grammarAccess.getImperativePropertyDefAccess().getIDTerminalRuleCall_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativePropertyDef"


    // $ANTLR start "entryRuleScenario"
    // InternalBddDsl.g:1357:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalBddDsl.g:1357:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalBddDsl.g:1358:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalBddDsl.g:1364:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'Scenario:' ( (lv_scenarioName_1_0= RULE_STRING ) ) otherlv_2= 'Given' ( (lv_preStateE_3_0= ruleDeclarativeScenarioState ) ) ( (lv_imperative1_4_0= ruleImperativeScenario ) )? otherlv_5= 'When' ( (lv_actionE_6_0= ruleDeclarativeScenarioAction ) ) ( (lv_imperative2_7_0= ruleImperativeScenario ) )? otherlv_8= 'Then' ( (lv_preStateE1_9_0= ruleDeclarativeScenarioState ) ) ( (lv_imperative3_10_0= ruleImperativeScenario ) )? ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_scenarioName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_preStateE_3_0 = null;

        EObject lv_imperative1_4_0 = null;

        EObject lv_actionE_6_0 = null;

        EObject lv_imperative2_7_0 = null;

        EObject lv_preStateE1_9_0 = null;

        EObject lv_imperative3_10_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1370:2: ( (otherlv_0= 'Scenario:' ( (lv_scenarioName_1_0= RULE_STRING ) ) otherlv_2= 'Given' ( (lv_preStateE_3_0= ruleDeclarativeScenarioState ) ) ( (lv_imperative1_4_0= ruleImperativeScenario ) )? otherlv_5= 'When' ( (lv_actionE_6_0= ruleDeclarativeScenarioAction ) ) ( (lv_imperative2_7_0= ruleImperativeScenario ) )? otherlv_8= 'Then' ( (lv_preStateE1_9_0= ruleDeclarativeScenarioState ) ) ( (lv_imperative3_10_0= ruleImperativeScenario ) )? ) )
            // InternalBddDsl.g:1371:2: (otherlv_0= 'Scenario:' ( (lv_scenarioName_1_0= RULE_STRING ) ) otherlv_2= 'Given' ( (lv_preStateE_3_0= ruleDeclarativeScenarioState ) ) ( (lv_imperative1_4_0= ruleImperativeScenario ) )? otherlv_5= 'When' ( (lv_actionE_6_0= ruleDeclarativeScenarioAction ) ) ( (lv_imperative2_7_0= ruleImperativeScenario ) )? otherlv_8= 'Then' ( (lv_preStateE1_9_0= ruleDeclarativeScenarioState ) ) ( (lv_imperative3_10_0= ruleImperativeScenario ) )? )
            {
            // InternalBddDsl.g:1371:2: (otherlv_0= 'Scenario:' ( (lv_scenarioName_1_0= RULE_STRING ) ) otherlv_2= 'Given' ( (lv_preStateE_3_0= ruleDeclarativeScenarioState ) ) ( (lv_imperative1_4_0= ruleImperativeScenario ) )? otherlv_5= 'When' ( (lv_actionE_6_0= ruleDeclarativeScenarioAction ) ) ( (lv_imperative2_7_0= ruleImperativeScenario ) )? otherlv_8= 'Then' ( (lv_preStateE1_9_0= ruleDeclarativeScenarioState ) ) ( (lv_imperative3_10_0= ruleImperativeScenario ) )? )
            // InternalBddDsl.g:1372:3: otherlv_0= 'Scenario:' ( (lv_scenarioName_1_0= RULE_STRING ) ) otherlv_2= 'Given' ( (lv_preStateE_3_0= ruleDeclarativeScenarioState ) ) ( (lv_imperative1_4_0= ruleImperativeScenario ) )? otherlv_5= 'When' ( (lv_actionE_6_0= ruleDeclarativeScenarioAction ) ) ( (lv_imperative2_7_0= ruleImperativeScenario ) )? otherlv_8= 'Then' ( (lv_preStateE1_9_0= ruleDeclarativeScenarioState ) ) ( (lv_imperative3_10_0= ruleImperativeScenario ) )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalBddDsl.g:1376:3: ( (lv_scenarioName_1_0= RULE_STRING ) )
            // InternalBddDsl.g:1377:4: (lv_scenarioName_1_0= RULE_STRING )
            {
            // InternalBddDsl.g:1377:4: (lv_scenarioName_1_0= RULE_STRING )
            // InternalBddDsl.g:1378:5: lv_scenarioName_1_0= RULE_STRING
            {
            lv_scenarioName_1_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_scenarioName_1_0, grammarAccess.getScenarioAccess().getScenarioNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScenarioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"scenarioName",
            						lv_scenarioName_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,42,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getGivenKeyword_2());
            		
            // InternalBddDsl.g:1398:3: ( (lv_preStateE_3_0= ruleDeclarativeScenarioState ) )
            // InternalBddDsl.g:1399:4: (lv_preStateE_3_0= ruleDeclarativeScenarioState )
            {
            // InternalBddDsl.g:1399:4: (lv_preStateE_3_0= ruleDeclarativeScenarioState )
            // InternalBddDsl.g:1400:5: lv_preStateE_3_0= ruleDeclarativeScenarioState
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getPreStateEDeclarativeScenarioStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_preStateE_3_0=ruleDeclarativeScenarioState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"preStateE",
            						lv_preStateE_3_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeScenarioState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1417:3: ( (lv_imperative1_4_0= ruleImperativeScenario ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalBddDsl.g:1418:4: (lv_imperative1_4_0= ruleImperativeScenario )
                    {
                    // InternalBddDsl.g:1418:4: (lv_imperative1_4_0= ruleImperativeScenario )
                    // InternalBddDsl.g:1419:5: lv_imperative1_4_0= ruleImperativeScenario
                    {

                    					newCompositeNode(grammarAccess.getScenarioAccess().getImperative1ImperativeScenarioParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_26);
                    lv_imperative1_4_0=ruleImperativeScenario();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioRule());
                    					}
                    					set(
                    						current,
                    						"imperative1",
                    						lv_imperative1_4_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ImperativeScenario");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,43,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getScenarioAccess().getWhenKeyword_5());
            		
            // InternalBddDsl.g:1440:3: ( (lv_actionE_6_0= ruleDeclarativeScenarioAction ) )
            // InternalBddDsl.g:1441:4: (lv_actionE_6_0= ruleDeclarativeScenarioAction )
            {
            // InternalBddDsl.g:1441:4: (lv_actionE_6_0= ruleDeclarativeScenarioAction )
            // InternalBddDsl.g:1442:5: lv_actionE_6_0= ruleDeclarativeScenarioAction
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getActionEDeclarativeScenarioActionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_28);
            lv_actionE_6_0=ruleDeclarativeScenarioAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"actionE",
            						lv_actionE_6_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeScenarioAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1459:3: ( (lv_imperative2_7_0= ruleImperativeScenario ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==45) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalBddDsl.g:1460:4: (lv_imperative2_7_0= ruleImperativeScenario )
                    {
                    // InternalBddDsl.g:1460:4: (lv_imperative2_7_0= ruleImperativeScenario )
                    // InternalBddDsl.g:1461:5: lv_imperative2_7_0= ruleImperativeScenario
                    {

                    					newCompositeNode(grammarAccess.getScenarioAccess().getImperative2ImperativeScenarioParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_29);
                    lv_imperative2_7_0=ruleImperativeScenario();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioRule());
                    					}
                    					set(
                    						current,
                    						"imperative2",
                    						lv_imperative2_7_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ImperativeScenario");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,44,FOLLOW_24); 

            			newLeafNode(otherlv_8, grammarAccess.getScenarioAccess().getThenKeyword_8());
            		
            // InternalBddDsl.g:1482:3: ( (lv_preStateE1_9_0= ruleDeclarativeScenarioState ) )
            // InternalBddDsl.g:1483:4: (lv_preStateE1_9_0= ruleDeclarativeScenarioState )
            {
            // InternalBddDsl.g:1483:4: (lv_preStateE1_9_0= ruleDeclarativeScenarioState )
            // InternalBddDsl.g:1484:5: lv_preStateE1_9_0= ruleDeclarativeScenarioState
            {

            					newCompositeNode(grammarAccess.getScenarioAccess().getPreStateE1DeclarativeScenarioStateParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_30);
            lv_preStateE1_9_0=ruleDeclarativeScenarioState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScenarioRule());
            					}
            					set(
            						current,
            						"preStateE1",
            						lv_preStateE1_9_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeScenarioState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:1501:3: ( (lv_imperative3_10_0= ruleImperativeScenario ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalBddDsl.g:1502:4: (lv_imperative3_10_0= ruleImperativeScenario )
                    {
                    // InternalBddDsl.g:1502:4: (lv_imperative3_10_0= ruleImperativeScenario )
                    // InternalBddDsl.g:1503:5: lv_imperative3_10_0= ruleImperativeScenario
                    {

                    					newCompositeNode(grammarAccess.getScenarioAccess().getImperative3ImperativeScenarioParserRuleCall_10_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_imperative3_10_0=ruleImperativeScenario();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getScenarioRule());
                    					}
                    					set(
                    						current,
                    						"imperative3",
                    						lv_imperative3_10_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ImperativeScenario");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleImperativeScenario"
    // InternalBddDsl.g:1524:1: entryRuleImperativeScenario returns [EObject current=null] : iv_ruleImperativeScenario= ruleImperativeScenario EOF ;
    public final EObject entryRuleImperativeScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeScenario = null;


        try {
            // InternalBddDsl.g:1524:59: (iv_ruleImperativeScenario= ruleImperativeScenario EOF )
            // InternalBddDsl.g:1525:2: iv_ruleImperativeScenario= ruleImperativeScenario EOF
            {
             newCompositeNode(grammarAccess.getImperativeScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeScenario=ruleImperativeScenario();

            state._fsp--;

             current =iv_ruleImperativeScenario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeScenario"


    // $ANTLR start "ruleImperativeScenario"
    // InternalBddDsl.g:1531:1: ruleImperativeScenario returns [EObject current=null] : (otherlv_0= 'which' otherlv_1= 'means' otherlv_2= 'Given' ( (lv_preState_3_0= ruleImperativeScenarioState ) ) otherlv_4= 'When' ( (lv_action_5_0= ruleImperativeScenarioAction ) ) otherlv_6= 'Then' ( (lv_postState_7_0= ruleImperativeScenarioState ) ) ) ;
    public final EObject ruleImperativeScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_preState_3_0 = null;

        EObject lv_action_5_0 = null;

        EObject lv_postState_7_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1537:2: ( (otherlv_0= 'which' otherlv_1= 'means' otherlv_2= 'Given' ( (lv_preState_3_0= ruleImperativeScenarioState ) ) otherlv_4= 'When' ( (lv_action_5_0= ruleImperativeScenarioAction ) ) otherlv_6= 'Then' ( (lv_postState_7_0= ruleImperativeScenarioState ) ) ) )
            // InternalBddDsl.g:1538:2: (otherlv_0= 'which' otherlv_1= 'means' otherlv_2= 'Given' ( (lv_preState_3_0= ruleImperativeScenarioState ) ) otherlv_4= 'When' ( (lv_action_5_0= ruleImperativeScenarioAction ) ) otherlv_6= 'Then' ( (lv_postState_7_0= ruleImperativeScenarioState ) ) )
            {
            // InternalBddDsl.g:1538:2: (otherlv_0= 'which' otherlv_1= 'means' otherlv_2= 'Given' ( (lv_preState_3_0= ruleImperativeScenarioState ) ) otherlv_4= 'When' ( (lv_action_5_0= ruleImperativeScenarioAction ) ) otherlv_6= 'Then' ( (lv_postState_7_0= ruleImperativeScenarioState ) ) )
            // InternalBddDsl.g:1539:3: otherlv_0= 'which' otherlv_1= 'means' otherlv_2= 'Given' ( (lv_preState_3_0= ruleImperativeScenarioState ) ) otherlv_4= 'When' ( (lv_action_5_0= ruleImperativeScenarioAction ) ) otherlv_6= 'Then' ( (lv_postState_7_0= ruleImperativeScenarioState ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getImperativeScenarioAccess().getWhichKeyword_0());
            		
            otherlv_1=(Token)match(input,46,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getImperativeScenarioAccess().getMeansKeyword_1());
            		
            otherlv_2=(Token)match(input,42,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getImperativeScenarioAccess().getGivenKeyword_2());
            		
            // InternalBddDsl.g:1551:3: ( (lv_preState_3_0= ruleImperativeScenarioState ) )
            // InternalBddDsl.g:1552:4: (lv_preState_3_0= ruleImperativeScenarioState )
            {
            // InternalBddDsl.g:1552:4: (lv_preState_3_0= ruleImperativeScenarioState )
            // InternalBddDsl.g:1553:5: lv_preState_3_0= ruleImperativeScenarioState
            {

            					newCompositeNode(grammarAccess.getImperativeScenarioAccess().getPreStateImperativeScenarioStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_preState_3_0=ruleImperativeScenarioState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeScenarioRule());
            					}
            					set(
            						current,
            						"preState",
            						lv_preState_3_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeScenarioState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,43,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getImperativeScenarioAccess().getWhenKeyword_4());
            		
            // InternalBddDsl.g:1574:3: ( (lv_action_5_0= ruleImperativeScenarioAction ) )
            // InternalBddDsl.g:1575:4: (lv_action_5_0= ruleImperativeScenarioAction )
            {
            // InternalBddDsl.g:1575:4: (lv_action_5_0= ruleImperativeScenarioAction )
            // InternalBddDsl.g:1576:5: lv_action_5_0= ruleImperativeScenarioAction
            {

            					newCompositeNode(grammarAccess.getImperativeScenarioAccess().getActionImperativeScenarioActionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
            lv_action_5_0=ruleImperativeScenarioAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeScenarioRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_5_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeScenarioAction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,44,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getImperativeScenarioAccess().getThenKeyword_6());
            		
            // InternalBddDsl.g:1597:3: ( (lv_postState_7_0= ruleImperativeScenarioState ) )
            // InternalBddDsl.g:1598:4: (lv_postState_7_0= ruleImperativeScenarioState )
            {
            // InternalBddDsl.g:1598:4: (lv_postState_7_0= ruleImperativeScenarioState )
            // InternalBddDsl.g:1599:5: lv_postState_7_0= ruleImperativeScenarioState
            {

            					newCompositeNode(grammarAccess.getImperativeScenarioAccess().getPostStateImperativeScenarioStateParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_postState_7_0=ruleImperativeScenarioState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeScenarioRule());
            					}
            					set(
            						current,
            						"postState",
            						lv_postState_7_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeScenarioState");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeScenario"


    // $ANTLR start "entryRulePrePostWords"
    // InternalBddDsl.g:1620:1: entryRulePrePostWords returns [String current=null] : iv_rulePrePostWords= rulePrePostWords EOF ;
    public final String entryRulePrePostWords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrePostWords = null;


        try {
            // InternalBddDsl.g:1620:52: (iv_rulePrePostWords= rulePrePostWords EOF )
            // InternalBddDsl.g:1621:2: iv_rulePrePostWords= rulePrePostWords EOF
            {
             newCompositeNode(grammarAccess.getPrePostWordsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrePostWords=rulePrePostWords();

            state._fsp--;

             current =iv_rulePrePostWords.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrePostWords"


    // $ANTLR start "rulePrePostWords"
    // InternalBddDsl.g:1627:1: rulePrePostWords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'all' )? ;
    public final AntlrDatatypeRuleToken rulePrePostWords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1633:2: ( (kw= 'all' )? )
            // InternalBddDsl.g:1634:2: (kw= 'all' )?
            {
            // InternalBddDsl.g:1634:2: (kw= 'all' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalBddDsl.g:1635:3: kw= 'all'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrePostWordsAccess().getAllKeyword());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrePostWords"


    // $ANTLR start "entryRuleToBeWords"
    // InternalBddDsl.g:1644:1: entryRuleToBeWords returns [String current=null] : iv_ruleToBeWords= ruleToBeWords EOF ;
    public final String entryRuleToBeWords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleToBeWords = null;


        try {
            // InternalBddDsl.g:1644:49: (iv_ruleToBeWords= ruleToBeWords EOF )
            // InternalBddDsl.g:1645:2: iv_ruleToBeWords= ruleToBeWords EOF
            {
             newCompositeNode(grammarAccess.getToBeWordsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToBeWords=ruleToBeWords();

            state._fsp--;

             current =iv_ruleToBeWords.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleToBeWords"


    // $ANTLR start "ruleToBeWords"
    // InternalBddDsl.g:1651:1: ruleToBeWords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'is' | kw= 'are' | (kw= 'is' kw= 'not' ) | (kw= 'are' kw= 'not' ) )? ;
    public final AntlrDatatypeRuleToken ruleToBeWords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1657:2: ( (kw= 'is' | kw= 'are' | (kw= 'is' kw= 'not' ) | (kw= 'are' kw= 'not' ) )? )
            // InternalBddDsl.g:1658:2: (kw= 'is' | kw= 'are' | (kw= 'is' kw= 'not' ) | (kw= 'are' kw= 'not' ) )?
            {
            // InternalBddDsl.g:1658:2: (kw= 'is' | kw= 'are' | (kw= 'is' kw= 'not' ) | (kw= 'are' kw= 'not' ) )?
            int alt42=5;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==16) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==49) ) {
                    alt42=3;
                }
                else if ( (LA42_1==EOF||(LA42_1>=RULE_ID && LA42_1<=RULE_STRING)||LA42_1==52) ) {
                    alt42=1;
                }
            }
            else if ( (LA42_0==48) ) {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==49) ) {
                    alt42=4;
                }
                else if ( (LA42_2==EOF||(LA42_2>=RULE_ID && LA42_2<=RULE_STRING)||LA42_2==52) ) {
                    alt42=2;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalBddDsl.g:1659:3: kw= 'is'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getToBeWordsAccess().getIsKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1665:3: kw= 'are'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getToBeWordsAccess().getAreKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:1671:3: (kw= 'is' kw= 'not' )
                    {
                    // InternalBddDsl.g:1671:3: (kw= 'is' kw= 'not' )
                    // InternalBddDsl.g:1672:4: kw= 'is' kw= 'not'
                    {
                    kw=(Token)match(input,16,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getToBeWordsAccess().getIsKeyword_2_0());
                    			
                    kw=(Token)match(input,49,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getToBeWordsAccess().getNotKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalBddDsl.g:1684:3: (kw= 'are' kw= 'not' )
                    {
                    // InternalBddDsl.g:1684:3: (kw= 'are' kw= 'not' )
                    // InternalBddDsl.g:1685:4: kw= 'are' kw= 'not'
                    {
                    kw=(Token)match(input,48,FOLLOW_32); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getToBeWordsAccess().getAreKeyword_3_0());
                    			
                    kw=(Token)match(input,49,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getToBeWordsAccess().getNotKeyword_3_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleToBeWords"


    // $ANTLR start "entryRuleDebugStatement"
    // InternalBddDsl.g:1700:1: entryRuleDebugStatement returns [String current=null] : iv_ruleDebugStatement= ruleDebugStatement EOF ;
    public final String entryRuleDebugStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDebugStatement = null;


        try {
            // InternalBddDsl.g:1700:54: (iv_ruleDebugStatement= ruleDebugStatement EOF )
            // InternalBddDsl.g:1701:2: iv_ruleDebugStatement= ruleDebugStatement EOF
            {
             newCompositeNode(grammarAccess.getDebugStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDebugStatement=ruleDebugStatement();

            state._fsp--;

             current =iv_ruleDebugStatement.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDebugStatement"


    // $ANTLR start "ruleDebugStatement"
    // InternalBddDsl.g:1707:1: ruleDebugStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'pause' ;
    public final AntlrDatatypeRuleToken ruleDebugStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalBddDsl.g:1713:2: (kw= 'pause' )
            // InternalBddDsl.g:1714:2: kw= 'pause'
            {
            kw=(Token)match(input,50,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDebugStatementAccess().getPauseKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDebugStatement"


    // $ANTLR start "entryRuleDeclarativeScenarioState"
    // InternalBddDsl.g:1722:1: entryRuleDeclarativeScenarioState returns [EObject current=null] : iv_ruleDeclarativeScenarioState= ruleDeclarativeScenarioState EOF ;
    public final EObject entryRuleDeclarativeScenarioState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeScenarioState = null;


        try {
            // InternalBddDsl.g:1722:65: (iv_ruleDeclarativeScenarioState= ruleDeclarativeScenarioState EOF )
            // InternalBddDsl.g:1723:2: iv_ruleDeclarativeScenarioState= ruleDeclarativeScenarioState EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeScenarioStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeScenarioState=ruleDeclarativeScenarioState();

            state._fsp--;

             current =iv_ruleDeclarativeScenarioState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarativeScenarioState"


    // $ANTLR start "ruleDeclarativeScenarioState"
    // InternalBddDsl.g:1729:1: ruleDeclarativeScenarioState returns [EObject current=null] : ( rulePrePostWords ( ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) ) ) (otherlv_2= 'And' ( (lv_andStates_3_0= ruleDeclarativeScenarioStateAnd ) ) )* ) ;
    public final EObject ruleDeclarativeScenarioState() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_states_1_1 = null;

        EObject lv_states_1_2 = null;

        EObject lv_states_1_3 = null;

        EObject lv_andStates_3_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1735:2: ( ( rulePrePostWords ( ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) ) ) (otherlv_2= 'And' ( (lv_andStates_3_0= ruleDeclarativeScenarioStateAnd ) ) )* ) )
            // InternalBddDsl.g:1736:2: ( rulePrePostWords ( ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) ) ) (otherlv_2= 'And' ( (lv_andStates_3_0= ruleDeclarativeScenarioStateAnd ) ) )* )
            {
            // InternalBddDsl.g:1736:2: ( rulePrePostWords ( ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) ) ) (otherlv_2= 'And' ( (lv_andStates_3_0= ruleDeclarativeScenarioStateAnd ) ) )* )
            // InternalBddDsl.g:1737:3: rulePrePostWords ( ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) ) ) (otherlv_2= 'And' ( (lv_andStates_3_0= ruleDeclarativeScenarioStateAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getDeclarativeScenarioStateAccess().getPrePostWordsParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            rulePrePostWords();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalBddDsl.g:1744:3: ( ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) ) )
            // InternalBddDsl.g:1745:4: ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) )
            {
            // InternalBddDsl.g:1745:4: ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) )
            // InternalBddDsl.g:1746:5: (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty )
            {
            // InternalBddDsl.g:1746:5: (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty )
            int alt43=3;
            alt43 = dfa43.predict(input);
            switch (alt43) {
                case 1 :
                    // InternalBddDsl.g:1747:6: lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeScenarioStateAccess().getStatesDeclarativeEntityPropertyStatePhraseParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_states_1_1=ruleDeclarativeEntityPropertyStatePhrase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeScenarioStateRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_1_1,
                    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityPropertyStatePhrase");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1763:6: lv_states_1_2= ruleDeclarativeEntityStatePhrase
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeScenarioStateAccess().getStatesDeclarativeEntityStatePhraseParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_33);
                    lv_states_1_2=ruleDeclarativeEntityStatePhrase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeScenarioStateRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_1_2,
                    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityStatePhrase");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:1779:6: lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeScenarioStateAccess().getStatesDeclarativeEntityStatePhraseWithPropertyParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_33);
                    lv_states_1_3=ruleDeclarativeEntityStatePhraseWithProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeScenarioStateRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_1_3,
                    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityStatePhraseWithProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalBddDsl.g:1797:3: (otherlv_2= 'And' ( (lv_andStates_3_0= ruleDeclarativeScenarioStateAnd ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==51) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalBddDsl.g:1798:4: otherlv_2= 'And' ( (lv_andStates_3_0= ruleDeclarativeScenarioStateAnd ) )
            	    {
            	    otherlv_2=(Token)match(input,51,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDeclarativeScenarioStateAccess().getAndKeyword_2_0());
            	    			
            	    // InternalBddDsl.g:1802:4: ( (lv_andStates_3_0= ruleDeclarativeScenarioStateAnd ) )
            	    // InternalBddDsl.g:1803:5: (lv_andStates_3_0= ruleDeclarativeScenarioStateAnd )
            	    {
            	    // InternalBddDsl.g:1803:5: (lv_andStates_3_0= ruleDeclarativeScenarioStateAnd )
            	    // InternalBddDsl.g:1804:6: lv_andStates_3_0= ruleDeclarativeScenarioStateAnd
            	    {

            	    						newCompositeNode(grammarAccess.getDeclarativeScenarioStateAccess().getAndStatesDeclarativeScenarioStateAndParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_andStates_3_0=ruleDeclarativeScenarioStateAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclarativeScenarioStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"andStates",
            	    							lv_andStates_3_0,
            	    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeScenarioStateAnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarativeScenarioState"


    // $ANTLR start "entryRuleDeclarativeScenarioStateAnd"
    // InternalBddDsl.g:1826:1: entryRuleDeclarativeScenarioStateAnd returns [EObject current=null] : iv_ruleDeclarativeScenarioStateAnd= ruleDeclarativeScenarioStateAnd EOF ;
    public final EObject entryRuleDeclarativeScenarioStateAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeScenarioStateAnd = null;


        try {
            // InternalBddDsl.g:1826:68: (iv_ruleDeclarativeScenarioStateAnd= ruleDeclarativeScenarioStateAnd EOF )
            // InternalBddDsl.g:1827:2: iv_ruleDeclarativeScenarioStateAnd= ruleDeclarativeScenarioStateAnd EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeScenarioStateAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeScenarioStateAnd=ruleDeclarativeScenarioStateAnd();

            state._fsp--;

             current =iv_ruleDeclarativeScenarioStateAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarativeScenarioStateAnd"


    // $ANTLR start "ruleDeclarativeScenarioStateAnd"
    // InternalBddDsl.g:1833:1: ruleDeclarativeScenarioStateAnd returns [EObject current=null] : ( rulePrePostWords ( ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) ) ) ) ;
    public final EObject ruleDeclarativeScenarioStateAnd() throws RecognitionException {
        EObject current = null;

        EObject lv_states_1_1 = null;

        EObject lv_states_1_2 = null;

        EObject lv_states_1_3 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1839:2: ( ( rulePrePostWords ( ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) ) ) ) )
            // InternalBddDsl.g:1840:2: ( rulePrePostWords ( ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) ) ) )
            {
            // InternalBddDsl.g:1840:2: ( rulePrePostWords ( ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) ) ) )
            // InternalBddDsl.g:1841:3: rulePrePostWords ( ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) ) )
            {

            			newCompositeNode(grammarAccess.getDeclarativeScenarioStateAndAccess().getPrePostWordsParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            rulePrePostWords();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalBddDsl.g:1848:3: ( ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) ) )
            // InternalBddDsl.g:1849:4: ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) )
            {
            // InternalBddDsl.g:1849:4: ( (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty ) )
            // InternalBddDsl.g:1850:5: (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty )
            {
            // InternalBddDsl.g:1850:5: (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty )
            int alt45=3;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // InternalBddDsl.g:1851:6: lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeScenarioStateAndAccess().getStatesDeclarativeEntityPropertyStatePhraseParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_states_1_1=ruleDeclarativeEntityPropertyStatePhrase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeScenarioStateAndRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_1_1,
                    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityPropertyStatePhrase");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1867:6: lv_states_1_2= ruleDeclarativeEntityStatePhrase
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeScenarioStateAndAccess().getStatesDeclarativeEntityStatePhraseParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_states_1_2=ruleDeclarativeEntityStatePhrase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeScenarioStateAndRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_1_2,
                    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityStatePhrase");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:1883:6: lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeScenarioStateAndAccess().getStatesDeclarativeEntityStatePhraseWithPropertyParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_states_1_3=ruleDeclarativeEntityStatePhraseWithProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeScenarioStateAndRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_1_3,
                    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityStatePhraseWithProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarativeScenarioStateAnd"


    // $ANTLR start "entryRuleImperativeScenarioState"
    // InternalBddDsl.g:1905:1: entryRuleImperativeScenarioState returns [EObject current=null] : iv_ruleImperativeScenarioState= ruleImperativeScenarioState EOF ;
    public final EObject entryRuleImperativeScenarioState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeScenarioState = null;


        try {
            // InternalBddDsl.g:1905:64: (iv_ruleImperativeScenarioState= ruleImperativeScenarioState EOF )
            // InternalBddDsl.g:1906:2: iv_ruleImperativeScenarioState= ruleImperativeScenarioState EOF
            {
             newCompositeNode(grammarAccess.getImperativeScenarioStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeScenarioState=ruleImperativeScenarioState();

            state._fsp--;

             current =iv_ruleImperativeScenarioState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeScenarioState"


    // $ANTLR start "ruleImperativeScenarioState"
    // InternalBddDsl.g:1912:1: ruleImperativeScenarioState returns [EObject current=null] : ( rulePrePostWords ( ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) ) ) (otherlv_2= 'And' ( (lv_andStates_3_0= ruleImperativeScenarioStateAnd ) ) )* ) ;
    public final EObject ruleImperativeScenarioState() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_states_1_1 = null;

        EObject lv_states_1_2 = null;

        EObject lv_states_1_3 = null;

        EObject lv_andStates_3_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:1918:2: ( ( rulePrePostWords ( ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) ) ) (otherlv_2= 'And' ( (lv_andStates_3_0= ruleImperativeScenarioStateAnd ) ) )* ) )
            // InternalBddDsl.g:1919:2: ( rulePrePostWords ( ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) ) ) (otherlv_2= 'And' ( (lv_andStates_3_0= ruleImperativeScenarioStateAnd ) ) )* )
            {
            // InternalBddDsl.g:1919:2: ( rulePrePostWords ( ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) ) ) (otherlv_2= 'And' ( (lv_andStates_3_0= ruleImperativeScenarioStateAnd ) ) )* )
            // InternalBddDsl.g:1920:3: rulePrePostWords ( ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) ) ) (otherlv_2= 'And' ( (lv_andStates_3_0= ruleImperativeScenarioStateAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getImperativeScenarioStateAccess().getPrePostWordsParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            rulePrePostWords();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalBddDsl.g:1927:3: ( ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) ) )
            // InternalBddDsl.g:1928:4: ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) )
            {
            // InternalBddDsl.g:1928:4: ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) )
            // InternalBddDsl.g:1929:5: (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty )
            {
            // InternalBddDsl.g:1929:5: (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty )
            int alt46=3;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // InternalBddDsl.g:1930:6: lv_states_1_1= ruleImperativeEntityPropertyStatePhrase
                    {

                    						newCompositeNode(grammarAccess.getImperativeScenarioStateAccess().getStatesImperativeEntityPropertyStatePhraseParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_states_1_1=ruleImperativeEntityPropertyStatePhrase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeScenarioStateRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_1_1,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityPropertyStatePhrase");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:1946:6: lv_states_1_2= ruleImperativeEntityStatePhrase
                    {

                    						newCompositeNode(grammarAccess.getImperativeScenarioStateAccess().getStatesImperativeEntityStatePhraseParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_33);
                    lv_states_1_2=ruleImperativeEntityStatePhrase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeScenarioStateRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_1_2,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityStatePhrase");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:1962:6: lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty
                    {

                    						newCompositeNode(grammarAccess.getImperativeScenarioStateAccess().getStatesImperativeEntityStatePhraseWithPropertyParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_33);
                    lv_states_1_3=ruleImperativeEntityStatePhraseWithProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeScenarioStateRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_1_3,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityStatePhraseWithProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalBddDsl.g:1980:3: (otherlv_2= 'And' ( (lv_andStates_3_0= ruleImperativeScenarioStateAnd ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==51) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalBddDsl.g:1981:4: otherlv_2= 'And' ( (lv_andStates_3_0= ruleImperativeScenarioStateAnd ) )
            	    {
            	    otherlv_2=(Token)match(input,51,FOLLOW_24); 

            	    				newLeafNode(otherlv_2, grammarAccess.getImperativeScenarioStateAccess().getAndKeyword_2_0());
            	    			
            	    // InternalBddDsl.g:1985:4: ( (lv_andStates_3_0= ruleImperativeScenarioStateAnd ) )
            	    // InternalBddDsl.g:1986:5: (lv_andStates_3_0= ruleImperativeScenarioStateAnd )
            	    {
            	    // InternalBddDsl.g:1986:5: (lv_andStates_3_0= ruleImperativeScenarioStateAnd )
            	    // InternalBddDsl.g:1987:6: lv_andStates_3_0= ruleImperativeScenarioStateAnd
            	    {

            	    						newCompositeNode(grammarAccess.getImperativeScenarioStateAccess().getAndStatesImperativeScenarioStateAndParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_andStates_3_0=ruleImperativeScenarioStateAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImperativeScenarioStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"andStates",
            	    							lv_andStates_3_0,
            	    							"dk.sdu.bdd.xtext.BddDsl.ImperativeScenarioStateAnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeScenarioState"


    // $ANTLR start "entryRuleImperativeScenarioStateAnd"
    // InternalBddDsl.g:2009:1: entryRuleImperativeScenarioStateAnd returns [EObject current=null] : iv_ruleImperativeScenarioStateAnd= ruleImperativeScenarioStateAnd EOF ;
    public final EObject entryRuleImperativeScenarioStateAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeScenarioStateAnd = null;


        try {
            // InternalBddDsl.g:2009:67: (iv_ruleImperativeScenarioStateAnd= ruleImperativeScenarioStateAnd EOF )
            // InternalBddDsl.g:2010:2: iv_ruleImperativeScenarioStateAnd= ruleImperativeScenarioStateAnd EOF
            {
             newCompositeNode(grammarAccess.getImperativeScenarioStateAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeScenarioStateAnd=ruleImperativeScenarioStateAnd();

            state._fsp--;

             current =iv_ruleImperativeScenarioStateAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeScenarioStateAnd"


    // $ANTLR start "ruleImperativeScenarioStateAnd"
    // InternalBddDsl.g:2016:1: ruleImperativeScenarioStateAnd returns [EObject current=null] : ( rulePrePostWords ( ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) ) ) ) ;
    public final EObject ruleImperativeScenarioStateAnd() throws RecognitionException {
        EObject current = null;

        EObject lv_states_1_1 = null;

        EObject lv_states_1_2 = null;

        EObject lv_states_1_3 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2022:2: ( ( rulePrePostWords ( ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) ) ) ) )
            // InternalBddDsl.g:2023:2: ( rulePrePostWords ( ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) ) ) )
            {
            // InternalBddDsl.g:2023:2: ( rulePrePostWords ( ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) ) ) )
            // InternalBddDsl.g:2024:3: rulePrePostWords ( ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) ) )
            {

            			newCompositeNode(grammarAccess.getImperativeScenarioStateAndAccess().getPrePostWordsParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            rulePrePostWords();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalBddDsl.g:2031:3: ( ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) ) )
            // InternalBddDsl.g:2032:4: ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) )
            {
            // InternalBddDsl.g:2032:4: ( (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty ) )
            // InternalBddDsl.g:2033:5: (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty )
            {
            // InternalBddDsl.g:2033:5: (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty )
            int alt48=3;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalBddDsl.g:2034:6: lv_states_1_1= ruleImperativeEntityPropertyStatePhrase
                    {

                    						newCompositeNode(grammarAccess.getImperativeScenarioStateAndAccess().getStatesImperativeEntityPropertyStatePhraseParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_states_1_1=ruleImperativeEntityPropertyStatePhrase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeScenarioStateAndRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_1_1,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityPropertyStatePhrase");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2050:6: lv_states_1_2= ruleImperativeEntityStatePhrase
                    {

                    						newCompositeNode(grammarAccess.getImperativeScenarioStateAndAccess().getStatesImperativeEntityStatePhraseParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_states_1_2=ruleImperativeEntityStatePhrase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeScenarioStateAndRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_1_2,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityStatePhrase");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:2066:6: lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty
                    {

                    						newCompositeNode(grammarAccess.getImperativeScenarioStateAndAccess().getStatesImperativeEntityStatePhraseWithPropertyParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_states_1_3=ruleImperativeEntityStatePhraseWithProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeScenarioStateAndRule());
                    						}
                    						add(
                    							current,
                    							"states",
                    							lv_states_1_3,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityStatePhraseWithProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeScenarioStateAnd"


    // $ANTLR start "entryRuleDeclarativeScenarioAction"
    // InternalBddDsl.g:2088:1: entryRuleDeclarativeScenarioAction returns [EObject current=null] : iv_ruleDeclarativeScenarioAction= ruleDeclarativeScenarioAction EOF ;
    public final EObject entryRuleDeclarativeScenarioAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeScenarioAction = null;


        try {
            // InternalBddDsl.g:2088:66: (iv_ruleDeclarativeScenarioAction= ruleDeclarativeScenarioAction EOF )
            // InternalBddDsl.g:2089:2: iv_ruleDeclarativeScenarioAction= ruleDeclarativeScenarioAction EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeScenarioActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeScenarioAction=ruleDeclarativeScenarioAction();

            state._fsp--;

             current =iv_ruleDeclarativeScenarioAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarativeScenarioAction"


    // $ANTLR start "ruleDeclarativeScenarioAction"
    // InternalBddDsl.g:2095:1: ruleDeclarativeScenarioAction returns [EObject current=null] : ( ( ( (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction ) ) ) (otherlv_1= 'And' ( (lv_andActions_2_0= ruleDeclarativeScenarioActionAnd ) ) )* ) ;
    public final EObject ruleDeclarativeScenarioAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_actions_0_1 = null;

        EObject lv_actions_0_2 = null;

        EObject lv_actions_0_3 = null;

        EObject lv_andActions_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2101:2: ( ( ( ( (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction ) ) ) (otherlv_1= 'And' ( (lv_andActions_2_0= ruleDeclarativeScenarioActionAnd ) ) )* ) )
            // InternalBddDsl.g:2102:2: ( ( ( (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction ) ) ) (otherlv_1= 'And' ( (lv_andActions_2_0= ruleDeclarativeScenarioActionAnd ) ) )* )
            {
            // InternalBddDsl.g:2102:2: ( ( ( (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction ) ) ) (otherlv_1= 'And' ( (lv_andActions_2_0= ruleDeclarativeScenarioActionAnd ) ) )* )
            // InternalBddDsl.g:2103:3: ( ( (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction ) ) ) (otherlv_1= 'And' ( (lv_andActions_2_0= ruleDeclarativeScenarioActionAnd ) ) )*
            {
            // InternalBddDsl.g:2103:3: ( ( (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction ) ) )
            // InternalBddDsl.g:2104:4: ( (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction ) )
            {
            // InternalBddDsl.g:2104:4: ( (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction ) )
            // InternalBddDsl.g:2105:5: (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction )
            {
            // InternalBddDsl.g:2105:5: (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction )
            int alt49=3;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalBddDsl.g:2106:6: lv_actions_0_1= ruleDeclarativeEntityAction
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeScenarioActionAccess().getActionsDeclarativeEntityActionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_actions_0_1=ruleDeclarativeEntityAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeScenarioActionRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_0_1,
                    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2122:6: lv_actions_0_2= ruleVerbAction
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeScenarioActionAccess().getActionsVerbActionParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_33);
                    lv_actions_0_2=ruleVerbAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeScenarioActionRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_0_2,
                    							"dk.sdu.bdd.xtext.BddDsl.VerbAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:2138:6: lv_actions_0_3= ruleDeclarativeEntityPropertyAction
                    {

                    						newCompositeNode(grammarAccess.getDeclarativeScenarioActionAccess().getActionsDeclarativeEntityPropertyActionParserRuleCall_0_0_2());
                    					
                    pushFollow(FOLLOW_33);
                    lv_actions_0_3=ruleDeclarativeEntityPropertyAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclarativeScenarioActionRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_0_3,
                    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityPropertyAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalBddDsl.g:2156:3: (otherlv_1= 'And' ( (lv_andActions_2_0= ruleDeclarativeScenarioActionAnd ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==51) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalBddDsl.g:2157:4: otherlv_1= 'And' ( (lv_andActions_2_0= ruleDeclarativeScenarioActionAnd ) )
            	    {
            	    otherlv_1=(Token)match(input,51,FOLLOW_27); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDeclarativeScenarioActionAccess().getAndKeyword_1_0());
            	    			
            	    // InternalBddDsl.g:2161:4: ( (lv_andActions_2_0= ruleDeclarativeScenarioActionAnd ) )
            	    // InternalBddDsl.g:2162:5: (lv_andActions_2_0= ruleDeclarativeScenarioActionAnd )
            	    {
            	    // InternalBddDsl.g:2162:5: (lv_andActions_2_0= ruleDeclarativeScenarioActionAnd )
            	    // InternalBddDsl.g:2163:6: lv_andActions_2_0= ruleDeclarativeScenarioActionAnd
            	    {

            	    						newCompositeNode(grammarAccess.getDeclarativeScenarioActionAccess().getAndActionsDeclarativeScenarioActionAndParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_andActions_2_0=ruleDeclarativeScenarioActionAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeclarativeScenarioActionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"andActions",
            	    							lv_andActions_2_0,
            	    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeScenarioActionAnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarativeScenarioAction"


    // $ANTLR start "entryRuleDeclarativeScenarioActionAnd"
    // InternalBddDsl.g:2185:1: entryRuleDeclarativeScenarioActionAnd returns [EObject current=null] : iv_ruleDeclarativeScenarioActionAnd= ruleDeclarativeScenarioActionAnd EOF ;
    public final EObject entryRuleDeclarativeScenarioActionAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeScenarioActionAnd = null;


        try {
            // InternalBddDsl.g:2185:69: (iv_ruleDeclarativeScenarioActionAnd= ruleDeclarativeScenarioActionAnd EOF )
            // InternalBddDsl.g:2186:2: iv_ruleDeclarativeScenarioActionAnd= ruleDeclarativeScenarioActionAnd EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeScenarioActionAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeScenarioActionAnd=ruleDeclarativeScenarioActionAnd();

            state._fsp--;

             current =iv_ruleDeclarativeScenarioActionAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarativeScenarioActionAnd"


    // $ANTLR start "ruleDeclarativeScenarioActionAnd"
    // InternalBddDsl.g:2192:1: ruleDeclarativeScenarioActionAnd returns [EObject current=null] : ( ( (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction ) ) ) ;
    public final EObject ruleDeclarativeScenarioActionAnd() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_0_1 = null;

        EObject lv_actions_0_2 = null;

        EObject lv_actions_0_3 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2198:2: ( ( ( (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction ) ) ) )
            // InternalBddDsl.g:2199:2: ( ( (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction ) ) )
            {
            // InternalBddDsl.g:2199:2: ( ( (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction ) ) )
            // InternalBddDsl.g:2200:3: ( (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction ) )
            {
            // InternalBddDsl.g:2200:3: ( (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction ) )
            // InternalBddDsl.g:2201:4: (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction )
            {
            // InternalBddDsl.g:2201:4: (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction )
            int alt51=3;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // InternalBddDsl.g:2202:5: lv_actions_0_1= ruleDeclarativeEntityAction
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeScenarioActionAndAccess().getActionsDeclarativeEntityActionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actions_0_1=ruleDeclarativeEntityAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeScenarioActionAndRule());
                    					}
                    					add(
                    						current,
                    						"actions",
                    						lv_actions_0_1,
                    						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2218:5: lv_actions_0_2= ruleVerbAction
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeScenarioActionAndAccess().getActionsVerbActionParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actions_0_2=ruleVerbAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeScenarioActionAndRule());
                    					}
                    					add(
                    						current,
                    						"actions",
                    						lv_actions_0_2,
                    						"dk.sdu.bdd.xtext.BddDsl.VerbAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:2234:5: lv_actions_0_3= ruleDeclarativeEntityPropertyAction
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeScenarioActionAndAccess().getActionsDeclarativeEntityPropertyActionParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actions_0_3=ruleDeclarativeEntityPropertyAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeScenarioActionAndRule());
                    					}
                    					add(
                    						current,
                    						"actions",
                    						lv_actions_0_3,
                    						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityPropertyAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarativeScenarioActionAnd"


    // $ANTLR start "entryRuleImperativeScenarioAction"
    // InternalBddDsl.g:2255:1: entryRuleImperativeScenarioAction returns [EObject current=null] : iv_ruleImperativeScenarioAction= ruleImperativeScenarioAction EOF ;
    public final EObject entryRuleImperativeScenarioAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeScenarioAction = null;


        try {
            // InternalBddDsl.g:2255:65: (iv_ruleImperativeScenarioAction= ruleImperativeScenarioAction EOF )
            // InternalBddDsl.g:2256:2: iv_ruleImperativeScenarioAction= ruleImperativeScenarioAction EOF
            {
             newCompositeNode(grammarAccess.getImperativeScenarioActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeScenarioAction=ruleImperativeScenarioAction();

            state._fsp--;

             current =iv_ruleImperativeScenarioAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeScenarioAction"


    // $ANTLR start "ruleImperativeScenarioAction"
    // InternalBddDsl.g:2262:1: ruleImperativeScenarioAction returns [EObject current=null] : ( ( ( (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction ) ) ) (otherlv_1= 'And' ( (lv_andActions_2_0= ruleImperativeScenarioActionAnd ) ) )* ) ;
    public final EObject ruleImperativeScenarioAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_actions_0_1 = null;

        EObject lv_actions_0_2 = null;

        EObject lv_actions_0_3 = null;

        EObject lv_andActions_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2268:2: ( ( ( ( (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction ) ) ) (otherlv_1= 'And' ( (lv_andActions_2_0= ruleImperativeScenarioActionAnd ) ) )* ) )
            // InternalBddDsl.g:2269:2: ( ( ( (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction ) ) ) (otherlv_1= 'And' ( (lv_andActions_2_0= ruleImperativeScenarioActionAnd ) ) )* )
            {
            // InternalBddDsl.g:2269:2: ( ( ( (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction ) ) ) (otherlv_1= 'And' ( (lv_andActions_2_0= ruleImperativeScenarioActionAnd ) ) )* )
            // InternalBddDsl.g:2270:3: ( ( (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction ) ) ) (otherlv_1= 'And' ( (lv_andActions_2_0= ruleImperativeScenarioActionAnd ) ) )*
            {
            // InternalBddDsl.g:2270:3: ( ( (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction ) ) )
            // InternalBddDsl.g:2271:4: ( (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction ) )
            {
            // InternalBddDsl.g:2271:4: ( (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction ) )
            // InternalBddDsl.g:2272:5: (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction )
            {
            // InternalBddDsl.g:2272:5: (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction )
            int alt52=3;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // InternalBddDsl.g:2273:6: lv_actions_0_1= ruleImperativeEntityAction
                    {

                    						newCompositeNode(grammarAccess.getImperativeScenarioActionAccess().getActionsImperativeEntityActionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_actions_0_1=ruleImperativeEntityAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeScenarioActionRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_0_1,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2289:6: lv_actions_0_2= ruleImperativeVerbAction
                    {

                    						newCompositeNode(grammarAccess.getImperativeScenarioActionAccess().getActionsImperativeVerbActionParserRuleCall_0_0_1());
                    					
                    pushFollow(FOLLOW_33);
                    lv_actions_0_2=ruleImperativeVerbAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeScenarioActionRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_0_2,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeVerbAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:2305:6: lv_actions_0_3= ruleImperativeEntityPropertyAction
                    {

                    						newCompositeNode(grammarAccess.getImperativeScenarioActionAccess().getActionsImperativeEntityPropertyActionParserRuleCall_0_0_2());
                    					
                    pushFollow(FOLLOW_33);
                    lv_actions_0_3=ruleImperativeEntityPropertyAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeScenarioActionRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_0_3,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityPropertyAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            // InternalBddDsl.g:2323:3: (otherlv_1= 'And' ( (lv_andActions_2_0= ruleImperativeScenarioActionAnd ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==51) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalBddDsl.g:2324:4: otherlv_1= 'And' ( (lv_andActions_2_0= ruleImperativeScenarioActionAnd ) )
            	    {
            	    otherlv_1=(Token)match(input,51,FOLLOW_27); 

            	    				newLeafNode(otherlv_1, grammarAccess.getImperativeScenarioActionAccess().getAndKeyword_1_0());
            	    			
            	    // InternalBddDsl.g:2328:4: ( (lv_andActions_2_0= ruleImperativeScenarioActionAnd ) )
            	    // InternalBddDsl.g:2329:5: (lv_andActions_2_0= ruleImperativeScenarioActionAnd )
            	    {
            	    // InternalBddDsl.g:2329:5: (lv_andActions_2_0= ruleImperativeScenarioActionAnd )
            	    // InternalBddDsl.g:2330:6: lv_andActions_2_0= ruleImperativeScenarioActionAnd
            	    {

            	    						newCompositeNode(grammarAccess.getImperativeScenarioActionAccess().getAndActionsImperativeScenarioActionAndParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_33);
            	    lv_andActions_2_0=ruleImperativeScenarioActionAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImperativeScenarioActionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"andActions",
            	    							lv_andActions_2_0,
            	    							"dk.sdu.bdd.xtext.BddDsl.ImperativeScenarioActionAnd");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeScenarioAction"


    // $ANTLR start "entryRuleImperativeScenarioActionAnd"
    // InternalBddDsl.g:2352:1: entryRuleImperativeScenarioActionAnd returns [EObject current=null] : iv_ruleImperativeScenarioActionAnd= ruleImperativeScenarioActionAnd EOF ;
    public final EObject entryRuleImperativeScenarioActionAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeScenarioActionAnd = null;


        try {
            // InternalBddDsl.g:2352:68: (iv_ruleImperativeScenarioActionAnd= ruleImperativeScenarioActionAnd EOF )
            // InternalBddDsl.g:2353:2: iv_ruleImperativeScenarioActionAnd= ruleImperativeScenarioActionAnd EOF
            {
             newCompositeNode(grammarAccess.getImperativeScenarioActionAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeScenarioActionAnd=ruleImperativeScenarioActionAnd();

            state._fsp--;

             current =iv_ruleImperativeScenarioActionAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeScenarioActionAnd"


    // $ANTLR start "ruleImperativeScenarioActionAnd"
    // InternalBddDsl.g:2359:1: ruleImperativeScenarioActionAnd returns [EObject current=null] : ( ( (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction ) ) ) ;
    public final EObject ruleImperativeScenarioActionAnd() throws RecognitionException {
        EObject current = null;

        EObject lv_actions_0_1 = null;

        EObject lv_actions_0_2 = null;

        EObject lv_actions_0_3 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2365:2: ( ( ( (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction ) ) ) )
            // InternalBddDsl.g:2366:2: ( ( (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction ) ) )
            {
            // InternalBddDsl.g:2366:2: ( ( (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction ) ) )
            // InternalBddDsl.g:2367:3: ( (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction ) )
            {
            // InternalBddDsl.g:2367:3: ( (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction ) )
            // InternalBddDsl.g:2368:4: (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction )
            {
            // InternalBddDsl.g:2368:4: (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction )
            int alt54=3;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // InternalBddDsl.g:2369:5: lv_actions_0_1= ruleImperativeEntityAction
                    {

                    					newCompositeNode(grammarAccess.getImperativeScenarioActionAndAccess().getActionsImperativeEntityActionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actions_0_1=ruleImperativeEntityAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImperativeScenarioActionAndRule());
                    					}
                    					add(
                    						current,
                    						"actions",
                    						lv_actions_0_1,
                    						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2385:5: lv_actions_0_2= ruleImperativeVerbAction
                    {

                    					newCompositeNode(grammarAccess.getImperativeScenarioActionAndAccess().getActionsImperativeVerbActionParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actions_0_2=ruleImperativeVerbAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImperativeScenarioActionAndRule());
                    					}
                    					add(
                    						current,
                    						"actions",
                    						lv_actions_0_2,
                    						"dk.sdu.bdd.xtext.BddDsl.ImperativeVerbAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalBddDsl.g:2401:5: lv_actions_0_3= ruleImperativeEntityPropertyAction
                    {

                    					newCompositeNode(grammarAccess.getImperativeScenarioActionAndAccess().getActionsImperativeEntityPropertyActionParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actions_0_3=ruleImperativeEntityPropertyAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImperativeScenarioActionAndRule());
                    					}
                    					add(
                    						current,
                    						"actions",
                    						lv_actions_0_3,
                    						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityPropertyAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeScenarioActionAnd"


    // $ANTLR start "entryRuleENTITY_IDENTITY"
    // InternalBddDsl.g:2422:1: entryRuleENTITY_IDENTITY returns [String current=null] : iv_ruleENTITY_IDENTITY= ruleENTITY_IDENTITY EOF ;
    public final String entryRuleENTITY_IDENTITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleENTITY_IDENTITY = null;


        try {
            // InternalBddDsl.g:2422:55: (iv_ruleENTITY_IDENTITY= ruleENTITY_IDENTITY EOF )
            // InternalBddDsl.g:2423:2: iv_ruleENTITY_IDENTITY= ruleENTITY_IDENTITY EOF
            {
             newCompositeNode(grammarAccess.getENTITY_IDENTITYRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENTITY_IDENTITY=ruleENTITY_IDENTITY();

            state._fsp--;

             current =iv_ruleENTITY_IDENTITY.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENTITY_IDENTITY"


    // $ANTLR start "ruleENTITY_IDENTITY"
    // InternalBddDsl.g:2429:1: ruleENTITY_IDENTITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '#' this_INT_1= RULE_INT ) | this_STRING_2= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleENTITY_IDENTITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_STRING_2=null;


        	enterRule();

        try {
            // InternalBddDsl.g:2435:2: ( ( (kw= '#' this_INT_1= RULE_INT ) | this_STRING_2= RULE_STRING ) )
            // InternalBddDsl.g:2436:2: ( (kw= '#' this_INT_1= RULE_INT ) | this_STRING_2= RULE_STRING )
            {
            // InternalBddDsl.g:2436:2: ( (kw= '#' this_INT_1= RULE_INT ) | this_STRING_2= RULE_STRING )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==52) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_STRING) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalBddDsl.g:2437:3: (kw= '#' this_INT_1= RULE_INT )
                    {
                    // InternalBddDsl.g:2437:3: (kw= '#' this_INT_1= RULE_INT )
                    // InternalBddDsl.g:2438:4: kw= '#' this_INT_1= RULE_INT
                    {
                    kw=(Token)match(input,52,FOLLOW_34); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getENTITY_IDENTITYAccess().getNumberSignKeyword_0_0());
                    			
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getENTITY_IDENTITYAccess().getINTTerminalRuleCall_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2452:3: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_2);
                    		

                    			newLeafNode(this_STRING_2, grammarAccess.getENTITY_IDENTITYAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENTITY_IDENTITY"


    // $ANTLR start "entryRuleDeclarativeEntityRef"
    // InternalBddDsl.g:2463:1: entryRuleDeclarativeEntityRef returns [EObject current=null] : iv_ruleDeclarativeEntityRef= ruleDeclarativeEntityRef EOF ;
    public final EObject entryRuleDeclarativeEntityRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeEntityRef = null;


        try {
            // InternalBddDsl.g:2463:61: (iv_ruleDeclarativeEntityRef= ruleDeclarativeEntityRef EOF )
            // InternalBddDsl.g:2464:2: iv_ruleDeclarativeEntityRef= ruleDeclarativeEntityRef EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeEntityRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeEntityRef=ruleDeclarativeEntityRef();

            state._fsp--;

             current =iv_ruleDeclarativeEntityRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarativeEntityRef"


    // $ANTLR start "ruleDeclarativeEntityRef"
    // InternalBddDsl.g:2470:1: ruleDeclarativeEntityRef returns [EObject current=null] : (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_entityValue_2_0= ruleENTITY_IDENTITY ) )? ) ;
    public final EObject ruleDeclarativeEntityRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_entityValue_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2476:2: ( (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_entityValue_2_0= ruleENTITY_IDENTITY ) )? ) )
            // InternalBddDsl.g:2477:2: (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_entityValue_2_0= ruleENTITY_IDENTITY ) )? )
            {
            // InternalBddDsl.g:2477:2: (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_entityValue_2_0= ruleENTITY_IDENTITY ) )? )
            // InternalBddDsl.g:2478:3: otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_entityValue_2_0= ruleENTITY_IDENTITY ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeclarativeEntityRefAccess().getTheKeyword_0());
            		
            // InternalBddDsl.g:2482:3: ( (otherlv_1= RULE_ID ) )
            // InternalBddDsl.g:2483:4: (otherlv_1= RULE_ID )
            {
            // InternalBddDsl.g:2483:4: (otherlv_1= RULE_ID )
            // InternalBddDsl.g:2484:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarativeEntityRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_1, grammarAccess.getDeclarativeEntityRefAccess().getEntityDeclarativeEntityDefCrossReference_1_0());
            				

            }


            }

            // InternalBddDsl.g:2495:3: ( (lv_entityValue_2_0= ruleENTITY_IDENTITY ) )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalBddDsl.g:2496:4: (lv_entityValue_2_0= ruleENTITY_IDENTITY )
                    {
                    // InternalBddDsl.g:2496:4: (lv_entityValue_2_0= ruleENTITY_IDENTITY )
                    // InternalBddDsl.g:2497:5: lv_entityValue_2_0= ruleENTITY_IDENTITY
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeEntityRefAccess().getEntityValueENTITY_IDENTITYParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_entityValue_2_0=ruleENTITY_IDENTITY();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeEntityRefRule());
                    					}
                    					set(
                    						current,
                    						"entityValue",
                    						lv_entityValue_2_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ENTITY_IDENTITY");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarativeEntityRef"


    // $ANTLR start "entryRuleImperativeEntityRef"
    // InternalBddDsl.g:2518:1: entryRuleImperativeEntityRef returns [EObject current=null] : iv_ruleImperativeEntityRef= ruleImperativeEntityRef EOF ;
    public final EObject entryRuleImperativeEntityRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeEntityRef = null;


        try {
            // InternalBddDsl.g:2518:60: (iv_ruleImperativeEntityRef= ruleImperativeEntityRef EOF )
            // InternalBddDsl.g:2519:2: iv_ruleImperativeEntityRef= ruleImperativeEntityRef EOF
            {
             newCompositeNode(grammarAccess.getImperativeEntityRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeEntityRef=ruleImperativeEntityRef();

            state._fsp--;

             current =iv_ruleImperativeEntityRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeEntityRef"


    // $ANTLR start "ruleImperativeEntityRef"
    // InternalBddDsl.g:2525:1: ruleImperativeEntityRef returns [EObject current=null] : (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_entityValue_2_0= ruleENTITY_IDENTITY ) )? ) ;
    public final EObject ruleImperativeEntityRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_entityValue_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2531:2: ( (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_entityValue_2_0= ruleENTITY_IDENTITY ) )? ) )
            // InternalBddDsl.g:2532:2: (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_entityValue_2_0= ruleENTITY_IDENTITY ) )? )
            {
            // InternalBddDsl.g:2532:2: (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_entityValue_2_0= ruleENTITY_IDENTITY ) )? )
            // InternalBddDsl.g:2533:3: otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_entityValue_2_0= ruleENTITY_IDENTITY ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImperativeEntityRefAccess().getTheKeyword_0());
            		
            // InternalBddDsl.g:2537:3: ( (otherlv_1= RULE_ID ) )
            // InternalBddDsl.g:2538:4: (otherlv_1= RULE_ID )
            {
            // InternalBddDsl.g:2538:4: (otherlv_1= RULE_ID )
            // InternalBddDsl.g:2539:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativeEntityRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_1, grammarAccess.getImperativeEntityRefAccess().getEntityImperativeEntityDefCrossReference_1_0());
            				

            }


            }

            // InternalBddDsl.g:2550:3: ( (lv_entityValue_2_0= ruleENTITY_IDENTITY ) )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // InternalBddDsl.g:2551:4: (lv_entityValue_2_0= ruleENTITY_IDENTITY )
                    {
                    // InternalBddDsl.g:2551:4: (lv_entityValue_2_0= ruleENTITY_IDENTITY )
                    // InternalBddDsl.g:2552:5: lv_entityValue_2_0= ruleENTITY_IDENTITY
                    {

                    					newCompositeNode(grammarAccess.getImperativeEntityRefAccess().getEntityValueENTITY_IDENTITYParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_entityValue_2_0=ruleENTITY_IDENTITY();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImperativeEntityRefRule());
                    					}
                    					set(
                    						current,
                    						"entityValue",
                    						lv_entityValue_2_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ENTITY_IDENTITY");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeEntityRef"


    // $ANTLR start "entryRuleActionRef"
    // InternalBddDsl.g:2573:1: entryRuleActionRef returns [EObject current=null] : iv_ruleActionRef= ruleActionRef EOF ;
    public final EObject entryRuleActionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionRef = null;


        try {
            // InternalBddDsl.g:2573:50: (iv_ruleActionRef= ruleActionRef EOF )
            // InternalBddDsl.g:2574:2: iv_ruleActionRef= ruleActionRef EOF
            {
             newCompositeNode(grammarAccess.getActionRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionRef=ruleActionRef();

            state._fsp--;

             current =iv_ruleActionRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionRef"


    // $ANTLR start "ruleActionRef"
    // InternalBddDsl.g:2580:1: ruleActionRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleActionRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBddDsl.g:2586:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBddDsl.g:2587:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBddDsl.g:2587:2: ( (otherlv_0= RULE_ID ) )
            // InternalBddDsl.g:2588:3: (otherlv_0= RULE_ID )
            {
            // InternalBddDsl.g:2588:3: (otherlv_0= RULE_ID )
            // InternalBddDsl.g:2589:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getActionRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getActionRefAccess().getActionActionDefCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionRef"


    // $ANTLR start "entryRuleImperativeActionRef"
    // InternalBddDsl.g:2603:1: entryRuleImperativeActionRef returns [EObject current=null] : iv_ruleImperativeActionRef= ruleImperativeActionRef EOF ;
    public final EObject entryRuleImperativeActionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeActionRef = null;


        try {
            // InternalBddDsl.g:2603:60: (iv_ruleImperativeActionRef= ruleImperativeActionRef EOF )
            // InternalBddDsl.g:2604:2: iv_ruleImperativeActionRef= ruleImperativeActionRef EOF
            {
             newCompositeNode(grammarAccess.getImperativeActionRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeActionRef=ruleImperativeActionRef();

            state._fsp--;

             current =iv_ruleImperativeActionRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeActionRef"


    // $ANTLR start "ruleImperativeActionRef"
    // InternalBddDsl.g:2610:1: ruleImperativeActionRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleImperativeActionRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBddDsl.g:2616:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBddDsl.g:2617:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBddDsl.g:2617:2: ( (otherlv_0= RULE_ID ) )
            // InternalBddDsl.g:2618:3: (otherlv_0= RULE_ID )
            {
            // InternalBddDsl.g:2618:3: (otherlv_0= RULE_ID )
            // InternalBddDsl.g:2619:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getImperativeActionRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getImperativeActionRefAccess().getActionImperativeActionDefCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeActionRef"


    // $ANTLR start "entryRulePropertyRef"
    // InternalBddDsl.g:2633:1: entryRulePropertyRef returns [EObject current=null] : iv_rulePropertyRef= rulePropertyRef EOF ;
    public final EObject entryRulePropertyRef() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRef = null;


        try {
            // InternalBddDsl.g:2633:52: (iv_rulePropertyRef= rulePropertyRef EOF )
            // InternalBddDsl.g:2634:2: iv_rulePropertyRef= rulePropertyRef EOF
            {
             newCompositeNode(grammarAccess.getPropertyRefRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyRef=rulePropertyRef();

            state._fsp--;

             current =iv_rulePropertyRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyRef"


    // $ANTLR start "rulePropertyRef"
    // InternalBddDsl.g:2640:1: rulePropertyRef returns [EObject current=null] : (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )? ) ;
    public final EObject rulePropertyRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_propertyValue_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2646:2: ( (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )? ) )
            // InternalBddDsl.g:2647:2: (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )? )
            {
            // InternalBddDsl.g:2647:2: (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )? )
            // InternalBddDsl.g:2648:3: otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyRefAccess().getTheKeyword_0());
            		
            // InternalBddDsl.g:2652:3: ( (otherlv_1= RULE_ID ) )
            // InternalBddDsl.g:2653:4: (otherlv_1= RULE_ID )
            {
            // InternalBddDsl.g:2653:4: (otherlv_1= RULE_ID )
            // InternalBddDsl.g:2654:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_1, grammarAccess.getPropertyRefAccess().getPropertyPropertyDefCrossReference_1_0());
            				

            }


            }

            // InternalBddDsl.g:2665:3: ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING||LA58_0==52) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalBddDsl.g:2666:4: (lv_propertyValue_2_0= ruleENTITY_IDENTITY )
                    {
                    // InternalBddDsl.g:2666:4: (lv_propertyValue_2_0= ruleENTITY_IDENTITY )
                    // InternalBddDsl.g:2667:5: lv_propertyValue_2_0= ruleENTITY_IDENTITY
                    {

                    					newCompositeNode(grammarAccess.getPropertyRefAccess().getPropertyValueENTITY_IDENTITYParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyValue_2_0=ruleENTITY_IDENTITY();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRefRule());
                    					}
                    					set(
                    						current,
                    						"propertyValue",
                    						lv_propertyValue_2_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ENTITY_IDENTITY");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyRef"


    // $ANTLR start "entryRuleImperativePropertyRef"
    // InternalBddDsl.g:2688:1: entryRuleImperativePropertyRef returns [EObject current=null] : iv_ruleImperativePropertyRef= ruleImperativePropertyRef EOF ;
    public final EObject entryRuleImperativePropertyRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativePropertyRef = null;


        try {
            // InternalBddDsl.g:2688:62: (iv_ruleImperativePropertyRef= ruleImperativePropertyRef EOF )
            // InternalBddDsl.g:2689:2: iv_ruleImperativePropertyRef= ruleImperativePropertyRef EOF
            {
             newCompositeNode(grammarAccess.getImperativePropertyRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativePropertyRef=ruleImperativePropertyRef();

            state._fsp--;

             current =iv_ruleImperativePropertyRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativePropertyRef"


    // $ANTLR start "ruleImperativePropertyRef"
    // InternalBddDsl.g:2695:1: ruleImperativePropertyRef returns [EObject current=null] : (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )? ) ;
    public final EObject ruleImperativePropertyRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_propertyValue_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2701:2: ( (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )? ) )
            // InternalBddDsl.g:2702:2: (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )? )
            {
            // InternalBddDsl.g:2702:2: (otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )? )
            // InternalBddDsl.g:2703:3: otherlv_0= 'the' ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImperativePropertyRefAccess().getTheKeyword_0());
            		
            // InternalBddDsl.g:2707:3: ( (otherlv_1= RULE_ID ) )
            // InternalBddDsl.g:2708:4: (otherlv_1= RULE_ID )
            {
            // InternalBddDsl.g:2708:4: (otherlv_1= RULE_ID )
            // InternalBddDsl.g:2709:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativePropertyRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_1, grammarAccess.getImperativePropertyRefAccess().getPropertyImperativePropertyDefCrossReference_1_0());
            				

            }


            }

            // InternalBddDsl.g:2720:3: ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_STRING||LA59_0==52) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalBddDsl.g:2721:4: (lv_propertyValue_2_0= ruleENTITY_IDENTITY )
                    {
                    // InternalBddDsl.g:2721:4: (lv_propertyValue_2_0= ruleENTITY_IDENTITY )
                    // InternalBddDsl.g:2722:5: lv_propertyValue_2_0= ruleENTITY_IDENTITY
                    {

                    					newCompositeNode(grammarAccess.getImperativePropertyRefAccess().getPropertyValueENTITY_IDENTITYParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_propertyValue_2_0=ruleENTITY_IDENTITY();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImperativePropertyRefRule());
                    					}
                    					set(
                    						current,
                    						"propertyValue",
                    						lv_propertyValue_2_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ENTITY_IDENTITY");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativePropertyRef"


    // $ANTLR start "entryRuleDeclarativeEntityOrPropertyRef"
    // InternalBddDsl.g:2743:1: entryRuleDeclarativeEntityOrPropertyRef returns [EObject current=null] : iv_ruleDeclarativeEntityOrPropertyRef= ruleDeclarativeEntityOrPropertyRef EOF ;
    public final EObject entryRuleDeclarativeEntityOrPropertyRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeEntityOrPropertyRef = null;


        try {
            // InternalBddDsl.g:2743:71: (iv_ruleDeclarativeEntityOrPropertyRef= ruleDeclarativeEntityOrPropertyRef EOF )
            // InternalBddDsl.g:2744:2: iv_ruleDeclarativeEntityOrPropertyRef= ruleDeclarativeEntityOrPropertyRef EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeEntityOrPropertyRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeEntityOrPropertyRef=ruleDeclarativeEntityOrPropertyRef();

            state._fsp--;

             current =iv_ruleDeclarativeEntityOrPropertyRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarativeEntityOrPropertyRef"


    // $ANTLR start "ruleDeclarativeEntityOrPropertyRef"
    // InternalBddDsl.g:2750:1: ruleDeclarativeEntityOrPropertyRef returns [EObject current=null] : (this_DeclarativeEntityRef_0= ruleDeclarativeEntityRef | ( ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )? ) ) ;
    public final EObject ruleDeclarativeEntityOrPropertyRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_DeclarativeEntityRef_0 = null;

        AntlrDatatypeRuleToken lv_propertyValue_2_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2756:2: ( (this_DeclarativeEntityRef_0= ruleDeclarativeEntityRef | ( ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )? ) ) )
            // InternalBddDsl.g:2757:2: (this_DeclarativeEntityRef_0= ruleDeclarativeEntityRef | ( ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )? ) )
            {
            // InternalBddDsl.g:2757:2: (this_DeclarativeEntityRef_0= ruleDeclarativeEntityRef | ( ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )? ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==25) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_ID) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalBddDsl.g:2758:3: this_DeclarativeEntityRef_0= ruleDeclarativeEntityRef
                    {

                    			newCompositeNode(grammarAccess.getDeclarativeEntityOrPropertyRefAccess().getDeclarativeEntityRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeclarativeEntityRef_0=ruleDeclarativeEntityRef();

                    state._fsp--;


                    			current = this_DeclarativeEntityRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBddDsl.g:2767:3: ( ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )? )
                    {
                    // InternalBddDsl.g:2767:3: ( ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )? )
                    // InternalBddDsl.g:2768:4: ( (otherlv_1= RULE_ID ) ) ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )?
                    {
                    // InternalBddDsl.g:2768:4: ( (otherlv_1= RULE_ID ) )
                    // InternalBddDsl.g:2769:5: (otherlv_1= RULE_ID )
                    {
                    // InternalBddDsl.g:2769:5: (otherlv_1= RULE_ID )
                    // InternalBddDsl.g:2770:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclarativeEntityOrPropertyRefRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_1, grammarAccess.getDeclarativeEntityOrPropertyRefAccess().getPropertyPropertyDefCrossReference_1_0_0());
                    					

                    }


                    }

                    // InternalBddDsl.g:2781:4: ( (lv_propertyValue_2_0= ruleENTITY_IDENTITY ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_STRING||LA60_0==52) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalBddDsl.g:2782:5: (lv_propertyValue_2_0= ruleENTITY_IDENTITY )
                            {
                            // InternalBddDsl.g:2782:5: (lv_propertyValue_2_0= ruleENTITY_IDENTITY )
                            // InternalBddDsl.g:2783:6: lv_propertyValue_2_0= ruleENTITY_IDENTITY
                            {

                            						newCompositeNode(grammarAccess.getDeclarativeEntityOrPropertyRefAccess().getPropertyValueENTITY_IDENTITYParserRuleCall_1_1_0());
                            					
                            pushFollow(FOLLOW_2);
                            lv_propertyValue_2_0=ruleENTITY_IDENTITY();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getDeclarativeEntityOrPropertyRefRule());
                            						}
                            						set(
                            							current,
                            							"propertyValue",
                            							lv_propertyValue_2_0,
                            							"dk.sdu.bdd.xtext.BddDsl.ENTITY_IDENTITY");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarativeEntityOrPropertyRef"


    // $ANTLR start "entryRuleDeclarativeEntityStatePhrase"
    // InternalBddDsl.g:2805:1: entryRuleDeclarativeEntityStatePhrase returns [EObject current=null] : iv_ruleDeclarativeEntityStatePhrase= ruleDeclarativeEntityStatePhrase EOF ;
    public final EObject entryRuleDeclarativeEntityStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeEntityStatePhrase = null;


        try {
            // InternalBddDsl.g:2805:69: (iv_ruleDeclarativeEntityStatePhrase= ruleDeclarativeEntityStatePhrase EOF )
            // InternalBddDsl.g:2806:2: iv_ruleDeclarativeEntityStatePhrase= ruleDeclarativeEntityStatePhrase EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeEntityStatePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeEntityStatePhrase=ruleDeclarativeEntityStatePhrase();

            state._fsp--;

             current =iv_ruleDeclarativeEntityStatePhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarativeEntityStatePhrase"


    // $ANTLR start "ruleDeclarativeEntityStatePhrase"
    // InternalBddDsl.g:2812:1: ruleDeclarativeEntityStatePhrase returns [EObject current=null] : ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) ( (lv_debug_3_0= ruleDebugStatement ) )? ) ;
    public final EObject ruleDeclarativeEntityStatePhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_entity_0_0 = null;

        AntlrDatatypeRuleToken lv_debug_3_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2818:2: ( ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) ( (lv_debug_3_0= ruleDebugStatement ) )? ) )
            // InternalBddDsl.g:2819:2: ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) ( (lv_debug_3_0= ruleDebugStatement ) )? )
            {
            // InternalBddDsl.g:2819:2: ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) ( (lv_debug_3_0= ruleDebugStatement ) )? )
            // InternalBddDsl.g:2820:3: ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) ( (lv_debug_3_0= ruleDebugStatement ) )?
            {
            // InternalBddDsl.g:2820:3: ( (lv_entity_0_0= ruleDeclarativeEntityRef ) )
            // InternalBddDsl.g:2821:4: (lv_entity_0_0= ruleDeclarativeEntityRef )
            {
            // InternalBddDsl.g:2821:4: (lv_entity_0_0= ruleDeclarativeEntityRef )
            // InternalBddDsl.g:2822:5: lv_entity_0_0= ruleDeclarativeEntityRef
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityStatePhraseAccess().getEntityDeclarativeEntityRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_entity_0_0=ruleDeclarativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityStatePhraseRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getDeclarativeEntityStatePhraseAccess().getToBeWordsParserRuleCall_1());
            		
            pushFollow(FOLLOW_3);
            ruleToBeWords();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalBddDsl.g:2846:3: ( (otherlv_2= RULE_ID ) )
            // InternalBddDsl.g:2847:4: (otherlv_2= RULE_ID )
            {
            // InternalBddDsl.g:2847:4: (otherlv_2= RULE_ID )
            // InternalBddDsl.g:2848:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarativeEntityStatePhraseRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_2, grammarAccess.getDeclarativeEntityStatePhraseAccess().getStateStateNameCrossReference_2_0());
            				

            }


            }

            // InternalBddDsl.g:2859:3: ( (lv_debug_3_0= ruleDebugStatement ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==50) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalBddDsl.g:2860:4: (lv_debug_3_0= ruleDebugStatement )
                    {
                    // InternalBddDsl.g:2860:4: (lv_debug_3_0= ruleDebugStatement )
                    // InternalBddDsl.g:2861:5: lv_debug_3_0= ruleDebugStatement
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeEntityStatePhraseAccess().getDebugDebugStatementParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_debug_3_0=ruleDebugStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeEntityStatePhraseRule());
                    					}
                    					set(
                    						current,
                    						"debug",
                    						lv_debug_3_0,
                    						"dk.sdu.bdd.xtext.BddDsl.DebugStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarativeEntityStatePhrase"


    // $ANTLR start "entryRuleDeclarativeEntityStatePhraseWithProperty"
    // InternalBddDsl.g:2882:1: entryRuleDeclarativeEntityStatePhraseWithProperty returns [EObject current=null] : iv_ruleDeclarativeEntityStatePhraseWithProperty= ruleDeclarativeEntityStatePhraseWithProperty EOF ;
    public final EObject entryRuleDeclarativeEntityStatePhraseWithProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeEntityStatePhraseWithProperty = null;


        try {
            // InternalBddDsl.g:2882:81: (iv_ruleDeclarativeEntityStatePhraseWithProperty= ruleDeclarativeEntityStatePhraseWithProperty EOF )
            // InternalBddDsl.g:2883:2: iv_ruleDeclarativeEntityStatePhraseWithProperty= ruleDeclarativeEntityStatePhraseWithProperty EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeEntityStatePhraseWithPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeEntityStatePhraseWithProperty=ruleDeclarativeEntityStatePhraseWithProperty();

            state._fsp--;

             current =iv_ruleDeclarativeEntityStatePhraseWithProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarativeEntityStatePhraseWithProperty"


    // $ANTLR start "ruleDeclarativeEntityStatePhraseWithProperty"
    // InternalBddDsl.g:2889:1: ruleDeclarativeEntityStatePhraseWithProperty returns [EObject current=null] : ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_property_4_0= rulePropertyRef ) ) ( (lv_debug_5_0= ruleDebugStatement ) )? ) ;
    public final EObject ruleDeclarativeEntityStatePhraseWithProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_entity_0_0 = null;

        EObject lv_property_4_0 = null;

        AntlrDatatypeRuleToken lv_debug_5_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2895:2: ( ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_property_4_0= rulePropertyRef ) ) ( (lv_debug_5_0= ruleDebugStatement ) )? ) )
            // InternalBddDsl.g:2896:2: ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_property_4_0= rulePropertyRef ) ) ( (lv_debug_5_0= ruleDebugStatement ) )? )
            {
            // InternalBddDsl.g:2896:2: ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_property_4_0= rulePropertyRef ) ) ( (lv_debug_5_0= ruleDebugStatement ) )? )
            // InternalBddDsl.g:2897:3: ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_property_4_0= rulePropertyRef ) ) ( (lv_debug_5_0= ruleDebugStatement ) )?
            {
            // InternalBddDsl.g:2897:3: ( (lv_entity_0_0= ruleDeclarativeEntityRef ) )
            // InternalBddDsl.g:2898:4: (lv_entity_0_0= ruleDeclarativeEntityRef )
            {
            // InternalBddDsl.g:2898:4: (lv_entity_0_0= ruleDeclarativeEntityRef )
            // InternalBddDsl.g:2899:5: lv_entity_0_0= ruleDeclarativeEntityRef
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityStatePhraseWithPropertyAccess().getEntityDeclarativeEntityRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_entity_0_0=ruleDeclarativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityStatePhraseWithPropertyRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getDeclarativeEntityStatePhraseWithPropertyAccess().getToBeWordsParserRuleCall_1());
            		
            pushFollow(FOLLOW_3);
            ruleToBeWords();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalBddDsl.g:2923:3: ( (otherlv_2= RULE_ID ) )
            // InternalBddDsl.g:2924:4: (otherlv_2= RULE_ID )
            {
            // InternalBddDsl.g:2924:4: (otherlv_2= RULE_ID )
            // InternalBddDsl.g:2925:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclarativeEntityStatePhraseWithPropertyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_2, grammarAccess.getDeclarativeEntityStatePhraseWithPropertyAccess().getStateStateNameCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getDeclarativeEntityStatePhraseWithPropertyAccess().getWithKeyword_3());
            		
            // InternalBddDsl.g:2940:3: ( (lv_property_4_0= rulePropertyRef ) )
            // InternalBddDsl.g:2941:4: (lv_property_4_0= rulePropertyRef )
            {
            // InternalBddDsl.g:2941:4: (lv_property_4_0= rulePropertyRef )
            // InternalBddDsl.g:2942:5: lv_property_4_0= rulePropertyRef
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityStatePhraseWithPropertyAccess().getPropertyPropertyRefParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_property_4_0=rulePropertyRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityStatePhraseWithPropertyRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_4_0,
            						"dk.sdu.bdd.xtext.BddDsl.PropertyRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:2959:3: ( (lv_debug_5_0= ruleDebugStatement ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==50) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalBddDsl.g:2960:4: (lv_debug_5_0= ruleDebugStatement )
                    {
                    // InternalBddDsl.g:2960:4: (lv_debug_5_0= ruleDebugStatement )
                    // InternalBddDsl.g:2961:5: lv_debug_5_0= ruleDebugStatement
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeEntityStatePhraseWithPropertyAccess().getDebugDebugStatementParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_debug_5_0=ruleDebugStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeEntityStatePhraseWithPropertyRule());
                    					}
                    					set(
                    						current,
                    						"debug",
                    						lv_debug_5_0,
                    						"dk.sdu.bdd.xtext.BddDsl.DebugStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarativeEntityStatePhraseWithProperty"


    // $ANTLR start "entryRuleImperativeEntityStatePhrase"
    // InternalBddDsl.g:2982:1: entryRuleImperativeEntityStatePhrase returns [EObject current=null] : iv_ruleImperativeEntityStatePhrase= ruleImperativeEntityStatePhrase EOF ;
    public final EObject entryRuleImperativeEntityStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeEntityStatePhrase = null;


        try {
            // InternalBddDsl.g:2982:68: (iv_ruleImperativeEntityStatePhrase= ruleImperativeEntityStatePhrase EOF )
            // InternalBddDsl.g:2983:2: iv_ruleImperativeEntityStatePhrase= ruleImperativeEntityStatePhrase EOF
            {
             newCompositeNode(grammarAccess.getImperativeEntityStatePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeEntityStatePhrase=ruleImperativeEntityStatePhrase();

            state._fsp--;

             current =iv_ruleImperativeEntityStatePhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeEntityStatePhrase"


    // $ANTLR start "ruleImperativeEntityStatePhrase"
    // InternalBddDsl.g:2989:1: ruleImperativeEntityStatePhrase returns [EObject current=null] : ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleImperativeEntityStatePhrase() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_entity_0_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:2995:2: ( ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) ) )
            // InternalBddDsl.g:2996:2: ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalBddDsl.g:2996:2: ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) )
            // InternalBddDsl.g:2997:3: ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) )
            {
            // InternalBddDsl.g:2997:3: ( (lv_entity_0_0= ruleImperativeEntityRef ) )
            // InternalBddDsl.g:2998:4: (lv_entity_0_0= ruleImperativeEntityRef )
            {
            // InternalBddDsl.g:2998:4: (lv_entity_0_0= ruleImperativeEntityRef )
            // InternalBddDsl.g:2999:5: lv_entity_0_0= ruleImperativeEntityRef
            {

            					newCompositeNode(grammarAccess.getImperativeEntityStatePhraseAccess().getEntityImperativeEntityRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_entity_0_0=ruleImperativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityStatePhraseRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getImperativeEntityStatePhraseAccess().getToBeWordsParserRuleCall_1());
            		
            pushFollow(FOLLOW_3);
            ruleToBeWords();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalBddDsl.g:3023:3: ( (otherlv_2= RULE_ID ) )
            // InternalBddDsl.g:3024:4: (otherlv_2= RULE_ID )
            {
            // InternalBddDsl.g:3024:4: (otherlv_2= RULE_ID )
            // InternalBddDsl.g:3025:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativeEntityStatePhraseRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getImperativeEntityStatePhraseAccess().getStateImperativeStateNameCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeEntityStatePhrase"


    // $ANTLR start "entryRuleImperativeEntityStatePhraseWithProperty"
    // InternalBddDsl.g:3040:1: entryRuleImperativeEntityStatePhraseWithProperty returns [EObject current=null] : iv_ruleImperativeEntityStatePhraseWithProperty= ruleImperativeEntityStatePhraseWithProperty EOF ;
    public final EObject entryRuleImperativeEntityStatePhraseWithProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeEntityStatePhraseWithProperty = null;


        try {
            // InternalBddDsl.g:3040:80: (iv_ruleImperativeEntityStatePhraseWithProperty= ruleImperativeEntityStatePhraseWithProperty EOF )
            // InternalBddDsl.g:3041:2: iv_ruleImperativeEntityStatePhraseWithProperty= ruleImperativeEntityStatePhraseWithProperty EOF
            {
             newCompositeNode(grammarAccess.getImperativeEntityStatePhraseWithPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeEntityStatePhraseWithProperty=ruleImperativeEntityStatePhraseWithProperty();

            state._fsp--;

             current =iv_ruleImperativeEntityStatePhraseWithProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeEntityStatePhraseWithProperty"


    // $ANTLR start "ruleImperativeEntityStatePhraseWithProperty"
    // InternalBddDsl.g:3047:1: ruleImperativeEntityStatePhraseWithProperty returns [EObject current=null] : ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_property_4_0= ruleImperativePropertyRef ) ) ) ;
    public final EObject ruleImperativeEntityStatePhraseWithProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_entity_0_0 = null;

        EObject lv_property_4_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3053:2: ( ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_property_4_0= ruleImperativePropertyRef ) ) ) )
            // InternalBddDsl.g:3054:2: ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_property_4_0= ruleImperativePropertyRef ) ) )
            {
            // InternalBddDsl.g:3054:2: ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_property_4_0= ruleImperativePropertyRef ) ) )
            // InternalBddDsl.g:3055:3: ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ruleToBeWords ( (otherlv_2= RULE_ID ) ) otherlv_3= 'with' ( (lv_property_4_0= ruleImperativePropertyRef ) )
            {
            // InternalBddDsl.g:3055:3: ( (lv_entity_0_0= ruleImperativeEntityRef ) )
            // InternalBddDsl.g:3056:4: (lv_entity_0_0= ruleImperativeEntityRef )
            {
            // InternalBddDsl.g:3056:4: (lv_entity_0_0= ruleImperativeEntityRef )
            // InternalBddDsl.g:3057:5: lv_entity_0_0= ruleImperativeEntityRef
            {

            					newCompositeNode(grammarAccess.getImperativeEntityStatePhraseWithPropertyAccess().getEntityImperativeEntityRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_entity_0_0=ruleImperativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityStatePhraseWithPropertyRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            			newCompositeNode(grammarAccess.getImperativeEntityStatePhraseWithPropertyAccess().getToBeWordsParserRuleCall_1());
            		
            pushFollow(FOLLOW_3);
            ruleToBeWords();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            // InternalBddDsl.g:3081:3: ( (otherlv_2= RULE_ID ) )
            // InternalBddDsl.g:3082:4: (otherlv_2= RULE_ID )
            {
            // InternalBddDsl.g:3082:4: (otherlv_2= RULE_ID )
            // InternalBddDsl.g:3083:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImperativeEntityStatePhraseWithPropertyRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_2, grammarAccess.getImperativeEntityStatePhraseWithPropertyAccess().getStateImperativeStateNameCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_39); 

            			newLeafNode(otherlv_3, grammarAccess.getImperativeEntityStatePhraseWithPropertyAccess().getWithKeyword_3());
            		
            // InternalBddDsl.g:3098:3: ( (lv_property_4_0= ruleImperativePropertyRef ) )
            // InternalBddDsl.g:3099:4: (lv_property_4_0= ruleImperativePropertyRef )
            {
            // InternalBddDsl.g:3099:4: (lv_property_4_0= ruleImperativePropertyRef )
            // InternalBddDsl.g:3100:5: lv_property_4_0= ruleImperativePropertyRef
            {

            					newCompositeNode(grammarAccess.getImperativeEntityStatePhraseWithPropertyAccess().getPropertyImperativePropertyRefParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_property_4_0=ruleImperativePropertyRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityStatePhraseWithPropertyRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_4_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativePropertyRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeEntityStatePhraseWithProperty"


    // $ANTLR start "entryRuleDeclarativeEntityPropertyStatePhrase"
    // InternalBddDsl.g:3121:1: entryRuleDeclarativeEntityPropertyStatePhrase returns [EObject current=null] : iv_ruleDeclarativeEntityPropertyStatePhrase= ruleDeclarativeEntityPropertyStatePhrase EOF ;
    public final EObject entryRuleDeclarativeEntityPropertyStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeEntityPropertyStatePhrase = null;


        try {
            // InternalBddDsl.g:3121:77: (iv_ruleDeclarativeEntityPropertyStatePhrase= ruleDeclarativeEntityPropertyStatePhrase EOF )
            // InternalBddDsl.g:3122:2: iv_ruleDeclarativeEntityPropertyStatePhrase= ruleDeclarativeEntityPropertyStatePhrase EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeEntityPropertyStatePhrase=ruleDeclarativeEntityPropertyStatePhrase();

            state._fsp--;

             current =iv_ruleDeclarativeEntityPropertyStatePhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarativeEntityPropertyStatePhrase"


    // $ANTLR start "ruleDeclarativeEntityPropertyStatePhrase"
    // InternalBddDsl.g:3128:1: ruleDeclarativeEntityPropertyStatePhrase returns [EObject current=null] : ( ( (lv_property_0_0= rulePropertyRef ) )? ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleDeclarativeEntityRef ) ) ( (lv_toBeWord_3_0= ruleToBeWords ) ) ( (lv_value_4_0= ruleENTITY_IDENTITY ) ) ( (lv_debug_5_0= ruleDebugStatement ) )? ) ;
    public final EObject ruleDeclarativeEntityPropertyStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject lv_property_0_0 = null;

        AntlrDatatypeRuleToken lv_preposition_1_0 = null;

        EObject lv_entity_2_0 = null;

        AntlrDatatypeRuleToken lv_toBeWord_3_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;

        AntlrDatatypeRuleToken lv_debug_5_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3134:2: ( ( ( (lv_property_0_0= rulePropertyRef ) )? ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleDeclarativeEntityRef ) ) ( (lv_toBeWord_3_0= ruleToBeWords ) ) ( (lv_value_4_0= ruleENTITY_IDENTITY ) ) ( (lv_debug_5_0= ruleDebugStatement ) )? ) )
            // InternalBddDsl.g:3135:2: ( ( (lv_property_0_0= rulePropertyRef ) )? ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleDeclarativeEntityRef ) ) ( (lv_toBeWord_3_0= ruleToBeWords ) ) ( (lv_value_4_0= ruleENTITY_IDENTITY ) ) ( (lv_debug_5_0= ruleDebugStatement ) )? )
            {
            // InternalBddDsl.g:3135:2: ( ( (lv_property_0_0= rulePropertyRef ) )? ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleDeclarativeEntityRef ) ) ( (lv_toBeWord_3_0= ruleToBeWords ) ) ( (lv_value_4_0= ruleENTITY_IDENTITY ) ) ( (lv_debug_5_0= ruleDebugStatement ) )? )
            // InternalBddDsl.g:3136:3: ( (lv_property_0_0= rulePropertyRef ) )? ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleDeclarativeEntityRef ) ) ( (lv_toBeWord_3_0= ruleToBeWords ) ) ( (lv_value_4_0= ruleENTITY_IDENTITY ) ) ( (lv_debug_5_0= ruleDebugStatement ) )?
            {
            // InternalBddDsl.g:3136:3: ( (lv_property_0_0= rulePropertyRef ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==25) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                        case 52:
                            {
                            int LA64_4 = input.LA(4);

                            if ( (LA64_4==RULE_INT) ) {
                                int LA64_7 = input.LA(5);

                                if ( (LA64_7==25||(LA64_7>=28 && LA64_7<=39)) ) {
                                    alt64=1;
                                }
                            }
                            }
                            break;
                        case RULE_STRING:
                            {
                            int LA64_5 = input.LA(4);

                            if ( (LA64_5==25||(LA64_5>=28 && LA64_5<=39)) ) {
                                alt64=1;
                            }
                            }
                            break;
                        case 25:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            {
                            alt64=1;
                            }
                            break;
                    }

                }
            }
            switch (alt64) {
                case 1 :
                    // InternalBddDsl.g:3137:4: (lv_property_0_0= rulePropertyRef )
                    {
                    // InternalBddDsl.g:3137:4: (lv_property_0_0= rulePropertyRef )
                    // InternalBddDsl.g:3138:5: lv_property_0_0= rulePropertyRef
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getPropertyPropertyRefParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_40);
                    lv_property_0_0=rulePropertyRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyStatePhraseRule());
                    					}
                    					set(
                    						current,
                    						"property",
                    						lv_property_0_0,
                    						"dk.sdu.bdd.xtext.BddDsl.PropertyRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:3155:3: ( (lv_preposition_1_0= rulePREP ) )
            // InternalBddDsl.g:3156:4: (lv_preposition_1_0= rulePREP )
            {
            // InternalBddDsl.g:3156:4: (lv_preposition_1_0= rulePREP )
            // InternalBddDsl.g:3157:5: lv_preposition_1_0= rulePREP
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getPrepositionPREPParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_preposition_1_0=rulePREP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyStatePhraseRule());
            					}
            					set(
            						current,
            						"preposition",
            						lv_preposition_1_0,
            						"dk.sdu.bdd.xtext.BddDsl.PREP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3174:3: ( (lv_entity_2_0= ruleDeclarativeEntityRef ) )
            // InternalBddDsl.g:3175:4: (lv_entity_2_0= ruleDeclarativeEntityRef )
            {
            // InternalBddDsl.g:3175:4: (lv_entity_2_0= ruleDeclarativeEntityRef )
            // InternalBddDsl.g:3176:5: lv_entity_2_0= ruleDeclarativeEntityRef
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getEntityDeclarativeEntityRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_entity_2_0=ruleDeclarativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyStatePhraseRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_2_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3193:3: ( (lv_toBeWord_3_0= ruleToBeWords ) )
            // InternalBddDsl.g:3194:4: (lv_toBeWord_3_0= ruleToBeWords )
            {
            // InternalBddDsl.g:3194:4: (lv_toBeWord_3_0= ruleToBeWords )
            // InternalBddDsl.g:3195:5: lv_toBeWord_3_0= ruleToBeWords
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getToBeWordToBeWordsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
            lv_toBeWord_3_0=ruleToBeWords();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyStatePhraseRule());
            					}
            					set(
            						current,
            						"toBeWord",
            						lv_toBeWord_3_0,
            						"dk.sdu.bdd.xtext.BddDsl.ToBeWords");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3212:3: ( (lv_value_4_0= ruleENTITY_IDENTITY ) )
            // InternalBddDsl.g:3213:4: (lv_value_4_0= ruleENTITY_IDENTITY )
            {
            // InternalBddDsl.g:3213:4: (lv_value_4_0= ruleENTITY_IDENTITY )
            // InternalBddDsl.g:3214:5: lv_value_4_0= ruleENTITY_IDENTITY
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getValueENTITY_IDENTITYParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_value_4_0=ruleENTITY_IDENTITY();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyStatePhraseRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"dk.sdu.bdd.xtext.BddDsl.ENTITY_IDENTITY");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3231:3: ( (lv_debug_5_0= ruleDebugStatement ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==50) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalBddDsl.g:3232:4: (lv_debug_5_0= ruleDebugStatement )
                    {
                    // InternalBddDsl.g:3232:4: (lv_debug_5_0= ruleDebugStatement )
                    // InternalBddDsl.g:3233:5: lv_debug_5_0= ruleDebugStatement
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyStatePhraseAccess().getDebugDebugStatementParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_debug_5_0=ruleDebugStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyStatePhraseRule());
                    					}
                    					set(
                    						current,
                    						"debug",
                    						lv_debug_5_0,
                    						"dk.sdu.bdd.xtext.BddDsl.DebugStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarativeEntityPropertyStatePhrase"


    // $ANTLR start "entryRuleImperativeEntityPropertyStatePhrase"
    // InternalBddDsl.g:3254:1: entryRuleImperativeEntityPropertyStatePhrase returns [EObject current=null] : iv_ruleImperativeEntityPropertyStatePhrase= ruleImperativeEntityPropertyStatePhrase EOF ;
    public final EObject entryRuleImperativeEntityPropertyStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeEntityPropertyStatePhrase = null;


        try {
            // InternalBddDsl.g:3254:76: (iv_ruleImperativeEntityPropertyStatePhrase= ruleImperativeEntityPropertyStatePhrase EOF )
            // InternalBddDsl.g:3255:2: iv_ruleImperativeEntityPropertyStatePhrase= ruleImperativeEntityPropertyStatePhrase EOF
            {
             newCompositeNode(grammarAccess.getImperativeEntityPropertyStatePhraseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeEntityPropertyStatePhrase=ruleImperativeEntityPropertyStatePhrase();

            state._fsp--;

             current =iv_ruleImperativeEntityPropertyStatePhrase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeEntityPropertyStatePhrase"


    // $ANTLR start "ruleImperativeEntityPropertyStatePhrase"
    // InternalBddDsl.g:3261:1: ruleImperativeEntityPropertyStatePhrase returns [EObject current=null] : ( ( (lv_property_0_0= ruleImperativePropertyRef ) )? ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleImperativeEntityRef ) ) ( (lv_toBeWord_3_0= ruleToBeWords ) ) ( (lv_value_4_0= ruleENTITY_IDENTITY ) ) ) ;
    public final EObject ruleImperativeEntityPropertyStatePhrase() throws RecognitionException {
        EObject current = null;

        EObject lv_property_0_0 = null;

        AntlrDatatypeRuleToken lv_preposition_1_0 = null;

        EObject lv_entity_2_0 = null;

        AntlrDatatypeRuleToken lv_toBeWord_3_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3267:2: ( ( ( (lv_property_0_0= ruleImperativePropertyRef ) )? ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleImperativeEntityRef ) ) ( (lv_toBeWord_3_0= ruleToBeWords ) ) ( (lv_value_4_0= ruleENTITY_IDENTITY ) ) ) )
            // InternalBddDsl.g:3268:2: ( ( (lv_property_0_0= ruleImperativePropertyRef ) )? ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleImperativeEntityRef ) ) ( (lv_toBeWord_3_0= ruleToBeWords ) ) ( (lv_value_4_0= ruleENTITY_IDENTITY ) ) )
            {
            // InternalBddDsl.g:3268:2: ( ( (lv_property_0_0= ruleImperativePropertyRef ) )? ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleImperativeEntityRef ) ) ( (lv_toBeWord_3_0= ruleToBeWords ) ) ( (lv_value_4_0= ruleENTITY_IDENTITY ) ) )
            // InternalBddDsl.g:3269:3: ( (lv_property_0_0= ruleImperativePropertyRef ) )? ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleImperativeEntityRef ) ) ( (lv_toBeWord_3_0= ruleToBeWords ) ) ( (lv_value_4_0= ruleENTITY_IDENTITY ) )
            {
            // InternalBddDsl.g:3269:3: ( (lv_property_0_0= ruleImperativePropertyRef ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==25) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                        case 52:
                            {
                            int LA66_4 = input.LA(4);

                            if ( (LA66_4==RULE_INT) ) {
                                int LA66_7 = input.LA(5);

                                if ( (LA66_7==25||(LA66_7>=28 && LA66_7<=39)) ) {
                                    alt66=1;
                                }
                            }
                            }
                            break;
                        case RULE_STRING:
                            {
                            int LA66_5 = input.LA(4);

                            if ( (LA66_5==25||(LA66_5>=28 && LA66_5<=39)) ) {
                                alt66=1;
                            }
                            }
                            break;
                        case 25:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            {
                            alt66=1;
                            }
                            break;
                    }

                }
            }
            switch (alt66) {
                case 1 :
                    // InternalBddDsl.g:3270:4: (lv_property_0_0= ruleImperativePropertyRef )
                    {
                    // InternalBddDsl.g:3270:4: (lv_property_0_0= ruleImperativePropertyRef )
                    // InternalBddDsl.g:3271:5: lv_property_0_0= ruleImperativePropertyRef
                    {

                    					newCompositeNode(grammarAccess.getImperativeEntityPropertyStatePhraseAccess().getPropertyImperativePropertyRefParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_40);
                    lv_property_0_0=ruleImperativePropertyRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImperativeEntityPropertyStatePhraseRule());
                    					}
                    					set(
                    						current,
                    						"property",
                    						lv_property_0_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ImperativePropertyRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:3288:3: ( (lv_preposition_1_0= rulePREP ) )
            // InternalBddDsl.g:3289:4: (lv_preposition_1_0= rulePREP )
            {
            // InternalBddDsl.g:3289:4: (lv_preposition_1_0= rulePREP )
            // InternalBddDsl.g:3290:5: lv_preposition_1_0= rulePREP
            {

            					newCompositeNode(grammarAccess.getImperativeEntityPropertyStatePhraseAccess().getPrepositionPREPParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_preposition_1_0=rulePREP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityPropertyStatePhraseRule());
            					}
            					set(
            						current,
            						"preposition",
            						lv_preposition_1_0,
            						"dk.sdu.bdd.xtext.BddDsl.PREP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3307:3: ( (lv_entity_2_0= ruleImperativeEntityRef ) )
            // InternalBddDsl.g:3308:4: (lv_entity_2_0= ruleImperativeEntityRef )
            {
            // InternalBddDsl.g:3308:4: (lv_entity_2_0= ruleImperativeEntityRef )
            // InternalBddDsl.g:3309:5: lv_entity_2_0= ruleImperativeEntityRef
            {

            					newCompositeNode(grammarAccess.getImperativeEntityPropertyStatePhraseAccess().getEntityImperativeEntityRefParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_entity_2_0=ruleImperativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityPropertyStatePhraseRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_2_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3326:3: ( (lv_toBeWord_3_0= ruleToBeWords ) )
            // InternalBddDsl.g:3327:4: (lv_toBeWord_3_0= ruleToBeWords )
            {
            // InternalBddDsl.g:3327:4: (lv_toBeWord_3_0= ruleToBeWords )
            // InternalBddDsl.g:3328:5: lv_toBeWord_3_0= ruleToBeWords
            {

            					newCompositeNode(grammarAccess.getImperativeEntityPropertyStatePhraseAccess().getToBeWordToBeWordsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
            lv_toBeWord_3_0=ruleToBeWords();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityPropertyStatePhraseRule());
            					}
            					set(
            						current,
            						"toBeWord",
            						lv_toBeWord_3_0,
            						"dk.sdu.bdd.xtext.BddDsl.ToBeWords");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3345:3: ( (lv_value_4_0= ruleENTITY_IDENTITY ) )
            // InternalBddDsl.g:3346:4: (lv_value_4_0= ruleENTITY_IDENTITY )
            {
            // InternalBddDsl.g:3346:4: (lv_value_4_0= ruleENTITY_IDENTITY )
            // InternalBddDsl.g:3347:5: lv_value_4_0= ruleENTITY_IDENTITY
            {

            					newCompositeNode(grammarAccess.getImperativeEntityPropertyStatePhraseAccess().getValueENTITY_IDENTITYParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleENTITY_IDENTITY();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityPropertyStatePhraseRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"dk.sdu.bdd.xtext.BddDsl.ENTITY_IDENTITY");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeEntityPropertyStatePhrase"


    // $ANTLR start "entryRuleVerbAction"
    // InternalBddDsl.g:3368:1: entryRuleVerbAction returns [EObject current=null] : iv_ruleVerbAction= ruleVerbAction EOF ;
    public final EObject entryRuleVerbAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerbAction = null;


        try {
            // InternalBddDsl.g:3368:51: (iv_ruleVerbAction= ruleVerbAction EOF )
            // InternalBddDsl.g:3369:2: iv_ruleVerbAction= ruleVerbAction EOF
            {
             newCompositeNode(grammarAccess.getVerbActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerbAction=ruleVerbAction();

            state._fsp--;

             current =iv_ruleVerbAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerbAction"


    // $ANTLR start "ruleVerbAction"
    // InternalBddDsl.g:3375:1: ruleVerbAction returns [EObject current=null] : ( ( (lv_action_0_0= ruleActionRef ) ) ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleDeclarativeEntityRef ) )? ( ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleDeclarativeEntityRef ) ) )? ( ( (lv_preposition3_5_0= rulePREP ) ) ( (lv_entity3_6_0= ruleDeclarativeEntityRef ) ) )? ( (lv_debug_7_0= ruleDebugStatement ) )? ) ;
    public final EObject ruleVerbAction() throws RecognitionException {
        EObject current = null;

        EObject lv_action_0_0 = null;

        AntlrDatatypeRuleToken lv_preposition_1_0 = null;

        EObject lv_entity_2_0 = null;

        AntlrDatatypeRuleToken lv_preposition2_3_0 = null;

        EObject lv_entity2_4_0 = null;

        AntlrDatatypeRuleToken lv_preposition3_5_0 = null;

        EObject lv_entity3_6_0 = null;

        AntlrDatatypeRuleToken lv_debug_7_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3381:2: ( ( ( (lv_action_0_0= ruleActionRef ) ) ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleDeclarativeEntityRef ) )? ( ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleDeclarativeEntityRef ) ) )? ( ( (lv_preposition3_5_0= rulePREP ) ) ( (lv_entity3_6_0= ruleDeclarativeEntityRef ) ) )? ( (lv_debug_7_0= ruleDebugStatement ) )? ) )
            // InternalBddDsl.g:3382:2: ( ( (lv_action_0_0= ruleActionRef ) ) ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleDeclarativeEntityRef ) )? ( ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleDeclarativeEntityRef ) ) )? ( ( (lv_preposition3_5_0= rulePREP ) ) ( (lv_entity3_6_0= ruleDeclarativeEntityRef ) ) )? ( (lv_debug_7_0= ruleDebugStatement ) )? )
            {
            // InternalBddDsl.g:3382:2: ( ( (lv_action_0_0= ruleActionRef ) ) ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleDeclarativeEntityRef ) )? ( ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleDeclarativeEntityRef ) ) )? ( ( (lv_preposition3_5_0= rulePREP ) ) ( (lv_entity3_6_0= ruleDeclarativeEntityRef ) ) )? ( (lv_debug_7_0= ruleDebugStatement ) )? )
            // InternalBddDsl.g:3383:3: ( (lv_action_0_0= ruleActionRef ) ) ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleDeclarativeEntityRef ) )? ( ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleDeclarativeEntityRef ) ) )? ( ( (lv_preposition3_5_0= rulePREP ) ) ( (lv_entity3_6_0= ruleDeclarativeEntityRef ) ) )? ( (lv_debug_7_0= ruleDebugStatement ) )?
            {
            // InternalBddDsl.g:3383:3: ( (lv_action_0_0= ruleActionRef ) )
            // InternalBddDsl.g:3384:4: (lv_action_0_0= ruleActionRef )
            {
            // InternalBddDsl.g:3384:4: (lv_action_0_0= ruleActionRef )
            // InternalBddDsl.g:3385:5: lv_action_0_0= ruleActionRef
            {

            					newCompositeNode(grammarAccess.getVerbActionAccess().getActionActionRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_43);
            lv_action_0_0=ruleActionRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerbActionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.ActionRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3402:3: ( (lv_preposition_1_0= rulePREP ) )
            // InternalBddDsl.g:3403:4: (lv_preposition_1_0= rulePREP )
            {
            // InternalBddDsl.g:3403:4: (lv_preposition_1_0= rulePREP )
            // InternalBddDsl.g:3404:5: lv_preposition_1_0= rulePREP
            {

            					newCompositeNode(grammarAccess.getVerbActionAccess().getPrepositionPREPParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_44);
            lv_preposition_1_0=rulePREP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerbActionRule());
            					}
            					set(
            						current,
            						"preposition",
            						lv_preposition_1_0,
            						"dk.sdu.bdd.xtext.BddDsl.PREP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3421:3: ( (lv_entity_2_0= ruleDeclarativeEntityRef ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==25) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==RULE_ID) ) {
                    alt67=1;
                }
            }
            switch (alt67) {
                case 1 :
                    // InternalBddDsl.g:3422:4: (lv_entity_2_0= ruleDeclarativeEntityRef )
                    {
                    // InternalBddDsl.g:3422:4: (lv_entity_2_0= ruleDeclarativeEntityRef )
                    // InternalBddDsl.g:3423:5: lv_entity_2_0= ruleDeclarativeEntityRef
                    {

                    					newCompositeNode(grammarAccess.getVerbActionAccess().getEntityDeclarativeEntityRefParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_44);
                    lv_entity_2_0=ruleDeclarativeEntityRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVerbActionRule());
                    					}
                    					set(
                    						current,
                    						"entity",
                    						lv_entity_2_0,
                    						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:3440:3: ( ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleDeclarativeEntityRef ) ) )?
            int alt68=2;
            alt68 = dfa68.predict(input);
            switch (alt68) {
                case 1 :
                    // InternalBddDsl.g:3441:4: ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleDeclarativeEntityRef ) )
                    {
                    // InternalBddDsl.g:3441:4: ( (lv_preposition2_3_0= rulePREP ) )
                    // InternalBddDsl.g:3442:5: (lv_preposition2_3_0= rulePREP )
                    {
                    // InternalBddDsl.g:3442:5: (lv_preposition2_3_0= rulePREP )
                    // InternalBddDsl.g:3443:6: lv_preposition2_3_0= rulePREP
                    {

                    						newCompositeNode(grammarAccess.getVerbActionAccess().getPreposition2PREPParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_preposition2_3_0=rulePREP();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVerbActionRule());
                    						}
                    						set(
                    							current,
                    							"preposition2",
                    							lv_preposition2_3_0,
                    							"dk.sdu.bdd.xtext.BddDsl.PREP");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:3460:4: ( (lv_entity2_4_0= ruleDeclarativeEntityRef ) )
                    // InternalBddDsl.g:3461:5: (lv_entity2_4_0= ruleDeclarativeEntityRef )
                    {
                    // InternalBddDsl.g:3461:5: (lv_entity2_4_0= ruleDeclarativeEntityRef )
                    // InternalBddDsl.g:3462:6: lv_entity2_4_0= ruleDeclarativeEntityRef
                    {

                    						newCompositeNode(grammarAccess.getVerbActionAccess().getEntity2DeclarativeEntityRefParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_entity2_4_0=ruleDeclarativeEntityRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVerbActionRule());
                    						}
                    						set(
                    							current,
                    							"entity2",
                    							lv_entity2_4_0,
                    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBddDsl.g:3480:3: ( ( (lv_preposition3_5_0= rulePREP ) ) ( (lv_entity3_6_0= ruleDeclarativeEntityRef ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==25||(LA69_0>=28 && LA69_0<=39)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalBddDsl.g:3481:4: ( (lv_preposition3_5_0= rulePREP ) ) ( (lv_entity3_6_0= ruleDeclarativeEntityRef ) )
                    {
                    // InternalBddDsl.g:3481:4: ( (lv_preposition3_5_0= rulePREP ) )
                    // InternalBddDsl.g:3482:5: (lv_preposition3_5_0= rulePREP )
                    {
                    // InternalBddDsl.g:3482:5: (lv_preposition3_5_0= rulePREP )
                    // InternalBddDsl.g:3483:6: lv_preposition3_5_0= rulePREP
                    {

                    						newCompositeNode(grammarAccess.getVerbActionAccess().getPreposition3PREPParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_preposition3_5_0=rulePREP();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVerbActionRule());
                    						}
                    						set(
                    							current,
                    							"preposition3",
                    							lv_preposition3_5_0,
                    							"dk.sdu.bdd.xtext.BddDsl.PREP");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:3500:4: ( (lv_entity3_6_0= ruleDeclarativeEntityRef ) )
                    // InternalBddDsl.g:3501:5: (lv_entity3_6_0= ruleDeclarativeEntityRef )
                    {
                    // InternalBddDsl.g:3501:5: (lv_entity3_6_0= ruleDeclarativeEntityRef )
                    // InternalBddDsl.g:3502:6: lv_entity3_6_0= ruleDeclarativeEntityRef
                    {

                    						newCompositeNode(grammarAccess.getVerbActionAccess().getEntity3DeclarativeEntityRefParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_entity3_6_0=ruleDeclarativeEntityRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVerbActionRule());
                    						}
                    						set(
                    							current,
                    							"entity3",
                    							lv_entity3_6_0,
                    							"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBddDsl.g:3520:3: ( (lv_debug_7_0= ruleDebugStatement ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==50) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalBddDsl.g:3521:4: (lv_debug_7_0= ruleDebugStatement )
                    {
                    // InternalBddDsl.g:3521:4: (lv_debug_7_0= ruleDebugStatement )
                    // InternalBddDsl.g:3522:5: lv_debug_7_0= ruleDebugStatement
                    {

                    					newCompositeNode(grammarAccess.getVerbActionAccess().getDebugDebugStatementParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_debug_7_0=ruleDebugStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVerbActionRule());
                    					}
                    					set(
                    						current,
                    						"debug",
                    						lv_debug_7_0,
                    						"dk.sdu.bdd.xtext.BddDsl.DebugStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerbAction"


    // $ANTLR start "entryRuleDeclarativeEntityAction"
    // InternalBddDsl.g:3543:1: entryRuleDeclarativeEntityAction returns [EObject current=null] : iv_ruleDeclarativeEntityAction= ruleDeclarativeEntityAction EOF ;
    public final EObject entryRuleDeclarativeEntityAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeEntityAction = null;


        try {
            // InternalBddDsl.g:3543:64: (iv_ruleDeclarativeEntityAction= ruleDeclarativeEntityAction EOF )
            // InternalBddDsl.g:3544:2: iv_ruleDeclarativeEntityAction= ruleDeclarativeEntityAction EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeEntityActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeEntityAction=ruleDeclarativeEntityAction();

            state._fsp--;

             current =iv_ruleDeclarativeEntityAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarativeEntityAction"


    // $ANTLR start "ruleDeclarativeEntityAction"
    // InternalBddDsl.g:3550:1: ruleDeclarativeEntityAction returns [EObject current=null] : ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ( (lv_actionRef_1_0= ruleActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_entity2_3_0= ruleDeclarativeEntityOrPropertyRef ) ) ( (lv_debug_4_0= ruleDebugStatement ) )? ) ;
    public final EObject ruleDeclarativeEntityAction() throws RecognitionException {
        EObject current = null;

        EObject lv_entity_0_0 = null;

        EObject lv_actionRef_1_0 = null;

        AntlrDatatypeRuleToken lv_preposition_2_0 = null;

        EObject lv_entity2_3_0 = null;

        AntlrDatatypeRuleToken lv_debug_4_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3556:2: ( ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ( (lv_actionRef_1_0= ruleActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_entity2_3_0= ruleDeclarativeEntityOrPropertyRef ) ) ( (lv_debug_4_0= ruleDebugStatement ) )? ) )
            // InternalBddDsl.g:3557:2: ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ( (lv_actionRef_1_0= ruleActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_entity2_3_0= ruleDeclarativeEntityOrPropertyRef ) ) ( (lv_debug_4_0= ruleDebugStatement ) )? )
            {
            // InternalBddDsl.g:3557:2: ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ( (lv_actionRef_1_0= ruleActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_entity2_3_0= ruleDeclarativeEntityOrPropertyRef ) ) ( (lv_debug_4_0= ruleDebugStatement ) )? )
            // InternalBddDsl.g:3558:3: ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ( (lv_actionRef_1_0= ruleActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_entity2_3_0= ruleDeclarativeEntityOrPropertyRef ) ) ( (lv_debug_4_0= ruleDebugStatement ) )?
            {
            // InternalBddDsl.g:3558:3: ( (lv_entity_0_0= ruleDeclarativeEntityRef ) )
            // InternalBddDsl.g:3559:4: (lv_entity_0_0= ruleDeclarativeEntityRef )
            {
            // InternalBddDsl.g:3559:4: (lv_entity_0_0= ruleDeclarativeEntityRef )
            // InternalBddDsl.g:3560:5: lv_entity_0_0= ruleDeclarativeEntityRef
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityActionAccess().getEntityDeclarativeEntityRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_entity_0_0=ruleDeclarativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityActionRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3577:3: ( (lv_actionRef_1_0= ruleActionRef ) )
            // InternalBddDsl.g:3578:4: (lv_actionRef_1_0= ruleActionRef )
            {
            // InternalBddDsl.g:3578:4: (lv_actionRef_1_0= ruleActionRef )
            // InternalBddDsl.g:3579:5: lv_actionRef_1_0= ruleActionRef
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityActionAccess().getActionRefActionRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_actionRef_1_0=ruleActionRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityActionRule());
            					}
            					set(
            						current,
            						"actionRef",
            						lv_actionRef_1_0,
            						"dk.sdu.bdd.xtext.BddDsl.ActionRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3596:3: ( (lv_preposition_2_0= rulePREP ) )
            // InternalBddDsl.g:3597:4: (lv_preposition_2_0= rulePREP )
            {
            // InternalBddDsl.g:3597:4: (lv_preposition_2_0= rulePREP )
            // InternalBddDsl.g:3598:5: lv_preposition_2_0= rulePREP
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityActionAccess().getPrepositionPREPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_preposition_2_0=rulePREP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityActionRule());
            					}
            					set(
            						current,
            						"preposition",
            						lv_preposition_2_0,
            						"dk.sdu.bdd.xtext.BddDsl.PREP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3615:3: ( (lv_entity2_3_0= ruleDeclarativeEntityOrPropertyRef ) )
            // InternalBddDsl.g:3616:4: (lv_entity2_3_0= ruleDeclarativeEntityOrPropertyRef )
            {
            // InternalBddDsl.g:3616:4: (lv_entity2_3_0= ruleDeclarativeEntityOrPropertyRef )
            // InternalBddDsl.g:3617:5: lv_entity2_3_0= ruleDeclarativeEntityOrPropertyRef
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityActionAccess().getEntity2DeclarativeEntityOrPropertyRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_37);
            lv_entity2_3_0=ruleDeclarativeEntityOrPropertyRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityActionRule());
            					}
            					set(
            						current,
            						"entity2",
            						lv_entity2_3_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityOrPropertyRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3634:3: ( (lv_debug_4_0= ruleDebugStatement ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==50) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalBddDsl.g:3635:4: (lv_debug_4_0= ruleDebugStatement )
                    {
                    // InternalBddDsl.g:3635:4: (lv_debug_4_0= ruleDebugStatement )
                    // InternalBddDsl.g:3636:5: lv_debug_4_0= ruleDebugStatement
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeEntityActionAccess().getDebugDebugStatementParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_debug_4_0=ruleDebugStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeEntityActionRule());
                    					}
                    					set(
                    						current,
                    						"debug",
                    						lv_debug_4_0,
                    						"dk.sdu.bdd.xtext.BddDsl.DebugStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarativeEntityAction"


    // $ANTLR start "entryRuleDeclarativeEntityPropertyAction"
    // InternalBddDsl.g:3657:1: entryRuleDeclarativeEntityPropertyAction returns [EObject current=null] : iv_ruleDeclarativeEntityPropertyAction= ruleDeclarativeEntityPropertyAction EOF ;
    public final EObject entryRuleDeclarativeEntityPropertyAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarativeEntityPropertyAction = null;


        try {
            // InternalBddDsl.g:3657:72: (iv_ruleDeclarativeEntityPropertyAction= ruleDeclarativeEntityPropertyAction EOF )
            // InternalBddDsl.g:3658:2: iv_ruleDeclarativeEntityPropertyAction= ruleDeclarativeEntityPropertyAction EOF
            {
             newCompositeNode(grammarAccess.getDeclarativeEntityPropertyActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclarativeEntityPropertyAction=ruleDeclarativeEntityPropertyAction();

            state._fsp--;

             current =iv_ruleDeclarativeEntityPropertyAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarativeEntityPropertyAction"


    // $ANTLR start "ruleDeclarativeEntityPropertyAction"
    // InternalBddDsl.g:3664:1: ruleDeclarativeEntityPropertyAction returns [EObject current=null] : ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ( (lv_actionRef_1_0= ruleActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_property_3_0= rulePropertyRef ) ) ( (lv_preposition2_4_0= rulePREP ) ) ( (lv_entity2_5_0= ruleDeclarativeEntityRef ) ) ( (lv_debug_6_0= ruleDebugStatement ) )? ) ;
    public final EObject ruleDeclarativeEntityPropertyAction() throws RecognitionException {
        EObject current = null;

        EObject lv_entity_0_0 = null;

        EObject lv_actionRef_1_0 = null;

        AntlrDatatypeRuleToken lv_preposition_2_0 = null;

        EObject lv_property_3_0 = null;

        AntlrDatatypeRuleToken lv_preposition2_4_0 = null;

        EObject lv_entity2_5_0 = null;

        AntlrDatatypeRuleToken lv_debug_6_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3670:2: ( ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ( (lv_actionRef_1_0= ruleActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_property_3_0= rulePropertyRef ) ) ( (lv_preposition2_4_0= rulePREP ) ) ( (lv_entity2_5_0= ruleDeclarativeEntityRef ) ) ( (lv_debug_6_0= ruleDebugStatement ) )? ) )
            // InternalBddDsl.g:3671:2: ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ( (lv_actionRef_1_0= ruleActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_property_3_0= rulePropertyRef ) ) ( (lv_preposition2_4_0= rulePREP ) ) ( (lv_entity2_5_0= ruleDeclarativeEntityRef ) ) ( (lv_debug_6_0= ruleDebugStatement ) )? )
            {
            // InternalBddDsl.g:3671:2: ( ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ( (lv_actionRef_1_0= ruleActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_property_3_0= rulePropertyRef ) ) ( (lv_preposition2_4_0= rulePREP ) ) ( (lv_entity2_5_0= ruleDeclarativeEntityRef ) ) ( (lv_debug_6_0= ruleDebugStatement ) )? )
            // InternalBddDsl.g:3672:3: ( (lv_entity_0_0= ruleDeclarativeEntityRef ) ) ( (lv_actionRef_1_0= ruleActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_property_3_0= rulePropertyRef ) ) ( (lv_preposition2_4_0= rulePREP ) ) ( (lv_entity2_5_0= ruleDeclarativeEntityRef ) ) ( (lv_debug_6_0= ruleDebugStatement ) )?
            {
            // InternalBddDsl.g:3672:3: ( (lv_entity_0_0= ruleDeclarativeEntityRef ) )
            // InternalBddDsl.g:3673:4: (lv_entity_0_0= ruleDeclarativeEntityRef )
            {
            // InternalBddDsl.g:3673:4: (lv_entity_0_0= ruleDeclarativeEntityRef )
            // InternalBddDsl.g:3674:5: lv_entity_0_0= ruleDeclarativeEntityRef
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyActionAccess().getEntityDeclarativeEntityRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_entity_0_0=ruleDeclarativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyActionRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3691:3: ( (lv_actionRef_1_0= ruleActionRef ) )
            // InternalBddDsl.g:3692:4: (lv_actionRef_1_0= ruleActionRef )
            {
            // InternalBddDsl.g:3692:4: (lv_actionRef_1_0= ruleActionRef )
            // InternalBddDsl.g:3693:5: lv_actionRef_1_0= ruleActionRef
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyActionAccess().getActionRefActionRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_actionRef_1_0=ruleActionRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyActionRule());
            					}
            					set(
            						current,
            						"actionRef",
            						lv_actionRef_1_0,
            						"dk.sdu.bdd.xtext.BddDsl.ActionRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3710:3: ( (lv_preposition_2_0= rulePREP ) )
            // InternalBddDsl.g:3711:4: (lv_preposition_2_0= rulePREP )
            {
            // InternalBddDsl.g:3711:4: (lv_preposition_2_0= rulePREP )
            // InternalBddDsl.g:3712:5: lv_preposition_2_0= rulePREP
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyActionAccess().getPrepositionPREPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_preposition_2_0=rulePREP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyActionRule());
            					}
            					set(
            						current,
            						"preposition",
            						lv_preposition_2_0,
            						"dk.sdu.bdd.xtext.BddDsl.PREP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3729:3: ( (lv_property_3_0= rulePropertyRef ) )
            // InternalBddDsl.g:3730:4: (lv_property_3_0= rulePropertyRef )
            {
            // InternalBddDsl.g:3730:4: (lv_property_3_0= rulePropertyRef )
            // InternalBddDsl.g:3731:5: lv_property_3_0= rulePropertyRef
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyActionAccess().getPropertyPropertyRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_40);
            lv_property_3_0=rulePropertyRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyActionRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_3_0,
            						"dk.sdu.bdd.xtext.BddDsl.PropertyRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3748:3: ( (lv_preposition2_4_0= rulePREP ) )
            // InternalBddDsl.g:3749:4: (lv_preposition2_4_0= rulePREP )
            {
            // InternalBddDsl.g:3749:4: (lv_preposition2_4_0= rulePREP )
            // InternalBddDsl.g:3750:5: lv_preposition2_4_0= rulePREP
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyActionAccess().getPreposition2PREPParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_40);
            lv_preposition2_4_0=rulePREP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyActionRule());
            					}
            					set(
            						current,
            						"preposition2",
            						lv_preposition2_4_0,
            						"dk.sdu.bdd.xtext.BddDsl.PREP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3767:3: ( (lv_entity2_5_0= ruleDeclarativeEntityRef ) )
            // InternalBddDsl.g:3768:4: (lv_entity2_5_0= ruleDeclarativeEntityRef )
            {
            // InternalBddDsl.g:3768:4: (lv_entity2_5_0= ruleDeclarativeEntityRef )
            // InternalBddDsl.g:3769:5: lv_entity2_5_0= ruleDeclarativeEntityRef
            {

            					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyActionAccess().getEntity2DeclarativeEntityRefParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_37);
            lv_entity2_5_0=ruleDeclarativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyActionRule());
            					}
            					set(
            						current,
            						"entity2",
            						lv_entity2_5_0,
            						"dk.sdu.bdd.xtext.BddDsl.DeclarativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3786:3: ( (lv_debug_6_0= ruleDebugStatement ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==50) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalBddDsl.g:3787:4: (lv_debug_6_0= ruleDebugStatement )
                    {
                    // InternalBddDsl.g:3787:4: (lv_debug_6_0= ruleDebugStatement )
                    // InternalBddDsl.g:3788:5: lv_debug_6_0= ruleDebugStatement
                    {

                    					newCompositeNode(grammarAccess.getDeclarativeEntityPropertyActionAccess().getDebugDebugStatementParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_debug_6_0=ruleDebugStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeclarativeEntityPropertyActionRule());
                    					}
                    					set(
                    						current,
                    						"debug",
                    						lv_debug_6_0,
                    						"dk.sdu.bdd.xtext.BddDsl.DebugStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarativeEntityPropertyAction"


    // $ANTLR start "entryRuleImperativeVerbAction"
    // InternalBddDsl.g:3809:1: entryRuleImperativeVerbAction returns [EObject current=null] : iv_ruleImperativeVerbAction= ruleImperativeVerbAction EOF ;
    public final EObject entryRuleImperativeVerbAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeVerbAction = null;


        try {
            // InternalBddDsl.g:3809:61: (iv_ruleImperativeVerbAction= ruleImperativeVerbAction EOF )
            // InternalBddDsl.g:3810:2: iv_ruleImperativeVerbAction= ruleImperativeVerbAction EOF
            {
             newCompositeNode(grammarAccess.getImperativeVerbActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeVerbAction=ruleImperativeVerbAction();

            state._fsp--;

             current =iv_ruleImperativeVerbAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeVerbAction"


    // $ANTLR start "ruleImperativeVerbAction"
    // InternalBddDsl.g:3816:1: ruleImperativeVerbAction returns [EObject current=null] : ( ( (lv_action_0_0= ruleImperativeActionRef ) ) ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleImperativeEntityRef ) )? ( ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleImperativeEntityRef ) ) )? ( ( (lv_preposition3_5_0= rulePREP ) ) ( (lv_entity3_6_0= ruleImperativeEntityRef ) ) )? ) ;
    public final EObject ruleImperativeVerbAction() throws RecognitionException {
        EObject current = null;

        EObject lv_action_0_0 = null;

        AntlrDatatypeRuleToken lv_preposition_1_0 = null;

        EObject lv_entity_2_0 = null;

        AntlrDatatypeRuleToken lv_preposition2_3_0 = null;

        EObject lv_entity2_4_0 = null;

        AntlrDatatypeRuleToken lv_preposition3_5_0 = null;

        EObject lv_entity3_6_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3822:2: ( ( ( (lv_action_0_0= ruleImperativeActionRef ) ) ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleImperativeEntityRef ) )? ( ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleImperativeEntityRef ) ) )? ( ( (lv_preposition3_5_0= rulePREP ) ) ( (lv_entity3_6_0= ruleImperativeEntityRef ) ) )? ) )
            // InternalBddDsl.g:3823:2: ( ( (lv_action_0_0= ruleImperativeActionRef ) ) ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleImperativeEntityRef ) )? ( ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleImperativeEntityRef ) ) )? ( ( (lv_preposition3_5_0= rulePREP ) ) ( (lv_entity3_6_0= ruleImperativeEntityRef ) ) )? )
            {
            // InternalBddDsl.g:3823:2: ( ( (lv_action_0_0= ruleImperativeActionRef ) ) ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleImperativeEntityRef ) )? ( ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleImperativeEntityRef ) ) )? ( ( (lv_preposition3_5_0= rulePREP ) ) ( (lv_entity3_6_0= ruleImperativeEntityRef ) ) )? )
            // InternalBddDsl.g:3824:3: ( (lv_action_0_0= ruleImperativeActionRef ) ) ( (lv_preposition_1_0= rulePREP ) ) ( (lv_entity_2_0= ruleImperativeEntityRef ) )? ( ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleImperativeEntityRef ) ) )? ( ( (lv_preposition3_5_0= rulePREP ) ) ( (lv_entity3_6_0= ruleImperativeEntityRef ) ) )?
            {
            // InternalBddDsl.g:3824:3: ( (lv_action_0_0= ruleImperativeActionRef ) )
            // InternalBddDsl.g:3825:4: (lv_action_0_0= ruleImperativeActionRef )
            {
            // InternalBddDsl.g:3825:4: (lv_action_0_0= ruleImperativeActionRef )
            // InternalBddDsl.g:3826:5: lv_action_0_0= ruleImperativeActionRef
            {

            					newCompositeNode(grammarAccess.getImperativeVerbActionAccess().getActionImperativeActionRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_action_0_0=ruleImperativeActionRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeVerbActionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeActionRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3843:3: ( (lv_preposition_1_0= rulePREP ) )
            // InternalBddDsl.g:3844:4: (lv_preposition_1_0= rulePREP )
            {
            // InternalBddDsl.g:3844:4: (lv_preposition_1_0= rulePREP )
            // InternalBddDsl.g:3845:5: lv_preposition_1_0= rulePREP
            {

            					newCompositeNode(grammarAccess.getImperativeVerbActionAccess().getPrepositionPREPParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_45);
            lv_preposition_1_0=rulePREP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeVerbActionRule());
            					}
            					set(
            						current,
            						"preposition",
            						lv_preposition_1_0,
            						"dk.sdu.bdd.xtext.BddDsl.PREP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3862:3: ( (lv_entity_2_0= ruleImperativeEntityRef ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==25) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==RULE_ID) ) {
                    alt73=1;
                }
            }
            switch (alt73) {
                case 1 :
                    // InternalBddDsl.g:3863:4: (lv_entity_2_0= ruleImperativeEntityRef )
                    {
                    // InternalBddDsl.g:3863:4: (lv_entity_2_0= ruleImperativeEntityRef )
                    // InternalBddDsl.g:3864:5: lv_entity_2_0= ruleImperativeEntityRef
                    {

                    					newCompositeNode(grammarAccess.getImperativeVerbActionAccess().getEntityImperativeEntityRefParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_45);
                    lv_entity_2_0=ruleImperativeEntityRef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImperativeVerbActionRule());
                    					}
                    					set(
                    						current,
                    						"entity",
                    						lv_entity_2_0,
                    						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityRef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBddDsl.g:3881:3: ( ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleImperativeEntityRef ) ) )?
            int alt74=2;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // InternalBddDsl.g:3882:4: ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleImperativeEntityRef ) )
                    {
                    // InternalBddDsl.g:3882:4: ( (lv_preposition2_3_0= rulePREP ) )
                    // InternalBddDsl.g:3883:5: (lv_preposition2_3_0= rulePREP )
                    {
                    // InternalBddDsl.g:3883:5: (lv_preposition2_3_0= rulePREP )
                    // InternalBddDsl.g:3884:6: lv_preposition2_3_0= rulePREP
                    {

                    						newCompositeNode(grammarAccess.getImperativeVerbActionAccess().getPreposition2PREPParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_preposition2_3_0=rulePREP();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeVerbActionRule());
                    						}
                    						set(
                    							current,
                    							"preposition2",
                    							lv_preposition2_3_0,
                    							"dk.sdu.bdd.xtext.BddDsl.PREP");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:3901:4: ( (lv_entity2_4_0= ruleImperativeEntityRef ) )
                    // InternalBddDsl.g:3902:5: (lv_entity2_4_0= ruleImperativeEntityRef )
                    {
                    // InternalBddDsl.g:3902:5: (lv_entity2_4_0= ruleImperativeEntityRef )
                    // InternalBddDsl.g:3903:6: lv_entity2_4_0= ruleImperativeEntityRef
                    {

                    						newCompositeNode(grammarAccess.getImperativeVerbActionAccess().getEntity2ImperativeEntityRefParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_entity2_4_0=ruleImperativeEntityRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeVerbActionRule());
                    						}
                    						set(
                    							current,
                    							"entity2",
                    							lv_entity2_4_0,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalBddDsl.g:3921:3: ( ( (lv_preposition3_5_0= rulePREP ) ) ( (lv_entity3_6_0= ruleImperativeEntityRef ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==25||(LA75_0>=28 && LA75_0<=39)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalBddDsl.g:3922:4: ( (lv_preposition3_5_0= rulePREP ) ) ( (lv_entity3_6_0= ruleImperativeEntityRef ) )
                    {
                    // InternalBddDsl.g:3922:4: ( (lv_preposition3_5_0= rulePREP ) )
                    // InternalBddDsl.g:3923:5: (lv_preposition3_5_0= rulePREP )
                    {
                    // InternalBddDsl.g:3923:5: (lv_preposition3_5_0= rulePREP )
                    // InternalBddDsl.g:3924:6: lv_preposition3_5_0= rulePREP
                    {

                    						newCompositeNode(grammarAccess.getImperativeVerbActionAccess().getPreposition3PREPParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_preposition3_5_0=rulePREP();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeVerbActionRule());
                    						}
                    						set(
                    							current,
                    							"preposition3",
                    							lv_preposition3_5_0,
                    							"dk.sdu.bdd.xtext.BddDsl.PREP");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalBddDsl.g:3941:4: ( (lv_entity3_6_0= ruleImperativeEntityRef ) )
                    // InternalBddDsl.g:3942:5: (lv_entity3_6_0= ruleImperativeEntityRef )
                    {
                    // InternalBddDsl.g:3942:5: (lv_entity3_6_0= ruleImperativeEntityRef )
                    // InternalBddDsl.g:3943:6: lv_entity3_6_0= ruleImperativeEntityRef
                    {

                    						newCompositeNode(grammarAccess.getImperativeVerbActionAccess().getEntity3ImperativeEntityRefParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_entity3_6_0=ruleImperativeEntityRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImperativeVerbActionRule());
                    						}
                    						set(
                    							current,
                    							"entity3",
                    							lv_entity3_6_0,
                    							"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeVerbAction"


    // $ANTLR start "entryRuleImperativeEntityAction"
    // InternalBddDsl.g:3965:1: entryRuleImperativeEntityAction returns [EObject current=null] : iv_ruleImperativeEntityAction= ruleImperativeEntityAction EOF ;
    public final EObject entryRuleImperativeEntityAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeEntityAction = null;


        try {
            // InternalBddDsl.g:3965:63: (iv_ruleImperativeEntityAction= ruleImperativeEntityAction EOF )
            // InternalBddDsl.g:3966:2: iv_ruleImperativeEntityAction= ruleImperativeEntityAction EOF
            {
             newCompositeNode(grammarAccess.getImperativeEntityActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeEntityAction=ruleImperativeEntityAction();

            state._fsp--;

             current =iv_ruleImperativeEntityAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeEntityAction"


    // $ANTLR start "ruleImperativeEntityAction"
    // InternalBddDsl.g:3972:1: ruleImperativeEntityAction returns [EObject current=null] : ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ( (lv_actionRef_1_0= ruleImperativeActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_entity2_3_0= ruleImperativeEntityRef ) ) ) ;
    public final EObject ruleImperativeEntityAction() throws RecognitionException {
        EObject current = null;

        EObject lv_entity_0_0 = null;

        EObject lv_actionRef_1_0 = null;

        AntlrDatatypeRuleToken lv_preposition_2_0 = null;

        EObject lv_entity2_3_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:3978:2: ( ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ( (lv_actionRef_1_0= ruleImperativeActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_entity2_3_0= ruleImperativeEntityRef ) ) ) )
            // InternalBddDsl.g:3979:2: ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ( (lv_actionRef_1_0= ruleImperativeActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_entity2_3_0= ruleImperativeEntityRef ) ) )
            {
            // InternalBddDsl.g:3979:2: ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ( (lv_actionRef_1_0= ruleImperativeActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_entity2_3_0= ruleImperativeEntityRef ) ) )
            // InternalBddDsl.g:3980:3: ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ( (lv_actionRef_1_0= ruleImperativeActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_entity2_3_0= ruleImperativeEntityRef ) )
            {
            // InternalBddDsl.g:3980:3: ( (lv_entity_0_0= ruleImperativeEntityRef ) )
            // InternalBddDsl.g:3981:4: (lv_entity_0_0= ruleImperativeEntityRef )
            {
            // InternalBddDsl.g:3981:4: (lv_entity_0_0= ruleImperativeEntityRef )
            // InternalBddDsl.g:3982:5: lv_entity_0_0= ruleImperativeEntityRef
            {

            					newCompositeNode(grammarAccess.getImperativeEntityActionAccess().getEntityImperativeEntityRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_entity_0_0=ruleImperativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityActionRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:3999:3: ( (lv_actionRef_1_0= ruleImperativeActionRef ) )
            // InternalBddDsl.g:4000:4: (lv_actionRef_1_0= ruleImperativeActionRef )
            {
            // InternalBddDsl.g:4000:4: (lv_actionRef_1_0= ruleImperativeActionRef )
            // InternalBddDsl.g:4001:5: lv_actionRef_1_0= ruleImperativeActionRef
            {

            					newCompositeNode(grammarAccess.getImperativeEntityActionAccess().getActionRefImperativeActionRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_actionRef_1_0=ruleImperativeActionRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityActionRule());
            					}
            					set(
            						current,
            						"actionRef",
            						lv_actionRef_1_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeActionRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:4018:3: ( (lv_preposition_2_0= rulePREP ) )
            // InternalBddDsl.g:4019:4: (lv_preposition_2_0= rulePREP )
            {
            // InternalBddDsl.g:4019:4: (lv_preposition_2_0= rulePREP )
            // InternalBddDsl.g:4020:5: lv_preposition_2_0= rulePREP
            {

            					newCompositeNode(grammarAccess.getImperativeEntityActionAccess().getPrepositionPREPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_40);
            lv_preposition_2_0=rulePREP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityActionRule());
            					}
            					set(
            						current,
            						"preposition",
            						lv_preposition_2_0,
            						"dk.sdu.bdd.xtext.BddDsl.PREP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:4037:3: ( (lv_entity2_3_0= ruleImperativeEntityRef ) )
            // InternalBddDsl.g:4038:4: (lv_entity2_3_0= ruleImperativeEntityRef )
            {
            // InternalBddDsl.g:4038:4: (lv_entity2_3_0= ruleImperativeEntityRef )
            // InternalBddDsl.g:4039:5: lv_entity2_3_0= ruleImperativeEntityRef
            {

            					newCompositeNode(grammarAccess.getImperativeEntityActionAccess().getEntity2ImperativeEntityRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_entity2_3_0=ruleImperativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityActionRule());
            					}
            					set(
            						current,
            						"entity2",
            						lv_entity2_3_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeEntityAction"


    // $ANTLR start "entryRuleImperativeEntityPropertyAction"
    // InternalBddDsl.g:4060:1: entryRuleImperativeEntityPropertyAction returns [EObject current=null] : iv_ruleImperativeEntityPropertyAction= ruleImperativeEntityPropertyAction EOF ;
    public final EObject entryRuleImperativeEntityPropertyAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImperativeEntityPropertyAction = null;


        try {
            // InternalBddDsl.g:4060:71: (iv_ruleImperativeEntityPropertyAction= ruleImperativeEntityPropertyAction EOF )
            // InternalBddDsl.g:4061:2: iv_ruleImperativeEntityPropertyAction= ruleImperativeEntityPropertyAction EOF
            {
             newCompositeNode(grammarAccess.getImperativeEntityPropertyActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImperativeEntityPropertyAction=ruleImperativeEntityPropertyAction();

            state._fsp--;

             current =iv_ruleImperativeEntityPropertyAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImperativeEntityPropertyAction"


    // $ANTLR start "ruleImperativeEntityPropertyAction"
    // InternalBddDsl.g:4067:1: ruleImperativeEntityPropertyAction returns [EObject current=null] : ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ( (lv_actionRef_1_0= ruleImperativeActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_property_3_0= ruleImperativePropertyRef ) ) ( (lv_preposition2_4_0= rulePREP ) ) ( (lv_entity2_5_0= ruleImperativeEntityRef ) ) ) ;
    public final EObject ruleImperativeEntityPropertyAction() throws RecognitionException {
        EObject current = null;

        EObject lv_entity_0_0 = null;

        EObject lv_actionRef_1_0 = null;

        AntlrDatatypeRuleToken lv_preposition_2_0 = null;

        EObject lv_property_3_0 = null;

        AntlrDatatypeRuleToken lv_preposition2_4_0 = null;

        EObject lv_entity2_5_0 = null;



        	enterRule();

        try {
            // InternalBddDsl.g:4073:2: ( ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ( (lv_actionRef_1_0= ruleImperativeActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_property_3_0= ruleImperativePropertyRef ) ) ( (lv_preposition2_4_0= rulePREP ) ) ( (lv_entity2_5_0= ruleImperativeEntityRef ) ) ) )
            // InternalBddDsl.g:4074:2: ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ( (lv_actionRef_1_0= ruleImperativeActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_property_3_0= ruleImperativePropertyRef ) ) ( (lv_preposition2_4_0= rulePREP ) ) ( (lv_entity2_5_0= ruleImperativeEntityRef ) ) )
            {
            // InternalBddDsl.g:4074:2: ( ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ( (lv_actionRef_1_0= ruleImperativeActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_property_3_0= ruleImperativePropertyRef ) ) ( (lv_preposition2_4_0= rulePREP ) ) ( (lv_entity2_5_0= ruleImperativeEntityRef ) ) )
            // InternalBddDsl.g:4075:3: ( (lv_entity_0_0= ruleImperativeEntityRef ) ) ( (lv_actionRef_1_0= ruleImperativeActionRef ) ) ( (lv_preposition_2_0= rulePREP ) ) ( (lv_property_3_0= ruleImperativePropertyRef ) ) ( (lv_preposition2_4_0= rulePREP ) ) ( (lv_entity2_5_0= ruleImperativeEntityRef ) )
            {
            // InternalBddDsl.g:4075:3: ( (lv_entity_0_0= ruleImperativeEntityRef ) )
            // InternalBddDsl.g:4076:4: (lv_entity_0_0= ruleImperativeEntityRef )
            {
            // InternalBddDsl.g:4076:4: (lv_entity_0_0= ruleImperativeEntityRef )
            // InternalBddDsl.g:4077:5: lv_entity_0_0= ruleImperativeEntityRef
            {

            					newCompositeNode(grammarAccess.getImperativeEntityPropertyActionAccess().getEntityImperativeEntityRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_entity_0_0=ruleImperativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityPropertyActionRule());
            					}
            					set(
            						current,
            						"entity",
            						lv_entity_0_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:4094:3: ( (lv_actionRef_1_0= ruleImperativeActionRef ) )
            // InternalBddDsl.g:4095:4: (lv_actionRef_1_0= ruleImperativeActionRef )
            {
            // InternalBddDsl.g:4095:4: (lv_actionRef_1_0= ruleImperativeActionRef )
            // InternalBddDsl.g:4096:5: lv_actionRef_1_0= ruleImperativeActionRef
            {

            					newCompositeNode(grammarAccess.getImperativeEntityPropertyActionAccess().getActionRefImperativeActionRefParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_actionRef_1_0=ruleImperativeActionRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityPropertyActionRule());
            					}
            					set(
            						current,
            						"actionRef",
            						lv_actionRef_1_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeActionRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:4113:3: ( (lv_preposition_2_0= rulePREP ) )
            // InternalBddDsl.g:4114:4: (lv_preposition_2_0= rulePREP )
            {
            // InternalBddDsl.g:4114:4: (lv_preposition_2_0= rulePREP )
            // InternalBddDsl.g:4115:5: lv_preposition_2_0= rulePREP
            {

            					newCompositeNode(grammarAccess.getImperativeEntityPropertyActionAccess().getPrepositionPREPParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_preposition_2_0=rulePREP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityPropertyActionRule());
            					}
            					set(
            						current,
            						"preposition",
            						lv_preposition_2_0,
            						"dk.sdu.bdd.xtext.BddDsl.PREP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:4132:3: ( (lv_property_3_0= ruleImperativePropertyRef ) )
            // InternalBddDsl.g:4133:4: (lv_property_3_0= ruleImperativePropertyRef )
            {
            // InternalBddDsl.g:4133:4: (lv_property_3_0= ruleImperativePropertyRef )
            // InternalBddDsl.g:4134:5: lv_property_3_0= ruleImperativePropertyRef
            {

            					newCompositeNode(grammarAccess.getImperativeEntityPropertyActionAccess().getPropertyImperativePropertyRefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_40);
            lv_property_3_0=ruleImperativePropertyRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityPropertyActionRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_3_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativePropertyRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:4151:3: ( (lv_preposition2_4_0= rulePREP ) )
            // InternalBddDsl.g:4152:4: (lv_preposition2_4_0= rulePREP )
            {
            // InternalBddDsl.g:4152:4: (lv_preposition2_4_0= rulePREP )
            // InternalBddDsl.g:4153:5: lv_preposition2_4_0= rulePREP
            {

            					newCompositeNode(grammarAccess.getImperativeEntityPropertyActionAccess().getPreposition2PREPParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_40);
            lv_preposition2_4_0=rulePREP();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityPropertyActionRule());
            					}
            					set(
            						current,
            						"preposition2",
            						lv_preposition2_4_0,
            						"dk.sdu.bdd.xtext.BddDsl.PREP");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBddDsl.g:4170:3: ( (lv_entity2_5_0= ruleImperativeEntityRef ) )
            // InternalBddDsl.g:4171:4: (lv_entity2_5_0= ruleImperativeEntityRef )
            {
            // InternalBddDsl.g:4171:4: (lv_entity2_5_0= ruleImperativeEntityRef )
            // InternalBddDsl.g:4172:5: lv_entity2_5_0= ruleImperativeEntityRef
            {

            					newCompositeNode(grammarAccess.getImperativeEntityPropertyActionAccess().getEntity2ImperativeEntityRefParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_entity2_5_0=ruleImperativeEntityRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImperativeEntityPropertyActionRule());
            					}
            					set(
            						current,
            						"entity2",
            						lv_entity2_5_0,
            						"dk.sdu.bdd.xtext.BddDsl.ImperativeEntityRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImperativeEntityPropertyAction"

    // Delegated rules


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA74 dfa74 = new DFA74(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\15\15\uffff";
    static final String dfa_3s = "\1\4\15\uffff";
    static final String dfa_4s = "\1\63\15\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15";
    static final String dfa_6s = "\16\uffff}>";
    static final String[] dfa_7s = {
            "\1\15\24\uffff\1\15\1\uffff\1\15\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\4\uffff\2\15\4\uffff\2\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "961:2: (kw= 'on' | kw= 'of' | kw= 'in' | kw= 'from' | kw= 'to' | kw= 'into' | kw= 'for' | kw= 'with' | kw= 'out' | kw= 'off' | kw= 'up' | kw= 'down' )?";
        }
    }
    static final String dfa_8s = "\5\uffff\1\2\2\uffff\1\15\1\2\4\uffff";
    static final String dfa_9s = "\1\31\1\4\1\uffff\1\4\1\6\3\4\1\14\3\4\2\uffff";
    static final String dfa_10s = "\1\47\1\4\1\uffff\1\64\1\6\3\64\1\63\3\64\2\uffff";
    static final String dfa_11s = "\2\uffff\1\1\11\uffff\1\3\1\2";
    static final String[] dfa_12s = {
            "\1\1\2\uffff\14\2",
            "\1\3",
            "",
            "\1\10\1\5\12\uffff\1\6\10\uffff\1\2\2\uffff\14\2\10\uffff\1\7\3\uffff\1\4",
            "\1\11",
            "\1\10\1\2\6\uffff\2\2\2\uffff\1\6\6\uffff\1\2\1\uffff\1\2\2\uffff\14\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\7\1\uffff\3\2",
            "\1\10\1\2\53\uffff\1\12\2\uffff\1\2",
            "\1\10\1\2\53\uffff\1\13\2\uffff\1\2",
            "\2\15\11\uffff\1\15\13\uffff\1\14\5\uffff\1\15\1\uffff\1\15\1\uffff\1\15\4\uffff\2\15",
            "\1\10\1\2\6\uffff\2\2\2\uffff\1\6\6\uffff\1\2\1\uffff\1\2\2\uffff\14\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\7\1\uffff\3\2",
            "\1\10\1\2\56\uffff\1\2",
            "\1\10\1\2\56\uffff\1\2",
            "",
            ""
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1746:5: (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty )";
        }
    }
    static final String dfa_13s = "\5\uffff\1\2\2\uffff\1\14\1\2\4\uffff";
    static final String dfa_14s = "\2\uffff\1\1\11\uffff\1\2\1\3";
    static final String[] dfa_15s = {
            "\1\1\2\uffff\14\2",
            "\1\3",
            "",
            "\1\10\1\5\12\uffff\1\6\10\uffff\1\2\2\uffff\14\2\10\uffff\1\7\3\uffff\1\4",
            "\1\11",
            "\1\10\1\2\6\uffff\2\2\2\uffff\1\6\6\uffff\1\2\1\uffff\1\2\2\uffff\14\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\7\1\uffff\3\2",
            "\1\10\1\2\53\uffff\1\12\2\uffff\1\2",
            "\1\10\1\2\53\uffff\1\13\2\uffff\1\2",
            "\2\14\11\uffff\1\14\13\uffff\1\15\5\uffff\1\14\1\uffff\1\14\1\uffff\1\14\4\uffff\2\14",
            "\1\10\1\2\6\uffff\2\2\2\uffff\1\6\6\uffff\1\2\1\uffff\1\2\2\uffff\14\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\7\1\uffff\3\2",
            "\1\10\1\2\56\uffff\1\2",
            "\1\10\1\2\56\uffff\1\2",
            "",
            ""
    };
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[][] dfa_15 = unpackEncodedStringArray(dfa_15s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_1;
            this.eof = dfa_13;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_14;
            this.special = dfa_6;
            this.transition = dfa_15;
        }
        public String getDescription() {
            return "1850:5: (lv_states_1_1= ruleDeclarativeEntityPropertyStatePhrase | lv_states_1_2= ruleDeclarativeEntityStatePhrase | lv_states_1_3= ruleDeclarativeEntityStatePhraseWithProperty )";
        }
    }
    static final String[] dfa_16s = {
            "\1\1\2\uffff\14\2",
            "\1\3",
            "",
            "\1\10\1\5\12\uffff\1\6\10\uffff\1\2\2\uffff\14\2\10\uffff\1\7\3\uffff\1\4",
            "\1\11",
            "\1\10\1\2\6\uffff\2\2\2\uffff\1\6\6\uffff\1\2\1\uffff\1\2\2\uffff\14\2\1\uffff\1\2\1\uffff\2\2\3\uffff\1\7\2\uffff\2\2",
            "\1\10\1\2\53\uffff\1\12\2\uffff\1\2",
            "\1\10\1\2\53\uffff\1\13\2\uffff\1\2",
            "\2\15\11\uffff\1\15\13\uffff\1\14\5\uffff\1\15\1\uffff\2\15\6\uffff\1\15",
            "\1\10\1\2\6\uffff\2\2\2\uffff\1\6\6\uffff\1\2\1\uffff\1\2\2\uffff\14\2\1\uffff\1\2\1\uffff\2\2\3\uffff\1\7\2\uffff\2\2",
            "\1\10\1\2\56\uffff\1\2",
            "\1\10\1\2\56\uffff\1\2",
            "",
            ""
    };
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "1929:5: (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty )";
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "2033:5: (lv_states_1_1= ruleImperativeEntityPropertyStatePhrase | lv_states_1_2= ruleImperativeEntityStatePhrase | lv_states_1_3= ruleImperativeEntityStatePhraseWithProperty )";
        }
    }
    static final String dfa_17s = "\33\uffff";
    static final String dfa_18s = "\26\uffff\1\25\1\uffff\1\25\1\uffff\1\25";
    static final String dfa_19s = "\2\4\1\uffff\1\4\1\6\20\4\1\uffff\1\5\1\6\1\31\1\uffff\1\31";
    static final String dfa_20s = "\1\31\1\4\1\uffff\1\64\1\6\1\4\1\47\1\4\14\31\1\4\1\uffff\1\64\1\6\1\63\1\uffff\1\63";
    static final String dfa_21s = "\2\uffff\1\2\22\uffff\1\1\3\uffff\1\3\1\uffff";
    static final String dfa_22s = "\33\uffff}>";
    static final String[] dfa_23s = {
            "\1\2\24\uffff\1\1",
            "\1\3",
            "",
            "\1\6\1\5\56\uffff\1\4",
            "\1\7",
            "\1\6",
            "\1\25\24\uffff\1\24\2\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23",
            "\1\6",
            "\1\25\24\uffff\1\24",
            "\1\25\24\uffff\1\24",
            "\1\25\24\uffff\1\24",
            "\1\25\24\uffff\1\24",
            "\1\25\24\uffff\1\24",
            "\1\25\24\uffff\1\24",
            "\1\25\24\uffff\1\24",
            "\1\25\24\uffff\1\24",
            "\1\25\24\uffff\1\24",
            "\1\25\24\uffff\1\24",
            "\1\25\24\uffff\1\24",
            "\1\25\24\uffff\1\24",
            "\1\26",
            "",
            "\1\30\23\uffff\1\31\2\uffff\14\31\4\uffff\2\25\4\uffff\2\25\1\27",
            "\1\32",
            "\1\31\2\uffff\14\31\4\uffff\2\25\4\uffff\2\25",
            "",
            "\1\31\2\uffff\14\31\4\uffff\2\25\4\uffff\2\25"
    };

    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_17;
            this.eof = dfa_18;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "2105:5: (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction )";
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_17;
            this.eof = dfa_18;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "2201:4: (lv_actions_0_1= ruleDeclarativeEntityAction | lv_actions_0_2= ruleVerbAction | lv_actions_0_3= ruleDeclarativeEntityPropertyAction )";
        }
    }
    static final String dfa_24s = "\25\uffff\1\30\1\uffff\1\30\2\uffff\1\30";
    static final String dfa_25s = "\2\4\1\uffff\1\4\1\6\1\4\1\31\1\4\14\31\1\4\1\5\1\6\1\31\2\uffff\1\31";
    static final String dfa_26s = "\1\31\1\4\1\uffff\1\64\1\6\1\4\1\47\1\4\14\31\1\4\1\64\1\6\1\63\2\uffff\1\63";
    static final String dfa_27s = "\2\uffff\1\2\25\uffff\1\1\1\3\1\uffff";
    static final String[] dfa_28s = {
            "\1\2\24\uffff\1\1",
            "\1\3",
            "",
            "\1\6\1\5\56\uffff\1\4",
            "\1\7",
            "\1\6",
            "\1\24\2\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23",
            "\1\6",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\25",
            "\1\27\23\uffff\1\31\2\uffff\14\31\4\uffff\1\30\6\uffff\1\30\1\26",
            "\1\32",
            "\1\31\2\uffff\14\31\4\uffff\1\30\6\uffff\1\30",
            "",
            "",
            "\1\31\2\uffff\14\31\4\uffff\1\30\6\uffff\1\30"
    };
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final char[] dfa_26 = DFA.unpackEncodedStringToUnsignedChars(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_17;
            this.eof = dfa_24;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_27;
            this.special = dfa_22;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "2272:5: (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction )";
        }
    }
    static final String dfa_29s = "\25\uffff\1\31\1\uffff\1\31\2\uffff\1\31";
    static final String dfa_30s = "\2\uffff\1\2\25\uffff\1\3\1\1\1\uffff";
    static final String[] dfa_31s = {
            "\1\2\24\uffff\1\1",
            "\1\3",
            "",
            "\1\6\1\5\56\uffff\1\4",
            "\1\7",
            "\1\6",
            "\1\24\2\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23",
            "\1\6",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\24",
            "\1\25",
            "\1\27\23\uffff\1\30\2\uffff\14\30\4\uffff\1\31\6\uffff\1\31\1\26",
            "\1\32",
            "\1\30\2\uffff\14\30\4\uffff\1\31\6\uffff\1\31",
            "",
            "",
            "\1\30\2\uffff\14\30\4\uffff\1\31\6\uffff\1\31"
    };
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_17;
            this.eof = dfa_29;
            this.min = dfa_25;
            this.max = dfa_26;
            this.accept = dfa_30;
            this.special = dfa_22;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "2368:4: (lv_actions_0_1= ruleImperativeEntityAction | lv_actions_0_2= ruleImperativeVerbAction | lv_actions_0_3= ruleImperativeEntityPropertyAction )";
        }
    }
    static final String dfa_32s = "\u017f\uffff";
    static final String dfa_33s = "\1\3\1\uffff\1\5\1\uffff\1\5\1\12\1\13\4\uffff\1\16\6\uffff\2\3\16\uffff\1\3\12\uffff\1\75\15\uffff\2\75\1\124\25\uffff\1\75\u0081\uffff\1\3\2\uffff\1\3\61\uffff\1\3\1\uffff\1\3\5\uffff\1\3\13\uffff\1\3\17\uffff\1\3\47\uffff\1\3\7\uffff\1\3\2\uffff\1\3\2\uffff\1\3\4\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\1\3\2\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\2\3";
    static final String dfa_34s = "\1\4\1\6\1\4\1\uffff\1\4\1\0\1\14\1\4\1\56\2\uffff\1\0\1\4\1\52\1\uffff\1\4\1\31\1\6\2\4\1\31\1\4\14\31\5\4\1\6\3\4\1\43\2\5\1\4\1\6\1\53\1\31\3\4\1\31\1\6\3\5\1\6\2\14\1\0\1\53\1\31\1\4\14\31\1\4\1\31\1\4\3\5\1\14\1\uffff\3\4\14\31\2\4\1\31\1\5\1\6\3\4\1\43\1\5\1\6\1\4\15\31\1\5\1\4\2\31\1\4\14\31\1\6\1\53\1\4\1\6\1\53\2\4\1\31\1\6\3\5\1\4\14\31\2\4\1\6\1\31\1\4\14\31\3\4\2\53\1\4\5\5\1\31\1\6\1\4\15\31\1\5\1\6\3\4\1\14\2\5\1\6\15\31\1\4\1\6\15\31\2\4\14\31\2\4\1\6\1\31\1\4\1\6\1\14\1\31\2\4\1\31\1\6\3\5\1\6\1\53\1\31\1\5\1\31\3\5\1\31\1\14\1\31\1\4\14\31\1\4\3\5\1\53\1\6\1\54\1\6\1\54\1\6\15\31\1\4\1\6\15\31\3\4\1\5\2\54\1\31\1\5\1\31\1\5\1\6\3\4\1\14\1\5\1\6\1\14\1\6\1\54\1\6\1\54\1\4\1\6\1\14\2\4\1\31\1\6\3\5\1\14\2\54\1\14\1\4\4\5\1\6\2\14";
    static final String dfa_35s = "\1\64\1\6\1\64\1\uffff\1\64\1\0\1\63\1\57\1\56\2\uffff\1\0\1\4\1\52\1\uffff\1\64\1\57\1\6\1\64\1\63\1\47\1\4\14\31\1\64\1\31\1\64\2\4\1\6\3\64\1\63\3\64\1\6\1\63\1\57\1\31\2\64\1\31\1\6\3\64\1\6\2\63\1\0\1\63\1\47\1\4\14\31\1\4\1\63\1\4\3\64\1\63\1\uffff\1\64\1\4\1\64\14\63\1\4\1\31\1\57\1\64\1\6\3\64\1\63\1\64\1\6\1\4\1\47\14\31\1\64\1\4\1\63\1\47\1\4\14\31\1\6\1\63\1\64\1\6\1\63\2\64\1\31\1\6\3\64\1\4\14\31\2\4\1\6\1\63\1\64\14\63\1\4\1\64\1\4\2\63\1\4\5\64\1\63\1\6\1\4\1\47\14\31\1\64\1\6\3\64\1\63\2\64\1\6\1\63\14\31\1\4\1\6\1\63\14\31\2\4\14\31\2\4\1\6\1\63\1\64\1\6\1\63\1\57\2\64\1\31\1\6\3\64\1\6\2\63\1\64\1\63\3\64\2\63\1\47\1\4\14\31\1\4\3\64\1\63\1\6\1\63\1\6\1\63\1\6\1\63\14\31\1\4\1\6\1\63\14\31\1\4\1\64\1\4\1\64\3\63\1\64\1\63\1\64\1\6\3\64\1\63\1\64\1\6\1\63\1\6\1\63\1\6\1\63\1\64\1\6\1\63\2\64\1\31\1\6\3\64\4\63\1\4\4\64\1\6\2\63";
    static final String dfa_36s = "\3\uffff\1\2\5\uffff\2\1\3\uffff\1\1\105\uffff\1\1\u012a\uffff";
    static final String dfa_37s = "\u017f\uffff}>";
    static final String[] dfa_38s = {
            "\1\3\1\2\12\uffff\1\3\10\uffff\1\3\2\uffff\14\3\4\uffff\2\3\2\uffff\1\3\1\uffff\2\3\1\1",
            "\1\4",
            "\2\11\6\uffff\2\3\2\uffff\1\11\6\uffff\1\3\1\uffff\1\11\2\uffff\14\11\1\uffff\1\3\1\uffff\1\3\1\11\1\10\2\uffff\1\11\1\uffff\1\6\1\7\1\11",
            "",
            "\2\11\6\uffff\2\3\2\uffff\1\11\6\uffff\1\3\1\uffff\1\11\2\uffff\14\11\1\uffff\1\3\1\uffff\1\3\1\11\1\10\2\uffff\1\11\1\uffff\1\6\1\7\1\11",
            "\1\uffff",
            "\2\3\11\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\1\10\5\uffff\1\7",
            "\1\11\24\uffff\1\14\2\uffff\14\3\7\uffff\1\3",
            "\1\15",
            "",
            "",
            "\1\uffff",
            "\1\17",
            "\1\20",
            "",
            "\1\23\1\22\12\uffff\1\3\10\uffff\1\3\2\uffff\14\3\10\uffff\1\3\3\uffff\1\21",
            "\1\25\2\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\7\uffff\1\24",
            "\1\42",
            "\1\23\1\3\6\uffff\2\3\2\uffff\1\3\6\uffff\1\3\1\uffff\1\3\2\uffff\14\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\3\3",
            "\1\16\7\uffff\2\3\11\uffff\1\3\1\uffff\1\16\2\uffff\7\16\1\43\4\16\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\4\uffff\2\3",
            "\1\25\2\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41",
            "\1\44",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\23\1\3\6\uffff\2\3\2\uffff\1\3\6\uffff\1\3\1\uffff\1\3\2\uffff\14\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\3\1\uffff\3\3",
            "\1\16\24\uffff\1\46",
            "\1\53\1\50\12\uffff\1\51\10\uffff\1\45\2\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\10\uffff\1\52\3\uffff\1\47",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\53\1\60\12\uffff\1\51\10\uffff\1\45\2\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\3\uffff\1\62\4\uffff\1\52\2\uffff\1\61\1\57",
            "\1\53\1\60\53\uffff\1\63\2\uffff\1\57",
            "\1\53\1\60\53\uffff\1\64\2\uffff\1\57",
            "\1\65\7\uffff\1\62\7\uffff\1\61",
            "\1\67\12\uffff\1\70\37\uffff\1\71\3\uffff\1\66",
            "\1\73\6\uffff\2\3\11\uffff\1\3\1\uffff\1\16\2\uffff\14\16\1\uffff\1\3\1\uffff\1\3\1\11\1\10\4\uffff\1\74\1\7\1\72",
            "\1\53\1\60\12\uffff\1\51\10\uffff\1\45\2\uffff\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\3\uffff\1\62\4\uffff\1\52\2\uffff\1\61\1\57",
            "\1\76",
            "\1\62\7\uffff\1\61",
            "\1\100\2\uffff\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\7\uffff\1\77",
            "\1\116\24\uffff\1\115",
            "\1\53\1\60\56\uffff\1\57",
            "\1\53\1\60\56\uffff\1\57",
            "\1\117",
            "\1\120",
            "\1\60\12\uffff\1\70\32\uffff\1\62\4\uffff\1\71\2\uffff\1\61\1\57",
            "\1\60\53\uffff\1\121\2\uffff\1\57",
            "\1\60\53\uffff\1\122\2\uffff\1\57",
            "\1\123",
            "\2\3\11\uffff\1\3\1\uffff\1\16\2\uffff\14\16\1\uffff\1\3\1\uffff\1\3\1\11\1\10\4\uffff\1\74\1\7",
            "\2\3\11\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\1\10\5\uffff\1\7",
            "\1\uffff",
            "\1\62\7\uffff\1\61",
            "\1\100\2\uffff\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114",
            "\1\125",
            "\1\126",
            "\1\126",
            "\1\126",
            "\1\126",
            "\1\126",
            "\1\126",
            "\1\126",
            "\1\126",
            "\1\126",
            "\1\126",
            "\1\126",
            "\1\126",
            "\1\127",
            "\1\144\2\uffff\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140\1\141\1\142\1\143\4\uffff\1\146\6\uffff\1\145",
            "\1\147",
            "\1\60\12\uffff\1\70\32\uffff\1\62\4\uffff\1\71\2\uffff\1\61\1\57",
            "\1\60\56\uffff\1\57",
            "\1\60\56\uffff\1\57",
            "\2\3\11\uffff\1\3\1\uffff\1\16\2\uffff\14\16\1\uffff\1\3\1\uffff\1\3\1\11\1\10\4\uffff\1\74\1\7",
            "",
            "\1\154\1\151\12\uffff\1\152\10\uffff\1\126\2\uffff\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\10\uffff\1\153\3\uffff\1\150",
            "\1\155",
            "\1\160\1\157\56\uffff\1\156",
            "\1\144\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145",
            "\1\144\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145",
            "\1\144\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145",
            "\1\144\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145",
            "\1\144\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145",
            "\1\144\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145",
            "\1\144\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145",
            "\1\144\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145",
            "\1\144\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145",
            "\1\144\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145",
            "\1\144\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145",
            "\1\144\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145",
            "\1\175",
            "\1\177\24\uffff\1\176",
            "\1\u0081\2\uffff\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\7\uffff\1\u0080",
            "\1\u008f\45\uffff\1\62\7\uffff\1\61\1\u008e",
            "\1\u0090",
            "\1\154\1\u0092\12\uffff\1\152\10\uffff\1\126\2\uffff\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\3\uffff\1\62\4\uffff\1\153\2\uffff\1\61\1\u0091",
            "\1\154\1\u0092\53\uffff\1\u0093\2\uffff\1\u0091",
            "\1\154\1\u0092\53\uffff\1\u0094\2\uffff\1\u0091",
            "\1\u0095\7\uffff\1\62\7\uffff\1\61",
            "\1\u0097\12\uffff\1\u0098\37\uffff\1\u0099\3\uffff\1\u0096",
            "\1\u009a",
            "\1\160",
            "\1\u00a7\2\uffff\1\u009b\1\u009c\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5\1\u00a6",
            "\1\u00a8",
            "\1\u00a8",
            "\1\u00a8",
            "\1\u00a8",
            "\1\u00a8",
            "\1\u00a8",
            "\1\u00a8",
            "\1\u00a8",
            "\1\u00a8",
            "\1\u00a8",
            "\1\u00a8",
            "\1\u00a8",
            "\1\u00aa\23\uffff\1\u00a8\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145\1\u00a9",
            "\1\u00ab",
            "\1\u00b8\2\uffff\1\u00ac\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4\1\u00b5\1\u00b6\1\u00b7\4\uffff\1\146\6\uffff\1\145",
            "\1\u0081\2\uffff\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00ba",
            "\1\u00bb",
            "\1\62\7\uffff\1\61",
            "\1\154\1\u0092\12\uffff\1\152\10\uffff\1\126\2\uffff\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\3\uffff\1\62\4\uffff\1\153\2\uffff\1\61\1\u0091",
            "\1\u00bc",
            "\1\62\7\uffff\1\61",
            "\1\154\1\u0092\56\uffff\1\u0091",
            "\1\154\1\u0092\56\uffff\1\u0091",
            "\1\u00bd",
            "\1\u00be",
            "\1\u0092\12\uffff\1\u0098\32\uffff\1\62\4\uffff\1\u0099\2\uffff\1\61\1\u0091",
            "\1\u0092\53\uffff\1\u00bf\2\uffff\1\u0091",
            "\1\u0092\53\uffff\1\u00c0\2\uffff\1\u0091",
            "\1\160",
            "\1\u00a7",
            "\1\u00a7",
            "\1\u00a7",
            "\1\u00a7",
            "\1\u00a7",
            "\1\u00a7",
            "\1\u00a7",
            "\1\u00a7",
            "\1\u00a7",
            "\1\u00a7",
            "\1\u00a7",
            "\1\u00a7",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00a8\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145",
            "\1\u00c6\1\u00c5\56\uffff\1\u00c4",
            "\1\u00b8\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145",
            "\1\u00b8\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145",
            "\1\u00b8\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145",
            "\1\u00b8\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145",
            "\1\u00b8\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145",
            "\1\u00b8\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145",
            "\1\u00b8\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145",
            "\1\u00b8\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145",
            "\1\u00b8\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145",
            "\1\u00b8\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145",
            "\1\u00b8\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145",
            "\1\u00b8\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145",
            "\1\u00d3",
            "\1\u00d8\1\u00d5\12\uffff\1\u00d6\10\uffff\1\u00ba\2\uffff\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\10\uffff\1\u00d7\3\uffff\1\u00d4",
            "\1\u00d9",
            "\1\62\7\uffff\1\61",
            "\1\62\7\uffff\1\61",
            "\1\u00da",
            "\1\u0092\12\uffff\1\u0098\32\uffff\1\62\4\uffff\1\u0099\2\uffff\1\61\1\u0091",
            "\1\u0092\56\uffff\1\u0091",
            "\1\u0092\56\uffff\1\u0091",
            "\1\u00dc\23\uffff\1\u00e9\2\uffff\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\4\uffff\1\146\6\uffff\1\145\1\u00db",
            "\1\u00eb\23\uffff\1\u00f8\2\uffff\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\4\uffff\1\146\6\uffff\1\145\1\u00ea",
            "\1\u00a8\2\uffff\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\4\uffff\1\146\6\uffff\1\145",
            "\1\u00f9",
            "\1\u00c6",
            "\1\u0106\2\uffff\1\u00fa\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101\1\u0102\1\u0103\1\u0104\1\u0105",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0107",
            "\1\u0109\23\uffff\1\u0107\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145\1\u0108",
            "\1\u010a",
            "\1\u00d8\1\u010c\6\uffff\2\3\2\uffff\1\u00d6\6\uffff\1\3\1\uffff\1\u00ba\2\uffff\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\uffff\1\3\1\uffff\1\3\1\11\3\uffff\1\u00d7\2\uffff\1\u010d\1\u010b",
            "\1\u00d8\1\u010c\53\uffff\1\u010e\2\uffff\1\u010b",
            "\1\u00d8\1\u010c\53\uffff\1\u010f\2\uffff\1\u010b",
            "\2\3\11\uffff\1\3\13\uffff\1\u0110\5\uffff\1\3\1\uffff\1\3\1\11\6\uffff\1\u010d",
            "\1\u0112\12\uffff\1\u0113\37\uffff\1\u0114\3\uffff\1\u0111",
            "\1\u0116\45\uffff\1\62\7\uffff\1\61\1\u0115",
            "\1\u0117",
            "\1\u00e9\2\uffff\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\4\uffff\1\146\6\uffff\1\145",
            "\1\u00e9",
            "\1\u00e9",
            "\1\u00e9",
            "\1\u00e9",
            "\1\u00e9",
            "\1\u00e9",
            "\1\u00e9",
            "\1\u00e9",
            "\1\u00e9",
            "\1\u00e9",
            "\1\u00e9",
            "\1\u00e9",
            "\1\u0118",
            "\1\u0119",
            "\1\u00f8\2\uffff\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\4\uffff\1\146\6\uffff\1\145",
            "\1\u00f8",
            "\1\u00f8",
            "\1\u00f8",
            "\1\u00f8",
            "\1\u00f8",
            "\1\u00f8",
            "\1\u00f8",
            "\1\u00f8",
            "\1\u00f8",
            "\1\u00f8",
            "\1\u00f8",
            "\1\u00f8",
            "\1\u011a",
            "\1\u00c6",
            "\1\u0106",
            "\1\u0106",
            "\1\u0106",
            "\1\u0106",
            "\1\u0106",
            "\1\u0106",
            "\1\u0106",
            "\1\u0106",
            "\1\u0106",
            "\1\u0106",
            "\1\u0106",
            "\1\u0106",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u0107\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145",
            "\1\u00d8\1\u010c\6\uffff\2\3\2\uffff\1\u00d6\6\uffff\1\3\1\uffff\1\u00ba\2\uffff\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\uffff\1\3\1\uffff\1\3\1\11\3\uffff\1\u00d7\2\uffff\1\u010d\1\u010b",
            "\1\u011e",
            "\2\3\11\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\6\uffff\1\u010d",
            "\1\u0120\2\uffff\1\u0121\1\u0122\1\u0123\1\u0124\1\u0125\1\u0126\1\u0127\1\u0128\1\u0129\1\u012a\1\u012b\1\u012c\7\uffff\1\u011f",
            "\1\u00d8\1\u010c\56\uffff\1\u010b",
            "\1\u00d8\1\u010c\56\uffff\1\u010b",
            "\1\u012d",
            "\1\u012e",
            "\1\u010c\6\uffff\2\3\2\uffff\1\u0113\6\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\3\uffff\1\u0114\2\uffff\1\u010d\1\u010b",
            "\1\u010c\53\uffff\1\u012f\2\uffff\1\u010b",
            "\1\u010c\53\uffff\1\u0130\2\uffff\1\u010b",
            "\1\u0131",
            "\1\62\7\uffff\1\61",
            "\1\u00e9\2\uffff\1\u00dd\1\u00de\1\u00df\1\u00e0\1\u00e1\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\4\uffff\1\146\6\uffff\1\145",
            "\1\u0133\46\uffff\1\146\6\uffff\1\145\1\u0132",
            "\1\u00f8\2\uffff\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\4\uffff\1\146\6\uffff\1\145",
            "\1\u0135\46\uffff\1\146\6\uffff\1\145\1\u0134",
            "\1\u0137\23\uffff\1\u0144\2\uffff\1\u0138\1\u0139\1\u013a\1\u013b\1\u013c\1\u013d\1\u013e\1\u013f\1\u0140\1\u0141\1\u0142\1\u0143\4\uffff\1\146\6\uffff\1\145\1\u0136",
            "\1\u0146\23\uffff\1\u0153\2\uffff\1\u0147\1\u0148\1\u0149\1\u014a\1\u014b\1\u014c\1\u014d\1\u014e\1\u014f\1\u0150\1\u0151\1\u0152\4\uffff\1\146\6\uffff\1\145\1\u0145",
            "\1\u0107\2\uffff\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\4\uffff\1\146\6\uffff\1\145",
            "\2\3\11\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\6\uffff\1\u010d",
            "\1\u0120\2\uffff\1\u0121\1\u0122\1\u0123\1\u0124\1\u0125\1\u0126\1\u0127\1\u0128\1\u0129\1\u012a\1\u012b\1\u012c",
            "\1\u0154",
            "\1\u0155",
            "\1\u0155",
            "\1\u0155",
            "\1\u0155",
            "\1\u0155",
            "\1\u0155",
            "\1\u0155",
            "\1\u0155",
            "\1\u0155",
            "\1\u0155",
            "\1\u0155",
            "\1\u0155",
            "\1\u0156",
            "\1\u010c\6\uffff\2\3\2\uffff\1\u0113\6\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\3\uffff\1\u0114\2\uffff\1\u010d\1\u010b",
            "\1\u010c\56\uffff\1\u010b",
            "\1\u010c\56\uffff\1\u010b",
            "\1\62\7\uffff\1\61",
            "\1\u0157",
            "\1\146\6\uffff\1\145",
            "\1\u0158",
            "\1\146\6\uffff\1\145",
            "\1\u0159",
            "\1\u0144\2\uffff\1\u0138\1\u0139\1\u013a\1\u013b\1\u013c\1\u013d\1\u013e\1\u013f\1\u0140\1\u0141\1\u0142\1\u0143\4\uffff\1\146\6\uffff\1\145",
            "\1\u0144",
            "\1\u0144",
            "\1\u0144",
            "\1\u0144",
            "\1\u0144",
            "\1\u0144",
            "\1\u0144",
            "\1\u0144",
            "\1\u0144",
            "\1\u0144",
            "\1\u0144",
            "\1\u0144",
            "\1\u015a",
            "\1\u015b",
            "\1\u0153\2\uffff\1\u0147\1\u0148\1\u0149\1\u014a\1\u014b\1\u014c\1\u014d\1\u014e\1\u014f\1\u0150\1\u0151\1\u0152\4\uffff\1\146\6\uffff\1\145",
            "\1\u0153",
            "\1\u0153",
            "\1\u0153",
            "\1\u0153",
            "\1\u0153",
            "\1\u0153",
            "\1\u0153",
            "\1\u0153",
            "\1\u0153",
            "\1\u0153",
            "\1\u0153",
            "\1\u0153",
            "\1\u015c",
            "\1\u0161\1\u015e\12\uffff\1\u015f\10\uffff\1\u0155\2\uffff\1\u0121\1\u0122\1\u0123\1\u0124\1\u0125\1\u0126\1\u0127\1\u0128\1\u0129\1\u012a\1\u012b\1\u012c\10\uffff\1\u0160\3\uffff\1\u015d",
            "\1\u0162",
            "\1\u0164\6\uffff\2\3\11\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\6\uffff\1\u010d\1\u0163",
            "\1\146\6\uffff\1\145",
            "\1\146\6\uffff\1\145",
            "\1\u0144\2\uffff\1\u0138\1\u0139\1\u013a\1\u013b\1\u013c\1\u013d\1\u013e\1\u013f\1\u0140\1\u0141\1\u0142\1\u0143\4\uffff\1\146\6\uffff\1\145",
            "\1\u0166\46\uffff\1\146\6\uffff\1\145\1\u0165",
            "\1\u0153\2\uffff\1\u0147\1\u0148\1\u0149\1\u014a\1\u014b\1\u014c\1\u014d\1\u014e\1\u014f\1\u0150\1\u0151\1\u0152\4\uffff\1\146\6\uffff\1\145",
            "\1\u0168\46\uffff\1\146\6\uffff\1\145\1\u0167",
            "\1\u0169",
            "\1\u0161\1\u016b\6\uffff\2\3\2\uffff\1\u015f\6\uffff\1\3\1\uffff\1\u0155\2\uffff\1\u0121\1\u0122\1\u0123\1\u0124\1\u0125\1\u0126\1\u0127\1\u0128\1\u0129\1\u012a\1\u012b\1\u012c\1\uffff\1\3\1\uffff\1\3\1\11\3\uffff\1\u0160\2\uffff\1\u010d\1\u016a",
            "\1\u0161\1\u016b\53\uffff\1\u016c\2\uffff\1\u016a",
            "\1\u0161\1\u016b\53\uffff\1\u016d\2\uffff\1\u016a",
            "\2\3\11\uffff\1\3\13\uffff\1\u016e\5\uffff\1\3\1\uffff\1\3\1\11\6\uffff\1\u010d",
            "\1\u0170\12\uffff\1\u0171\37\uffff\1\u0172\3\uffff\1\u016f",
            "\1\u0173",
            "\2\3\11\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\6\uffff\1\u010d",
            "\1\u0174",
            "\1\146\6\uffff\1\145",
            "\1\u0175",
            "\1\146\6\uffff\1\145",
            "\1\u0161\1\u016b\6\uffff\2\3\2\uffff\1\u015f\6\uffff\1\3\1\uffff\1\u0155\2\uffff\1\u0121\1\u0122\1\u0123\1\u0124\1\u0125\1\u0126\1\u0127\1\u0128\1\u0129\1\u012a\1\u012b\1\u012c\1\uffff\1\3\1\uffff\1\3\1\11\3\uffff\1\u0160\2\uffff\1\u010d\1\u016a",
            "\1\u0176",
            "\2\3\11\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\6\uffff\1\u010d",
            "\1\u0161\1\u016b\56\uffff\1\u016a",
            "\1\u0161\1\u016b\56\uffff\1\u016a",
            "\1\u0177",
            "\1\u0178",
            "\1\u016b\6\uffff\2\3\2\uffff\1\u0171\6\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\3\uffff\1\u0172\2\uffff\1\u010d\1\u016a",
            "\1\u016b\53\uffff\1\u0179\2\uffff\1\u016a",
            "\1\u016b\53\uffff\1\u017a\2\uffff\1\u016a",
            "\2\3\11\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\6\uffff\1\u010d",
            "\1\146\6\uffff\1\145",
            "\1\146\6\uffff\1\145",
            "\2\3\11\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\6\uffff\1\u010d",
            "\1\u017b",
            "\1\u016b\6\uffff\2\3\2\uffff\1\u0171\6\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\3\uffff\1\u0172\2\uffff\1\u010d\1\u016a",
            "\1\u016b\56\uffff\1\u016a",
            "\1\u016b\56\uffff\1\u016a",
            "\1\u017d\6\uffff\2\3\11\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\6\uffff\1\u010d\1\u017c",
            "\1\u017e",
            "\2\3\11\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\6\uffff\1\u010d",
            "\2\3\11\uffff\1\3\21\uffff\1\3\1\uffff\1\3\1\11\6\uffff\1\u010d"
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_32;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "2495:3: ( (lv_entityValue_2_0= ruleENTITY_IDENTITY ) )?";
        }
    }
    static final String dfa_39s = "\73\uffff";
    static final String dfa_40s = "\1\3\1\uffff\1\5\1\uffff\1\5\1\11\27\uffff\2\3\6\uffff\1\3\17\uffff\1\70\1\uffff\1\70\1\72\1\70\1\uffff";
    static final String dfa_41s = "\1\4\1\6\1\4\1\uffff\1\4\1\0\1\uffff\1\4\1\31\1\uffff\1\4\1\31\1\4\14\31\3\4\1\6\1\4\1\14\1\6\1\uffff\2\4\1\uffff\1\5\1\4\1\31\1\uffff\1\4\1\6\1\uffff\1\4\1\6\1\uffff\2\5\1\4\2\uffff\3\5\1\6\1\14\1\0\1\14\1\uffff";
    static final String dfa_42s = "\1\64\1\6\1\64\1\uffff\1\64\1\0\1\uffff\2\57\1\uffff\1\4\1\47\1\4\14\31\2\64\1\4\1\6\1\64\1\63\1\6\1\uffff\2\64\1\uffff\2\64\1\31\1\uffff\1\64\1\6\1\uffff\1\64\1\6\1\uffff\2\64\1\4\2\uffff\3\64\1\6\1\63\1\0\1\63\1\uffff";
    static final String dfa_43s = "\3\uffff\1\2\2\uffff\1\1\2\uffff\1\1\26\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\2\uffff\1\1\3\uffff\2\1\7\uffff\1\1";
    static final String dfa_44s = "\73\uffff}>";
    static final String[] dfa_45s = {
            "\1\3\1\2\12\uffff\1\3\10\uffff\1\3\2\uffff\14\3\4\uffff\1\3\3\uffff\1\3\2\uffff\1\3\1\1",
            "\1\4",
            "\2\6\6\uffff\2\3\2\uffff\1\6\6\uffff\1\3\1\uffff\1\6\2\uffff\14\6\1\uffff\1\3\1\uffff\1\3\1\10\3\uffff\1\6\2\uffff\1\7\1\6",
            "",
            "\2\6\6\uffff\2\3\2\uffff\1\6\6\uffff\1\3\1\uffff\1\6\2\uffff\14\6\1\uffff\1\3\1\uffff\1\3\1\10\3\uffff\1\6\2\uffff\1\7\1\6",
            "\1\uffff",
            "",
            "\1\6\24\uffff\1\12\2\uffff\14\3\7\uffff\1\3",
            "\1\14\2\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\7\uffff\1\13",
            "",
            "\1\31",
            "\1\14\2\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30",
            "\1\32",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\36\1\35\12\uffff\1\3\10\uffff\1\3\2\uffff\14\3\10\uffff\1\3\3\uffff\1\34",
            "\1\43\1\40\12\uffff\1\41\10\uffff\1\33\2\uffff\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\10\uffff\1\42\3\uffff\1\37",
            "\1\44",
            "\1\45",
            "\1\36\1\3\6\uffff\2\3\2\uffff\1\3\6\uffff\1\3\1\uffff\1\3\2\uffff\14\3\1\uffff\1\3\1\uffff\2\3\3\uffff\1\3\2\uffff\2\3",
            "\2\3\11\uffff\1\3\1\uffff\1\43\2\uffff\7\43\1\46\4\43\1\uffff\1\3\1\uffff\2\3\6\uffff\1\3",
            "\1\47",
            "",
            "\1\43\1\52\53\uffff\1\50\2\uffff\1\51",
            "\1\43\1\52\53\uffff\1\53\2\uffff\1\51",
            "",
            "\1\55\12\uffff\1\56\37\uffff\1\57\3\uffff\1\54",
            "\1\36\1\3\6\uffff\2\3\2\uffff\1\3\6\uffff\1\3\1\uffff\1\3\2\uffff\14\3\1\uffff\1\3\1\uffff\2\3\3\uffff\1\3\2\uffff\2\3",
            "\1\60",
            "",
            "\1\43\1\52\56\uffff\1\51",
            "\1\61",
            "",
            "\1\43\1\52\56\uffff\1\51",
            "\1\62",
            "",
            "\1\52\53\uffff\1\63\2\uffff\1\51",
            "\1\52\53\uffff\1\64\2\uffff\1\51",
            "\1\65",
            "",
            "",
            "\1\52\56\uffff\1\51",
            "\1\52\56\uffff\1\51",
            "\1\67\6\uffff\2\3\11\uffff\1\3\1\uffff\1\62\2\uffff\14\62\1\uffff\1\3\1\uffff\1\3\1\10\6\uffff\1\7\1\66",
            "\1\71",
            "\2\3\11\uffff\1\3\1\uffff\1\62\2\uffff\14\62\1\uffff\1\3\1\uffff\1\3\1\10\6\uffff\1\7",
            "\1\uffff",
            "\2\3\11\uffff\1\3\1\uffff\1\62\2\uffff\14\62\1\uffff\1\3\1\uffff\1\3\1\10\6\uffff\1\7",
            ""
    };

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[][] dfa_45 = unpackEncodedStringArray(dfa_45s);

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_39;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "2550:3: ( (lv_entityValue_2_0= ruleENTITY_IDENTITY ) )?";
        }
    }
    static final String dfa_46s = "\20\uffff";
    static final String dfa_47s = "\1\16\17\uffff";
    static final String dfa_48s = "\15\31\1\4\2\uffff";
    static final String dfa_49s = "\1\63\14\31\1\4\2\uffff";
    static final String dfa_50s = "\16\uffff\1\2\1\1";
    static final String dfa_51s = "\20\uffff}>";
    static final String[] dfa_52s = {
            "\1\15\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\4\uffff\2\16\4\uffff\2\16",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\17",
            "",
            ""
    };

    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[][] dfa_52 = unpackEncodedStringArray(dfa_52s);

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_46;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "3440:3: ( ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleDeclarativeEntityRef ) ) )?";
        }
    }
    static final String[] dfa_53s = {
            "\1\15\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\4\uffff\1\16\6\uffff\1\16",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\15",
            "\1\17",
            "",
            ""
    };
    static final short[][] dfa_53 = unpackEncodedStringArray(dfa_53s);

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = dfa_46;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_53;
        }
        public String getDescription() {
            return "3881:3: ( ( (lv_preposition2_3_0= rulePREP ) ) ( (lv_entity2_4_0= ruleImperativeEntityRef ) ) )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000020000803002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000720000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000620000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000007000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000FFF8000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002001000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000080FFF2000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000280000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000FFF2000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0010000000000022L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000010010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000FFF2000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0011000000010020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0010000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000400FFF2000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000400FFF2000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000FFF2000002L});

}