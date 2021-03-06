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
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.ExtremitiesSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ExtremitiesSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Extremities Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ExtremitiesSection#validateExtremitiesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ExtremitiesSection#validateExtremitiesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ExtremitiesSection#validateExtremitiesSectionProblemEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Section Problem Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ExtremitiesSection#getProblemEntry() <em>Get Problem Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ExtremitiesSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExtremitiesSectionTemplateId() {
		OperationsTestCase<ExtremitiesSection> validateExtremitiesSectionTemplateIdTestCase = new OperationsTestCase<ExtremitiesSection>(
			"validateExtremitiesSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EXTREMITIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExtremitiesSection target) {

			}

			@Override
			protected void updateToPass(ExtremitiesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExtremitiesSectionOperations.validateExtremitiesSectionTemplateId(
					(ExtremitiesSection) objectToTest, diagnostician, map);
			}

		};

		validateExtremitiesSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExtremitiesSectionCode() {
		OperationsTestCase<ExtremitiesSection> validateExtremitiesSectionCodeTestCase = new OperationsTestCase<ExtremitiesSection>(
			"validateExtremitiesSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EXTREMITIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExtremitiesSection target) {

			}

			@Override
			protected void updateToPass(ExtremitiesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExtremitiesSectionOperations.validateExtremitiesSectionCode(
					(ExtremitiesSection) objectToTest, diagnostician, map);
			}

		};

		validateExtremitiesSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateExtremitiesSectionProblemEntry() {
		OperationsTestCase<ExtremitiesSection> validateExtremitiesSectionProblemEntryTestCase = new OperationsTestCase<ExtremitiesSection>(
			"validateExtremitiesSectionProblemEntry",
			operationsForOCL.getOCLValue("VALIDATE_EXTREMITIES_SECTION_PROBLEM_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExtremitiesSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(ExtremitiesSection target) {

				target.addObservation(IHEFactory.eINSTANCE.createProblemEntry().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExtremitiesSectionOperations.validateExtremitiesSectionProblemEntry(
					(ExtremitiesSection) objectToTest, diagnostician, map);
			}

		};

		validateExtremitiesSectionProblemEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntry() {

		ExtremitiesSection target = objectFactory.create();
		target.getProblemEntry();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ExtremitiesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ExtremitiesSection> {
		public ExtremitiesSection create() {
			return IHEFactory.eINSTANCE.createExtremitiesSection();
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
	private static class ConstructorTestClass extends ExtremitiesSectionOperations {
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

} // ExtremitiesSectionOperations
