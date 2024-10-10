/**
 * generated by Xtext 2.37.0.M0
 */
package dk.sdu.bdd.xtext.bddDsl.impl;

import dk.sdu.bdd.xtext.bddDsl.BddDslPackage;
import dk.sdu.bdd.xtext.bddDsl.PropertyDef;
import dk.sdu.bdd.xtext.bddDsl.PropertyRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.PropertyRefImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link dk.sdu.bdd.xtext.bddDsl.impl.PropertyRefImpl#getPropertyValue <em>Property Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyRefImpl extends MinimalEObjectImpl.Container implements PropertyRef
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected PropertyDef property;

  /**
   * The default value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyValue()
   * @generated
   * @ordered
   */
  protected static final String PROPERTY_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPropertyValue()
   * @generated
   * @ordered
   */
  protected String propertyValue = PROPERTY_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyRefImpl()
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
    return BddDslPackage.Literals.PROPERTY_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyDef getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (PropertyDef)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BddDslPackage.PROPERTY_REF__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDef basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProperty(PropertyDef newProperty)
  {
    PropertyDef oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.PROPERTY_REF__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPropertyValue()
  {
    return propertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPropertyValue(String newPropertyValue)
  {
    String oldPropertyValue = propertyValue;
    propertyValue = newPropertyValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BddDslPackage.PROPERTY_REF__PROPERTY_VALUE, oldPropertyValue, propertyValue));
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
      case BddDslPackage.PROPERTY_REF__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case BddDslPackage.PROPERTY_REF__PROPERTY_VALUE:
        return getPropertyValue();
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
      case BddDslPackage.PROPERTY_REF__PROPERTY:
        setProperty((PropertyDef)newValue);
        return;
      case BddDslPackage.PROPERTY_REF__PROPERTY_VALUE:
        setPropertyValue((String)newValue);
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
      case BddDslPackage.PROPERTY_REF__PROPERTY:
        setProperty((PropertyDef)null);
        return;
      case BddDslPackage.PROPERTY_REF__PROPERTY_VALUE:
        setPropertyValue(PROPERTY_VALUE_EDEFAULT);
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
      case BddDslPackage.PROPERTY_REF__PROPERTY:
        return property != null;
      case BddDslPackage.PROPERTY_REF__PROPERTY_VALUE:
        return PROPERTY_VALUE_EDEFAULT == null ? propertyValue != null : !PROPERTY_VALUE_EDEFAULT.equals(propertyValue);
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
    result.append(" (propertyValue: ");
    result.append(propertyValue);
    result.append(')');
    return result.toString();
  }

} //PropertyRefImpl
