/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2.validation;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndAnnotations;
import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndDerivation;
import org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndSpecialization;
import org.openhealthtools.mdht.emf.hl7.mif2.BusinessName;
import org.openhealthtools.mdht.emf.hl7.mif2.ConformanceKind;
import org.openhealthtools.mdht.emf.hl7.mif2.UpdateModeKind;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.AssociationEndBase}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AssociationEndBaseValidator {
	boolean validate();

	boolean validateBusinessName(EList<BusinessName> value);

	boolean validateAnnotations(AssociationEndAnnotations value);

	boolean validateDerivedFrom(EList<AssociationEndDerivation> value);

	boolean validateChoiceItem(EList<AssociationEndSpecialization> value);

	boolean validateConformance(ConformanceKind value);

	boolean validateExtensionOID(String value);

	boolean validateIsMandatory(boolean value);

	boolean validateMaximumMultiplicity(Object value);

	boolean validateMaximumRecursionDepth(BigInteger value);

	boolean validateMinimumMultiplicity(BigInteger value);

	boolean validateName(String value);

	boolean validateNameLocked(boolean value);

	boolean validateReferenceHistory(boolean value);

	boolean validateSortKey(String value);

	boolean validateUpdateModeDefault(UpdateModeKind value);

	boolean validateUpdateModesAllowed(List<UpdateModeKind> value);
}
