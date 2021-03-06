/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.AuthoringDevice;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ScanningDeviceOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.SC;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scanning Device</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice#validateScanningDeviceTimeEqualsDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Time Equals Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice#validateScanningDeviceHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice#validateScanningDeviceHasAssignedAuthoringDeviceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Authoring Device Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice#validateScanningDeviceHasDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Device Manufacturer Model Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice#validateScanningDeviceHasDeviceSoftwareName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Device Software Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice#validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Author Represented Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice#validateScanningDeviceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ScanningDeviceTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScanningDeviceTimeEqualsDocumentEffectiveTime() {
		OperationsTestCase<ScanningDevice> validateScanningDeviceTimeEqualsDocumentEffectiveTimeTestCase = new OperationsTestCase<ScanningDevice>(
			"validateScanningDeviceTimeEqualsDocumentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanningDevice target) {

				target.init();
				TS ts = DatatypesFactory.eINSTANCE.createTS("20071204103022-0500");
				target.setTime(ts);
				ClinicalDocument cd = CDAFactory.eINSTANCE.createClinicalDocument();
				TS docts = DatatypesFactory.eINSTANCE.createTS("20081204103022-0500");
				;
				cd.setEffectiveTime(docts);
				cd.getAuthors().add(target);
				// cd.setd
				// cd.getd .setDataEnterer(target);

			}

			@Override
			protected void updateToPass(ScanningDevice target) {
				TS ts = DatatypesFactory.eINSTANCE.createTS("20071204103022-0500");
				target.setTime(ts);
				ClinicalDocument cd = CDAFactory.eINSTANCE.createClinicalDocument();
				cd.setEffectiveTime(EcoreUtil.copy(ts)); // one TS cannot have two containers
				cd.getAuthors().add(target);
				// cd.setDataEnterer(target);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanningDeviceOperations.validateScanningDeviceTimeEqualsDocumentEffectiveTime(
					(ScanningDevice) objectToTest, diagnostician, map);
			}

		};

		validateScanningDeviceTimeEqualsDocumentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScanningDeviceHasAssignedAuthorId() {
		OperationsTestCase<ScanningDevice> validateScanningDeviceHasAssignedAuthorIdTestCase = new OperationsTestCase<ScanningDevice>(
			"validateScanningDeviceHasAssignedAuthorId",
			operationsForOCL.getOCLValue("VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanningDevice target) {
				target.init();
			}

			@Override
			protected void updateToPass(ScanningDevice target) {
				target.init();
				AssignedAuthor value = CDAFactory.eINSTANCE.createAssignedAuthor();
				target.setAssignedAuthor(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanningDeviceOperations.validateScanningDeviceHasAssignedAuthorId(
					(ScanningDevice) objectToTest, diagnostician, map);
			}

		};

		validateScanningDeviceHasAssignedAuthorIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScanningDeviceHasAssignedAuthoringDeviceCode() {
		OperationsTestCase<ScanningDevice> validateScanningDeviceHasAssignedAuthoringDeviceCodeTestCase = new OperationsTestCase<ScanningDevice>(
			"validateScanningDeviceHasAssignedAuthoringDeviceCode",
			operationsForOCL.getOCLValue("VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanningDevice target) {
				target.init();
				AssignedAuthor value = CDAFactory.eINSTANCE.createAssignedAuthor();
				AuthoringDevice device = CDAFactory.eINSTANCE.createAuthoringDevice();
				value.setAssignedAuthoringDevice(device);
				target.setAssignedAuthor(value);
			}

			@Override
			protected void updateToPass(ScanningDevice target) {

				CE ce = DatatypesFactory.eINSTANCE.createCE("", "1.2.840.10008.2.16.4");
				ce.setCode("CAPTURE");
				ce.setDisplayName("PDF Capture");

				target.getAssignedAuthor().getAssignedAuthoringDevice().setCode(ce);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanningDeviceOperations.validateScanningDeviceHasAssignedAuthoringDeviceCode(
					(ScanningDevice) objectToTest, diagnostician, map);
			}

		};

		validateScanningDeviceHasAssignedAuthoringDeviceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScanningDeviceHasDeviceManufacturerModelName() {
		OperationsTestCase<ScanningDevice> validateScanningDeviceHasDeviceManufacturerModelNameTestCase = new OperationsTestCase<ScanningDevice>(
			"validateScanningDeviceHasDeviceManufacturerModelName",
			operationsForOCL.getOCLValue("VALIDATE_SCANNING_DEVICE_HAS_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			@Override
			protected void updateToFail(ScanningDevice target) {
				target.init();
				AssignedAuthor value = CDAFactory.eINSTANCE.createAssignedAuthor();
				AuthoringDevice device = CDAFactory.eINSTANCE.createAuthoringDevice();

				value.setAssignedAuthoringDevice(device);
				target.setAssignedAuthor(value);
			}

			@Override
			protected void updateToPass(ScanningDevice target) {
				SC sc = DatatypesFactory.eINSTANCE.createSC();
				sc.addText("model name");
				target.getAssignedAuthor().getAssignedAuthoringDevice().setManufacturerModelName(sc);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanningDeviceOperations.validateScanningDeviceHasDeviceManufacturerModelName(
					(ScanningDevice) objectToTest, diagnostician, map);
			}

		};

		validateScanningDeviceHasDeviceManufacturerModelNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScanningDeviceHasDeviceSoftwareName() {
		OperationsTestCase<ScanningDevice> validateScanningDeviceHasDeviceSoftwareNameTestCase = new OperationsTestCase<ScanningDevice>(
			"validateScanningDeviceHasDeviceSoftwareName",
			operationsForOCL.getOCLValue("VALIDATE_SCANNING_DEVICE_HAS_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanningDevice target) {
				target.init();
				AssignedAuthor value = CDAFactory.eINSTANCE.createAssignedAuthor();
				AuthoringDevice device = CDAFactory.eINSTANCE.createAuthoringDevice();

				value.setAssignedAuthoringDevice(device);
				target.setAssignedAuthor(value);
			}

			@Override
			protected void updateToPass(ScanningDevice target) {

				SC sc = DatatypesFactory.eINSTANCE.createSC();
				sc.addText("software");
				target.getAssignedAuthor().getAssignedAuthoringDevice().setSoftwareName(sc);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanningDeviceOperations.validateScanningDeviceHasDeviceSoftwareName(
					(ScanningDevice) objectToTest, diagnostician, map);
			}

		};

		validateScanningDeviceHasDeviceSoftwareNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateScanningDeviceHasAssignedAuthorRepresentedOrganizationId() {
		OperationsTestCase<ScanningDevice> validateScanningDeviceHasAssignedAuthorRepresentedOrganizationIdTestCase = new OperationsTestCase<ScanningDevice>(
			"validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanningDevice target) {
				target.init();
				AssignedAuthor value = CDAFactory.eINSTANCE.createAssignedAuthor();
				Organization reporg = CDAFactory.eINSTANCE.createOrganization();
				II ii = DatatypesFactory.eINSTANCE.createII();

				reporg.getIds().add(ii);
				value.setRepresentedOrganization(reporg);
				target.setAssignedAuthor(value);
			}

			@Override
			protected void updateToPass(ScanningDevice target) {

				for (II ii : target.getAssignedAuthor().getRepresentedOrganization().getIds()) {
					ii.setRoot("root");
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanningDeviceOperations.validateScanningDeviceHasAssignedAuthorRepresentedOrganizationId(
					(ScanningDevice) objectToTest, diagnostician, map);
			}

		};

		validateScanningDeviceHasAssignedAuthorRepresentedOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScanningDeviceTemplateId() {
		OperationsTestCase<ScanningDevice> validateScanningDeviceTemplateIdTestCase = new OperationsTestCase<ScanningDevice>(
			"validateScanningDeviceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SCANNING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScanningDevice target) {

			}

			@Override
			protected void updateToPass(ScanningDevice target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScanningDeviceOperations.validateScanningDeviceTemplateId(
					(ScanningDevice) objectToTest, diagnostician, map);
			}

		};

		validateScanningDeviceTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ScanningDeviceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ScanningDevice> {

		public ScanningDevice create() {
			return IHEFactory.eINSTANCE.createScanningDevice();
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
	* @generated
	*/
	private static class ConstructorTestClass extends ScanningDeviceOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
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

} // ScanningDeviceOperations
