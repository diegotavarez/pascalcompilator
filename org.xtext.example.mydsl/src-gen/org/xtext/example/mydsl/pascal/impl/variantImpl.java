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
import org.xtext.example.mydsl.pascal.case_label_list;
import org.xtext.example.mydsl.pascal.field_list;
import org.xtext.example.mydsl.pascal.variant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.variantImpl#getCaseLabelList <em>Case Label List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.variantImpl#getFieldList <em>Field List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class variantImpl extends MinimalEObjectImpl.Container implements variant
{
  /**
   * The cached value of the '{@link #getCaseLabelList() <em>Case Label List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseLabelList()
   * @generated
   * @ordered
   */
  protected case_label_list caseLabelList;

  /**
   * The cached value of the '{@link #getFieldList() <em>Field List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldList()
   * @generated
   * @ordered
   */
  protected field_list fieldList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variantImpl()
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
    return PascalPackage.Literals.VARIANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public case_label_list getCaseLabelList()
  {
    return caseLabelList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaseLabelList(case_label_list newCaseLabelList, NotificationChain msgs)
  {
    case_label_list oldCaseLabelList = caseLabelList;
    caseLabelList = newCaseLabelList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT__CASE_LABEL_LIST, oldCaseLabelList, newCaseLabelList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseLabelList(case_label_list newCaseLabelList)
  {
    if (newCaseLabelList != caseLabelList)
    {
      NotificationChain msgs = null;
      if (caseLabelList != null)
        msgs = ((InternalEObject)caseLabelList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT__CASE_LABEL_LIST, null, msgs);
      if (newCaseLabelList != null)
        msgs = ((InternalEObject)newCaseLabelList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT__CASE_LABEL_LIST, null, msgs);
      msgs = basicSetCaseLabelList(newCaseLabelList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT__CASE_LABEL_LIST, newCaseLabelList, newCaseLabelList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public field_list getFieldList()
  {
    return fieldList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFieldList(field_list newFieldList, NotificationChain msgs)
  {
    field_list oldFieldList = fieldList;
    fieldList = newFieldList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT__FIELD_LIST, oldFieldList, newFieldList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldList(field_list newFieldList)
  {
    if (newFieldList != fieldList)
    {
      NotificationChain msgs = null;
      if (fieldList != null)
        msgs = ((InternalEObject)fieldList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT__FIELD_LIST, null, msgs);
      if (newFieldList != null)
        msgs = ((InternalEObject)newFieldList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIANT__FIELD_LIST, null, msgs);
      msgs = basicSetFieldList(newFieldList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIANT__FIELD_LIST, newFieldList, newFieldList));
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
      case PascalPackage.VARIANT__CASE_LABEL_LIST:
        return basicSetCaseLabelList(null, msgs);
      case PascalPackage.VARIANT__FIELD_LIST:
        return basicSetFieldList(null, msgs);
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
      case PascalPackage.VARIANT__CASE_LABEL_LIST:
        return getCaseLabelList();
      case PascalPackage.VARIANT__FIELD_LIST:
        return getFieldList();
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
      case PascalPackage.VARIANT__CASE_LABEL_LIST:
        setCaseLabelList((case_label_list)newValue);
        return;
      case PascalPackage.VARIANT__FIELD_LIST:
        setFieldList((field_list)newValue);
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
      case PascalPackage.VARIANT__CASE_LABEL_LIST:
        setCaseLabelList((case_label_list)null);
        return;
      case PascalPackage.VARIANT__FIELD_LIST:
        setFieldList((field_list)null);
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
      case PascalPackage.VARIANT__CASE_LABEL_LIST:
        return caseLabelList != null;
      case PascalPackage.VARIANT__FIELD_LIST:
        return fieldList != null;
    }
    return super.eIsSet(featureID);
  }

} //variantImpl
