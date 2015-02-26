/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unpacked conformant array Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.unpacked_conformant_array_Schema#getBoundSpecifications <em>Bound Specifications</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.unpacked_conformant_array_Schema#getConformantArraySchema <em>Conformant Array Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getunpacked_conformant_array_Schema()
 * @model
 * @generated
 */
public interface unpacked_conformant_array_Schema extends conformant_array_schema
{
  /**
   * Returns the value of the '<em><b>Bound Specifications</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.bound_specification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bound Specifications</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound Specifications</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getunpacked_conformant_array_Schema_BoundSpecifications()
   * @model containment="true"
   * @generated
   */
  EList<bound_specification> getBoundSpecifications();

  /**
   * Returns the value of the '<em><b>Conformant Array Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conformant Array Schema</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conformant Array Schema</em>' containment reference.
   * @see #setConformantArraySchema(conformant_array_schema)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getunpacked_conformant_array_Schema_ConformantArraySchema()
   * @model containment="true"
   * @generated
   */
  conformant_array_schema getConformantArraySchema();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.unpacked_conformant_array_Schema#getConformantArraySchema <em>Conformant Array Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conformant Array Schema</em>' containment reference.
   * @see #getConformantArraySchema()
   * @generated
   */
  void setConformantArraySchema(conformant_array_schema value);

} // unpacked_conformant_array_Schema
