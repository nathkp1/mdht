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
package org.openhealthtools.mdht.uml.hl7.datatypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.ENXP;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartQualifier;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityNamePartType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENXP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENXPImpl#getPartType <em>Part Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.impl.ENXPImpl#getQualifiers <em>Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ENXPImpl extends STImpl implements ENXP {
	/**
	 * The default value of the '{@link #getPartType() <em>Part Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartType()
	 * @generated
	 * @ordered
	 */
	protected static final EntityNamePartType PART_TYPE_EDEFAULT = EntityNamePartType.DEL;

	/**
	 * The cached value of the '{@link #getPartType() <em>Part Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartType()
	 * @generated
	 * @ordered
	 */
	protected EntityNamePartType partType = PART_TYPE_EDEFAULT;

	/**
	 * This is true if the Part Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean partTypeESet;

	/**
	 * The cached value of the '{@link #getQualifiers() <em>Qualifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityNamePartQualifier> qualifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ENXPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.ENXP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityNamePartType getPartType() {
		return partType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartType(EntityNamePartType newPartType) {
		EntityNamePartType oldPartType = partType;
		partType = newPartType == null
				? PART_TYPE_EDEFAULT
				: newPartType;
		boolean oldPartTypeESet = partTypeESet;
		partTypeESet = true;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.SET, DatatypesPackage.ENXP__PART_TYPE, oldPartType, partType, !oldPartTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPartType() {
		EntityNamePartType oldPartType = partType;
		boolean oldPartTypeESet = partTypeESet;
		partType = PART_TYPE_EDEFAULT;
		partTypeESet = false;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(
				this, Notification.UNSET, DatatypesPackage.ENXP__PART_TYPE, oldPartType, PART_TYPE_EDEFAULT,
				oldPartTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPartType() {
		return partTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityNamePartQualifier> getQualifiers() {
		if (qualifiers == null) {
			qualifiers = new EDataTypeUniqueEList.Unsettable<EntityNamePartQualifier>(
				EntityNamePartQualifier.class, this, DatatypesPackage.ENXP__QUALIFIER);
		}
		return qualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQualifiers() {
		if (qualifiers != null) {
			((InternalEList.Unsettable<?>) qualifiers).unset();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQualifiers() {
		return qualifiers != null && ((InternalEList.Unsettable<?>) qualifiers).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DatatypesPackage.ENXP__PART_TYPE:
				return getPartType();
			case DatatypesPackage.ENXP__QUALIFIER:
				return getQualifiers();
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
			case DatatypesPackage.ENXP__PART_TYPE:
				setPartType((EntityNamePartType) newValue);
				return;
			case DatatypesPackage.ENXP__QUALIFIER:
				getQualifiers().clear();
				getQualifiers().addAll((Collection<? extends EntityNamePartQualifier>) newValue);
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
			case DatatypesPackage.ENXP__PART_TYPE:
				unsetPartType();
				return;
			case DatatypesPackage.ENXP__QUALIFIER:
				unsetQualifiers();
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
			case DatatypesPackage.ENXP__PART_TYPE:
				return isSetPartType();
			case DatatypesPackage.ENXP__QUALIFIER:
				return isSetQualifiers();
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
		result.append(" (partType: ");
		if (partTypeESet) {
			result.append(partType);
		} else {
			result.append("<unset>");
		}
		result.append(", qualifier: ");
		result.append(qualifiers);
		result.append(')');
		return result.toString();
	}

} // ENXPImpl
