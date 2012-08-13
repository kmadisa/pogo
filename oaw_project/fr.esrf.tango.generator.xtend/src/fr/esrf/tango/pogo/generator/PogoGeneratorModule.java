package fr.esrf.tango.pogo.generator;

import java.net.URI;
import java.util.ArrayList;

import net.danieldietrich.protectedregions.core.IRegionParser;
import net.danieldietrich.protectedregions.core.RegionParserBuilder;
import net.danieldietrich.protectedregions.core.RegionParserFactory;
import net.danieldietrich.protectedregions.support.IPathFilter;
import net.danieldietrich.protectedregions.support.ProtectedRegionSupport;
import net.danieldietrich.protectedregions.xtext.BidiJavaIoFileSystemAccess;

import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.service.AbstractGenericModule;

import com.google.inject.Provides;

//import org.tango.pogo.pogo_gui.tools.OAWutils;

import fr.esrf.tango.pogo.generator.pr.PogoPR;

public class PogoGeneratorModule extends AbstractGenericModule {
//	@Inject
//	IOutputConfigurationProvider outputConfigurationProvider;
	
//	public void configureIFileSystemAccess (Binder binder) {
//		JavaIoFileSystemAccess fsa = new JavaIoFileSystemAccess();
//		IOutputConfigurationProvider outputConfigurationProvider = 
//				binder.getProvider(IOutputConfigurationProvider.class).get();
//		for (OutputConfiguration cfg : outputConfigurationProvider.getOutputConfigurations()) {
//			fsa.getOutputConfigurations().put(cfg.getName(), cfg);
//		}
//		binder.bind(IFileSystemAccess.class).toInstance(fsa);
//	}
//	
	public Class<? extends IGenerator> bindIGenerator () {
		return PogoDslGenerator.class;
	}

	@Provides
	public JavaIoFileSystemAccess createJavaIoFileSystemAccess(ProtectedRegionSupport support) {
		
		

		// comments in Java and C++ are the same, so we just add the file extensions for C++ to the Java parser
		support.addParser(RegionParserFactory.createJavaParser(new PogoPR(),false), ".java", ".cpp", ".h", ".html");
		support.addParser(RegionParserFactory.createXmlParser(), ".xml", ".xsd");
		support.addParser(createPythonParser(), "py");		
		BidiJavaIoFileSystemAccess fsa = new BidiJavaIoFileSystemAccess(support);
		fsa.setFilter(new pogoPathFilter()); // (optional)
	  return fsa;
	}
	
	private IRegionParser createPythonParser () {
		IRegionParser parser = new RegionParserBuilder().name("python").addComment("#").ignoreCData('"', '\\')
				.ignoreCData('\'', '\\').setInverse(false).useOracle(new PogoPR()).build();
		return parser;
	}
	
	//===================================================================================
	//===================================================================================
	private class pogoPathFilter implements IPathFilter {
		
		//===================================================================================
		private ArrayList<String>	generatedFiles = new ArrayList<String>();
		pogoPathFilter() {
			
			//	Build the list of generated files.
			String	targetDir = System.getProperty("targetDir");
			String	className = System.getProperty("className");
			String	language  = System.getProperty("targetLanguage");
			System.out.println(targetDir + "/" + className + " : " + language);
			
			generatedFiles.clear();
			if (language.toLowerCase().equals("cpp"))
				fillGeneratedFilesListForCpp(targetDir, className);
			else
			if (language.toLowerCase().equals("java"))
				fillGeneratedFilesListForJava(targetDir, className);
			else
			if (language.toLowerCase().equals("python"))
				fillGeneratedFilesListForPython(targetDir, className);
			//	Add html file for all languages
			generatedFiles.add(targetDir+"/doc_html/Description.html");
			generatedFiles.add(targetDir+"/../doc_html/Description.html");
		}
		//===================================================================================
		public boolean accept(URI uri) {

			String fileName = uri.getPath();
		
			for (String generateFile : generatedFiles) {
				if (generateFile.contains("*")) {
					int	pos = generateFile.indexOf('*');
					String head = generateFile.substring(0, pos);
					String end  = generateFile.substring(pos+1);
					if (fileName.startsWith(head) && fileName.endsWith(end)) {
						return true;
					}
				}
				else
				if (generateFile.equals(fileName)) {
					return true;
				}
					
			}
			//System.out.println(fileName + "  Not found !");
			return false;
			//return uri.getPath().endsWith("Makefile");
		}
		//===================================================================================
		private void fillGeneratedFilesListForCpp(String targetDir, String className) {
			generatedFiles.add(targetDir+"/"+className + ".h");
			generatedFiles.add(targetDir+"/"+className + ".cpp");
			generatedFiles.add(targetDir+"/"+className + "Class.h");
			generatedFiles.add(targetDir+"/"+className + "Class.cpp");
			generatedFiles.add(targetDir+"/"+className + "StateMachine.cpp");
			generatedFiles.add(targetDir+"/"+className + "DynAttrUtils.cpp");
			generatedFiles.add(targetDir+"/ClassFactory.cpp");
			generatedFiles.add(targetDir+"/MultiClassFactory.cpp");
			generatedFiles.add(targetDir+"/main.cpp");
			generatedFiles.add(targetDir+"/Makefile");
			generatedFiles.add(targetDir+"/Makefile.multi");
		}
		//===================================================================================
		private void fillGeneratedFilesListForJava(String targetDir, String className) {
			generatedFiles.add(targetDir+"/org/tango/" + className.toLowerCase() + "/*.java");
			generatedFiles.add(targetDir+"/Makefile");
		}
		//===================================================================================
		private void fillGeneratedFilesListForPython(String targetDir, String className) {
			generatedFiles.add(targetDir+"/"+className.toLowerCase() + ".py");
		}
		//===================================================================================
	}
}