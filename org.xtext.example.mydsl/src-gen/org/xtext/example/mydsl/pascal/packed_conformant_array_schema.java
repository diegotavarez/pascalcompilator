/**
 */
package org.xtext.example.mydsl.pascal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>packed conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.packed_conformant_array_schema#getBoundSpecification <em>Bound Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getpacked_conformant_array_schema()
 * @model
 * @generated
 */
public interface packed_conformant_array_schema extends conformant_array_schema
{
  /**
   * Returns the value of the '<em><b>Bound Specification</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bound Specification</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bound Specification</em>' containment reference.
   * @see #setBoundSpecification(bound_specification)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getpacked_conformant_array_schema_BoundSpecification()
   * @model containment="true"
   * @generated
   */
  bound_specification getBoundSpecification();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.packed_conformant_array_schema#getBoundSpecification <em>Bound Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bound Specification</em>' containment reference.
   * @see #getBoundSpecification()
   * @generated
   */
  void setBoundSpecification(bound_specification value);

} // packed_conformant_array_schema
