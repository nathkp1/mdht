/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.PayerEntity;

import org.openhealthtools.mdht.uml.cda.ccd.operations.PayerEntityOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Payer Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PayerEntity#validatePayerEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Payer Entity Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PayerEntityTest extends CDAValidationTest {

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePayerEntityId() {
		OperationsTestCase<PayerEntity> validatePayerEntityIdTestCase = new OperationsTestCase<PayerEntity>(
				"validatePayerEntityId",
				operationsForOCL
						.getOCLValue("VALIDATE_PAYER_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PayerEntity target) {

			}

			@Override
			protected void updateToPass(PayerEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PayerEntityOperations.validatePayerEntityId(
						(PayerEntity) objectToTest, diagnostician, map);
			}

		};

		validatePayerEntityIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	private static class OperationsForOCL extends PayerEntityOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<PayerEntity> {
		public PayerEntity create() {
			return CCDFactory.eINSTANCE.createPayerEntity();
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
	 *
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // PayerEntityOperations