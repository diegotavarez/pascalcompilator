/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pascal.DeclarationPart;
import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.constant_definition_part;
import org.xtext.example.mydsl.pascal.label_declaration_part;
import org.xtext.example.mydsl.pascal.procedure_and_function_declaration_part;
import org.xtext.example.mydsl.pascal.type_definition_part;
import org.xtext.example.mydsl.pascal.variable_declaration_part;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Declaration Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.DeclarationPartImpl#getLabelDeclarationPart <em>Label Declaration Part</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.DeclarationPartImpl#getConstantDefinitionPart <em>Constant Definition Part</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.DeclarationPartImpl#getTypeDefinitionPart <em>Type Definition Part</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.DeclarationPartImpl#getVariableDeclarationPart <em>Variable Declaration Part</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.DeclarationPartImpl#getProcedureAndFunctionDeclarationPart <em>Procedure And Function Declaration Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeclarationPartImpl extends MinimalEObjectImpl.Container implements DeclarationPart
{
  /**
   * The cached value of the '{@link #getLabelDeclarationPart() <em>Label Declaration Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelDeclarationPart()
   * @generated
   * @ordered
   */
  protected label_declaration_part labelDeclarationPart;

  /**
   * The cached value of the '{@link #getConstantDefinitionPart() <em>Constant Definition Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstantDefinitionPart()
   * @generated
   * @ordered
   */
  protected constant_definition_part constantDefinitionPart;

  /**
   * The cached value of the '{@link #getTypeDefinitionPart() <em>Type Definition Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefinitionPart()
   * @generated
   * @ordered
   */
  protected type_definition_part typeDefinitionPart;

  /**
   * The cached value of the '{@link #getVariableDeclarationPart() <em>Variable Declaration Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableDeclarationPart()
   * @generated
   * @ordered
   */
  protected variable_declaration_part variableDeclarationPart;

  /**
   * The cached value of the '{@link #getProcedureAndFunctionDeclarationPart() <em>Procedure And Function Declaration Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcedureAndFunctionDeclarationPart()
   * @generated
   * @ordered
   */
  protected procedure_and_function_declaration_part procedureAndFunctionDeclarationPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeclarationPartImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PascalPackage.Literals.DECLARATION_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public label_declaration_part getLabelDeclarationPart()
  {
    return labelDeclarationPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabelDeclarationPart(label_declaration_part newLabelDeclarationPart, NotificationChain msgs)
  {
    label_declaration_part oldLabelDeclarationPart = labelDeclarationPart;
    labelDeclarationPart = newLabelDeclarationPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART, oldLabelDeclarationPart, newLabelDeclarationPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelDeclarationPart(label_declaration_part newLabelDeclarationPart)
  {
    if (newLabelDeclarationPart != labelDeclarationPart)
    {
      NotificationChain msgs = null;
      if (labelDeclarationPart != null)
        msgs = ((InternalEObject)labelDeclarationPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART, null, msgs);
      if (newLabelDeclarationPart != null)
        msgs = ((InternalEObject)newLabelDeclarationPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART, null, msgs);
      msgs = basicSetLabelDeclarationPart(newLabelDeclarationPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART, newLabelDeclarationPart, newLabelDeclarationPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant_definition_part getConstantDefinitionPart()
  {
    return constantDefinitionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstantDefinitionPart(constant_definition_part newConstantDefinitionPart, NotificationChain msgs)
  {
    constant_definition_part oldConstantDefinitionPart = constantDefinitionPart;
    constantDefinitionPart = newConstantDefinitionPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART, oldConstantDefinitionPart, newConstantDefinitionPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstantDefinitionPart(constant_definition_part newConstantDefinitionPart)
  {
    if (newConstantDefinitionPart != constantDefinitionPart)
    {
      NotificationChain msgs = null;
      if (constantDefinitionPart != null)
        msgs = ((InternalEObject)constantDefinitionPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART, null, msgs);
      if (newConstantDefinitionPart != null)
        msgs = ((InternalEObject)newConstantDefinitionPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART, null, msgs);
      msgs = basicSetConstantDefinitionPart(newConstantDefinitionPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART, newConstantDefinitionPart, newConstantDefinitionPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_definition_part getTypeDefinitionPart()
  {
    return typeDefinitionPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeDefinitionPart(type_definition_part newTypeDefinitionPart, NotificationChain msgs)
  {
    type_definition_part oldTypeDefinitionPart = typeDefinitionPart;
    typeDefinitionPart = newTypeDefinitionPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART, oldTypeDefinitionPart, newTypeDefinitionPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeDefinitionPart(type_definition_part newTypeDefinitionPart)
  {
    if (newTypeDefinitionPart != typeDefinitionPart)
    {
      NotificationChain msgs = null;
      if (typeDefinitionPart != null)
        msgs = ((InternalEObject)typeDefinitionPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART, null, msgs);
      if (newTypeDefinitionPart != null)
        msgs = ((InternalEObject)newTypeDefinitionPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART, null, msgs);
      msgs = basicSetTypeDefinitionPart(newTypeDefinitionPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART, newTypeDefinitionPart, newTypeDefinitionPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable_declaration_part getVariableDeclarationPart()
  {
    return variableDeclarationPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableDeclarationPart(variable_declaration_part newVariableDeclarationPart, NotificationChain msgs)
  {
    variable_declaration_part oldVariableDeclarationPart = variableDeclarationPart;
    variableDeclarationPart = newVariableDeclarationPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART, oldVariableDeclarationPart, newVariableDeclarationPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableDeclarationPart(variable_declaration_part newVariableDeclarationPart)
  {
    if (newVariableDeclarationPart != variableDeclarationPart)
    {
      NotificationChain msgs = null;
      if (variableDeclarationPart != null)
        msgs = ((InternalEObject)variableDeclarationPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART, null, msgs);
      if (newVariableDeclarationPart != null)
        msgs = ((InternalEObject)newVariableDeclarationPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART, null, msgs);
      msgs = basicSetVariableDeclarationPart(newVariableDeclarationPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART, newVariableDeclarationPart, newVariableDeclarationPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public procedure_and_function_declaration_part getProcedureAndFunctionDeclarationPart()
  {
    return procedureAndFunctionDeclarationPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcedureAndFunctionDeclarationPart(procedure_and_function_declaration_part newProcedureAndFunctionDeclarationPart, NotificationChain msgs)
  {
    procedure_and_function_declaration_part oldProcedureAndFunctionDeclarationPart = procedureAndFunctionDeclarationPart;
    procedureAndFunctionDeclarationPart = newProcedureAndFunctionDeclarationPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__PROCEDURE_AND_FUNCTION_DECLARATION_PART, oldProcedureAndFunctionDeclarationPart, newProcedureAndFunctionDeclarationPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcedureAndFunctionDeclarationPart(procedure_and_function_declaration_part newProcedureAndFunctionDeclarationPart)
  {
    if (newProcedureAndFunctionDeclarationPart != procedureAndFunctionDeclarationPart)
    {
      NotificationChain msgs = null;
      if (procedureAndFunctionDeclarationPart != null)
        msgs = ((InternalEObject)procedureAndFunctionDeclarationPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__PROCEDURE_AND_FUNCTION_DECLARATION_PART, null, msgs);
      if (newProcedureAndFunctionDeclarationPart != null)
        msgs = ((InternalEObject)newProcedureAndFunctionDeclarationPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.DECLARATION_PART__PROCEDURE_AND_FUNCTION_DECLARATION_PART, null, msgs);
      msgs = basicSetProcedureAndFunctionDeclarationPart(newProcedureAndFunctionDeclarationPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.DECLARATION_PART__PROCEDURE_AND_FUNCTION_DECLARATION_PART, newProcedureAndFunctionDeclarationPart, newProcedureAndFunctionDeclarationPart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART:
        return basicSetLabelDeclarationPart(null, msgs);
      case PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART:
        return basicSetConstantDefinitionPart(null, msgs);
      case PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART:
        return basicSetTypeDefinitionPart(null, msgs);
      case PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART:
        return basicSetVariableDeclarationPart(null, msgs);
      case PascalPackage.DECLARATION_PART__PROCEDURE_AND_FUNCTION_DECLARATION_PART:
        return basicSetProcedureAndFunctionDeclarationPart(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART:
        return getLabelDeclarationPart();
      case PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART:
        return getConstantDefinitionPart();
      case PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART:
        return getTypeDefinitionPart();
      case PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART:
        return getVariableDeclarationPart();
      case PascalPackage.DECLARATION_PART__PROCEDURE_AND_FUNCTION_DECLARATION_PART:
        return getProcedureAndFunctionDeclarationPart();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART:
        setLabelDeclarationPart((label_declaration_part)newValue);
        return;
      case PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART:
        setConstantDefinitionPart((constant_definition_part)newValue);
        return;
      case PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART:
        setTypeDefinitionPart((type_definition_part)newValue);
        return;
      case PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART:
        setVariableDeclarationPart((variable_declaration_part)newValue);
        return;
      case PascalPackage.DECLARATION_PART__PROCEDURE_AND_FUNCTION_DECLARATION_PART:
        setProcedureAndFunctionDeclarationPart((procedure_and_function_declaration_part)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART:
        setLabelDeclarationPart((label_declaration_part)null);
        return;
      case PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART:
        setConstantDefinitionPart((constant_definition_part)null);
        return;
      case PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART:
        setTypeDefinitionPart((type_definition_part)null);
        return;
      case PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART:
        setVariableDeclarationPart((variable_declaration_part)null);
        return;
      case PascalPackage.DECLARATION_PART__PROCEDURE_AND_FUNCTION_DECLARATION_PART:
        setProcedureAndFunctionDeclarationPart((procedure_and_function_declaration_part)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PascalPackage.DECLARATION_PART__LABEL_DECLARATION_PART:
        return labelDeclarationPart != null;
      case PascalPackage.DECLARATION_PART__CONSTANT_DEFINITION_PART:
        return constantDefinitionPart != null;
      case PascalPackage.DECLARATION_PART__TYPE_DEFINITION_PART:
        return typeDefinitionPart != null;
      case PascalPackage.DECLARATION_PART__VARIABLE_DECLARATION_PART:
        return variableDeclarationPart != null;
      case PascalPackage.DECLARATION_PART__PROCEDURE_AND_FUNCTION_DECLARATION_PART:
        return procedureAndFunctionDeclarationPart != null;
    }
    return super.eIsSet(featureID);
  }

} //DeclarationPartImpl
