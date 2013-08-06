/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *    Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.SmokingStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Smoking Status Observation</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation#validateMU2CONSOLSmokingStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MU2CONSOL Smoking Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation#validateMU2CONSOLSmokingStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MU2CONSOL Smoking Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SmokingStatusObservation#validateTobaccoUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SmokingStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMU2CONSOLSmokingStatusObservationValueP() {
		OperationsTestCase<SmokingStatusObservation> validateMU2CONSOLSmokingStatusObservationValuePTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateMU2CONSOLSmokingStatusObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_MU2CONSOL_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateMU2CONSOLSmokingStatusObservationValueP(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMU2CONSOLSmokingStatusObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMU2CONSOLSmokingStatusObservationValue() {
		OperationsTestCase<SmokingStatusObservation> validateMU2CONSOLSmokingStatusObservationValueTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateMU2CONSOLSmokingStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_MU2CONSOL_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("428061000124105", "2.16.840.1.113883.6.96", null, null);
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateMU2CONSOLSmokingStatusObservationValue(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMU2CONSOLSmokingStatusObservationValueTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateTobaccoUseTemplateId() {
		OperationsTestCase<SmokingStatusObservation> validateTobaccoUseTemplateIdTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateTobaccoUseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateTobaccoUseTemplateId(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends SmokingStatusObservationOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static class ObjectFactory implements TestObjectFactory<SmokingStatusObservation> {

		public SmokingStatusObservation create() {
			return Mu2consolFactory.eINSTANCE.createSmokingStatusObservation();
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	 * 
	 * @generated
	 */
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends SmokingStatusObservationOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
	 * @generated
	 */
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	 * 
	 * @generated
	 */

	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // SmokingStatusObservationOperations
