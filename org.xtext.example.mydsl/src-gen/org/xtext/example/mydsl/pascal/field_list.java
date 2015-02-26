/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>field list</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.field_list#getFixedPart <em>Fixed Part</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.field_list#getVariantPart <em>Variant Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getfield_list()
 * @model
 * @generated
 */
public interface field_list extends EObject
{
  /**
   * Returns the value of the '<em><b>Fixed Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fixed Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fixed Part</em>' containment reference.
   * @see #setFixedPart(fixed_part)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfield_list_FixedPart()
   * @model containment="true"
   * @generated
   */
  fixed_part getFixedPart();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.field_list#getFixedPart <em>Fixed Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fixed Part</em>' containment reference.
   * @see #getFixedPart()
   * @generated
   */
  void setFixedPart(fixed_part value);

  /**
   * Returns the value of the '<em><b>Variant Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variant Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variant Part</em>' containment reference.
   * @see #setVariantPart(variant_part)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfield_list_VariantPart()
   * @model containment="true"
   * @generated
   */
  variant_part getVariantPart();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.field_list#getVariantPart <em>Variant Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variant Part</em>' containment reference.
   * @see #getVariantPart()
   * @generated
   */
  void setVariantPart(variant_part value);

} // field_list
