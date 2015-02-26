/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.enumerated_type;
import org.xtext.example.mydsl.pascal.simple_type;
import org.xtext.example.mydsl.pascal.subrange_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>simple type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.simple_typeImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.simple_typeImpl#getSubrangeType <em>Subrange Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.simple_typeImpl#getEnumeratedType <em>Enumerated Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class simple_typeImpl extends MinimalEObjectImpl.Container implements simple_type
{
  /**
   * The default value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveType()
   * @generated
   * @ordered
   */
  protected static final String PRIMITIVE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveType()
   * @generated
   * @ordered
   */
  protected String primitiveType = PRIMITIVE_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubrangeType() <em>Subrange Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubrangeType()
   * @generated
   * @ordered
   */
  protected subrange_type subrangeType;

  /**
   * The cached value of the '{@link #getEnumeratedType() <em>Enumerated Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumeratedType()
   * @generated
   * @ordered
   */
  protected enumerated_type enumeratedType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected simple_typeImpl()
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
    return PascalPackage.Literals.SIMPLE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrimitiveType()
  {
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimitiveType(String newPrimitiveType)
  {
    String oldPrimitiveType = primitiveType;
    primitiveType = newPrimitiveType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__PRIMITIVE_TYPE, oldPrimitiveType, primitiveType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public subrange_type getSubrangeType()
  {
    return subrangeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubrangeType(subrange_type newSubrangeType, NotificationChain msgs)
  {
    subrange_type oldSubrangeType = subrangeType;
    subrangeType = newSubrangeType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE, oldSubrangeType, newSubrangeType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubrangeType(subrange_type newSubrangeType)
  {
    if (newSubrangeType != subrangeType)
    {
      NotificationChain msgs = null;
      if (subrangeType != null)
        msgs = ((InternalEObject)subrangeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE, null, msgs);
      if (newSubrangeType != null)
        msgs = ((InternalEObject)newSubrangeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE, null, msgs);
      msgs = basicSetSubrangeType(newSubrangeType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE, newSubrangeType, newSubrangeType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public enumerated_type getEnumeratedType()
  {
    return enumeratedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumeratedType(enumerated_type newEnumeratedType, NotificationChain msgs)
  {
    enumerated_type oldEnumeratedType = enumeratedType;
    enumeratedType = newEnumeratedType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE, oldEnumeratedType, newEnumeratedType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumeratedType(enumerated_type newEnumeratedType)
  {
    if (newEnumeratedType != enumeratedType)
    {
      NotificationChain msgs = null;
      if (enumeratedType != null)
        msgs = ((InternalEObject)enumeratedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE, null, msgs);
      if (newEnumeratedType != null)
        msgs = ((InternalEObject)newEnumeratedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE, null, msgs);
      msgs = basicSetEnumeratedType(newEnumeratedType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE, newEnumeratedType, newEnumeratedType));
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
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        return basicSetSubrangeType(null, msgs);
      case PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE:
        return basicSetEnumeratedType(null, msgs);
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
      case PascalPackage.SIMPLE_TYPE__PRIMITIVE_TYPE:
        return getPrimitiveType();
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        return getSubrangeType();
      case PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE:
        return getEnumeratedType();
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
      case PascalPackage.SIMPLE_TYPE__PRIMITIVE_TYPE:
        setPrimitiveType((String)newValue);
        return;
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        setSubrangeType((subrange_type)newValue);
        return;
      case PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE:
        setEnumeratedType((enumerated_type)newValue);
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
      case PascalPackage.SIMPLE_TYPE__PRIMITIVE_TYPE:
        setPrimitiveType(PRIMITIVE_TYPE_EDEFAULT);
        return;
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        setSubrangeType((subrange_type)null);
        return;
      case PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE:
        setEnumeratedType((enumerated_type)null);
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
      case PascalPackage.SIMPLE_TYPE__PRIMITIVE_TYPE:
        return PRIMITIVE_TYPE_EDEFAULT == null ? primitiveType != null : !PRIMITIVE_TYPE_EDEFAULT.equals(primitiveType);
      case PascalPackage.SIMPLE_TYPE__SUBRANGE_TYPE:
        return subrangeType != null;
      case PascalPackage.SIMPLE_TYPE__ENUMERATED_TYPE:
        return enumeratedType != null;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (primitiveType: ");
    result.append(primitiveType);
    result.append(')');
    return result.toString();
  }

} //simple_typeImpl
