/**
 * generated by Xtext 2.36.0
 */
package dk.sdu.bdd.xtext.bddDsl.impl;

import dk.sdu.bdd.xtext.bddDsl.BddDslPackage;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityPropertyStatePhrase;
import dk.sdu.bdd.xtext.bddDsl.ImperativeEntityRef;
import dk.sdu.bdd.xtext.bddDsl.ImperativePropertyRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imperative Entity Property State Phrase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ImperativeEntityPropertyStatePhraseImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ImperativeEntityPropertyStatePhraseImpl#getPreposition <em>Preposition</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ImperativeEntityPropertyStatePhraseImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ImperativeEntityPropertyStatePhraseImpl#getToBeWord <em>To Be Word</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ImperativeEntityPropertyStatePhraseImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImperativeEntityPropertyStatePhraseImpl extends MinimalEObjectImpl.Container implements ImperativeEntityPropertyStatePhrase
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected ImperativePropertyRef property;

  /**
   * The default value of the '{@link #getPreposition() <em>Preposition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreposition()
   * @generated
   * @ordered
   */
  protected static final String PREPOSITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPreposition() <em>Preposition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreposition()
   * @generated
   * @ordered
   */
  protected String preposition = PREPOSITION_EDEFAULT;

  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected ImperativeEntityRef entity;

  /**
   * The default value of the '{@link #getToBeWord() <em>To Be Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToBeWord()
   * @generated
   * @ordered
   */
  protected static final String TO_BE_WORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getToBeWord() <em>To Be Word</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToBeWord()
   * @generated
   * @ordered
   */
  protected String toBeWord = TO_BE_WORD_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImperativeEntityPropertyStatePhraseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BddDslPackage.Literals.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImperativePropertyRef getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperty(ImperativePropertyRef newProperty, NotificationChain msgs)
  {
    ImperativePropertyRef oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY, oldProperty, newProperty);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProperty(ImperativePropertyRef newProperty)
  {
    if (newProperty != property)
    {
      NotificationChain msgs = null;
      if (property != null)
        msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY, null, msgs);
      if (newProperty != null)
        msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY, null, msgs);
      msgs = basicSetProperty(newProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY, newProperty, newProperty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPreposition()
  {
    return preposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPreposition(String newPreposition)
  {
    String oldPreposition = preposition;
    preposition = newPreposition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PREPOSITION, oldPreposition, preposition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImperativeEntityRef getEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntity(ImperativeEntityRef newEntity, NotificationChain msgs)
  {
    ImperativeEntityRef oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY, oldEntity, newEntity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEntity(ImperativeEntityRef newEntity)
  {
    if (newEntity != entity)
    {
      NotificationChain msgs = null;
      if (entity != null)
        msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY, null, msgs);
      if (newEntity != null)
        msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY, null, msgs);
      msgs = basicSetEntity(newEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY, newEntity, newEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getToBeWord()
  {
    return toBeWord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setToBeWord(String newToBeWord)
  {
    String oldToBeWord = toBeWord;
    toBeWord = newToBeWord;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__TO_BE_WORD, oldToBeWord, toBeWord));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY:
        return basicSetProperty(null, msgs);
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        return basicSetEntity(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY:
        return getProperty();
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PREPOSITION:
        return getPreposition();
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        return getEntity();
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__TO_BE_WORD:
        return getToBeWord();
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY:
        setProperty((ImperativePropertyRef)newValue);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PREPOSITION:
        setPreposition((String)newValue);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        setEntity((ImperativeEntityRef)newValue);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__TO_BE_WORD:
        setToBeWord((String)newValue);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__VALUE:
        setValue((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY:
        setProperty((ImperativePropertyRef)null);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PREPOSITION:
        setPreposition(PREPOSITION_EDEFAULT);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        setEntity((ImperativeEntityRef)null);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__TO_BE_WORD:
        setToBeWord(TO_BE_WORD_EDEFAULT);
        return;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PROPERTY:
        return property != null;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__PREPOSITION:
        return PREPOSITION_EDEFAULT == null ? preposition != null : !PREPOSITION_EDEFAULT.equals(preposition);
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__ENTITY:
        return entity != null;
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__TO_BE_WORD:
        return TO_BE_WORD_EDEFAULT == null ? toBeWord != null : !TO_BE_WORD_EDEFAULT.equals(toBeWord);
      case BddDslPackage.IMPERATIVE_ENTITY_PROPERTY_STATE_PHRASE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (preposition: ");
    result.append(preposition);
    result.append(", toBeWord: ");
    result.append(toBeWord);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //ImperativeEntityPropertyStatePhraseImpl
