/**
 * generated by Xtext 2.37.0.M0
 */
package dk.sdu.bdd.xtext.bddDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declarative Entity State Phrase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityStatePhrase#getEntity <em>Entity</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityStatePhrase#getState <em>State</em>}</li>
 * </ul>
 *
 * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getDeclarativeEntityStatePhrase()
 * @model
 * @generated
 */
public interface DeclarativeEntityStatePhrase extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(DeclarativeEntityRef)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getDeclarativeEntityStatePhrase_Entity()
   * @model containment="true"
   * @generated
   */
  DeclarativeEntityRef getEntity();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityStatePhrase#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(DeclarativeEntityRef value);

  /**
   * Returns the value of the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' reference.
   * @see #setState(StateName)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getDeclarativeEntityStatePhrase_State()
   * @model
   * @generated
   */
  StateName getState();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityStatePhrase#getState <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' reference.
   * @see #getState()
   * @generated
   */
  void setState(StateName value);

} // DeclarativeEntityStatePhrase
