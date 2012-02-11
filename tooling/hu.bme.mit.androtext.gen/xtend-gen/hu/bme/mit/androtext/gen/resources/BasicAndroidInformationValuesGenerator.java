package hu.bme.mit.androtext.gen.resources;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.IGeneratorSlots;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.Activity;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class BasicAndroidInformationValuesGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions extensions;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication androidApplication) {
    StringConcatenation _content = this.content(resourceSet, androidApplication);
    fsa.generateFile("string.xml", IGeneratorSlots.VALUES_SLOT, _content);
  }
  
  public StringConcatenation content(final ResourceSet resourceSet, final TargetApplication androidApplication) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _xmlHeader = this.extensions.xmlHeader(androidApplication);
    _builder.append(_xmlHeader, "");
    _builder.newLineIfNotEmpty();
    _builder.append("<resources>");
    _builder.newLine();
    _builder.append("\t");
    AndroidApplication _application = androidApplication.getApplication();
    String _name = _application.getName();
    StringConcatenation _stringLine = this.stringLine("app_name", _name);
    _builder.append(_stringLine, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _findPackageName = this.extensions.findPackageName(androidApplication);
    StringConcatenation _stringLine_1 = this.stringLine("package_name", _findPackageName);
    _builder.append(_stringLine_1, "	");
    _builder.newLineIfNotEmpty();
    {
      EList<Resource> _resources = resourceSet.getResources();
      final Function1<Resource,Iterable<Activity>> _function = new Function1<Resource,Iterable<Activity>>() {
          public Iterable<Activity> apply(final Resource r) {
            Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(r);
            Iterable<Activity> _filter = IterableExtensions.<Activity>filter(_allContentsIterable, hu.bme.mit.androtext.lang.androTextDsl.Activity.class);
            return _filter;
          }
        };
      List<Iterable<Activity>> _map = ListExtensions.<Resource, Iterable<Activity>>map(_resources, _function);
      Iterable<Activity> _flatten = IterableExtensions.<Activity>flatten(_map);
      for(final Activity activity : _flatten) {
        _builder.append("\t");
        String _activityNameValue = this.extensions.activityNameValue(activity);
        String _name_1 = activity.getName();
        StringConcatenation _stringLine_2 = this.stringLine(_activityNameValue, _name_1);
        _builder.append(_stringLine_2, "	");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</resources>");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation stringLine(final String name, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<string name=\"");
    _builder.append(name, "");
    _builder.append("\">");
    _builder.append(value, "");
    _builder.append("</string>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}