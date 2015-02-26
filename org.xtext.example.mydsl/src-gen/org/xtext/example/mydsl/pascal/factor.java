/**
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.factor#getFunctionDesignator <em>Function Designator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.factor#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.factor#getNumber <em>Number</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.factor#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.factor#getSet <em>Set</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.factor#getNil <em>Nil</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.factor#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.factor#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.factor#getFactor <em>Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getfactor()
 * @model
 * @generated
 */
public interface factor extends EObject
{
  /**
   * Returns the value of the '<em><b>Function Designator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Designator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Designator</em>' containment reference.
   * @see #setFunctionDesignator(FunctionDesignator)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfactor_FunctionDesignator()
   * @model containment="true"
   * @generated
   */
  FunctionDesignator getFunctionDesignator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.factor#getFunctionDesignator <em>Function Designator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Designator</em>' containment reference.
   * @see #getFunctionDesignator()
   * @generated
   */
  void setFunctionDesignator(FunctionDesignator value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(variable)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfactor_Variable()
   * @model containment="true"
   * @generated
   */
  variable getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.factor#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(variable value);

  /**
   * Returns the value of the '<em><b>Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number</em>' containment reference.
   * @see #setNumber(number)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfactor_Number()
   * @model containment="true"
   * @generated
   */
  number getNumber();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.factor#getNumber <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number</em>' containment reference.
   * @see #getNumber()
   * @generated
   */
  void setNumber(number value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfactor_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.factor#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set</em>' containment reference.
   * @see #setSet(Set)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfactor_Set()
   * @model containment="true"
   * @generated
   */
  Set getSet();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.factor#getSet <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set</em>' containment reference.
   * @see #getSet()
   * @generated
   */
  void setSet(Set value);

  /**
   * Returns the value of the '<em><b>Nil</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nil</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nil</em>' attribute.
   * @see #setNil(String)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfactor_Nil()
   * @model
   * @generated
   */
  String getNil();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.factor#getNil <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nil</em>' attribute.
   * @see #getNil()
   * @generated
   */
  void setNil(String value);

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
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfactor_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.factor#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(expression)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfactor_Expression()
   * @model containment="true"
   * @generated
   */
  expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.factor#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(expression value);

  /**
   * Returns the value of the '<em><b>Factor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Factor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor</em>' containment reference.
   * @see #setFactor(factor)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getfactor_Factor()
   * @model containment="true"
   * @generated
   */
  factor getFactor();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.factor#getFactor <em>Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Factor</em>' containment reference.
   * @see #getFactor()
   * @generated
   */
  void setFactor(factor value);

} // factor
