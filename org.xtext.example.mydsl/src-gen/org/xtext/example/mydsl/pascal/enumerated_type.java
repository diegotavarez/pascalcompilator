/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>enumerated type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.enumerated_type#getIdentifierList <em>Identifier List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getenumerated_type()
 * @model
 * @generated
 */
public interface enumerated_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier List</em>' containment reference.
   * @see #setIdentifierList(identifier_list)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getenumerated_type_IdentifierList()
   * @model containment="true"
   * @generated
   */
  identifier_list getIdentifierList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.enumerated_type#getIdentifierList <em>Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier List</em>' containment reference.
   * @see #getIdentifierList()
   * @generated
   */
  void setIdentifierList(identifier_list value);

} // enumerated_type
