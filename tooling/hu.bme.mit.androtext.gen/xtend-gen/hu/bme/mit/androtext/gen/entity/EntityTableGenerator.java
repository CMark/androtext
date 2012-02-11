package hu.bme.mit.androtext.gen.entity;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.IGenerator;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AndroDataModelRoot;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplication;
import hu.bme.mit.androtext.lang.androTextDsl.AndroidApplicationModelElement;
import hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider;
import hu.bme.mit.androtext.lang.androTextDsl.Entity;
import hu.bme.mit.androtext.lang.androTextDsl.Property;
import hu.bme.mit.androtext.lang.androTextDsl.TargetApplication;
import hu.bme.mit.androtext.lang.androTextDsl.TypeRef;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EntityTableGenerator implements IGenerator {
  @Inject
  private GeneratorExtensions extensions;
  
  public void doGenerate(final ResourceSet resourceSet, final IFileSystemAccess fsa, final TargetApplication androidApplication) {
    String _dataInformationClassName = this.extensions.dataInformationClassName(androidApplication);
    String _operator_plus = StringExtensions.operator_plus(_dataInformationClassName, ".java");
    StringConcatenation _generateDataInformation = this.generateDataInformation(resourceSet, androidApplication);
    fsa.generateFile(_operator_plus, _generateDataInformation);
  }
  
  public StringConcatenation generateDataInformation(final ResourceSet resourceSet, final TargetApplication androidApplication) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _findPackageName = this.extensions.findPackageName(androidApplication);
    _builder.append(_findPackageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import android.net.Uri;");
    _builder.newLine();
    _builder.append("import android.provider.BaseColumns;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public final class ");
    String _dataInformationClassName = this.extensions.dataInformationClassName(androidApplication);
    _builder.append(_dataInformationClassName, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final String AUTHORITY = \"");
    String _dataPackageName = this.extensions.dataPackageName(androidApplication);
    _builder.append(_dataPackageName, "    ");
    _builder.append(".");
    String _dataInformationClassName_1 = this.extensions.dataInformationClassName(androidApplication);
    _builder.append(_dataInformationClassName_1, "    ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// This class cannot be instantiated");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private ");
    String _dataInformationClassName_2 = this.extensions.dataInformationClassName(androidApplication);
    _builder.append(_dataInformationClassName_2, "    ");
    _builder.append("() {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    \t\t");
    _builder.newLine();
    {
      AndroidApplication _application = androidApplication.getApplication();
      EList<AndroidApplicationModelElement> _modelElements = _application.getModelElements();
      Iterable<DatabaseContentProvider> _filter = IterableExtensions.<DatabaseContentProvider>filter(_modelElements, hu.bme.mit.androtext.lang.androTextDsl.DatabaseContentProvider.class);
      for(final DatabaseContentProvider databaseContentProvider : _filter) {
        {
          AndroDataModelRoot _datamodel = databaseContentProvider.getDatamodel();
          EList<Entity> _entities = _datamodel.getEntities();
          for(final Entity entity : _entities) {
            _builder.append("\t");
            StringConcatenation _entityTable = this.entityTable(entity, androidApplication);
            _builder.append(_entityTable, "	");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation entityTable(final Entity e, final TargetApplication androidApplication) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Profiles table");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static final class ");
    String _className = this.extensions.className(e);
    _builder.append(_className, "");
    _builder.append("s implements BaseColumns {");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// This class cannot be instantiated");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private ");
    String _className_1 = this.extensions.className(e);
    _builder.append(_className_1, "    ");
    _builder.append("s() {}");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The table name offered by this provider");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final String TABLE_NAME = \"");
    String _name = e.getName();
    String _lowerCase = _name.toLowerCase();
    _builder.append(_lowerCase, "    ");
    _builder.append("s\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* URI definitions");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The scheme part for this provider\'s URI");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static final String SCHEME = \"content://\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Path parts for the URIs");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Path part for the ");
    String _name_1 = e.getName();
    String _lowerCase_1 = _name_1.toLowerCase();
    _builder.append(_lowerCase_1, "     ");
    _builder.append("s URI");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static final String PATH_");
    String _name_2 = e.getName();
    String _upperCase = _name_2.toUpperCase();
    _builder.append(_upperCase, "    ");
    _builder.append("S = \"/");
    String _name_3 = e.getName();
    String _lowerCase_2 = _name_3.toLowerCase();
    _builder.append(_lowerCase_2, "    ");
    _builder.append("s\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Path part for the ");
    String _name_4 = e.getName();
    String _lowerCase_3 = _name_4.toLowerCase();
    _builder.append(_lowerCase_3, "     ");
    _builder.append(" ID URI");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static final String PATH_");
    String _name_5 = e.getName();
    String _upperCase_1 = _name_5.toUpperCase();
    _builder.append(_upperCase_1, "    ");
    _builder.append("_ID = \"/");
    String _name_6 = e.getName();
    String _lowerCase_4 = _name_6.toLowerCase();
    _builder.append(_lowerCase_4, "    ");
    _builder.append("s/\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* 0-relative position of a ");
    String _name_7 = e.getName();
    String _lowerCase_5 = _name_7.toLowerCase();
    _builder.append(_lowerCase_5, "     ");
    _builder.append(" ID segment in the path part of a ");
    String _name_8 = e.getName();
    String _lowerCase_6 = _name_8.toLowerCase();
    _builder.append(_lowerCase_6, "     ");
    _builder.append(" ID URI");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final int ");
    String _name_9 = e.getName();
    String _upperCase_2 = _name_9.toUpperCase();
    _builder.append(_upperCase_2, "    ");
    _builder.append("_ID_PATH_POSITION = 1;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The content:// style URL for this table");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final Uri CONTENT_URI =  Uri.parse(SCHEME + AUTHORITY + PATH_");
    String _name_10 = e.getName();
    String _upperCase_3 = _name_10.toUpperCase();
    _builder.append(_upperCase_3, "    ");
    _builder.append("S);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The content URI base for a single ");
    String _name_11 = e.getName();
    String _lowerCase_7 = _name_11.toLowerCase();
    _builder.append(_lowerCase_7, "     ");
    _builder.append(". Callers must");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("* append a numeric ");
    String _name_12 = e.getName();
    String _lowerCase_8 = _name_12.toLowerCase();
    _builder.append(_lowerCase_8, "     ");
    _builder.append(" id to this Uri to retrieve a ");
    String _name_13 = e.getName();
    String _lowerCase_9 = _name_13.toLowerCase();
    _builder.append(_lowerCase_9, "     ");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final Uri CONTENT_ID_URI_BASE");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("= Uri.parse(SCHEME + AUTHORITY + PATH_");
    String _name_14 = e.getName();
    String _upperCase_4 = _name_14.toUpperCase();
    _builder.append(_upperCase_4, "        ");
    _builder.append("_ID);");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The content URI match pattern for a single ");
    String _name_15 = e.getName();
    String _lowerCase_10 = _name_15.toLowerCase();
    _builder.append(_lowerCase_10, "     ");
    _builder.append(", specified by its ID. Use this to match");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("* incoming URIs or to construct an Intent.");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final Uri CONTENT_ID_URI_PATTERN");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("= Uri.parse(SCHEME + AUTHORITY + PATH_");
    String _name_16 = e.getName();
    String _upperCase_5 = _name_16.toUpperCase();
    _builder.append(_upperCase_5, "        ");
    _builder.append("_ID + \"/#\");");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* MIME type definitions");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The MIME type of {@link #CONTENT_URI} providing a directory of ");
    String _name_17 = e.getName();
    String _lowerCase_11 = _name_17.toLowerCase();
    _builder.append(_lowerCase_11, "     ");
    _builder.append("s.");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final String CONTENT_TYPE = \"vnd.android.cursor.dir/vnd.");
    String _findPackageName = this.extensions.findPackageName(androidApplication);
    _builder.append(_findPackageName, "    ");
    _builder.append(".");
    String _name_18 = e.getName();
    String _lowerCase_12 = _name_18.toLowerCase();
    _builder.append(_lowerCase_12, "    ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The MIME type of a {@link #CONTENT_URI} sub-directory of a single");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* ");
    String _name_19 = e.getName();
    String _lowerCase_13 = _name_19.toLowerCase();
    _builder.append(_lowerCase_13, "     ");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final String CONTENT_ITEM_TYPE = \"vnd.android.cursor.item/vnd.");
    String _findPackageName_1 = this.extensions.findPackageName(androidApplication);
    _builder.append(_findPackageName_1, "    ");
    _builder.append(".");
    String _name_20 = e.getName();
    String _lowerCase_14 = _name_20.toLowerCase();
    _builder.append(_lowerCase_14, "    ");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/**");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* The default sort order for this table");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static final String DEFAULT_SORT_ORDER = \"name ASC\";");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("/*");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("* Column definitions");
    _builder.newLine();
    _builder.append("     ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("     ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation column(final Property f) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/**");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* Column name for the ");
    String _name = f.getName();
    _builder.append(_name, " ");
    _builder.append(" feature");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("* <P>Type: ");
    TypeRef _type = f.getType();
    _builder.append(_type, " ");
    _builder.append("</P>");
    _builder.newLineIfNotEmpty();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public static final String ");
    String _name_1 = f.getName();
    String _upperCase = _name_1.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append(" = \"");
    String _name_2 = f.getName();
    _builder.append(_name_2, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
