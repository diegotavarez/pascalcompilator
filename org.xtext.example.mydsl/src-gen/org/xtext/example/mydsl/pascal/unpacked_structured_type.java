/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unpacked structured type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.unpacked_structured_type#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.unpacked_structured_type#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.unpacked_structured_type#getSetType <em>Set Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.unpacked_structured_type#getFileType <em>File Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getunpacked_structured_type()
 * @model
 * @generated
 */
public interface unpacked_structured_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Array Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Type</em>' containment reference.
   * @see #setArrayType(array_type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getunpacked_structured_type_ArrayType()
   * @model containment="true"
   * @generated
   */
  array_type getArrayType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.unpacked_structured_type#getArrayType <em>Array Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Type</em>' containment reference.
   * @see #getArrayType()
   * @generated
   */
  void setArrayType(array_type value);

  /**
   * Returns the value of the '<em><b>Record Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Type</em>' containment reference.
   * @see #setRecordType(record_type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getunpacked_structured_type_RecordType()
   * @model containment="true"
   * @generated
   */
  record_type getRecordType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.unpacked_structured_type#getRecordType <em>Record Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Type</em>' containment reference.
   * @see #getRecordType()
   * @generated
   */
  void setRecordType(record_type value);

  /**
   * Returns the value of the '<em><b>Set Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Type</em>' containment reference.
   * @see #setSetType(set_type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getunpacked_structured_type_SetType()
   * @model containment="true"
   * @generated
   */
  set_type getSetType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.unpacked_structured_type#getSetType <em>Set Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set Type</em>' containment reference.
   * @see #getSetType()
   * @generated
   */
  void setSetType(set_type value);

  /**
   * Returns the value of the '<em><b>File Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Type</em>' containment reference.
   * @see #setFileType(file_type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getunpacked_structured_type_FileType()
   * @model containment="true"
   * @generated
   */
  file_type getFileType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.unpacked_structured_type#getFileType <em>File Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Type</em>' containment reference.
   * @see #getFileType()
   * @generated
   */
  void setFileType(file_type value);

} // unpacked_structured_type
