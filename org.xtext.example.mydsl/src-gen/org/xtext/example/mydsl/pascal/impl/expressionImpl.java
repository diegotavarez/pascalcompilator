/**
 */
package org.xtext.example.mydsl.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.expression;
import org.xtext.example.mydsl.pascal.simple_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.expressionImpl#getSimpleExpressions <em>Simple Expressions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.expressionImpl#getRelational_operators <em>Relational operators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class expressionImpl extends MinimalEObjectImpl.Container implements expression
{
  /**
   * The cached value of the '{@link #getSimpleExpressions() <em>Simple Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleExpressions()
   * @generated
   * @ordered
   */
  protected EList<simple_expression> simpleExpressions;

  /**
   * The cached value of the '{@link #getRelational_operators() <em>Relational operators</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelational_operators()
   * @generated
   * @ordered
   */
  protected EList<String> relational_operators;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected expressionImpl()
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
    return PascalPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<simple_expression> getSimpleExpressions()
  {
    if (simpleExpressions == null)
    {
      simpleExpressions = new EObjectContainmentEList<simple_expression>(simple_expression.class, this, PascalPackage.EXPRESSION__SIMPLE_EXPRESSIONS);
    }
    return simpleExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRelational_operators()
  {
    if (relational_operators == null)
    {
      relational_operators = new EDataTypeEList<String>(String.class, this, PascalPackage.EXPRESSION__RELATIONAL_OPERATORS);
    }
    return relational_operators;
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
      case PascalPackage.EXPRESSION__SIMPLE_EXPRESSIONS:
        return ((InternalEList<?>)getSimpleExpressions()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.EXPRESSION__SIMPLE_EXPRESSIONS:
        return getSimpleExpressions();
      case PascalPackage.EXPRESSION__RELATIONAL_OPERATORS:
        return getRelational_operators();
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
      case PascalPackage.EXPRESSION__SIMPLE_EXPRESSIONS:
        getSimpleExpressions().clear();
        getSimpleExpressions().addAll((Collection<? extends simple_expression>)newValue);
        return;
      case PascalPackage.EXPRESSION__RELATIONAL_OPERATORS:
        getRelational_operators().clear();
        getRelational_operators().addAll((Collection<? extends String>)newValue);
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
      case PascalPackage.EXPRESSION__SIMPLE_EXPRESSIONS:
        getSimpleExpressions().clear();
        return;
      case PascalPackage.EXPRESSION__RELATIONAL_OPERATORS:
        getRelational_operators().clear();
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
      case PascalPackage.EXPRESSION__SIMPLE_EXPRESSIONS:
        return simpleExpressions != null && !simpleExpressions.isEmpty();
      case PascalPackage.EXPRESSION__RELATIONAL_OPERATORS:
        return relational_operators != null && !relational_operators.isEmpty();
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
    result.append(" (relational_operators: ");
    result.append(relational_operators);
    result.append(')');
    return result.toString();
  }

} //expressionImpl
