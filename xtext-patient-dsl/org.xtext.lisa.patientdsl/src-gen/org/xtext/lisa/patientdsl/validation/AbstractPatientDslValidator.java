/*
 * generated by Xtext 2.33.0
 */
package org.xtext.lisa.patientdsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractPatientDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.lisa.patientdsl.patientDsl.PatientDslPackage.eINSTANCE);
		return result;
	}
}
