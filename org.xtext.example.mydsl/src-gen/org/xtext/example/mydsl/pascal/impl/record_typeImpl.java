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
import org.xtext.example.mydsl.pascal.field_list;
import org.xtext.example.mydsl.pascal.record_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>record type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.record_typeImpl#getFieldlist <em>Fieldlist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class record_typeImpl extends MinimalEObjectImpl.Container implements record_type
{
  /**
   * The cached value of the '{@link #getFieldlist() <em>Fieldlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldlist()
   * @generated
   * @ordered
   */
  protected field_list fieldlist;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected record_typeImpl()
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
    return PascalPackage.Literals.RECORD_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public field_list getFieldlist()
  {
    return fieldlist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFieldlist(field_list newFieldlist, NotificationChain msgs)
  {
    field_list oldFieldlist = fieldlist;
    fieldlist = newFieldlist;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_TYPE__FIELDLIST, oldFieldlist, newFieldlist);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldlist(field_list newFieldlist)
  {
    if (newFieldlist != fieldlist)
    {
      NotificationChain msgs = null;
      if (fieldlist != null)
        msgs = ((InternalEObject)fieldlist).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RECORD_TYPE__FIELDLIST, null, msgs);
      if (newFieldlist != null)
        msgs = ((InternalEObject)newFieldlist).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.RECORD_TYPE__FIELDLIST, null, msgs);
      msgs = basicSetFieldlist(newFieldlist, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.RECORD_TYPE__FIELDLIST, newFieldlist, newFieldlist));
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
      case PascalPackage.RECORD_TYPE__FIELDLIST:
        return basicSetFieldlist(null, msgs);
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
      case PascalPackage.RECORD_TYPE__FIELDLIST:
        return getFieldlist();
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
      case PascalPackage.RECORD_TYPE__FIELDLIST:
        setFieldlist((field_list)newValue);
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
      case PascalPackage.RECORD_TYPE__FIELDLIST:
        setFieldlist((field_list)null);
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
      case PascalPackage.RECORD_TYPE__FIELDLIST:
        return fieldlist != null;
    }
    return super.eIsSet(featureID);
  }

} //record_typeImpl
