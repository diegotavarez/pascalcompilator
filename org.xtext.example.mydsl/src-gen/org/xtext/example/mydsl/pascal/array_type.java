/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>array type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.array_type#getSimpleTypes <em>Simple Types</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.array_type#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getarray_type()
 * @model
 * @generated
 */
public interface array_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Simple Types</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.simple_type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Types</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getarray_type_SimpleTypes()
   * @model containment="true"
   * @generated
   */
  EList<simple_type> getSimpleTypes();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getarray_type_Type()
   * @model containment="true"
   * @generated
   */
  type getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.array_type#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(type value);

} // array_type
