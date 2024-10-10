/**
 * generated by Xtext 2.37.0.M0
 */
package dk.sdu.bdd.xtext.bddDsl.impl;

import dk.sdu.bdd.xtext.bddDsl.BddDslPackage;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityRef;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityStatePhraseWithProperty;
import dk.sdu.bdd.xtext.bddDsl.PropertyRef;
import dk.sdu.bdd.xtext.bddDsl.StateName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declarative Entity State Phrase With Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.DeclarativeEntityStatePhraseWithPropertyImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.DeclarativeEntityStatePhraseWithPropertyImpl#getState <em>State</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.DeclarativeEntityStatePhraseWithPropertyImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarativeEntityStatePhraseWithPropertyImpl extends MinimalEObjectImpl.Container implements DeclarativeEntityStatePhraseWithProperty
{
  /**
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected DeclarativeEntityRef entity;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected StateName state;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected PropertyRef property;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarativeEntityStatePhraseWithPropertyImpl()
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
    return BddDslPackage.Literals.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeclarativeEntityRef getEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntity(DeclarativeEntityRef newEntity, NotificationChain msgs)
  {
    DeclarativeEntityRef oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__ENTITY, oldEntity, newEntity);
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
  public void setEntity(DeclarativeEntityRef newEntity)
  {
    if (newEntity != entity)
    {
      NotificationChain msgs = null;
      if (entity != null)
        msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__ENTITY, null, msgs);
      if (newEntity != null)
        msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__ENTITY, null, msgs);
      msgs = basicSetEntity(newEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__ENTITY, newEntity, newEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateName getState()
  {
    if (state != null && state.eIsProxy())
    {
      InternalEObject oldState = (InternalEObject)state;
      state = (StateName)eResolveProxy(oldState);
      if (state != oldState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__STATE, oldState, state));
      }
    }
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateName basicGetState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setState(StateName newState)
  {
    StateName oldState = state;
    state = newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__STATE, oldState, state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyRef getProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperty(PropertyRef newProperty, NotificationChain msgs)
  {
    PropertyRef oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__PROPERTY, oldProperty, newProperty);
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
  public void setProperty(PropertyRef newProperty)
  {
    if (newProperty != property)
    {
      NotificationChain msgs = null;
      if (property != null)
        msgs = ((InternalEObject)property).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__PROPERTY, null, msgs);
      if (newProperty != null)
        msgs = ((InternalEObject)newProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__PROPERTY, null, msgs);
      msgs = basicSetProperty(newProperty, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__PROPERTY, newProperty, newProperty));
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
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__ENTITY:
        return basicSetEntity(null, msgs);
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__PROPERTY:
        return basicSetProperty(null, msgs);
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
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__ENTITY:
        return getEntity();
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__STATE:
        if (resolve) return getState();
        return basicGetState();
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__PROPERTY:
        return getProperty();
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
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__ENTITY:
        setEntity((DeclarativeEntityRef)newValue);
        return;
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__STATE:
        setState((StateName)newValue);
        return;
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__PROPERTY:
        setProperty((PropertyRef)newValue);
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
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__ENTITY:
        setEntity((DeclarativeEntityRef)null);
        return;
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__STATE:
        setState((StateName)null);
        return;
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__PROPERTY:
        setProperty((PropertyRef)null);
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
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__ENTITY:
        return entity != null;
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__STATE:
        return state != null;
      case BddDslPackage.DECLARATIVE_ENTITY_STATE_PHRASE_WITH_PROPERTY__PROPERTY:
        return property != null;
    }
    return super.eIsSet(featureID);
  }

} //DeclarativeEntityStatePhraseWithPropertyImpl
