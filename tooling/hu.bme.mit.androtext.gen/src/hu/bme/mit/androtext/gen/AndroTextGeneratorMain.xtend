package hu.bme.mit.androtext.gen

import com.google.inject.Inject
import hu.bme.mit.androtext.gen.activity.AbstractActivityClassGenerator
import hu.bme.mit.androtext.gen.activity.ActivityClassGenerator
import hu.bme.mit.androtext.gen.application.AndroidManifestGenerator
import hu.bme.mit.androtext.gen.entity.EntityClassGenerator
import hu.bme.mit.androtext.gen.entity.EntityTableGenerator
import hu.bme.mit.androtext.gen.layout.LayoutResourceGenerator
import hu.bme.mit.androtext.gen.resources.BasicAndroidInformationValuesGenerator
import hu.bme.mit.androtext.gen.resources.StringArrayResourceGenerator
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess
import hu.bme.mit.androtext.gen.layout.TabLayoutGenerator
import hu.bme.mit.androtext.gen.selector.SelectorGenerator
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider

class AndroTextGeneratorMain implements IMainGenerator {
	
	@Inject EntityClassGenerator entityClassGenerator
	
	@Inject EntityTableGenerator entityTableGenerator
	
	@Inject AndroidManifestGenerator manifestGenerator
	
	@Inject BasicAndroidInformationValuesGenerator basicValueGenerator
	
	@Inject StringArrayResourceGenerator stringArrayResourceGenerator
	
	@Inject AbstractActivityClassGenerator abstractActivityClassGenerator
	
	@Inject ActivityClassGenerator activityClassGenerator
	
	@Inject LayoutResourceGenerator layoutGenerator
	
	@Inject TabLayoutGenerator tabLayoutGenerator
	
	@Inject SelectorGenerator selectorGenerator
	
	override void doGenerate(ResourceSet resourceSet, IFileSystemAccess fsa, TargetApplication targetApplication) {
		// generate data related stuff only when a contentprovider exist in the application file
		if (!targetApplication.application.modelElements.filter(typeof (DatabaseContentProvider)).empty) {
			entityClassGenerator.doGenerate(resourceSet, fsa, targetApplication);
			entityTableGenerator.doGenerate(resourceSet, fsa, targetApplication);	
		}
		manifestGenerator.doGenerate(resourceSet, fsa, targetApplication);
		basicValueGenerator.doGenerate(resourceSet, fsa, targetApplication);
		stringArrayResourceGenerator.doGenerate(resourceSet, fsa, targetApplication);
		abstractActivityClassGenerator.doGenerate(resourceSet, fsa, targetApplication);
		activityClassGenerator.doGenerate(resourceSet, fsa, targetApplication);
		layoutGenerator.doGenerate(resourceSet, fsa, targetApplication);
		tabLayoutGenerator.doGenerate(resourceSet, fsa, targetApplication);
		selectorGenerator.doGenerate(resourceSet, fsa, targetApplication);
	}
	
}