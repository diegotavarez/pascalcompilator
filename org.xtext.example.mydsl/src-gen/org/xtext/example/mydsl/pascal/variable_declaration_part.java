/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable declaration part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.variable_declaration_part#getVariableDeclarations <em>Variable Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariable_declaration_part()
 * @model
 * @generated
 */
public interface variable_declaration_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Variable Declarations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.variable_declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Declarations</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariable_declaration_part_VariableDeclarations()
   * @model containment="true"
   * @generated
   */
  EList<variable_declaration> getVariableDeclarations();

} // variable_declaration_part
