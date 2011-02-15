/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.EIVL_event;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.EIVL_eventOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EIVL event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EIVL_eventImpl extends CEImpl implements EIVL_event {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EIVL_eventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.EIVL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOriginalText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EIVL_eventOperations.validateOriginalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTranslation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EIVL_eventOperations.validateTranslation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystem(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EIVL_eventOperations.validateCodeSystem(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeSystemName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EIVL_eventOperations.validateCodeSystemName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EIVL_event init() {
		return EIVL_eventOperations.init(this);
	}

} //EIVL_eventImpl
