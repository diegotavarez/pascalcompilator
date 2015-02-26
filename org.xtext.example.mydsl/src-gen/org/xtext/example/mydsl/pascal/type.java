/**
 */
package org.xtext.example.mydsl.pascal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.type#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.type#getStructuredType <em>Structured Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.type#getPointerType <em>Pointer Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.type#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#gettype()
 * @model
 * @generated
 */
public interface type extends type_definition
{
  /**
   * Returns the value of the '<em><b>Simple Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simple Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Type</em>' containment reference.
   * @see #setSimpleType(simple_type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#gettype_SimpleType()
   * @model containment="true"
   * @generated
   */
  simple_type getSimpleType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.type#getSimpleType <em>Simple Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Simple Type</em>' containment reference.
   * @see #getSimpleType()
   * @generated
   */
  void setSimpleType(simple_type value);

  /**
   * Returns the value of the '<em><b>Structured Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structured Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structured Type</em>' containment reference.
   * @see #setStructuredType(structured_type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#gettype_StructuredType()
   * @model containment="true"
   * @generated
   */
  structured_type getStructuredType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.type#getStructuredType <em>Structured Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Structured Type</em>' containment reference.
   * @see #getStructuredType()
   * @generated
   */
  void setStructuredType(structured_type value);

  /**
   * Returns the value of the '<em><b>Pointer Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointer Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointer Type</em>' containment reference.
   * @see #setPointerType(pointer_type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#gettype_PointerType()
   * @model containment="true"
   * @generated
   */
  pointer_type getPointerType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.type#getPointerType <em>Pointer Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointer Type</em>' containment reference.
   * @see #getPointerType()
   * @generated
   */
  void setPointerType(pointer_type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#gettype_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.type#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // type
