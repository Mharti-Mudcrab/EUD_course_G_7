/**
 * generated by Xtext 2.37.0.M0
 */
package dk.sdu.bdd.xtext.bddDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imperative Entity Property State Phrase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyStatePhrase#getProperty <em>Property</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyStatePhrase#getPreposition <em>Preposition</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyStatePhrase#getEntity <em>Entity</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyStatePhrase#getToBeWord <em>To Be Word</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyStatePhrase#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityPropertyStatePhrase()
 * @model
 * @generated
 */
public interface ImperativeEntityPropertyStatePhrase extends EObject
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference.
   * @see #setProperty(ImperativePropertyRef)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityPropertyStatePhrase_Property()
   * @model containment="true"
   * @generated
   */
  ImperativePropertyRef getProperty();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyStatePhrase#getProperty <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' containment reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(ImperativePropertyRef value);

  /**
   * Returns the value of the '<em><b>Preposition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Preposition</em>' attribute.
   * @see #setPreposition(String)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityPropertyStatePhrase_Preposition()
   * @model
   * @generated
   */
  String getPreposition();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyStatePhrase#getPreposition <em>Preposition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Preposition</em>' attribute.
   * @see #getPreposition()
   * @generated
   */
  void setPreposition(String value);

  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(ImperativeEntityRef)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityPropertyStatePhrase_Entity()
   * @model containment="true"
   * @generated
   */
  ImperativeEntityRef getEntity();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyStatePhrase#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(ImperativeEntityRef value);

  /**
   * Returns the value of the '<em><b>To Be Word</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Be Word</em>' attribute.
   * @see #setToBeWord(String)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityPropertyStatePhrase_ToBeWord()
   * @model
   * @generated
   */
  String getToBeWord();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyStatePhrase#getToBeWord <em>To Be Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Be Word</em>' attribute.
   * @see #getToBeWord()
   * @generated
   */
  void setToBeWord(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see dk.sdu.bdd.xtext.bddDsl.BddDslPackage#getImperativeEntityPropertyStatePhrase_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyStatePhrase#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // ImperativeEntityPropertyStatePhrase
