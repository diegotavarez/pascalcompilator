/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.case_statement;
import org.xtext.example.mydsl.pascal.conditional_statement;
import org.xtext.example.mydsl.pascal.if_statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>conditional statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.conditional_statementImpl#getIfStatement <em>If Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.conditional_statementImpl#getCaseStatement <em>Case Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class conditional_statementImpl extends structured_statementImpl implements conditional_statement
{
  /**
   * The cached value of the '{@link #getIfStatement() <em>If Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIfStatement()
   * @generated
   * @ordered
   */
  protected if_statement ifStatement;

  /**
   * The cached value of the '{@link #getCaseStatement() <em>Case Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseStatement()
   * @generated
   * @ordered
   */
  protected case_statement caseStatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected conditional_statementImpl()
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
    return PascalPackage.Literals.CONDITIONAL_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public if_statement getIfStatement()
  {
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIfStatement(if_statement newIfStatement, NotificationChain msgs)
  {
    if_statement oldIfStatement = ifStatement;
    ifStatement = newIfStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONDITIONAL_STATEMENT__IF_STATEMENT, oldIfStatement, newIfStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIfStatement(if_statement newIfStatement)
  {
    if (newIfStatement != ifStatement)
    {
      NotificationChain msgs = null;
      if (ifStatement != null)
        msgs = ((InternalEObject)ifStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONDITIONAL_STATEMENT__IF_STATEMENT, null, msgs);
      if (newIfStatement != null)
        msgs = ((InternalEObject)newIfStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONDITIONAL_STATEMENT__IF_STATEMENT, null, msgs);
      msgs = basicSetIfStatement(newIfStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONDITIONAL_STATEMENT__IF_STATEMENT, newIfStatement, newIfStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public case_statement getCaseStatement()
  {
    return caseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaseStatement(case_statement newCaseStatement, NotificationChain msgs)
  {
    case_statement oldCaseStatement = caseStatement;
    caseStatement = newCaseStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT, oldCaseStatement, newCaseStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseStatement(case_statement newCaseStatement)
  {
    if (newCaseStatement != caseStatement)
    {
      NotificationChain msgs = null;
      if (caseStatement != null)
        msgs = ((InternalEObject)caseStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT, null, msgs);
      if (newCaseStatement != null)
        msgs = ((InternalEObject)newCaseStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT, null, msgs);
      msgs = basicSetCaseStatement(newCaseStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT, newCaseStatement, newCaseStatement));
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
      case PascalPackage.CONDITIONAL_STATEMENT__IF_STATEMENT:
        return basicSetIfStatement(null, msgs);
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT:
        return basicSetCaseStatement(null, msgs);
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
      case PascalPackage.CONDITIONAL_STATEMENT__IF_STATEMENT:
        return getIfStatement();
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT:
        return getCaseStatement();
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
      case PascalPackage.CONDITIONAL_STATEMENT__IF_STATEMENT:
        setIfStatement((if_statement)newValue);
        return;
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT:
        setCaseStatement((case_statement)newValue);
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
      case PascalPackage.CONDITIONAL_STATEMENT__IF_STATEMENT:
        setIfStatement((if_statement)null);
        return;
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT:
        setCaseStatement((case_statement)null);
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
      case PascalPackage.CONDITIONAL_STATEMENT__IF_STATEMENT:
        return ifStatement != null;
      case PascalPackage.CONDITIONAL_STATEMENT__CASE_STATEMENT:
        return caseStatement != null;
    }
    return super.eIsSet(featureID);
  }

} //conditional_statementImpl
