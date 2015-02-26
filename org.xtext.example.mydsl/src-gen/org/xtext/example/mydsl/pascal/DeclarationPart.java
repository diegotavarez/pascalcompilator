/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.DeclarationPart#getLabelDeclarationPart <em>Label Declaration Part</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.DeclarationPart#getConstantDefinitionPart <em>Constant Definition Part</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.DeclarationPart#getTypeDefinitionPart <em>Type Definition Part</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.DeclarationPart#getVariableDeclarationPart <em>Variable Declaration Part</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.DeclarationPart#getProcedureAndFunctionDeclarationPart <em>Procedure And Function Declaration Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getDeclarationPart()
 * @model
 * @generated
 */
public interface DeclarationPart extends EObject
{
  /**
   * Returns the value of the '<em><b>Label Declaration Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label Declaration Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label Declaration Part</em>' containment reference.
   * @see #setLabelDeclarationPart(label_declaration_part)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getDeclarationPart_LabelDeclarationPart()
   * @model containment="true"
   * @generated
   */
  label_declaration_part getLabelDeclarationPart();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.DeclarationPart#getLabelDeclarationPart <em>Label Declaration Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label Declaration Part</em>' containment reference.
   * @see #getLabelDeclarationPart()
   * @generated
   */
  void setLabelDeclarationPart(label_declaration_part value);

  /**
   * Returns the value of the '<em><b>Constant Definition Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant Definition Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant Definition Part</em>' containment reference.
   * @see #setConstantDefinitionPart(constant_definition_part)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getDeclarationPart_ConstantDefinitionPart()
   * @model containment="true"
   * @generated
   */
  constant_definition_part getConstantDefinitionPart();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.DeclarationPart#getConstantDefinitionPart <em>Constant Definition Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant Definition Part</em>' containment reference.
   * @see #getConstantDefinitionPart()
   * @generated
   */
  void setConstantDefinitionPart(constant_definition_part value);

  /**
   * Returns the value of the '<em><b>Type Definition Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Definition Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Definition Part</em>' containment reference.
   * @see #setTypeDefinitionPart(type_definition_part)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getDeclarationPart_TypeDefinitionPart()
   * @model containment="true"
   * @generated
   */
  type_definition_part getTypeDefinitionPart();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.DeclarationPart#getTypeDefinitionPart <em>Type Definition Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Definition Part</em>' containment reference.
   * @see #getTypeDefinitionPart()
   * @generated
   */
  void setTypeDefinitionPart(type_definition_part value);

  /**
   * Returns the value of the '<em><b>Variable Declaration Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Declaration Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Declaration Part</em>' containment reference.
   * @see #setVariableDeclarationPart(variable_declaration_part)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getDeclarationPart_VariableDeclarationPart()
   * @model containment="true"
   * @generated
   */
  variable_declaration_part getVariableDeclarationPart();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.DeclarationPart#getVariableDeclarationPart <em>Variable Declaration Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable Declaration Part</em>' containment reference.
   * @see #getVariableDeclarationPart()
   * @generated
   */
  void setVariableDeclarationPart(variable_declaration_part value);

  /**
   * Returns the value of the '<em><b>Procedure And Function Declaration Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure And Function Declaration Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure And Function Declaration Part</em>' containment reference.
   * @see #setProcedureAndFunctionDeclarationPart(procedure_and_function_declaration_part)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getDeclarationPart_ProcedureAndFunctionDeclarationPart()
   * @model containment="true"
   * @generated
   */
  procedure_and_function_declaration_part getProcedureAndFunctionDeclarationPart();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.DeclarationPart#getProcedureAndFunctionDeclarationPart <em>Procedure And Function Declaration Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure And Function Declaration Part</em>' containment reference.
   * @see #getProcedureAndFunctionDeclarationPart()
   * @generated
   */
  void setProcedureAndFunctionDeclarationPart(procedure_and_function_declaration_part value);

} // DeclarationPart
