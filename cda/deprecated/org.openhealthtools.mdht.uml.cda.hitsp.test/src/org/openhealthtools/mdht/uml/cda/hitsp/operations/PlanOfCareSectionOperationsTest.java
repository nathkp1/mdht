/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CarePlanSectionOperationsTest;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class PlanOfCareSectionOperationsTest extends CarePlanSectionOperationsTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.3.88.11.83.124";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Template ID
	// -------------------------------------------------------------
	new TemplateIDValidationTest(TEMPLATE_ID) {

		@Override
		protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			return PlanOfCareSectionOperations.validateHITSPPlanOfCareSectionTemplateId(
				(PlanOfCareSection) objectToTest, diagnostician, map);
		}

	}

	}; // TEST_CASE_ARRAY

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		final List<CDATestCase> retValue = super.getTestCases();
		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
		return retValue;
	}

	@Override
	protected EObject getObjectToTest() {
		return HITSPFactory.eINSTANCE.createPlanOfCareSection();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return HITSPFactory.eINSTANCE.createPlanOfCareSection().init();
	}

} // PlanOfCareSectionOperationsTest
