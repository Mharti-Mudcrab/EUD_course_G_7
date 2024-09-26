/**
 * generated by Xtext 2.32.0
 */
package dk.sdu.bdd.xtext.bddDsl.impl;

import dk.sdu.bdd.xtext.bddDsl.BddDslPackage;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeScenarioAction;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeScenarioState;
import dk.sdu.bdd.xtext.bddDsl.ImperativeScenario;
import dk.sdu.bdd.xtext.bddDsl.Scenario;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ScenarioImpl#getScenarioName <em>Scenario Name</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ScenarioImpl#getPreStateE <em>Pre State E</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ScenarioImpl#getImperative1 <em>Imperative1</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ScenarioImpl#getActionE <em>Action E</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ScenarioImpl#getImperative2 <em>Imperative2</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ScenarioImpl#getPreStateE1 <em>Pre State E1</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.ScenarioImpl#getImperative3 <em>Imperative3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScenarioImpl extends MinimalEObjectImpl.Container implements Scenario
{
  /**
   * The default value of the '{@link #getScenarioName() <em>Scenario Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarioName()
   * @generated
   * @ordered
   */
  protected static final String SCENARIO_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScenarioName() <em>Scenario Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenarioName()
   * @generated
   * @ordered
   */
  protected String scenarioName = SCENARIO_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getPreStateE() <em>Pre State E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreStateE()
   * @generated
   * @ordered
   */
  protected DeclarativeScenarioState preStateE;

  /**
   * The cached value of the '{@link #getImperative1() <em>Imperative1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImperative1()
   * @generated
   * @ordered
   */
  protected ImperativeScenario imperative1;

  /**
   * The cached value of the '{@link #getActionE() <em>Action E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionE()
   * @generated
   * @ordered
   */
  protected DeclarativeScenarioAction actionE;

  /**
   * The cached value of the '{@link #getImperative2() <em>Imperative2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImperative2()
   * @generated
   * @ordered
   */
  protected ImperativeScenario imperative2;

  /**
   * The cached value of the '{@link #getPreStateE1() <em>Pre State E1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPreStateE1()
   * @generated
   * @ordered
   */
  protected DeclarativeScenarioState preStateE1;

  /**
   * The cached value of the '{@link #getImperative3() <em>Imperative3</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImperative3()
   * @generated
   * @ordered
   */
  protected ImperativeScenario imperative3;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScenarioImpl()
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
    return BddDslPackage.Literals.SCENARIO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getScenarioName()
  {
    return scenarioName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setScenarioName(String newScenarioName)
  {
    String oldScenarioName = scenarioName;
    scenarioName = newScenarioName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__SCENARIO_NAME, oldScenarioName, scenarioName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeclarativeScenarioState getPreStateE()
  {
    return preStateE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreStateE(DeclarativeScenarioState newPreStateE, NotificationChain msgs)
  {
    DeclarativeScenarioState oldPreStateE = preStateE;
    preStateE = newPreStateE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__PRE_STATE_E, oldPreStateE, newPreStateE);
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
  public void setPreStateE(DeclarativeScenarioState newPreStateE)
  {
    if (newPreStateE != preStateE)
    {
      NotificationChain msgs = null;
      if (preStateE != null)
        msgs = ((InternalEObject)preStateE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__PRE_STATE_E, null, msgs);
      if (newPreStateE != null)
        msgs = ((InternalEObject)newPreStateE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__PRE_STATE_E, null, msgs);
      msgs = basicSetPreStateE(newPreStateE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__PRE_STATE_E, newPreStateE, newPreStateE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImperativeScenario getImperative1()
  {
    return imperative1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImperative1(ImperativeScenario newImperative1, NotificationChain msgs)
  {
    ImperativeScenario oldImperative1 = imperative1;
    imperative1 = newImperative1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__IMPERATIVE1, oldImperative1, newImperative1);
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
  public void setImperative1(ImperativeScenario newImperative1)
  {
    if (newImperative1 != imperative1)
    {
      NotificationChain msgs = null;
      if (imperative1 != null)
        msgs = ((InternalEObject)imperative1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__IMPERATIVE1, null, msgs);
      if (newImperative1 != null)
        msgs = ((InternalEObject)newImperative1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__IMPERATIVE1, null, msgs);
      msgs = basicSetImperative1(newImperative1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__IMPERATIVE1, newImperative1, newImperative1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeclarativeScenarioAction getActionE()
  {
    return actionE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionE(DeclarativeScenarioAction newActionE, NotificationChain msgs)
  {
    DeclarativeScenarioAction oldActionE = actionE;
    actionE = newActionE;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__ACTION_E, oldActionE, newActionE);
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
  public void setActionE(DeclarativeScenarioAction newActionE)
  {
    if (newActionE != actionE)
    {
      NotificationChain msgs = null;
      if (actionE != null)
        msgs = ((InternalEObject)actionE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__ACTION_E, null, msgs);
      if (newActionE != null)
        msgs = ((InternalEObject)newActionE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__ACTION_E, null, msgs);
      msgs = basicSetActionE(newActionE, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__ACTION_E, newActionE, newActionE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImperativeScenario getImperative2()
  {
    return imperative2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImperative2(ImperativeScenario newImperative2, NotificationChain msgs)
  {
    ImperativeScenario oldImperative2 = imperative2;
    imperative2 = newImperative2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__IMPERATIVE2, oldImperative2, newImperative2);
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
  public void setImperative2(ImperativeScenario newImperative2)
  {
    if (newImperative2 != imperative2)
    {
      NotificationChain msgs = null;
      if (imperative2 != null)
        msgs = ((InternalEObject)imperative2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__IMPERATIVE2, null, msgs);
      if (newImperative2 != null)
        msgs = ((InternalEObject)newImperative2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__IMPERATIVE2, null, msgs);
      msgs = basicSetImperative2(newImperative2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__IMPERATIVE2, newImperative2, newImperative2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeclarativeScenarioState getPreStateE1()
  {
    return preStateE1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPreStateE1(DeclarativeScenarioState newPreStateE1, NotificationChain msgs)
  {
    DeclarativeScenarioState oldPreStateE1 = preStateE1;
    preStateE1 = newPreStateE1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__PRE_STATE_E1, oldPreStateE1, newPreStateE1);
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
  public void setPreStateE1(DeclarativeScenarioState newPreStateE1)
  {
    if (newPreStateE1 != preStateE1)
    {
      NotificationChain msgs = null;
      if (preStateE1 != null)
        msgs = ((InternalEObject)preStateE1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__PRE_STATE_E1, null, msgs);
      if (newPreStateE1 != null)
        msgs = ((InternalEObject)newPreStateE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__PRE_STATE_E1, null, msgs);
      msgs = basicSetPreStateE1(newPreStateE1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__PRE_STATE_E1, newPreStateE1, newPreStateE1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ImperativeScenario getImperative3()
  {
    return imperative3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImperative3(ImperativeScenario newImperative3, NotificationChain msgs)
  {
    ImperativeScenario oldImperative3 = imperative3;
    imperative3 = newImperative3;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__IMPERATIVE3, oldImperative3, newImperative3);
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
  public void setImperative3(ImperativeScenario newImperative3)
  {
    if (newImperative3 != imperative3)
    {
      NotificationChain msgs = null;
      if (imperative3 != null)
        msgs = ((InternalEObject)imperative3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__IMPERATIVE3, null, msgs);
      if (newImperative3 != null)
        msgs = ((InternalEObject)newImperative3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BddDslPackage.SCENARIO__IMPERATIVE3, null, msgs);
      msgs = basicSetImperative3(newImperative3, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.SCENARIO__IMPERATIVE3, newImperative3, newImperative3));
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
      case BddDslPackage.SCENARIO__PRE_STATE_E:
        return basicSetPreStateE(null, msgs);
      case BddDslPackage.SCENARIO__IMPERATIVE1:
        return basicSetImperative1(null, msgs);
      case BddDslPackage.SCENARIO__ACTION_E:
        return basicSetActionE(null, msgs);
      case BddDslPackage.SCENARIO__IMPERATIVE2:
        return basicSetImperative2(null, msgs);
      case BddDslPackage.SCENARIO__PRE_STATE_E1:
        return basicSetPreStateE1(null, msgs);
      case BddDslPackage.SCENARIO__IMPERATIVE3:
        return basicSetImperative3(null, msgs);
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
      case BddDslPackage.SCENARIO__SCENARIO_NAME:
        return getScenarioName();
      case BddDslPackage.SCENARIO__PRE_STATE_E:
        return getPreStateE();
      case BddDslPackage.SCENARIO__IMPERATIVE1:
        return getImperative1();
      case BddDslPackage.SCENARIO__ACTION_E:
        return getActionE();
      case BddDslPackage.SCENARIO__IMPERATIVE2:
        return getImperative2();
      case BddDslPackage.SCENARIO__PRE_STATE_E1:
        return getPreStateE1();
      case BddDslPackage.SCENARIO__IMPERATIVE3:
        return getImperative3();
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
      case BddDslPackage.SCENARIO__SCENARIO_NAME:
        setScenarioName((String)newValue);
        return;
      case BddDslPackage.SCENARIO__PRE_STATE_E:
        setPreStateE((DeclarativeScenarioState)newValue);
        return;
      case BddDslPackage.SCENARIO__IMPERATIVE1:
        setImperative1((ImperativeScenario)newValue);
        return;
      case BddDslPackage.SCENARIO__ACTION_E:
        setActionE((DeclarativeScenarioAction)newValue);
        return;
      case BddDslPackage.SCENARIO__IMPERATIVE2:
        setImperative2((ImperativeScenario)newValue);
        return;
      case BddDslPackage.SCENARIO__PRE_STATE_E1:
        setPreStateE1((DeclarativeScenarioState)newValue);
        return;
      case BddDslPackage.SCENARIO__IMPERATIVE3:
        setImperative3((ImperativeScenario)newValue);
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
      case BddDslPackage.SCENARIO__SCENARIO_NAME:
        setScenarioName(SCENARIO_NAME_EDEFAULT);
        return;
      case BddDslPackage.SCENARIO__PRE_STATE_E:
        setPreStateE((DeclarativeScenarioState)null);
        return;
      case BddDslPackage.SCENARIO__IMPERATIVE1:
        setImperative1((ImperativeScenario)null);
        return;
      case BddDslPackage.SCENARIO__ACTION_E:
        setActionE((DeclarativeScenarioAction)null);
        return;
      case BddDslPackage.SCENARIO__IMPERATIVE2:
        setImperative2((ImperativeScenario)null);
        return;
      case BddDslPackage.SCENARIO__PRE_STATE_E1:
        setPreStateE1((DeclarativeScenarioState)null);
        return;
      case BddDslPackage.SCENARIO__IMPERATIVE3:
        setImperative3((ImperativeScenario)null);
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
      case BddDslPackage.SCENARIO__SCENARIO_NAME:
        return SCENARIO_NAME_EDEFAULT == null ? scenarioName != null : !SCENARIO_NAME_EDEFAULT.equals(scenarioName);
      case BddDslPackage.SCENARIO__PRE_STATE_E:
        return preStateE != null;
      case BddDslPackage.SCENARIO__IMPERATIVE1:
        return imperative1 != null;
      case BddDslPackage.SCENARIO__ACTION_E:
        return actionE != null;
      case BddDslPackage.SCENARIO__IMPERATIVE2:
        return imperative2 != null;
      case BddDslPackage.SCENARIO__PRE_STATE_E1:
        return preStateE1 != null;
      case BddDslPackage.SCENARIO__IMPERATIVE3:
        return imperative3 != null;
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
    result.append(" (scenarioName: ");
    result.append(scenarioName);
    result.append(')');
    return result.toString();
  }

} //ScenarioImpl
