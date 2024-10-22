/**
 * generated by Xtext 2.36.0
 */
package dk.sdu.bdd.xtext.bddDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative Entity State Phrase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityStatePhrase#getEntity <em>Entity</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityStatePhrase#getState <em>State</em>}</li>
 * </ul>
 *
 * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityStatePhrase()
 * @model
 * @generated
 */
public interface ImperativeEntityStatePhrase extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(ImperativeEntityRef)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityStatePhrase_Entity()
   * @model containment="true"
   * @generated
   */
  ImperativeEntityRef getEntity();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityStatePhrase#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(ImperativeEntityRef value);

  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(ImperativeStateName)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityStatePhrase_State()
   * @model
   * @generated
   */
  ImperativeStateName getState();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityStatePhrase#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(ImperativeStateName value);

} // ImperativeEntityStatePhrase
