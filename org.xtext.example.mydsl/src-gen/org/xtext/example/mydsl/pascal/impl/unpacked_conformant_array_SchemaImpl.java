/**
 */
package org.xtext.example.mydsl.pascal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.pascal.PascalPackage;
import org.xtext.example.mydsl.pascal.bound_specification;
import org.xtext.example.mydsl.pascal.conformant_array_schema;
import org.xtext.example.mydsl.pascal.unpacked_conformant_array_Schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unpacked conformant array Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.unpacked_conformant_array_SchemaImpl#getBoundSpecifications <em>Bound Specifications</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.unpacked_conformant_array_SchemaImpl#getConformantArraySchema <em>Conformant Array Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class unpacked_conformant_array_SchemaImpl extends conformant_array_schemaImpl implements unpacked_conformant_array_Schema
{
  /**
   * The cached value of the '{@link #getBoundSpecifications() <em>Bound Specifications</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoundSpecifications()
   * @generated
   * @ordered
   */
  protected EList<bound_specification> boundSpecifications;

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
  protected unpacked_conformant_array_SchemaImpl()
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
    return PascalPackage.Literals.UNPACKED_CONFORMANT_ARRAY_SCHEMA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<bound_specification> getBoundSpecifications()
  {
    if (boundSpecifications == null)
    {
      boundSpecifications = new EObjectContainmentEList<bound_specification>(bound_specification.class, this, PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATIONS);
    }
    return boundSpecifications;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA, oldConformantArraySchema, newConformantArraySchema);
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
        msgs = ((InternalEObject)conformantArraySchema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA, null, msgs);
      if (newConformantArraySchema != null)
        msgs = ((InternalEObject)newConformantArraySchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA, null, msgs);
      msgs = basicSetConformantArraySchema(newConformantArraySchema, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA, newConformantArraySchema, newConformantArraySchema));
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
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATIONS:
        return ((InternalEList<?>)getBoundSpecifications()).basicRemove(otherEnd, msgs);
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA:
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
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATIONS:
        return getBoundSpecifications();
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA:
        return getConformantArraySchema();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATIONS:
        getBoundSpecifications().clear();
        getBoundSpecifications().addAll((Collection<? extends bound_specification>)newValue);
        return;
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA:
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
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATIONS:
        getBoundSpecifications().clear();
        return;
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA:
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
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__BOUND_SPECIFICATIONS:
        return boundSpecifications != null && !boundSpecifications.isEmpty();
      case PascalPackage.UNPACKED_CONFORMANT_ARRAY_SCHEMA__CONFORMANT_ARRAY_SCHEMA:
        return conformantArraySchema != null;
    }
    return super.eIsSet(featureID);
  }

} //unpacked_conformant_array_SchemaImpl
