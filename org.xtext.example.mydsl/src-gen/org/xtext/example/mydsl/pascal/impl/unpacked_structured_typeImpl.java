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
import org.xtext.example.mydsl.pascal.array_type;
import org.xtext.example.mydsl.pascal.file_type;
import org.xtext.example.mydsl.pascal.record_type;
import org.xtext.example.mydsl.pascal.set_type;
import org.xtext.example.mydsl.pascal.unpacked_structured_type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>unpacked structured type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.unpacked_structured_typeImpl#getArrayType <em>Array Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.unpacked_structured_typeImpl#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.unpacked_structured_typeImpl#getSetType <em>Set Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.impl.unpacked_structured_typeImpl#getFileType <em>File Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class unpacked_structured_typeImpl extends MinimalEObjectImpl.Container implements unpacked_structured_type
{
  /**
   * The cached value of the '{@link #getArrayType() <em>Array Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayType()
   * @generated
   * @ordered
   */
  protected array_type arrayType;

  /**
   * The cached value of the '{@link #getRecordType() <em>Record Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecordType()
   * @generated
   * @ordered
   */
  protected record_type recordType;

  /**
   * The cached value of the '{@link #getSetType() <em>Set Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetType()
   * @generated
   * @ordered
   */
  protected set_type setType;

  /**
   * The cached value of the '{@link #getFileType() <em>File Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileType()
   * @generated
   * @ordered
   */
  protected file_type fileType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected unpacked_structured_typeImpl()
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
    return PascalPackage.Literals.UNPACKED_STRUCTURED_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public array_type getArrayType()
  {
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayType(array_type newArrayType, NotificationChain msgs)
  {
    array_type oldArrayType = arrayType;
    arrayType = newArrayType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY_TYPE, oldArrayType, newArrayType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayType(array_type newArrayType)
  {
    if (newArrayType != arrayType)
    {
      NotificationChain msgs = null;
      if (arrayType != null)
        msgs = ((InternalEObject)arrayType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY_TYPE, null, msgs);
      if (newArrayType != null)
        msgs = ((InternalEObject)newArrayType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY_TYPE, null, msgs);
      msgs = basicSetArrayType(newArrayType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY_TYPE, newArrayType, newArrayType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public record_type getRecordType()
  {
    return recordType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRecordType(record_type newRecordType, NotificationChain msgs)
  {
    record_type oldRecordType = recordType;
    recordType = newRecordType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE, oldRecordType, newRecordType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordType(record_type newRecordType)
  {
    if (newRecordType != recordType)
    {
      NotificationChain msgs = null;
      if (recordType != null)
        msgs = ((InternalEObject)recordType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE, null, msgs);
      if (newRecordType != null)
        msgs = ((InternalEObject)newRecordType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE, null, msgs);
      msgs = basicSetRecordType(newRecordType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE, newRecordType, newRecordType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public set_type getSetType()
  {
    return setType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSetType(set_type newSetType, NotificationChain msgs)
  {
    set_type oldSetType = setType;
    setType = newSetType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__SET_TYPE, oldSetType, newSetType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSetType(set_type newSetType)
  {
    if (newSetType != setType)
    {
      NotificationChain msgs = null;
      if (setType != null)
        msgs = ((InternalEObject)setType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__SET_TYPE, null, msgs);
      if (newSetType != null)
        msgs = ((InternalEObject)newSetType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__SET_TYPE, null, msgs);
      msgs = basicSetSetType(newSetType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__SET_TYPE, newSetType, newSetType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public file_type getFileType()
  {
    return fileType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFileType(file_type newFileType, NotificationChain msgs)
  {
    file_type oldFileType = fileType;
    fileType = newFileType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE_TYPE, oldFileType, newFileType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileType(file_type newFileType)
  {
    if (newFileType != fileType)
    {
      NotificationChain msgs = null;
      if (fileType != null)
        msgs = ((InternalEObject)fileType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE_TYPE, null, msgs);
      if (newFileType != null)
        msgs = ((InternalEObject)newFileType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE_TYPE, null, msgs);
      msgs = basicSetFileType(newFileType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE_TYPE, newFileType, newFileType));
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY_TYPE:
        return basicSetArrayType(null, msgs);
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE:
        return basicSetRecordType(null, msgs);
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__SET_TYPE:
        return basicSetSetType(null, msgs);
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE_TYPE:
        return basicSetFileType(null, msgs);
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY_TYPE:
        return getArrayType();
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE:
        return getRecordType();
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__SET_TYPE:
        return getSetType();
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE_TYPE:
        return getFileType();
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY_TYPE:
        setArrayType((array_type)newValue);
        return;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE:
        setRecordType((record_type)newValue);
        return;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__SET_TYPE:
        setSetType((set_type)newValue);
        return;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE_TYPE:
        setFileType((file_type)newValue);
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY_TYPE:
        setArrayType((array_type)null);
        return;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE:
        setRecordType((record_type)null);
        return;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__SET_TYPE:
        setSetType((set_type)null);
        return;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE_TYPE:
        setFileType((file_type)null);
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
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__ARRAY_TYPE:
        return arrayType != null;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__RECORD_TYPE:
        return recordType != null;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__SET_TYPE:
        return setType != null;
      case PascalPackage.UNPACKED_STRUCTURED_TYPE__FILE_TYPE:
        return fileType != null;
    }
    return super.eIsSet(featureID);
  }

} //unpacked_structured_typeImpl
