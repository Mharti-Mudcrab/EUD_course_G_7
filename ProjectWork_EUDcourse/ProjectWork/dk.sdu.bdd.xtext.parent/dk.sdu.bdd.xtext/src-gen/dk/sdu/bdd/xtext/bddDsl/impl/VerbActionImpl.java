/**
 * generated by Xtext 2.36.0
 */
package dk.sdu.bdd.xtext.bddDsl.impl;

import dk.sdu.bdd.xtext.bddDsl.ActionRef;
import dk.sdu.bdd.xtext.bddDsl.BddDslPackage;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeEntityRef;
import dk.sdu.bdd.xtext.bddDsl.VerbAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verb Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.VerbActionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.VerbActionImpl#getPreposition <em>Preposition</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.VerbActionImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.VerbActionImpl#getPreposition2 <em>Preposition2</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.VerbActionImpl#getEntity2 <em>Entity2</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.VerbActionImpl#getPreposition3 <em>Preposition3</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.VerbActionImpl#getEntity3 <em>Entity3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerbActionImpl extends MinimalEObjectImpl.Container implements VerbAction
{
  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected ActionRef action;

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
  protected DeclarativeEntityRef entity;

  /**
   * The default value of the '{@link #getPreposition2() <em>Preposition2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreposition2()
   * @generated
   * @ordered
   */
  protected static final String PREPOSITION2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPreposition2() <em>Preposition2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreposition2()
   * @generated
   * @ordered
   */
  protected String preposition2 = PREPOSITION2_EDEFAULT;

  /**
   * The cached value of the '{@link #getEntity2() <em>Entity2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity2()
   * @generated
   * @ordered
   */
  protected DeclarativeEntityRef entity2;

  /**
   * The default value of the '{@link #getPreposition3() <em>Preposition3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreposition3()
   * @generated
   * @ordered
   */
  protected static final String PREPOSITION3_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPreposition3() <em>Preposition3</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreposition3()
   * @generated
   * @ordered
   */
  protected String preposition3 = PREPOSITION3_EDEFAULT;

  /**
   * The cached value of the '{@link #getEntity3() <em>Entity3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity3()
   * @generated
   * @ordered
   */
  protected DeclarativeEntityRef entity3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerbActionImpl()
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
    return BddDslPackage.Literals.VERB_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionRef getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(ActionRef newAction, NotificationChain msgs)
  {
    ActionRef oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.VERB_ACTION__ACTION, oldAction, newAction);
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
  public void setAction(ActionRef newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.VERB_ACTION__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.VERB_ACTION__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.VERB_ACTION__ACTION, newAction, newAction));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.VERB_ACTION__PREPOSITION, oldPreposition, preposition));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.VERB_ACTION__ENTITY, oldEntity, newEntity);
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
        msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.VERB_ACTION__ENTITY, null, msgs);
      if (newEntity != null)
        msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.VERB_ACTION__ENTITY, null, msgs);
      msgs = basicSetEntity(newEntity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.VERB_ACTION__ENTITY, newEntity, newEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPreposition2()
  {
    return preposition2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPreposition2(String newPreposition2)
  {
    String oldPreposition2 = preposition2;
    preposition2 = newPreposition2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.VERB_ACTION__PREPOSITION2, oldPreposition2, preposition2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeclarativeEntityRef getEntity2()
  {
    return entity2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntity2(DeclarativeEntityRef newEntity2, NotificationChain msgs)
  {
    DeclarativeEntityRef oldEntity2 = entity2;
    entity2 = newEntity2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.VERB_ACTION__ENTITY2, oldEntity2, newEntity2);
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
  public void setEntity2(DeclarativeEntityRef newEntity2)
  {
    if (newEntity2 != entity2)
    {
      NotificationChain msgs = null;
      if (entity2 != null)
        msgs = ((InternalEObject)entity2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.VERB_ACTION__ENTITY2, null, msgs);
      if (newEntity2 != null)
        msgs = ((InternalEObject)newEntity2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.VERB_ACTION__ENTITY2, null, msgs);
      msgs = basicSetEntity2(newEntity2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.VERB_ACTION__ENTITY2, newEntity2, newEntity2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPreposition3()
  {
    return preposition3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPreposition3(String newPreposition3)
  {
    String oldPreposition3 = preposition3;
    preposition3 = newPreposition3;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.VERB_ACTION__PREPOSITION3, oldPreposition3, preposition3));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeclarativeEntityRef getEntity3()
  {
    return entity3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntity3(DeclarativeEntityRef newEntity3, NotificationChain msgs)
  {
    DeclarativeEntityRef oldEntity3 = entity3;
    entity3 = newEntity3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.VERB_ACTION__ENTITY3, oldEntity3, newEntity3);
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
  public void setEntity3(DeclarativeEntityRef newEntity3)
  {
    if (newEntity3 != entity3)
    {
      NotificationChain msgs = null;
      if (entity3 != null)
        msgs = ((InternalEObject)entity3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.VERB_ACTION__ENTITY3, null, msgs);
      if (newEntity3 != null)
        msgs = ((InternalEObject)newEntity3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.VERB_ACTION__ENTITY3, null, msgs);
      msgs = basicSetEntity3(newEntity3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.VERB_ACTION__ENTITY3, newEntity3, newEntity3));
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
      case BddDslPackage.VERB_ACTION__ACTION:
        return basicSetAction(null, msgs);
      case BddDslPackage.VERB_ACTION__ENTITY:
        return basicSetEntity(null, msgs);
      case BddDslPackage.VERB_ACTION__ENTITY2:
        return basicSetEntity2(null, msgs);
      case BddDslPackage.VERB_ACTION__ENTITY3:
        return basicSetEntity3(null, msgs);
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
      case BddDslPackage.VERB_ACTION__ACTION:
        return getAction();
      case BddDslPackage.VERB_ACTION__PREPOSITION:
        return getPreposition();
      case BddDslPackage.VERB_ACTION__ENTITY:
        return getEntity();
      case BddDslPackage.VERB_ACTION__PREPOSITION2:
        return getPreposition2();
      case BddDslPackage.VERB_ACTION__ENTITY2:
        return getEntity2();
      case BddDslPackage.VERB_ACTION__PREPOSITION3:
        return getPreposition3();
      case BddDslPackage.VERB_ACTION__ENTITY3:
        return getEntity3();
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
      case BddDslPackage.VERB_ACTION__ACTION:
        setAction((ActionRef)newValue);
        return;
      case BddDslPackage.VERB_ACTION__PREPOSITION:
        setPreposition((String)newValue);
        return;
      case BddDslPackage.VERB_ACTION__ENTITY:
        setEntity((DeclarativeEntityRef)newValue);
        return;
      case BddDslPackage.VERB_ACTION__PREPOSITION2:
        setPreposition2((String)newValue);
        return;
      case BddDslPackage.VERB_ACTION__ENTITY2:
        setEntity2((DeclarativeEntityRef)newValue);
        return;
      case BddDslPackage.VERB_ACTION__PREPOSITION3:
        setPreposition3((String)newValue);
        return;
      case BddDslPackage.VERB_ACTION__ENTITY3:
        setEntity3((DeclarativeEntityRef)newValue);
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
      case BddDslPackage.VERB_ACTION__ACTION:
        setAction((ActionRef)null);
        return;
      case BddDslPackage.VERB_ACTION__PREPOSITION:
        setPreposition(PREPOSITION_EDEFAULT);
        return;
      case BddDslPackage.VERB_ACTION__ENTITY:
        setEntity((DeclarativeEntityRef)null);
        return;
      case BddDslPackage.VERB_ACTION__PREPOSITION2:
        setPreposition2(PREPOSITION2_EDEFAULT);
        return;
      case BddDslPackage.VERB_ACTION__ENTITY2:
        setEntity2((DeclarativeEntityRef)null);
        return;
      case BddDslPackage.VERB_ACTION__PREPOSITION3:
        setPreposition3(PREPOSITION3_EDEFAULT);
        return;
      case BddDslPackage.VERB_ACTION__ENTITY3:
        setEntity3((DeclarativeEntityRef)null);
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
      case BddDslPackage.VERB_ACTION__ACTION:
        return action != null;
      case BddDslPackage.VERB_ACTION__PREPOSITION:
        return PREPOSITION_EDEFAULT == null ? preposition != null : !PREPOSITION_EDEFAULT.equals(preposition);
      case BddDslPackage.VERB_ACTION__ENTITY:
        return entity != null;
      case BddDslPackage.VERB_ACTION__PREPOSITION2:
        return PREPOSITION2_EDEFAULT == null ? preposition2 != null : !PREPOSITION2_EDEFAULT.equals(preposition2);
      case BddDslPackage.VERB_ACTION__ENTITY2:
        return entity2 != null;
      case BddDslPackage.VERB_ACTION__PREPOSITION3:
        return PREPOSITION3_EDEFAULT == null ? preposition3 != null : !PREPOSITION3_EDEFAULT.equals(preposition3);
      case BddDslPackage.VERB_ACTION__ENTITY3:
        return entity3 != null;
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
    result.append(", preposition2: ");
    result.append(preposition2);
    result.append(", preposition3: ");
    result.append(preposition3);
    result.append(')');
    return result.toString();
  }

} //VerbActionImpl
