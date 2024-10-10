/**
 * generated by Xtext 2.37.0.M0
 */
package dk.sdu.bdd.xtext.bddDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative Scenario Action And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeScenarioActionAnd#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeScenarioActionAnd()
 * @model
 * @generated
 */
public interface ImperativeScenarioActionAnd extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeScenarioActionAnd_Actions()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getActions();

} // ImperativeScenarioActionAnd
