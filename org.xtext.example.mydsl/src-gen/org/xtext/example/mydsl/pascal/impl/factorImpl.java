/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pascal.FunctionDesignator;
import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.Set;
import org.xtext.example.mydsl.pascal.expression;
import org.xtext.example.mydsl.pascal.factor;
import org.xtext.example.mydsl.pascal.number;
import org.xtext.example.mydsl.pascal.variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.factorImpl#getFunctionDesignator <em>Function Designator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.factorImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.factorImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.factorImpl#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.factorImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.factorImpl#getNil <em>Nil</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.factorImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.factorImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.factorImpl#getFactor <em>Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class factorImpl extends MinimalEObjectImpl.Container implements factor
{
  /**
   * The cached value of the '{@link #getFunctionDesignator() <em>Function Designator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionDesignator()
   * @generated
   * @ordered
   */
  protected FunctionDesignator functionDesignator;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected variable variable;

  /**
   * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumber()
   * @generated
   * @ordered
   */
  protected number number;

  /**
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

  /**
   * The cached value of the '{@link #getSet() <em>Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSet()
   * @generated
   * @ordered
   */
  protected Set set;

  /**
   * The default value of the '{@link #getNil() <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNil()
   * @generated
   * @ordered
   */
  protected static final String NIL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNil() <em>Nil</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNil()
   * @generated
   * @ordered
   */
  protected String nil = NIL_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected expression expression;

  /**
   * The cached value of the '{@link #getFactor() <em>Factor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFactor()
   * @generated
   * @ordered
   */
  protected factor factor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected factorImpl()
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
    return PascalPackage.Literals.FACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDesignator getFunctionDesignator()
  {
    return functionDesignator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionDesignator(FunctionDesignator newFunctionDesignator, NotificationChain msgs)
  {
    FunctionDesignator oldFunctionDesignator = functionDesignator;
    functionDesignator = newFunctionDesignator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__FUNCTION_DESIGNATOR, oldFunctionDesignator, newFunctionDesignator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionDesignator(FunctionDesignator newFunctionDesignator)
  {
    if (newFunctionDesignator != functionDesignator)
    {
      NotificationChain msgs = null;
      if (functionDesignator != null)
        msgs = ((InternalEObject)functionDesignator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__FUNCTION_DESIGNATOR, null, msgs);
      if (newFunctionDesignator != null)
        msgs = ((InternalEObject)newFunctionDesignator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__FUNCTION_DESIGNATOR, null, msgs);
      msgs = basicSetFunctionDesignator(newFunctionDesignator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__FUNCTION_DESIGNATOR, newFunctionDesignator, newFunctionDesignator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variable getVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariable(variable newVariable, NotificationChain msgs)
  {
    variable oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__VARIABLE, oldVariable, newVariable);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(variable newVariable)
  {
    if (newVariable != variable)
    {
      NotificationChain msgs = null;
      if (variable != null)
        msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__VARIABLE, null, msgs);
      if (newVariable != null)
        msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__VARIABLE, null, msgs);
      msgs = basicSetVariable(newVariable, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__VARIABLE, newVariable, newVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public number getNumber()
  {
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumber(number newNumber, NotificationChain msgs)
  {
    number oldNumber = number;
    number = newNumber;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__NUMBER, oldNumber, newNumber);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumber(number newNumber)
  {
    if (newNumber != number)
    {
      NotificationChain msgs = null;
      if (number != null)
        msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__NUMBER, null, msgs);
      if (newNumber != null)
        msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__NUMBER, null, msgs);
      msgs = basicSetNumber(newNumber, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__NUMBER, newNumber, newNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(String newString)
  {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__STRING, oldString, string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Set getSet()
  {
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSet(Set newSet, NotificationChain msgs)
  {
    Set oldSet = set;
    set = newSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__SET, oldSet, newSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSet(Set newSet)
  {
    if (newSet != set)
    {
      NotificationChain msgs = null;
      if (set != null)
        msgs = ((InternalEObject)set).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__SET, null, msgs);
      if (newSet != null)
        msgs = ((InternalEObject)newSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__SET, null, msgs);
      msgs = basicSetSet(newSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__SET, newSet, newSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNil()
  {
    return nil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNil(String newNil)
  {
    String oldNil = nil;
    nil = newNil;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__NIL, oldNil, nil));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(expression newExpression, NotificationChain msgs)
  {
    expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public factor getFactor()
  {
    return factor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFactor(factor newFactor, NotificationChain msgs)
  {
    factor oldFactor = factor;
    factor = newFactor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__FACTOR, oldFactor, newFactor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFactor(factor newFactor)
  {
    if (newFactor != factor)
    {
      NotificationChain msgs = null;
      if (factor != null)
        msgs = ((InternalEObject)factor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__FACTOR, null, msgs);
      if (newFactor != null)
        msgs = ((InternalEObject)newFactor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.FACTOR__FACTOR, null, msgs);
      msgs = basicSetFactor(newFactor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.FACTOR__FACTOR, newFactor, newFactor));
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
      case PascalPackage.FACTOR__FUNCTION_DESIGNATOR:
        return basicSetFunctionDesignator(null, msgs);
      case PascalPackage.FACTOR__VARIABLE:
        return basicSetVariable(null, msgs);
      case PascalPackage.FACTOR__NUMBER:
        return basicSetNumber(null, msgs);
      case PascalPackage.FACTOR__SET:
        return basicSetSet(null, msgs);
      case PascalPackage.FACTOR__EXPRESSION:
        return basicSetExpression(null, msgs);
      case PascalPackage.FACTOR__FACTOR:
        return basicSetFactor(null, msgs);
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
      case PascalPackage.FACTOR__FUNCTION_DESIGNATOR:
        return getFunctionDesignator();
      case PascalPackage.FACTOR__VARIABLE:
        return getVariable();
      case PascalPackage.FACTOR__NUMBER:
        return getNumber();
      case PascalPackage.FACTOR__STRING:
        return getString();
      case PascalPackage.FACTOR__SET:
        return getSet();
      case PascalPackage.FACTOR__NIL:
        return getNil();
      case PascalPackage.FACTOR__ID:
        return getId();
      case PascalPackage.FACTOR__EXPRESSION:
        return getExpression();
      case PascalPackage.FACTOR__FACTOR:
        return getFactor();
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
      case PascalPackage.FACTOR__FUNCTION_DESIGNATOR:
        setFunctionDesignator((FunctionDesignator)newValue);
        return;
      case PascalPackage.FACTOR__VARIABLE:
        setVariable((variable)newValue);
        return;
      case PascalPackage.FACTOR__NUMBER:
        setNumber((number)newValue);
        return;
      case PascalPackage.FACTOR__STRING:
        setString((String)newValue);
        return;
      case PascalPackage.FACTOR__SET:
        setSet((Set)newValue);
        return;
      case PascalPackage.FACTOR__NIL:
        setNil((String)newValue);
        return;
      case PascalPackage.FACTOR__ID:
        setId((String)newValue);
        return;
      case PascalPackage.FACTOR__EXPRESSION:
        setExpression((expression)newValue);
        return;
      case PascalPackage.FACTOR__FACTOR:
        setFactor((factor)newValue);
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
      case PascalPackage.FACTOR__FUNCTION_DESIGNATOR:
        setFunctionDesignator((FunctionDesignator)null);
        return;
      case PascalPackage.FACTOR__VARIABLE:
        setVariable((variable)null);
        return;
      case PascalPackage.FACTOR__NUMBER:
        setNumber((number)null);
        return;
      case PascalPackage.FACTOR__STRING:
        setString(STRING_EDEFAULT);
        return;
      case PascalPackage.FACTOR__SET:
        setSet((Set)null);
        return;
      case PascalPackage.FACTOR__NIL:
        setNil(NIL_EDEFAULT);
        return;
      case PascalPackage.FACTOR__ID:
        setId(ID_EDEFAULT);
        return;
      case PascalPackage.FACTOR__EXPRESSION:
        setExpression((expression)null);
        return;
      case PascalPackage.FACTOR__FACTOR:
        setFactor((factor)null);
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
      case PascalPackage.FACTOR__FUNCTION_DESIGNATOR:
        return functionDesignator != null;
      case PascalPackage.FACTOR__VARIABLE:
        return variable != null;
      case PascalPackage.FACTOR__NUMBER:
        return number != null;
      case PascalPackage.FACTOR__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case PascalPackage.FACTOR__SET:
        return set != null;
      case PascalPackage.FACTOR__NIL:
        return NIL_EDEFAULT == null ? nil != null : !NIL_EDEFAULT.equals(nil);
      case PascalPackage.FACTOR__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case PascalPackage.FACTOR__EXPRESSION:
        return expression != null;
      case PascalPackage.FACTOR__FACTOR:
        return factor != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (string: ");
    result.append(string);
    result.append(", nil: ");
    result.append(nil);
    result.append(", id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //factorImpl
