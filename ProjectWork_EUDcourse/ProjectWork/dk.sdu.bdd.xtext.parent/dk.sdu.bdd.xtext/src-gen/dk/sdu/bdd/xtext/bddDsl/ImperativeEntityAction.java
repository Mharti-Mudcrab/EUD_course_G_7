/**
 * generated by Xtext 2.36.0
 */
package dk.sdu.bdd.xtext.bddDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative Entity Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityAction#getEntity <em>Entity</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityAction#getActionRef <em>Action Ref</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityAction#getPreposition <em>Preposition</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityAction#getEntity2 <em>Entity2</em>}</li>
 * </ul>
 *
 * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityAction()
 * @model
 * @generated
 */
public interface ImperativeEntityAction extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(ImperativeEntityRef)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityAction_Entity()
   * @model containment="true"
   * @generated
   */
  ImperativeEntityRef getEntity();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityAction#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(ImperativeEntityRef value);

  /**
   * Returns the value of the '<em><b>Action Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action Ref</em>' containment reference.
   * @see #setActionRef(ImperativeActionRef)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityAction_ActionRef()
   * @model containment="true"
   * @generated
   */
  ImperativeActionRef getActionRef();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityAction#getActionRef <em>Action Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action Ref</em>' containment reference.
   * @see #getActionRef()
   * @generated
   */
  void setActionRef(ImperativeActionRef value);

  /**
   * Returns the value of the '<em><b>Preposition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preposition</em>' attribute.
   * @see #setPreposition(String)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityAction_Preposition()
   * @model
   * @generated
   */
  String getPreposition();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityAction#getPreposition <em>Preposition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preposition</em>' attribute.
   * @see #getPreposition()
   * @generated
   */
  void setPreposition(String value);

  /**
   * Returns the value of the '<em><b>Entity2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity2</em>' containment reference.
   * @see #setEntity2(ImperativeEntityRef)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityAction_Entity2()
   * @model containment="true"
   * @generated
   */
  ImperativeEntityRef getEntity2();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityAction#getEntity2 <em>Entity2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity2</em>' containment reference.
   * @see #getEntity2()
   * @generated
   */
  void setEntity2(ImperativeEntityRef value);

} // ImperativeEntityAction
