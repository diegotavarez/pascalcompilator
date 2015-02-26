/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pascal.DeclarationPart;
import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.block;
import org.xtext.example.mydsl.pascal.statement_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.blockImpl#getDeclarationPart <em>Declaration Part</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.blockImpl#getStatementPart <em>Statement Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class blockImpl extends MinimalEObjectImpl.Container implements block
{
  /**
   * The cached value of the '{@link #getDeclarationPart() <em>Declaration Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarationPart()
   * @generated
   * @ordered
   */
  protected DeclarationPart declarationPart;

  /**
   * The cached value of the '{@link #getStatementPart() <em>Statement Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementPart()
   * @generated
   * @ordered
   */
  protected statement_part statementPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected blockImpl()
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
    return PascalPackage.Literals.BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclarationPart getDeclarationPart()
  {
    return declarationPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclarationPart(DeclarationPart newDeclarationPart, NotificationChain msgs)
  {
    DeclarationPart oldDeclarationPart = declarationPart;
    declarationPart = newDeclarationPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__DECLARATION_PART, oldDeclarationPart, newDeclarationPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclarationPart(DeclarationPart newDeclarationPart)
  {
    if (newDeclarationPart != declarationPart)
    {
      NotificationChain msgs = null;
      if (declarationPart != null)
        msgs = ((InternalEObject)declarationPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__DECLARATION_PART, null, msgs);
      if (newDeclarationPart != null)
        msgs = ((InternalEObject)newDeclarationPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__DECLARATION_PART, null, msgs);
      msgs = basicSetDeclarationPart(newDeclarationPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__DECLARATION_PART, newDeclarationPart, newDeclarationPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement_part getStatementPart()
  {
    return statementPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatementPart(statement_part newStatementPart, NotificationChain msgs)
  {
    statement_part oldStatementPart = statementPart;
    statementPart = newStatementPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__STATEMENT_PART, oldStatementPart, newStatementPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatementPart(statement_part newStatementPart)
  {
    if (newStatementPart != statementPart)
    {
      NotificationChain msgs = null;
      if (statementPart != null)
        msgs = ((InternalEObject)statementPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__STATEMENT_PART, null, msgs);
      if (newStatementPart != null)
        msgs = ((InternalEObject)newStatementPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.BLOCK__STATEMENT_PART, null, msgs);
      msgs = basicSetStatementPart(newStatementPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.BLOCK__STATEMENT_PART, newStatementPart, newStatementPart));
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
      case PascalPackage.BLOCK__DECLARATION_PART:
        return basicSetDeclarationPart(null, msgs);
      case PascalPackage.BLOCK__STATEMENT_PART:
        return basicSetStatementPart(null, msgs);
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
      case PascalPackage.BLOCK__DECLARATION_PART:
        return getDeclarationPart();
      case PascalPackage.BLOCK__STATEMENT_PART:
        return getStatementPart();
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
      case PascalPackage.BLOCK__DECLARATION_PART:
        setDeclarationPart((DeclarationPart)newValue);
        return;
      case PascalPackage.BLOCK__STATEMENT_PART:
        setStatementPart((statement_part)newValue);
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
      case PascalPackage.BLOCK__DECLARATION_PART:
        setDeclarationPart((DeclarationPart)null);
        return;
      case PascalPackage.BLOCK__STATEMENT_PART:
        setStatementPart((statement_part)null);
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
      case PascalPackage.BLOCK__DECLARATION_PART:
        return declarationPart != null;
      case PascalPackage.BLOCK__STATEMENT_PART:
        return statementPart != null;
    }
    return super.eIsSet(featureID);
  }

} //blockImpl
