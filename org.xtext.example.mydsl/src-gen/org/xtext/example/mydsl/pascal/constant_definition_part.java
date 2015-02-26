/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>constant definition part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.constant_definition_part#getConstantDefinitions <em>Constant Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getconstant_definition_part()
 * @model
 * @generated
 */
public interface constant_definition_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Constant Definitions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.constant_definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant Definitions</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getconstant_definition_part_ConstantDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<constant_definition> getConstantDefinitions();

} // constant_definition_part
