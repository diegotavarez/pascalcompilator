/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>procedure and function declaration part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.procedure_and_function_declaration_part#getProcedureDeclarations <em>Procedure Declarations</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.procedure_and_function_declaration_part#getFunctionDeclarations <em>Function Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedure_and_function_declaration_part()
 * @model
 * @generated
 */
public interface procedure_and_function_declaration_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Procedure Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.procedure_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure Declarations</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedure_and_function_declaration_part_ProcedureDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<procedure_declaration> getProcedureDeclarations();

  /**
   * Returns the value of the '<em><b>Function Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.function_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Declarations</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedure_and_function_declaration_part_FunctionDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<function_declaration> getFunctionDeclarations();

} // procedure_and_function_declaration_part
