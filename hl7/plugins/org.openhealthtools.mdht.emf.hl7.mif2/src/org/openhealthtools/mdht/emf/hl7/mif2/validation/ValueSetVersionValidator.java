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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.emf.hl7.mif2.ConceptProperty;
import org.openhealthtools.mdht.emf.hl7.mif2.ContentDefinition;
import org.openhealthtools.mdht.emf.hl7.mif2.VocabularyCodeRefs;

/**
 * A sample validator interface for {@link org.openhealthtools.mdht.emf.hl7.mif2.ValueSetVersion}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ValueSetVersionValidator {
	boolean validate();

	boolean validateUsesCodeSystemSupplement(EList<String> value);

	boolean validateSupportedCodeSystem(EList<String> value);

	boolean validateSupportedLanguage(EList<String> value);

	boolean validateAssociatedConceptProperty(EList<ConceptProperty> value);

	boolean validateContent(ContentDefinition value);

	boolean validateNonSelectableContent(ContentDefinition value);

	boolean validateEnumeratedContent(VocabularyCodeRefs value);

	boolean validateExampleContent(VocabularyCodeRefs value);

	boolean validateVersionDate(XMLGregorianCalendar value);

	boolean validateVersionTime(XMLGregorianCalendar value);
}
