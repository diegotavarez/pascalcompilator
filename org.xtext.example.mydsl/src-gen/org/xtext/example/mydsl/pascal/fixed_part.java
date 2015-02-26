/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>fixed part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.fixed_part#getRecordSections <em>Record Sections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getfixed_part()
 * @model
 * @generated
 */
public interface fixed_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Record Sections</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.record_section}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Sections</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Sections</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfixed_part_RecordSections()
   * @model containment="true"
   * @generated
   */
  EList<record_section> getRecordSections();

} // fixed_part
