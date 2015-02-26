/**
 */
package org.xtext.example.mydsl.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.array_type;
import org.xtext.example.mydsl.pascal.simple_type;
import org.xtext.example.mydsl.pascal.type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>array type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.array_typeImpl#getSimpleTypes <em>Simple Types</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.array_typeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class array_typeImpl extends MinimalEObjectImpl.Container implements array_type
{
  /**
   * The cached value of the '{@link #getSimpleTypes() <em>Simple Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleTypes()
   * @generated
   * @ordered
   */
  protected EList<simple_type> simpleTypes;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected type type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected array_typeImpl()
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
    return PascalPackage.Literals.ARRAY_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<simple_type> getSimpleTypes()
  {
    if (simpleTypes == null)
    {
      simpleTypes = new EObjectContainmentEList<simple_type>(simple_type.class, this, PascalPackage.ARRAY_TYPE__SIMPLE_TYPES);
    }
    return simpleTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(type newType, NotificationChain msgs)
  {
    type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.ARRAY_TYPE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.ARRAY_TYPE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.ARRAY_TYPE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.ARRAY_TYPE__TYPE, newType, newType));
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
      case PascalPackage.ARRAY_TYPE__SIMPLE_TYPES:
        return ((InternalEList<?>)getSimpleTypes()).basicRemove(otherEnd, msgs);
      case PascalPackage.ARRAY_TYPE__TYPE:
        return basicSetType(null, msgs);
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
      case PascalPackage.ARRAY_TYPE__SIMPLE_TYPES:
        return getSimpleTypes();
      case PascalPackage.ARRAY_TYPE__TYPE:
        return getType();
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
      case PascalPackage.ARRAY_TYPE__SIMPLE_TYPES:
        getSimpleTypes().clear();
        getSimpleTypes().addAll((Collection<? extends simple_type>)newValue);
        return;
      case PascalPackage.ARRAY_TYPE__TYPE:
        setType((type)newValue);
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
      case PascalPackage.ARRAY_TYPE__SIMPLE_TYPES:
        getSimpleTypes().clear();
        return;
      case PascalPackage.ARRAY_TYPE__TYPE:
        setType((type)null);
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
      case PascalPackage.ARRAY_TYPE__SIMPLE_TYPES:
        return simpleTypes != null && !simpleTypes.isEmpty();
      case PascalPackage.ARRAY_TYPE__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //array_typeImpl
