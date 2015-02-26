/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parameter type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.parameter_type#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.parameter_type#getConformantArraySchema <em>Conformant Array Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getparameter_type()
 * @model
 * @generated
 */
public interface parameter_type extends EObject
{
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
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getparameter_type_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.parameter_type#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

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
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getparameter_type_ConformantArraySchema()
   * @model containment="true"
   * @generated
   */
  conformant_array_schema getConformantArraySchema();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.parameter_type#getConformantArraySchema <em>Conformant Array Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conformant Array Schema</em>' containment reference.
   * @see #getConformantArraySchema()
   * @generated
   */
  void setConformantArraySchema(conformant_array_schema value);

} // parameter_type
