/**
 */
package org.xtext.example.mydsl.pascal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.conformant_array_schema;
import org.xtext.example.mydsl.pascal.parameter_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>parameter type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.parameter_typeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.parameter_typeImpl#getConformantArraySchema <em>Conformant Array Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class parameter_typeImpl extends MinimalEObjectImpl.Container implements parameter_type
{
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
   * The cached value of the '{@link #getConformantArraySchema() <em>Conformant Array Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConformantArraySchema()
   * @generated
   * @ordered
   */
  protected conformant_array_schema conformantArraySchema;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected parameter_typeImpl()
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
    return PascalPackage.Literals.PARAMETER_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PARAMETER_TYPE__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conformant_array_schema getConformantArraySchema()
  {
    return conformantArraySchema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConformantArraySchema(conformant_array_schema newConformantArraySchema, NotificationChain msgs)
  {
    conformant_array_schema oldConformantArraySchema = conformantArraySchema;
    conformantArraySchema = newConformantArraySchema;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.PARAMETER_TYPE__CONFORMANT_ARRAY_SCHEMA, oldConformantArraySchema, newConformantArraySchema);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConformantArraySchema(conformant_array_schema newConformantArraySchema)
  {
    if (newConformantArraySchema != conformantArraySchema)
    {
      NotificationChain msgs = null;
      if (conformantArraySchema != null)
        msgs = ((InternalEObject)conformantArraySchema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PARAMETER_TYPE__CONFORMANT_ARRAY_SCHEMA, null, msgs);
      if (newConformantArraySchema != null)
        msgs = ((InternalEObject)newConformantArraySchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.PARAMETER_TYPE__CONFORMANT_ARRAY_SCHEMA, null, msgs);
      msgs = basicSetConformantArraySchema(newConformantArraySchema, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.PARAMETER_TYPE__CONFORMANT_ARRAY_SCHEMA, newConformantArraySchema, newConformantArraySchema));
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
      case PascalPackage.PARAMETER_TYPE__CONFORMANT_ARRAY_SCHEMA:
        return basicSetConformantArraySchema(null, msgs);
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
      case PascalPackage.PARAMETER_TYPE__ID:
        return getId();
      case PascalPackage.PARAMETER_TYPE__CONFORMANT_ARRAY_SCHEMA:
        return getConformantArraySchema();
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
      case PascalPackage.PARAMETER_TYPE__ID:
        setId((String)newValue);
        return;
      case PascalPackage.PARAMETER_TYPE__CONFORMANT_ARRAY_SCHEMA:
        setConformantArraySchema((conformant_array_schema)newValue);
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
      case PascalPackage.PARAMETER_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case PascalPackage.PARAMETER_TYPE__CONFORMANT_ARRAY_SCHEMA:
        setConformantArraySchema((conformant_array_schema)null);
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
      case PascalPackage.PARAMETER_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case PascalPackage.PARAMETER_TYPE__CONFORMANT_ARRAY_SCHEMA:
        return conformantArraySchema != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //parameter_typeImpl
