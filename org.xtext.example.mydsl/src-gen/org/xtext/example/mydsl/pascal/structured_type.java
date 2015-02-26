/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>structured type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.structured_type#getUnpackedStructuredType <em>Unpacked Structured Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getstructured_type()
 * @model
 * @generated
 */
public interface structured_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Unpacked Structured Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unpacked Structured Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unpacked Structured Type</em>' containment reference.
   * @see #setUnpackedStructuredType(unpacked_structured_type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getstructured_type_UnpackedStructuredType()
   * @model containment="true"
   * @generated
   */
  unpacked_structured_type getUnpackedStructuredType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.structured_type#getUnpackedStructuredType <em>Unpacked Structured Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unpacked Structured Type</em>' containment reference.
   * @see #getUnpackedStructuredType()
   * @generated
   */
  void setUnpackedStructuredType(unpacked_structured_type value);

} // structured_type
