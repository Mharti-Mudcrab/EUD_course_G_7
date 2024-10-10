/**
 * generated by Xtext 2.37.0.M0
 */
package dk.sdu.bdd.xtext.bddDsl.impl;

import dk.sdu.bdd.xtext.bddDsl.BddDslPackage;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeScenarioState;
import dk.sdu.bdd.xtext.bddDsl.DeclarativeScenarioStateAnd;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declarative Scenario State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.DeclarativeScenarioStateImpl#getStates <em>States</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.DeclarativeScenarioStateImpl#getAndStates <em>And States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarativeScenarioStateImpl extends MinimalEObjectImpl.Container implements DeclarativeScenarioState
{
  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<EObject> states;

  /**
   * The cached value of the '{@link #getAndStates() <em>And States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAndStates()
   * @generated
   * @ordered
   */
  protected EList<DeclarativeScenarioStateAnd> andStates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarativeScenarioStateImpl()
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
    return BddDslPackage.Literals.DECLARATIVE_SCENARIO_STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EObject> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<EObject>(EObject.class, this, BddDslPackage.DECLARATIVE_SCENARIO_STATE__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DeclarativeScenarioStateAnd> getAndStates()
  {
    if (andStates == null)
    {
      andStates = new EObjectContainmentEList<DeclarativeScenarioStateAnd>(DeclarativeScenarioStateAnd.class, this, BddDslPackage.DECLARATIVE_SCENARIO_STATE__AND_STATES);
    }
    return andStates;
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
      case BddDslPackage.DECLARATIVE_SCENARIO_STATE__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
      case BddDslPackage.DECLARATIVE_SCENARIO_STATE__AND_STATES:
        return ((InternalEList<?>)getAndStates()).basicRemove(otherEnd, msgs);
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
      case BddDslPackage.DECLARATIVE_SCENARIO_STATE__STATES:
        return getStates();
      case BddDslPackage.DECLARATIVE_SCENARIO_STATE__AND_STATES:
        return getAndStates();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BddDslPackage.DECLARATIVE_SCENARIO_STATE__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends EObject>)newValue);
        return;
      case BddDslPackage.DECLARATIVE_SCENARIO_STATE__AND_STATES:
        getAndStates().clear();
        getAndStates().addAll((Collection<? extends DeclarativeScenarioStateAnd>)newValue);
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
      case BddDslPackage.DECLARATIVE_SCENARIO_STATE__STATES:
        getStates().clear();
        return;
      case BddDslPackage.DECLARATIVE_SCENARIO_STATE__AND_STATES:
        getAndStates().clear();
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
      case BddDslPackage.DECLARATIVE_SCENARIO_STATE__STATES:
        return states != null && !states.isEmpty();
      case BddDslPackage.DECLARATIVE_SCENARIO_STATE__AND_STATES:
        return andStates != null && !andStates.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DeclarativeScenarioStateImpl
