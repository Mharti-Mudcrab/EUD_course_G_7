/*
 * generated by Xtext 2.36.0
 */
package dk.sdu.bdd.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractBddDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(dk.sdu.bdd.xtext.bddDsl.BddDslPackage.eINSTANCE);
		return result;
	}
}
