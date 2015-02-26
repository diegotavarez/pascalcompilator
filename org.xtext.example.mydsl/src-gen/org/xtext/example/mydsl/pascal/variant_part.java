/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variant part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.variant_part#getTagfield <em>Tagfield</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.variant_part#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.variant_part#getVariants <em>Variants</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariant_part()
 * @model
 * @generated
 */
public interface variant_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Tagfield</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tagfield</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tagfield</em>' containment reference.
   * @see #setTagfield(tag_field)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariant_part_Tagfield()
   * @model containment="true"
   * @generated
   */
  tag_field getTagfield();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.variant_part#getTagfield <em>Tagfield</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tagfield</em>' containment reference.
   * @see #getTagfield()
   * @generated
   */
  void setTagfield(tag_field value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariant_part_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.variant_part#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.variant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variants</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariant_part_Variants()
   * @model containment="true"
   * @generated
   */
  EList<variant> getVariants();

} // variant_part
