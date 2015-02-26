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
import org.xtext.example.mydsl.pascal.case_limb;
import org.xtext.example.mydsl.pascal.statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>case limb</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.case_limbImpl#getCaseLabelList <em>Case Label List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.case_limbImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class case_limbImpl extends MinimalEObjectImpl.Container implements case_limb
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
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected statement statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected case_limbImpl()
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
    return PascalPackage.Literals.CASE_LIMB;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CASE_LIMB__CASE_LABEL_LIST, oldCaseLabelList, newCaseLabelList);
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
        msgs = ((InternalEObject)caseLabelList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CASE_LIMB__CASE_LABEL_LIST, null, msgs);
      if (newCaseLabelList != null)
        msgs = ((InternalEObject)newCaseLabelList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CASE_LIMB__CASE_LABEL_LIST, null, msgs);
      msgs = basicSetCaseLabelList(newCaseLabelList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CASE_LIMB__CASE_LABEL_LIST, newCaseLabelList, newCaseLabelList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(statement newStatement, NotificationChain msgs)
  {
    statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CASE_LIMB__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CASE_LIMB__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CASE_LIMB__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CASE_LIMB__STATEMENT, newStatement, newStatement));
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
      case PascalPackage.CASE_LIMB__CASE_LABEL_LIST:
        return basicSetCaseLabelList(null, msgs);
      case PascalPackage.CASE_LIMB__STATEMENT:
        return basicSetStatement(null, msgs);
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
      case PascalPackage.CASE_LIMB__CASE_LABEL_LIST:
        return getCaseLabelList();
      case PascalPackage.CASE_LIMB__STATEMENT:
        return getStatement();
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
      case PascalPackage.CASE_LIMB__CASE_LABEL_LIST:
        setCaseLabelList((case_label_list)newValue);
        return;
      case PascalPackage.CASE_LIMB__STATEMENT:
        setStatement((statement)newValue);
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
      case PascalPackage.CASE_LIMB__CASE_LABEL_LIST:
        setCaseLabelList((case_label_list)null);
        return;
      case PascalPackage.CASE_LIMB__STATEMENT:
        setStatement((statement)null);
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
      case PascalPackage.CASE_LIMB__CASE_LABEL_LIST:
        return caseLabelList != null;
      case PascalPackage.CASE_LIMB__STATEMENT:
        return statement != null;
    }
    return super.eIsSet(featureID);
  }

} //case_limbImpl
