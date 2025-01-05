/*
 * generated by Xtext 2.36.0
 */
package dk.sdu.bdd.xtext.serializer;

import com.google.inject.Inject;
import dk.sdu.bdd.xtext.bddDsl.ActionDef;
import dk.sdu.bdd.xtext.bddDsl.ActionRef;
import dk.sdu.bdd.xtext.bddDsl.BddDslPackage;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityAction;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityDef;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityOrPropertyRef;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityPropertyAction;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityPropertyStatePhrase;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityRef;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityStatePhrase;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityStatePhraseWithProperty;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeScenarioAction;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeScenarioActionAnd;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeScenarioState;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeScenarioStateAnd;
import dk.sdu.bdd.xtext.bddDsl.ImperativeActionDef;
import dk.sdu.bdd.xtext.bddDsl.ImperativeActionRef;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityAction;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityDef;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyAction;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyStatePhrase;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityRef;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityStatePhrase;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityStatePhraseWithProperty;
import dk.sdu.bdd.xtext.bddDsl.ImperativePropertyDef;
import dk.sdu.bdd.xtext.bddDsl.ImperativePropertyRef;
import dk.sdu.bdd.xtext.bddDsl.ImperativeScenario;
import dk.sdu.bdd.xtext.bddDsl.ImperativeScenarioAction;
import dk.sdu.bdd.xtext.bddDsl.ImperativeScenarioActionAnd;
import dk.sdu.bdd.xtext.bddDsl.ImperativeScenarioState;
import dk.sdu.bdd.xtext.bddDsl.ImperativeScenarioStateAnd;
import dk.sdu.bdd.xtext.bddDsl.ImperativeStateDef;
import dk.sdu.bdd.xtext.bddDsl.ImperativeStateName;
import dk.sdu.bdd.xtext.bddDsl.ImperativeVerbAction;
import dk.sdu.bdd.xtext.bddDsl.Model;
import dk.sdu.bdd.xtext.bddDsl.ModelRef;
import dk.sdu.bdd.xtext.bddDsl.PropertyDef;
import dk.sdu.bdd.xtext.bddDsl.PropertyRef;
import dk.sdu.bdd.xtext.bddDsl.Scenario;
import dk.sdu.bdd.xtext.bddDsl.StateDef;
import dk.sdu.bdd.xtext.bddDsl.StateName;
import dk.sdu.bdd.xtext.bddDsl.VerbAction;
import dk.sdu.bdd.xtext.services.BddDslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class BddDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BddDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BddDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BddDslPackage.ACTION_DEF:
				sequence_ActionDef(context, (ActionDef) semanticObject); 
				return; 
			case BddDslPackage.ACTION_REF:
				sequence_ActionRef(context, (ActionRef) semanticObject); 
				return; 
			case BddDslPackage.DECLARATIVE_ENTITY_ACTION:
				sequence_DeclarativeEntityAction(context, (DeclarativeEntityAction) semanticObject); 
				return; 
			case BddDslPackage.DECLARATIVE_ENTITY_DEF:
				sequence_DeclarativeEntityDef(context, (DeclarativeEntityDef) semanticObject); 
				return; 
			case BddDslPackage.DECLARATIVE_ENTITY_OR_PROPERTY_REF:
				sequence_DeclarativeEntityOrPropertyRef(context, (DeclarativeEntityOrPropertyRef) semanticObject); 
				return; 
			case BddDslPackage.DECLARATIVE_ENTITY_PROPERTY_ACTION:
				sequence_DeclarativeEntityPropertyAction(context, (DeclarativeEntityPropertyAction) semanticObject); 
				return; 
			case BddDslPackage.DECLARATIVE_ENTITY_PROPERTY_STATE_PHRASE:
				sequence_DeclarativeEntityPropertyStatePhrase(context, (DeclarativeEntityPropertyStatePhrase) semanticObject); 
				return; 
			case BddDslPackage.DECLARATIVE_ENTITY_REF:
				sequence_DeclarativeEntityRef(context, (DeclarativeEntityRef) semanticObject); 
				return; 
			case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE:
				sequence_DeclarativeEntityStatePhrase(context, (DeclarativeEntityStatePhrase) semanticObject); 
				return; 
			case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY:
				sequence_DeclarativeEntityStatePhraseWithProperty(context, (DeclarativeEntityStatePhraseWithProperty) semanticObject); 
				return; 
			case BddDslPackage.DECLARATIVE_SCENARIO_ACTION:
				sequence_DeclarativeScenarioAction(context, (DeclarativeScenarioAction) semanticObject); 
				return; 
			case BddDslPackage.DECLARATIVE_SCENARIO_ACTION_AND:
				sequence_DeclarativeScenarioActionAnd(context, (DeclarativeScenarioActionAnd) semanticObject); 
				return; 
			case BddDslPackage.DECLARATIVE_SCENARIO_STATE:
				sequence_DeclarativeScenarioState(context, (DeclarativeScenarioState) semanticObject); 
				return; 
			case BddDslPackage.DECLARATIVE_SCENARIO_STATE_AND:
				sequence_DeclarativeScenarioStateAnd(context, (DeclarativeScenarioStateAnd) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_ACTION_DEF:
				sequence_ImperativeActionDef(context, (ImperativeActionDef) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_ACTION_REF:
				sequence_ImperativeActionRef(context, (ImperativeActionRef) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_ENTITY_ACTION:
				sequence_ImperativeEntityAction(context, (ImperativeEntityAction) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_ENTITY_DEF:
				sequence_ImperativeEntityDef(context, (ImperativeEntityDef) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_ACTION:
				sequence_ImperativeEntityPropertyAction(context, (ImperativeEntityPropertyAction) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE:
				sequence_ImperativeEntityPropertyStatePhrase(context, (ImperativeEntityPropertyStatePhrase) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_ENTITY_REF:
				sequence_ImperativeEntityRef(context, (ImperativeEntityRef) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_ENTITY_STATE_PHRASE:
				sequence_ImperativeEntityStatePhrase(context, (ImperativeEntityStatePhrase) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY:
				sequence_ImperativeEntityStatePhraseWithProperty(context, (ImperativeEntityStatePhraseWithProperty) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_PROPERTY_DEF:
				sequence_ImperativePropertyDef(context, (ImperativePropertyDef) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_PROPERTY_REF:
				sequence_ImperativePropertyRef(context, (ImperativePropertyRef) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_SCENARIO:
				sequence_ImperativeScenario(context, (ImperativeScenario) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_SCENARIO_ACTION:
				sequence_ImperativeScenarioAction(context, (ImperativeScenarioAction) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_SCENARIO_ACTION_AND:
				sequence_ImperativeScenarioActionAnd(context, (ImperativeScenarioActionAnd) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_SCENARIO_STATE:
				sequence_ImperativeScenarioState(context, (ImperativeScenarioState) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_SCENARIO_STATE_AND:
				sequence_ImperativeScenarioStateAnd(context, (ImperativeScenarioStateAnd) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_STATE_DEF:
				sequence_ImperativeStateDef(context, (ImperativeStateDef) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_STATE_NAME:
				sequence_ImperativeStateName(context, (ImperativeStateName) semanticObject); 
				return; 
			case BddDslPackage.IMPERATIVE_VERB_ACTION:
				sequence_ImperativeVerbAction(context, (ImperativeVerbAction) semanticObject); 
				return; 
			case BddDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case BddDslPackage.MODEL_REF:
				sequence_ModelRef(context, (ModelRef) semanticObject); 
				return; 
			case BddDslPackage.PROPERTY_DEF:
				sequence_PropertyDef(context, (PropertyDef) semanticObject); 
				return; 
			case BddDslPackage.PROPERTY_REF:
				sequence_PropertyRef(context, (PropertyRef) semanticObject); 
				return; 
			case BddDslPackage.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case BddDslPackage.STATE_DEF:
				sequence_StateDef(context, (StateDef) semanticObject); 
				return; 
			case BddDslPackage.STATE_NAME:
				sequence_StateName(context, (StateName) semanticObject); 
				return; 
			case BddDslPackage.VERB_ACTION:
				sequence_VerbAction(context, (VerbAction) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     ActionDef returns ActionDef
	 *
	 * Constraint:
	 *     (name=ID preposition=PREP? argument=ID?)
	 * </pre>
	 */
	protected void sequence_ActionDef(ISerializationContext context, ActionDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ActionRef returns ActionRef
	 *
	 * Constraint:
	 *     action=[ActionDef|ID]
	 * </pre>
	 */
	protected void sequence_ActionRef(ISerializationContext context, ActionRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.ACTION_REF__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.ACTION_REF__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActionRefAccess().getActionActionDefIDTerminalRuleCall_0_1(), semanticObject.eGet(BddDslPackage.Literals.ACTION_REF__ACTION, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclarativeEntityAction returns DeclarativeEntityAction
	 *
	 * Constraint:
	 *     (entity=DeclarativeEntityRef actionRef=ActionRef preposition=PREP entity2=DeclarativeEntityOrPropertyRef debug=DebugStatement?)
	 * </pre>
	 */
	protected void sequence_DeclarativeEntityAction(ISerializationContext context, DeclarativeEntityAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclarativeEntityDef returns DeclarativeEntityDef
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (superEntities+=[DeclarativeEntityDef|ID] superEntities+=[DeclarativeEntityDef|ID]*)? 
	 *         (actions+=ActionDef actions+=ActionDef*)? 
	 *         (states+=StateDef states+=StateDef*)? 
	 *         (properties+=PropertyDef properties+=PropertyDef*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_DeclarativeEntityDef(ISerializationContext context, DeclarativeEntityDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclarativeEntityOrPropertyRef returns DeclarativeEntityOrPropertyRef
	 *
	 * Constraint:
	 *     (property=[PropertyDef|ID] propertyValue=ENTITY_IDENTITY?)
	 * </pre>
	 */
	protected void sequence_DeclarativeEntityOrPropertyRef(ISerializationContext context, DeclarativeEntityOrPropertyRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclarativeEntityPropertyAction returns DeclarativeEntityPropertyAction
	 *
	 * Constraint:
	 *     (
	 *         entity=DeclarativeEntityRef 
	 *         actionRef=ActionRef 
	 *         preposition=PREP 
	 *         property=PropertyRef 
	 *         preposition2=PREP 
	 *         entity2=DeclarativeEntityRef 
	 *         debug=DebugStatement?
	 *     )
	 * </pre>
	 */
	protected void sequence_DeclarativeEntityPropertyAction(ISerializationContext context, DeclarativeEntityPropertyAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclarativeEntityPropertyStatePhrase returns DeclarativeEntityPropertyStatePhrase
	 *
	 * Constraint:
	 *     (
	 *         property=PropertyRef? 
	 *         preposition=PREP 
	 *         entity=DeclarativeEntityRef 
	 *         toBeWord=ToBeWords 
	 *         value=ENTITY_IDENTITY 
	 *         debug=DebugStatement?
	 *     )
	 * </pre>
	 */
	protected void sequence_DeclarativeEntityPropertyStatePhrase(ISerializationContext context, DeclarativeEntityPropertyStatePhrase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclarativeEntityRef returns DeclarativeEntityRef
	 *     DeclarativeEntityOrPropertyRef returns DeclarativeEntityRef
	 *
	 * Constraint:
	 *     (entity=[DeclarativeEntityDef|ID] entityValue=ENTITY_IDENTITY?)
	 * </pre>
	 */
	protected void sequence_DeclarativeEntityRef(ISerializationContext context, DeclarativeEntityRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclarativeEntityStatePhraseWithProperty returns DeclarativeEntityStatePhraseWithProperty
	 *
	 * Constraint:
	 *     (entity=DeclarativeEntityRef state=[StateName|ID] property=PropertyRef debug=DebugStatement?)
	 * </pre>
	 */
	protected void sequence_DeclarativeEntityStatePhraseWithProperty(ISerializationContext context, DeclarativeEntityStatePhraseWithProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclarativeEntityStatePhrase returns DeclarativeEntityStatePhrase
	 *
	 * Constraint:
	 *     (entity=DeclarativeEntityRef state=[StateName|ID] debug=DebugStatement?)
	 * </pre>
	 */
	protected void sequence_DeclarativeEntityStatePhrase(ISerializationContext context, DeclarativeEntityStatePhrase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclarativeScenarioActionAnd returns DeclarativeScenarioActionAnd
	 *
	 * Constraint:
	 *     (actions+=DeclarativeEntityAction | actions+=VerbAction | actions+=DeclarativeEntityPropertyAction)
	 * </pre>
	 */
	protected void sequence_DeclarativeScenarioActionAnd(ISerializationContext context, DeclarativeScenarioActionAnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclarativeScenarioAction returns DeclarativeScenarioAction
	 *
	 * Constraint:
	 *     ((actions+=DeclarativeEntityAction | actions+=VerbAction | actions+=DeclarativeEntityPropertyAction) andActions+=DeclarativeScenarioActionAnd*)
	 * </pre>
	 */
	protected void sequence_DeclarativeScenarioAction(ISerializationContext context, DeclarativeScenarioAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclarativeScenarioStateAnd returns DeclarativeScenarioStateAnd
	 *
	 * Constraint:
	 *     (states+=DeclarativeEntityPropertyStatePhrase | states+=DeclarativeEntityStatePhrase | states+=DeclarativeEntityStatePhraseWithProperty)
	 * </pre>
	 */
	protected void sequence_DeclarativeScenarioStateAnd(ISerializationContext context, DeclarativeScenarioStateAnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DeclarativeScenarioState returns DeclarativeScenarioState
	 *
	 * Constraint:
	 *     (
	 *         (states+=DeclarativeEntityPropertyStatePhrase | states+=DeclarativeEntityStatePhrase | states+=DeclarativeEntityStatePhraseWithProperty) 
	 *         andStates+=DeclarativeScenarioStateAnd*
	 *     )
	 * </pre>
	 */
	protected void sequence_DeclarativeScenarioState(ISerializationContext context, DeclarativeScenarioState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeActionDef returns ImperativeActionDef
	 *
	 * Constraint:
	 *     (name=ID preposition=PREP? argument=ID?)
	 * </pre>
	 */
	protected void sequence_ImperativeActionDef(ISerializationContext context, ImperativeActionDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeActionRef returns ImperativeActionRef
	 *
	 * Constraint:
	 *     action=[ImperativeActionDef|ID]
	 * </pre>
	 */
	protected void sequence_ImperativeActionRef(ISerializationContext context, ImperativeActionRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ACTION_REF__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ACTION_REF__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImperativeActionRefAccess().getActionImperativeActionDefIDTerminalRuleCall_0_1(), semanticObject.eGet(BddDslPackage.Literals.IMPERATIVE_ACTION_REF__ACTION, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeEntityAction returns ImperativeEntityAction
	 *
	 * Constraint:
	 *     (entity=ImperativeEntityRef actionRef=ImperativeActionRef preposition=PREP entity2=ImperativeEntityRef)
	 * </pre>
	 */
	protected void sequence_ImperativeEntityAction(ISerializationContext context, ImperativeEntityAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_ACTION__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_ACTION__ENTITY));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_ACTION__ACTION_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_ACTION__ACTION_REF));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_ACTION__PREPOSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_ACTION__PREPOSITION));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_ACTION__ENTITY2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_ACTION__ENTITY2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImperativeEntityActionAccess().getEntityImperativeEntityRefParserRuleCall_0_0(), semanticObject.getEntity());
		feeder.accept(grammarAccess.getImperativeEntityActionAccess().getActionRefImperativeActionRefParserRuleCall_1_0(), semanticObject.getActionRef());
		feeder.accept(grammarAccess.getImperativeEntityActionAccess().getPrepositionPREPParserRuleCall_2_0(), semanticObject.getPreposition());
		feeder.accept(grammarAccess.getImperativeEntityActionAccess().getEntity2ImperativeEntityRefParserRuleCall_3_0(), semanticObject.getEntity2());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeEntityDef returns ImperativeEntityDef
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (superEntities+=[ImperativeEntityDef|ID] superEntities+=[ImperativeEntityDef|ID]*)? 
	 *         (actions+=ImperativeActionDef actions+=ImperativeActionDef*)? 
	 *         (states+=ImperativeStateDef states+=ImperativeStateDef*)? 
	 *         (properties+=ImperativePropertyDef properties+=ImperativePropertyDef*)?
	 *     )
	 * </pre>
	 */
	protected void sequence_ImperativeEntityDef(ISerializationContext context, ImperativeEntityDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeEntityPropertyAction returns ImperativeEntityPropertyAction
	 *
	 * Constraint:
	 *     (
	 *         entity=ImperativeEntityRef 
	 *         actionRef=ImperativeActionRef 
	 *         preposition=PREP 
	 *         property=ImperativePropertyRef 
	 *         preposition2=PREP 
	 *         entity2=ImperativeEntityRef
	 *     )
	 * </pre>
	 */
	protected void sequence_ImperativeEntityPropertyAction(ISerializationContext context, ImperativeEntityPropertyAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_PROPERTY_ACTION__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_PROPERTY_ACTION__ENTITY));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_PROPERTY_ACTION__ACTION_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_PROPERTY_ACTION__ACTION_REF));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_PROPERTY_ACTION__PREPOSITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_PROPERTY_ACTION__PREPOSITION));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_PROPERTY_ACTION__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_PROPERTY_ACTION__PROPERTY));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_PROPERTY_ACTION__PREPOSITION2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_PROPERTY_ACTION__PREPOSITION2));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_PROPERTY_ACTION__ENTITY2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_PROPERTY_ACTION__ENTITY2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImperativeEntityPropertyActionAccess().getEntityImperativeEntityRefParserRuleCall_0_0(), semanticObject.getEntity());
		feeder.accept(grammarAccess.getImperativeEntityPropertyActionAccess().getActionRefImperativeActionRefParserRuleCall_1_0(), semanticObject.getActionRef());
		feeder.accept(grammarAccess.getImperativeEntityPropertyActionAccess().getPrepositionPREPParserRuleCall_2_0(), semanticObject.getPreposition());
		feeder.accept(grammarAccess.getImperativeEntityPropertyActionAccess().getPropertyImperativePropertyRefParserRuleCall_3_0(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getImperativeEntityPropertyActionAccess().getPreposition2PREPParserRuleCall_4_0(), semanticObject.getPreposition2());
		feeder.accept(grammarAccess.getImperativeEntityPropertyActionAccess().getEntity2ImperativeEntityRefParserRuleCall_5_0(), semanticObject.getEntity2());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeEntityPropertyStatePhrase returns ImperativeEntityPropertyStatePhrase
	 *
	 * Constraint:
	 *     (property=ImperativePropertyRef? preposition=PREP entity=ImperativeEntityRef toBeWord=ToBeWords value=ENTITY_IDENTITY)
	 * </pre>
	 */
	protected void sequence_ImperativeEntityPropertyStatePhrase(ISerializationContext context, ImperativeEntityPropertyStatePhrase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeEntityRef returns ImperativeEntityRef
	 *
	 * Constraint:
	 *     (entity=[ImperativeEntityDef|ID] entityValue=ENTITY_IDENTITY?)
	 * </pre>
	 */
	protected void sequence_ImperativeEntityRef(ISerializationContext context, ImperativeEntityRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeEntityStatePhraseWithProperty returns ImperativeEntityStatePhraseWithProperty
	 *
	 * Constraint:
	 *     (entity=ImperativeEntityRef state=[ImperativeStateName|ID] property=ImperativePropertyRef)
	 * </pre>
	 */
	protected void sequence_ImperativeEntityStatePhraseWithProperty(ISerializationContext context, ImperativeEntityStatePhraseWithProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__ENTITY));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__STATE));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__PROPERTY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImperativeEntityStatePhraseWithPropertyAccess().getEntityImperativeEntityRefParserRuleCall_0_0(), semanticObject.getEntity());
		feeder.accept(grammarAccess.getImperativeEntityStatePhraseWithPropertyAccess().getStateImperativeStateNameIDTerminalRuleCall_2_0_1(), semanticObject.eGet(BddDslPackage.Literals.IMPERATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__STATE, false));
		feeder.accept(grammarAccess.getImperativeEntityStatePhraseWithPropertyAccess().getPropertyImperativePropertyRefParserRuleCall_4_0(), semanticObject.getProperty());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeEntityStatePhrase returns ImperativeEntityStatePhrase
	 *
	 * Constraint:
	 *     (entity=ImperativeEntityRef state=[ImperativeStateName|ID])
	 * </pre>
	 */
	protected void sequence_ImperativeEntityStatePhrase(ISerializationContext context, ImperativeEntityStatePhrase semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_STATE_PHRASE__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_STATE_PHRASE__ENTITY));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_STATE_PHRASE__STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_ENTITY_STATE_PHRASE__STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImperativeEntityStatePhraseAccess().getEntityImperativeEntityRefParserRuleCall_0_0(), semanticObject.getEntity());
		feeder.accept(grammarAccess.getImperativeEntityStatePhraseAccess().getStateImperativeStateNameIDTerminalRuleCall_2_0_1(), semanticObject.eGet(BddDslPackage.Literals.IMPERATIVE_ENTITY_STATE_PHRASE__STATE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativePropertyDef returns ImperativePropertyDef
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_ImperativePropertyDef(ISerializationContext context, ImperativePropertyDef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_PROPERTY_DEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_PROPERTY_DEF__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImperativePropertyDefAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativePropertyRef returns ImperativePropertyRef
	 *
	 * Constraint:
	 *     (property=[ImperativePropertyDef|ID] propertyValue=ENTITY_IDENTITY?)
	 * </pre>
	 */
	protected void sequence_ImperativePropertyRef(ISerializationContext context, ImperativePropertyRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeScenarioActionAnd returns ImperativeScenarioActionAnd
	 *
	 * Constraint:
	 *     (actions+=ImperativeEntityAction | actions+=ImperativeVerbAction | actions+=ImperativeEntityPropertyAction)
	 * </pre>
	 */
	protected void sequence_ImperativeScenarioActionAnd(ISerializationContext context, ImperativeScenarioActionAnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeScenarioAction returns ImperativeScenarioAction
	 *
	 * Constraint:
	 *     (
	 *         (actions+=ImperativeEntityAction | actions+=ImperativeVerbAction | actions+=ImperativeEntityPropertyAction) 
	 *         andActions+=ImperativeScenarioActionAnd*
	 *     )
	 * </pre>
	 */
	protected void sequence_ImperativeScenarioAction(ISerializationContext context, ImperativeScenarioAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeScenarioStateAnd returns ImperativeScenarioStateAnd
	 *
	 * Constraint:
	 *     (states+=ImperativeEntityPropertyStatePhrase | states+=ImperativeEntityStatePhrase | states+=ImperativeEntityStatePhraseWithProperty)
	 * </pre>
	 */
	protected void sequence_ImperativeScenarioStateAnd(ISerializationContext context, ImperativeScenarioStateAnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeScenarioState returns ImperativeScenarioState
	 *
	 * Constraint:
	 *     (
	 *         (states+=ImperativeEntityPropertyStatePhrase | states+=ImperativeEntityStatePhrase | states+=ImperativeEntityStatePhraseWithProperty) 
	 *         andStates+=ImperativeScenarioStateAnd*
	 *     )
	 * </pre>
	 */
	protected void sequence_ImperativeScenarioState(ISerializationContext context, ImperativeScenarioState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeScenario returns ImperativeScenario
	 *
	 * Constraint:
	 *     (preState=ImperativeScenarioState action=ImperativeScenarioAction postState=ImperativeScenarioState)
	 * </pre>
	 */
	protected void sequence_ImperativeScenario(ISerializationContext context, ImperativeScenario semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_SCENARIO__PRE_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_SCENARIO__PRE_STATE));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_SCENARIO__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_SCENARIO__ACTION));
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_SCENARIO__POST_STATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_SCENARIO__POST_STATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImperativeScenarioAccess().getPreStateImperativeScenarioStateParserRuleCall_3_0(), semanticObject.getPreState());
		feeder.accept(grammarAccess.getImperativeScenarioAccess().getActionImperativeScenarioActionParserRuleCall_5_0(), semanticObject.getAction());
		feeder.accept(grammarAccess.getImperativeScenarioAccess().getPostStateImperativeScenarioStateParserRuleCall_7_0(), semanticObject.getPostState());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeStateDef returns ImperativeStateDef
	 *
	 * Constraint:
	 *     (postive=ImperativeStateName negative=ImperativeStateName?)
	 * </pre>
	 */
	protected void sequence_ImperativeStateDef(ISerializationContext context, ImperativeStateDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeStateName returns ImperativeStateName
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_ImperativeStateName(ISerializationContext context, ImperativeStateName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.IMPERATIVE_STATE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.IMPERATIVE_STATE_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImperativeStateNameAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ImperativeVerbAction returns ImperativeVerbAction
	 *
	 * Constraint:
	 *     (
	 *         action=ImperativeActionRef 
	 *         preposition=PREP 
	 *         entity=ImperativeEntityRef? 
	 *         (preposition2=PREP entity2=ImperativeEntityRef)? 
	 *         (preposition3=PREP entity3=ImperativeEntityRef)?
	 *     )
	 * </pre>
	 */
	protected void sequence_ImperativeVerbAction(ISerializationContext context, ImperativeVerbAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ModelRef returns ModelRef
	 *
	 * Constraint:
	 *     modelRef=[Model|ID]
	 * </pre>
	 */
	protected void sequence_ModelRef(ISerializationContext context, ModelRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.MODEL_REF__MODEL_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.MODEL_REF__MODEL_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelRefAccess().getModelRefModelIDTerminalRuleCall_1_0_1(), semanticObject.eGet(BddDslPackage.Literals.MODEL_REF__MODEL_REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=ID (modelRefs+=ModelRef | declarativeEntityDef+=DeclarativeEntityDef | imperativeEntityDef+=ImperativeEntityDef | scenarios+=Scenario)*)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PropertyDef returns PropertyDef
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_PropertyDef(ISerializationContext context, PropertyDef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.PROPERTY_DEF__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.PROPERTY_DEF__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyDefAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     PropertyRef returns PropertyRef
	 *
	 * Constraint:
	 *     (property=[PropertyDef|ID] propertyValue=ENTITY_IDENTITY?)
	 * </pre>
	 */
	protected void sequence_PropertyRef(ISerializationContext context, PropertyRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Scenario returns Scenario
	 *
	 * Constraint:
	 *     (
	 *         scenarioName=STRING 
	 *         preStateE=DeclarativeScenarioState 
	 *         imperative1=ImperativeScenario? 
	 *         actionE=DeclarativeScenarioAction 
	 *         imperative2=ImperativeScenario? 
	 *         preStateE1=DeclarativeScenarioState 
	 *         imperative3=ImperativeScenario?
	 *     )
	 * </pre>
	 */
	protected void sequence_Scenario(ISerializationContext context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StateDef returns StateDef
	 *
	 * Constraint:
	 *     (postive=StateName negative=StateName?)
	 * </pre>
	 */
	protected void sequence_StateDef(ISerializationContext context, StateDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     StateName returns StateName
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_StateName(ISerializationContext context, StateName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BddDslPackage.Literals.STATE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BddDslPackage.Literals.STATE_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateNameAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     VerbAction returns VerbAction
	 *
	 * Constraint:
	 *     (
	 *         action=ActionRef 
	 *         preposition=PREP 
	 *         entity=DeclarativeEntityRef? 
	 *         (preposition2=PREP entity2=DeclarativeEntityRef)? 
	 *         (preposition3=PREP entity3=DeclarativeEntityRef)? 
	 *         debug=DebugStatement?
	 *     )
	 * </pre>
	 */
	protected void sequence_VerbAction(ISerializationContext context, VerbAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
