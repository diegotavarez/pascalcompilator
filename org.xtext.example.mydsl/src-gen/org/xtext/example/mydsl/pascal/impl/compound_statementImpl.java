/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.compound_statement;
import org.xtext.example.mydsl.pascal.statement_sequence;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>compound statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.compound_statementImpl#getStatementSequence <em>Statement Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class compound_statementImpl extends structured_statementImpl implements compound_statement
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected compound_statementImpl()
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
    return PascalPackage.Literals.COMPOUND_STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.COMPOUND_STATEMENT__STATEMENT_SEQUENCE, oldStatementSequence, newStatementSequence);
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
        msgs = ((InternalEObject)statementSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.COMPOUND_STATEMENT__STATEMENT_SEQUENCE, null, msgs);
      if (newStatementSequence != null)
        msgs = ((InternalEObject)newStatementSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.COMPOUND_STATEMENT__STATEMENT_SEQUENCE, null, msgs);
      msgs = basicSetStatementSequence(newStatementSequence, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.COMPOUND_STATEMENT__STATEMENT_SEQUENCE, newStatementSequence, newStatementSequence));
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
      case PascalPackage.COMPOUND_STATEMENT__STATEMENT_SEQUENCE:
        return basicSetStatementSequence(null, msgs);
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
      case PascalPackage.COMPOUND_STATEMENT__STATEMENT_SEQUENCE:
        return getStatementSequence();
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
      case PascalPackage.COMPOUND_STATEMENT__STATEMENT_SEQUENCE:
        setStatementSequence((statement_sequence)newValue);
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
      case PascalPackage.COMPOUND_STATEMENT__STATEMENT_SEQUENCE:
        setStatementSequence((statement_sequence)null);
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
      case PascalPackage.COMPOUND_STATEMENT__STATEMENT_SEQUENCE:
        return statementSequence != null;
    }
    return super.eIsSet(featureID);
  }

} //compound_statementImpl
