/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>record type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.record_type#getFieldlist <em>Fieldlist</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getrecord_type()
 * @model
 * @generated
 */
public interface record_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Fieldlist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fieldlist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fieldlist</em>' containment reference.
   * @see #setFieldlist(field_list)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getrecord_type_Fieldlist()
   * @model containment="true"
   * @generated
   */
  field_list getFieldlist();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.record_type#getFieldlist <em>Fieldlist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fieldlist</em>' containment reference.
   * @see #getFieldlist()
   * @generated
   */
  void setFieldlist(field_list value);

} // record_type
