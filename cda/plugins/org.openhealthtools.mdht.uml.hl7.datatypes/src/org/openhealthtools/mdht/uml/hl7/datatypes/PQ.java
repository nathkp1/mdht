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
package org.openhealthtools.mdht.uml.hl7.datatypes;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PQ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.PQ#getValue <em>Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.PQ#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.PQ#getTranslations <em>Translation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getPQ()
 * @model
 * @generated
 */
public interface PQ extends QTY {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigDecimal)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getPQ_Value()
	 * @model ordered="false"
	 * @generated
	 */
	BigDecimal getValue();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PQ#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigDecimal value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newValueRequired="true" newValueOrdered="false"
	 * @generated
	 */
	void setValue(Double newValue);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getPQ_Unit()
	 * @model default="1" dataType="org.openhealthtools.mdht.uml.hl7.datatypes.csType" ordered="false"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.PQ#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.PQR}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getPQ_Translation()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="namespace='urn:hl7-org:v3'"
	 * @generated
	 */
	EList<PQR> getTranslations();

} // PQ
