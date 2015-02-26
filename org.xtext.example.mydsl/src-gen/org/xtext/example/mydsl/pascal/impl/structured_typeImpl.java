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
import org.xtext.example.mydsl.pascal.structured_type;
import org.xtext.example.mydsl.pascal.unpacked_structured_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>structured type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.structured_typeImpl#getUnpackedStructuredType <em>Unpacked Structured Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class structured_typeImpl extends MinimalEObjectImpl.Container implements structured_type
{
  /**
   * The cached value of the '{@link #getUnpackedStructuredType() <em>Unpacked Structured Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnpackedStructuredType()
   * @generated
   * @ordered
   */
  protected unpacked_structured_type unpackedStructuredType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected structured_typeImpl()
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
    return PascalPackage.Literals.STRUCTURED_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unpacked_structured_type getUnpackedStructuredType()
  {
    return unpackedStructuredType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnpackedStructuredType(unpacked_structured_type newUnpackedStructuredType, NotificationChain msgs)
  {
    unpacked_structured_type oldUnpackedStructuredType = unpackedStructuredType;
    unpackedStructuredType = newUnpackedStructuredType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE, oldUnpackedStructuredType, newUnpackedStructuredType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnpackedStructuredType(unpacked_structured_type newUnpackedStructuredType)
  {
    if (newUnpackedStructuredType != unpackedStructuredType)
    {
      NotificationChain msgs = null;
      if (unpackedStructuredType != null)
        msgs = ((InternalEObject)unpackedStructuredType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE, null, msgs);
      if (newUnpackedStructuredType != null)
        msgs = ((InternalEObject)newUnpackedStructuredType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE, null, msgs);
      msgs = basicSetUnpackedStructuredType(newUnpackedStructuredType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE, newUnpackedStructuredType, newUnpackedStructuredType));
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
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        return basicSetUnpackedStructuredType(null, msgs);
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
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        return getUnpackedStructuredType();
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
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        setUnpackedStructuredType((unpacked_structured_type)newValue);
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
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        setUnpackedStructuredType((unpacked_structured_type)null);
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
      case PascalPackage.STRUCTURED_TYPE__UNPACKED_STRUCTURED_TYPE:
        return unpackedStructuredType != null;
    }
    return super.eIsSet(featureID);
  }

} //structured_typeImpl
