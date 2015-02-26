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
import org.xtext.example.mydsl.pascal.function_declaration;
import org.xtext.example.mydsl.pascal.procedure_and_function_declaration_part;
import org.xtext.example.mydsl.pascal.procedure_declaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>procedure and function declaration part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.procedure_and_function_declaration_partImpl#getProcedureDeclarations <em>Procedure Declarations</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.procedure_and_function_declaration_partImpl#getFunctionDeclarations <em>Function Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class procedure_and_function_declaration_partImpl extends MinimalEObjectImpl.Container implements procedure_and_function_declaration_part
{
  /**
   * The cached value of the '{@link #getProcedureDeclarations() <em>Procedure Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedureDeclarations()
   * @generated
   * @ordered
   */
  protected EList<procedure_declaration> procedureDeclarations;

  /**
   * The cached value of the '{@link #getFunctionDeclarations() <em>Function Declarations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionDeclarations()
   * @generated
   * @ordered
   */
  protected EList<function_declaration> functionDeclarations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected procedure_and_function_declaration_partImpl()
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
    return PascalPackage.Literals.PROCEDURE_AND_FUNCTION_DECLARATION_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<procedure_declaration> getProcedureDeclarations()
  {
    if (procedureDeclarations == null)
    {
      procedureDeclarations = new EObjectContainmentEList<procedure_declaration>(procedure_declaration.class, this, PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURE_DECLARATIONS);
    }
    return procedureDeclarations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<function_declaration> getFunctionDeclarations()
  {
    if (functionDeclarations == null)
    {
      functionDeclarations = new EObjectContainmentEList<function_declaration>(function_declaration.class, this, PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTION_DECLARATIONS);
    }
    return functionDeclarations;
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
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURE_DECLARATIONS:
        return ((InternalEList<?>)getProcedureDeclarations()).basicRemove(otherEnd, msgs);
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTION_DECLARATIONS:
        return ((InternalEList<?>)getFunctionDeclarations()).basicRemove(otherEnd, msgs);
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
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURE_DECLARATIONS:
        return getProcedureDeclarations();
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTION_DECLARATIONS:
        return getFunctionDeclarations();
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
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURE_DECLARATIONS:
        getProcedureDeclarations().clear();
        getProcedureDeclarations().addAll((Collection<? extends procedure_declaration>)newValue);
        return;
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTION_DECLARATIONS:
        getFunctionDeclarations().clear();
        getFunctionDeclarations().addAll((Collection<? extends function_declaration>)newValue);
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
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURE_DECLARATIONS:
        getProcedureDeclarations().clear();
        return;
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTION_DECLARATIONS:
        getFunctionDeclarations().clear();
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
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__PROCEDURE_DECLARATIONS:
        return procedureDeclarations != null && !procedureDeclarations.isEmpty();
      case PascalPackage.PROCEDURE_AND_FUNCTION_DECLARATION_PART__FUNCTION_DECLARATIONS:
        return functionDeclarations != null && !functionDeclarations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //procedure_and_function_declaration_partImpl
