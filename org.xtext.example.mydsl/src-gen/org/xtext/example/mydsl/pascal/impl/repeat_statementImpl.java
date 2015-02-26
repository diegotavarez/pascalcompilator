/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.expression;
import org.xtext.example.mydsl.pascal.repeat_statement;
import org.xtext.example.mydsl.pascal.statement_sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>repeat statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.repeat_statementImpl#getStatementSequence <em>Statement Sequence</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.repeat_statementImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class repeat_statementImpl extends repetitive_statementImpl implements repeat_statement
{
  /**
   * The cached value of the '{@link #getStatementSequence() <em>Statement Sequence</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementSequence()
   * @generated
   * @ordered
   */
  protected statement_sequence statementSequence;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected repeat_statementImpl()
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
    return PascalPackage.Literals.REPEAT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_sequence getStatementSequence()
  {
    return statementSequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatementSequence(statement_sequence newStatementSequence, NotificationChain msgs)
  {
    statement_sequence oldStatementSequence = statementSequence;
    statementSequence = newStatementSequence;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.REPEAT_STATEMENT__STATEMENT_SEQUENCE, oldStatementSequence, newStatementSequence);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementSequence(statement_sequence newStatementSequence)
  {
    if (newStatementSequence != statementSequence)
    {
      NotificationChain msgs = null;
      if (statementSequence != null)
        msgs = ((InternalEObject)statementSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPEAT_STATEMENT__STATEMENT_SEQUENCE, null, msgs);
      if (newStatementSequence != null)
        msgs = ((InternalEObject)newStatementSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPEAT_STATEMENT__STATEMENT_SEQUENCE, null, msgs);
      msgs = basicSetStatementSequence(newStatementSequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REPEAT_STATEMENT__STATEMENT_SEQUENCE, newStatementSequence, newStatementSequence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(expression newExpression, NotificationChain msgs)
  {
    expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.REPEAT_STATEMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPEAT_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.REPEAT_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.REPEAT_STATEMENT__EXPRESSION, newExpression, newExpression));
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
      case PascalPackage.REPEAT_STATEMENT__STATEMENT_SEQUENCE:
        return basicSetStatementSequence(null, msgs);
      case PascalPackage.REPEAT_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case PascalPackage.REPEAT_STATEMENT__STATEMENT_SEQUENCE:
        return getStatementSequence();
      case PascalPackage.REPEAT_STATEMENT__EXPRESSION:
        return getExpression();
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
      case PascalPackage.REPEAT_STATEMENT__STATEMENT_SEQUENCE:
        setStatementSequence((statement_sequence)newValue);
        return;
      case PascalPackage.REPEAT_STATEMENT__EXPRESSION:
        setExpression((expression)newValue);
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
      case PascalPackage.REPEAT_STATEMENT__STATEMENT_SEQUENCE:
        setStatementSequence((statement_sequence)null);
        return;
      case PascalPackage.REPEAT_STATEMENT__EXPRESSION:
        setExpression((expression)null);
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
      case PascalPackage.REPEAT_STATEMENT__STATEMENT_SEQUENCE:
        return statementSequence != null;
      case PascalPackage.REPEAT_STATEMENT__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //repeat_statementImpl
