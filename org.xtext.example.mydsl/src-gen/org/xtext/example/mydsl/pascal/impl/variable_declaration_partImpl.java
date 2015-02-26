/**
 */
package org.xtext.example.mydsl.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.variable_declaration;
import org.xtext.example.mydsl.pascal.variable_declaration_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>variable declaration part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.variable_declaration_partImpl#getVariableDeclarations <em>Variable Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class variable_declaration_partImpl extends MinimalEObjectImpl.Container implements variable_declaration_part
{
  /**
   * The cached value of the '{@link #getVariableDeclarations() <em>Variable Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableDeclarations()
   * @generated
   * @ordered
   */
  protected EList<variable_declaration> variableDeclarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected variable_declaration_partImpl()
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
    return PascalPackage.Literals.VARIABLE_DECLARATION_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<variable_declaration> getVariableDeclarations()
  {
    if (variableDeclarations == null)
    {
      variableDeclarations = new EObjectContainmentEList<variable_declaration>(variable_declaration.class, this, PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATIONS);
    }
    return variableDeclarations;
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
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATIONS:
        return ((InternalEList<?>)getVariableDeclarations()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATIONS:
        return getVariableDeclarations();
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
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATIONS:
        getVariableDeclarations().clear();
        getVariableDeclarations().addAll((Collection<? extends variable_declaration>)newValue);
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
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATIONS:
        getVariableDeclarations().clear();
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
      case PascalPackage.VARIABLE_DECLARATION_PART__VARIABLE_DECLARATIONS:
        return variableDeclarations != null && !variableDeclarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //variable_declaration_partImpl
