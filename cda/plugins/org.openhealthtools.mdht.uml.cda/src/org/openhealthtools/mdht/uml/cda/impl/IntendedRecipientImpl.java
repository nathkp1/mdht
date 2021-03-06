/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.IntendedRecipient;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.rim.impl.RoleImpl;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_InformationRecipientRole;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intended Recipient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getRealmCodes <em>Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getTypeId <em>Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getTemplateIds <em>Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getIds <em>Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getAddrs <em>Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getTelecoms <em>Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getInformationRecipient <em>Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getReceivedOrganization <em>Received Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getNullFlavor <em>Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.impl.IntendedRecipientImpl#getClassCode <em>Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntendedRecipientImpl extends RoleImpl implements IntendedRecipient {
	/**
	 * The cached value of the '{@link #getRealmCodes() <em>Realm Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealmCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CS> realmCodes;

	/**
	 * The cached value of the '{@link #getTypeId() <em>Type Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected InfrastructureRootTypeId typeId;

	/**
	 * The cached value of the '{@link #getTemplateIds() <em>Template Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateIds()
	 * @generated
	 * @ordered
	 */
	protected EList<II> templateIds;

	/**
	 * The cached value of the '{@link #getIds() <em>Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected EList<II> ids;

	/**
	 * The cached value of the '{@link #getAddrs() <em>Addr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddrs()
	 * @generated
	 * @ordered
	 */
	protected EList<AD> addrs;

	/**
	 * The cached value of the '{@link #getTelecoms() <em>Telecom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelecoms()
	 * @generated
	 * @ordered
	 */
	protected EList<TEL> telecoms;

	/**
	 * The cached value of the '{@link #getInformationRecipient() <em>Information Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationRecipient()
	 * @generated
	 * @ordered
	 */
	protected Person informationRecipient;

	/**
	 * The cached value of the '{@link #getReceivedOrganization() <em>Received Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization receivedOrganization;

	/**
	 * The default value of the '{@link #getNullFlavor() <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullFlavor()
	 * @generated
	 * @ordered
	 */
	protected static final NullFlavor NULL_FLAVOR_EDEFAULT = NullFlavor.ASKU;

	/**
	 * The cached value of the '{@link #getNullFlavor() <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNullFlavor()
	 * @generated
	 * @ordered
	 */
	protected NullFlavor nullFlavor = NULL_FLAVOR_EDEFAULT;

	/**
	 * This is true if the Null Flavor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullFlavorESet;

	/**
	 * The default value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected static final x_InformationRecipientRole CLASS_CODE_EDEFAULT = x_InformationRecipientRole.ASSIGNED;

	/**
	 * The cached value of the '{@link #getClassCode() <em>Class Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassCode()
	 * @generated
	 * @ordered
	 */
	protected x_InformationRecipientRole classCode = CLASS_CODE_EDEFAULT;

	/**
	 * This is true if the Class Code attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean classCodeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntendedRecipientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDAPackage.Literals.INTENDED_RECIPIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CS> getRealmCodes() {
		if (realmCodes == null) {
			realmCodes = new EObjectContainmentEList<CS>(CS.class, this, CDAPackage.INTENDED_RECIPIENT__REALM_CODE);
		}
		return realmCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InfrastructureRootTypeId getTypeId() {
		return typeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeId(InfrastructureRootTypeId newTypeId, NotificationChain msgs) {
		InfrastructureRootTypeId oldTypeId = typeId;
		typeId = newTypeId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__TYPE_ID, oldTypeId, newTypeId);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeId(InfrastructureRootTypeId newTypeId) {
		if (newTypeId != typeId) {
			NotificationChain msgs = null;
			if (typeId != null) {
				msgs = ((InternalEObject) typeId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.INTENDED_RECIPIENT__TYPE_ID, null, msgs);
			}
			if (newTypeId != null) {
				msgs = ((InternalEObject) newTypeId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.INTENDED_RECIPIENT__TYPE_ID, null, msgs);
			}
			msgs = basicSetTypeId(newTypeId, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__TYPE_ID, newTypeId, newTypeId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<II> getTemplateIds() {
		if (templateIds == null) {
			templateIds = new EObjectContainmentEList<II>(II.class, this, CDAPackage.INTENDED_RECIPIENT__TEMPLATE_ID);
		}
		return templateIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getIds() {
		if (ids == null) {
			ids = new EObjectContainmentEList<II>(II.class, this, CDAPackage.INTENDED_RECIPIENT__ID);
		}
		return ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AD> getAddrs() {
		if (addrs == null) {
			addrs = new EObjectContainmentEList<AD>(AD.class, this, CDAPackage.INTENDED_RECIPIENT__ADDR);
		}
		return addrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TEL> getTelecoms() {
		if (telecoms == null) {
			telecoms = new EObjectContainmentEList<TEL>(TEL.class, this, CDAPackage.INTENDED_RECIPIENT__TELECOM);
		}
		return telecoms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getInformationRecipient() {
		return informationRecipient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationRecipient(Person newInformationRecipient, NotificationChain msgs) {
		Person oldInformationRecipient = informationRecipient;
		informationRecipient = newInformationRecipient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT, oldInformationRecipient,
				newInformationRecipient);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformationRecipient(Person newInformationRecipient) {
		if (newInformationRecipient != informationRecipient) {
			NotificationChain msgs = null;
			if (informationRecipient != null) {
				msgs = ((InternalEObject) informationRecipient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT, null, msgs);
			}
			if (newInformationRecipient != null) {
				msgs = ((InternalEObject) newInformationRecipient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT, null, msgs);
			}
			msgs = basicSetInformationRecipient(newInformationRecipient, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT, newInformationRecipient,
				newInformationRecipient));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getReceivedOrganization() {
		return receivedOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceivedOrganization(Organization newReceivedOrganization, NotificationChain msgs) {
		Organization oldReceivedOrganization = receivedOrganization;
		receivedOrganization = newReceivedOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(
				this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION, oldReceivedOrganization,
				newReceivedOrganization);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivedOrganization(Organization newReceivedOrganization) {
		if (newReceivedOrganization != receivedOrganization) {
			NotificationChain msgs = null;
			if (receivedOrganization != null) {
				msgs = ((InternalEObject) receivedOrganization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION, null, msgs);
			}
			if (newReceivedOrganization != null) {
				msgs = ((InternalEObject) newReceivedOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE -
						CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION, null, msgs);
			}
			msgs = basicSetReceivedOrganization(newReceivedOrganization, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION, newReceivedOrganization,
				newReceivedOrganization));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullFlavor getNullFlavor() {
		return nullFlavor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullFlavor(NullFlavor newNullFlavor) {
		NullFlavor oldNullFlavor = nullFlavor;
		nullFlavor = newNullFlavor == null
				? NULL_FLAVOR_EDEFAULT
				: newNullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavorESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__NULL_FLAVOR, oldNullFlavor, nullFlavor,
				!oldNullFlavorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNullFlavor() {
		NullFlavor oldNullFlavor = nullFlavor;
		boolean oldNullFlavorESet = nullFlavorESet;
		nullFlavor = NULL_FLAVOR_EDEFAULT;
		nullFlavorESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.INTENDED_RECIPIENT__NULL_FLAVOR, oldNullFlavor,
				NULL_FLAVOR_EDEFAULT, oldNullFlavorESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNullFlavor() {
		return nullFlavorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public x_InformationRecipientRole getClassCode() {
		return classCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassCode(x_InformationRecipientRole newClassCode) {
		x_InformationRecipientRole oldClassCode = classCode;
		classCode = newClassCode == null
				? CLASS_CODE_EDEFAULT
				: newClassCode;
		boolean oldClassCodeESet = classCodeESet;
		classCodeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, CDAPackage.INTENDED_RECIPIENT__CLASS_CODE, oldClassCode, classCode,
				!oldClassCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClassCode() {
		x_InformationRecipientRole oldClassCode = classCode;
		boolean oldClassCodeESet = classCodeESet;
		classCode = CLASS_CODE_EDEFAULT;
		classCodeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, CDAPackage.INTENDED_RECIPIENT__CLASS_CODE, oldClassCode, CLASS_CODE_EDEFAULT,
				oldClassCodeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClassCode() {
		return classCodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CDAPackage.INTENDED_RECIPIENT__REALM_CODE:
				return ((InternalEList<?>) getRealmCodes()).basicRemove(otherEnd, msgs);
			case CDAPackage.INTENDED_RECIPIENT__TYPE_ID:
				return basicSetTypeId(null, msgs);
			case CDAPackage.INTENDED_RECIPIENT__TEMPLATE_ID:
				return ((InternalEList<?>) getTemplateIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.INTENDED_RECIPIENT__ID:
				return ((InternalEList<?>) getIds()).basicRemove(otherEnd, msgs);
			case CDAPackage.INTENDED_RECIPIENT__ADDR:
				return ((InternalEList<?>) getAddrs()).basicRemove(otherEnd, msgs);
			case CDAPackage.INTENDED_RECIPIENT__TELECOM:
				return ((InternalEList<?>) getTelecoms()).basicRemove(otherEnd, msgs);
			case CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT:
				return basicSetInformationRecipient(null, msgs);
			case CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION:
				return basicSetReceivedOrganization(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CDAPackage.INTENDED_RECIPIENT__REALM_CODE:
				return getRealmCodes();
			case CDAPackage.INTENDED_RECIPIENT__TYPE_ID:
				return getTypeId();
			case CDAPackage.INTENDED_RECIPIENT__TEMPLATE_ID:
				return getTemplateIds();
			case CDAPackage.INTENDED_RECIPIENT__ID:
				return getIds();
			case CDAPackage.INTENDED_RECIPIENT__ADDR:
				return getAddrs();
			case CDAPackage.INTENDED_RECIPIENT__TELECOM:
				return getTelecoms();
			case CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT:
				return getInformationRecipient();
			case CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION:
				return getReceivedOrganization();
			case CDAPackage.INTENDED_RECIPIENT__NULL_FLAVOR:
				return getNullFlavor();
			case CDAPackage.INTENDED_RECIPIENT__CLASS_CODE:
				return getClassCode();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CDAPackage.INTENDED_RECIPIENT__REALM_CODE:
				getRealmCodes().clear();
				getRealmCodes().addAll((Collection<? extends CS>) newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__TEMPLATE_ID:
				getTemplateIds().clear();
				getTemplateIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__ID:
				getIds().clear();
				getIds().addAll((Collection<? extends II>) newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__ADDR:
				getAddrs().clear();
				getAddrs().addAll((Collection<? extends AD>) newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__TELECOM:
				getTelecoms().clear();
				getTelecoms().addAll((Collection<? extends TEL>) newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT:
				setInformationRecipient((Person) newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION:
				setReceivedOrganization((Organization) newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__NULL_FLAVOR:
				setNullFlavor((NullFlavor) newValue);
				return;
			case CDAPackage.INTENDED_RECIPIENT__CLASS_CODE:
				setClassCode((x_InformationRecipientRole) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case CDAPackage.INTENDED_RECIPIENT__REALM_CODE:
				getRealmCodes().clear();
				return;
			case CDAPackage.INTENDED_RECIPIENT__TYPE_ID:
				setTypeId((InfrastructureRootTypeId) null);
				return;
			case CDAPackage.INTENDED_RECIPIENT__TEMPLATE_ID:
				getTemplateIds().clear();
				return;
			case CDAPackage.INTENDED_RECIPIENT__ID:
				getIds().clear();
				return;
			case CDAPackage.INTENDED_RECIPIENT__ADDR:
				getAddrs().clear();
				return;
			case CDAPackage.INTENDED_RECIPIENT__TELECOM:
				getTelecoms().clear();
				return;
			case CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT:
				setInformationRecipient((Person) null);
				return;
			case CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION:
				setReceivedOrganization((Organization) null);
				return;
			case CDAPackage.INTENDED_RECIPIENT__NULL_FLAVOR:
				unsetNullFlavor();
				return;
			case CDAPackage.INTENDED_RECIPIENT__CLASS_CODE:
				unsetClassCode();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CDAPackage.INTENDED_RECIPIENT__REALM_CODE:
				return realmCodes != null && !realmCodes.isEmpty();
			case CDAPackage.INTENDED_RECIPIENT__TYPE_ID:
				return typeId != null;
			case CDAPackage.INTENDED_RECIPIENT__TEMPLATE_ID:
				return templateIds != null && !templateIds.isEmpty();
			case CDAPackage.INTENDED_RECIPIENT__ID:
				return ids != null && !ids.isEmpty();
			case CDAPackage.INTENDED_RECIPIENT__ADDR:
				return addrs != null && !addrs.isEmpty();
			case CDAPackage.INTENDED_RECIPIENT__TELECOM:
				return telecoms != null && !telecoms.isEmpty();
			case CDAPackage.INTENDED_RECIPIENT__INFORMATION_RECIPIENT:
				return informationRecipient != null;
			case CDAPackage.INTENDED_RECIPIENT__RECEIVED_ORGANIZATION:
				return receivedOrganization != null;
			case CDAPackage.INTENDED_RECIPIENT__NULL_FLAVOR:
				return isSetNullFlavor();
			case CDAPackage.INTENDED_RECIPIENT__CLASS_CODE:
				return isSetClassCode();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nullFlavor: ");
		if (nullFlavorESet) {
			result.append(nullFlavor);
		} else {
			result.append("<unset>");
		}
		result.append(", classCode: ");
		if (classCodeESet) {
			result.append(classCode);
		} else {
			result.append("<unset>");
		}
		result.append(')');
		return result.toString();
	}

} // IntendedRecipientImpl
