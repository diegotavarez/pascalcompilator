/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pascal.ExpressionList;
import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.Variable1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.Variable1Impl#getExpressionList <em>Expression List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.Variable1Impl#getVariable1 <em>Variable1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.Variable1Impl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Variable1Impl extends MinimalEObjectImpl.Container implements Variable1
{
  /**
   * The cached value of the '{@link #getExpressionList() <em>Expression List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressionList()
   * @generated
   * @ordered
   */
  protected ExpressionList expressionList;

  /**
   * The cached value of the '{@link #getVariable1() <em>Variable1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable1()
   * @generated
   * @ordered
   */
  protected Variable1 variable1;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Variable1Impl()
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
    return PascalPackage.Literals.VARIABLE1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionList getExpressionList()
  {
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpressionList(ExpressionList newExpressionList, NotificationChain msgs)
  {
    ExpressionList oldExpressionList = expressionList;
    expressionList = newExpressionList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIABLE1__EXPRESSION_LIST, oldExpressionList, newExpressionList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpressionList(ExpressionList newExpressionList)
  {
    if (newExpressionList != expressionList)
    {
      NotificationChain msgs = null;
      if (expressionList != null)
        msgs = ((InternalEObject)expressionList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIABLE1__EXPRESSION_LIST, null, msgs);
      if (newExpressionList != null)
        msgs = ((InternalEObject)newExpressionList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIABLE1__EXPRESSION_LIST, null, msgs);
      msgs = basicSetExpressionList(newExpressionList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIABLE1__EXPRESSION_LIST, newExpressionList, newExpressionList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable1 getVariable1()
  {
    return variable1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable1(Variable1 newVariable1, NotificationChain msgs)
  {
    Variable1 oldVariable1 = variable1;
    variable1 = newVariable1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.VARIABLE1__VARIABLE1, oldVariable1, newVariable1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable1(Variable1 newVariable1)
  {
    if (newVariable1 != variable1)
    {
      NotificationChain msgs = null;
      if (variable1 != null)
        msgs = ((InternalEObject)variable1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIABLE1__VARIABLE1, null, msgs);
      if (newVariable1 != null)
        msgs = ((InternalEObject)newVariable1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.VARIABLE1__VARIABLE1, null, msgs);
      msgs = basicSetVariable1(newVariable1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIABLE1__VARIABLE1, newVariable1, newVariable1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.VARIABLE1__NAME, oldName, name));
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
      case PascalPackage.VARIABLE1__EXPRESSION_LIST:
        return basicSetExpressionList(null, msgs);
      case PascalPackage.VARIABLE1__VARIABLE1:
        return basicSetVariable1(null, msgs);
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
      case PascalPackage.VARIABLE1__EXPRESSION_LIST:
        return getExpressionList();
      case PascalPackage.VARIABLE1__VARIABLE1:
        return getVariable1();
      case PascalPackage.VARIABLE1__NAME:
        return getName();
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
      case PascalPackage.VARIABLE1__EXPRESSION_LIST:
        setExpressionList((ExpressionList)newValue);
        return;
      case PascalPackage.VARIABLE1__VARIABLE1:
        setVariable1((Variable1)newValue);
        return;
      case PascalPackage.VARIABLE1__NAME:
        setName((String)newValue);
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
      case PascalPackage.VARIABLE1__EXPRESSION_LIST:
        setExpressionList((ExpressionList)null);
        return;
      case PascalPackage.VARIABLE1__VARIABLE1:
        setVariable1((Variable1)null);
        return;
      case PascalPackage.VARIABLE1__NAME:
        setName(NAME_EDEFAULT);
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
      case PascalPackage.VARIABLE1__EXPRESSION_LIST:
        return expressionList != null;
      case PascalPackage.VARIABLE1__VARIABLE1:
        return variable1 != null;
      case PascalPackage.VARIABLE1__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //Variable1Impl
