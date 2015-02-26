/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>simple type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.simple_type#getPrimitiveType <em>Primitive Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.simple_type#getSubrangeType <em>Subrange Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.simple_type#getEnumeratedType <em>Enumerated Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getsimple_type()
 * @model
 * @generated
 */
public interface simple_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Primitive Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primitive Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primitive Type</em>' attribute.
   * @see #setPrimitiveType(String)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getsimple_type_PrimitiveType()
   * @model
   * @generated
   */
  String getPrimitiveType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.simple_type#getPrimitiveType <em>Primitive Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primitive Type</em>' attribute.
   * @see #getPrimitiveType()
   * @generated
   */
  void setPrimitiveType(String value);

  /**
   * Returns the value of the '<em><b>Subrange Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subrange Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subrange Type</em>' containment reference.
   * @see #setSubrangeType(subrange_type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getsimple_type_SubrangeType()
   * @model containment="true"
   * @generated
   */
  subrange_type getSubrangeType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.simple_type#getSubrangeType <em>Subrange Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subrange Type</em>' containment reference.
   * @see #getSubrangeType()
   * @generated
   */
  void setSubrangeType(subrange_type value);

  /**
   * Returns the value of the '<em><b>Enumerated Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumerated Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerated Type</em>' containment reference.
   * @see #setEnumeratedType(enumerated_type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getsimple_type_EnumeratedType()
   * @model containment="true"
   * @generated
   */
  enumerated_type getEnumeratedType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.simple_type#getEnumeratedType <em>Enumerated Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumerated Type</em>' containment reference.
   * @see #getEnumeratedType()
   * @generated
   */
  void setEnumeratedType(enumerated_type value);

} // simple_type
