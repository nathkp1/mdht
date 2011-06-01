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
import org.openhealthtools.mdht.uml.cda.ccd.ProductInstance;

import org.openhealthtools.mdht.uml.cda.ccd.operations.ProductInstanceOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Product Instance</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProductInstance#validateProductInstanceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProductInstance#validateProductInstanceClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Product Instance Class Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProductInstanceTest extends CDAValidationTest {

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateProductInstanceTemplateId() {
		OperationsTestCase<ProductInstance> validateProductInstanceTemplateIdTestCase = new OperationsTestCase<ProductInstance>(
				"validateProductInstanceTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_PRODUCT_INSTANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ProductInstance target) {

			}

			@Override
			protected void updateToPass(ProductInstance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductInstanceOperations
						.validateProductInstanceTemplateId(
								(ProductInstance) objectToTest, diagnostician,
								map);
			}

		};

		validateProductInstanceTemplateIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateProductInstanceClassCode() {
		OperationsTestCase<ProductInstance> validateProductInstanceClassCodeTestCase = new OperationsTestCase<ProductInstance>(
				"validateProductInstanceClassCode",
				operationsForOCL
						.getOCLValue("VALIDATE_PRODUCT_INSTANCE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ProductInstance target) {

			}

			@Override
			protected void updateToPass(ProductInstance target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductInstanceOperations
						.validateProductInstanceClassCode(
								(ProductInstance) objectToTest, diagnostician,
								map);
			}

		};

		validateProductInstanceClassCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	private static class OperationsForOCL extends ProductInstanceOperations {
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
			TestObjectFactory<ProductInstance> {
		public ProductInstance create() {
			return CCDFactory.eINSTANCE.createProductInstance();
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

} // ProductInstanceOperations