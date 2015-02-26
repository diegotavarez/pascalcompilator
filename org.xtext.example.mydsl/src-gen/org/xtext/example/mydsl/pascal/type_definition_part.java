/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type definition part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.type_definition_part#getTypeDefinitions <em>Type Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#gettype_definition_part()
 * @model
 * @generated
 */
public interface type_definition_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Definitions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.type_definition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Definitions</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#gettype_definition_part_TypeDefinitions()
   * @model containment="true"
   * @generated
   */
  EList<type_definition> getTypeDefinitions();

} // type_definition_part
