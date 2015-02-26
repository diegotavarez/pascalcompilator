/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.variant#getCaseLabelList <em>Case Label List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.variant#getFieldList <em>Field List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariant()
 * @model
 * @generated
 */
public interface variant extends EObject
{
  /**
   * Returns the value of the '<em><b>Case Label List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case Label List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Label List</em>' containment reference.
   * @see #setCaseLabelList(case_label_list)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariant_CaseLabelList()
   * @model containment="true"
   * @generated
   */
  case_label_list getCaseLabelList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.variant#getCaseLabelList <em>Case Label List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Label List</em>' containment reference.
   * @see #getCaseLabelList()
   * @generated
   */
  void setCaseLabelList(case_label_list value);

  /**
   * Returns the value of the '<em><b>Field List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field List</em>' containment reference.
   * @see #setFieldList(field_list)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariant_FieldList()
   * @model containment="true"
   * @generated
   */
  field_list getFieldList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.variant#getFieldList <em>Field List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field List</em>' containment reference.
   * @see #getFieldList()
   * @generated
   */
  void setFieldList(field_list value);

} // variant
