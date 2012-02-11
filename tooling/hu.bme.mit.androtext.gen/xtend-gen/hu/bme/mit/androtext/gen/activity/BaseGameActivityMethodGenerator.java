package hu.bme.mit.androtext.gen.activity;

import com.google.inject.Inject;
import hu.bme.mit.androtext.gen.util.GeneratorExtensions;
import hu.bme.mit.androtext.lang.androTextDsl.AndroGameLogic;
import hu.bme.mit.androtext.lang.androTextDsl.AnimatedSprite;
import hu.bme.mit.androtext.lang.androTextDsl.BaseGameActivity;
import hu.bme.mit.androtext.lang.androTextDsl.Bindable;
import hu.bme.mit.androtext.lang.androTextDsl.Binding;
import hu.bme.mit.androtext.lang.androTextDsl.BindingTarget;
import hu.bme.mit.androtext.lang.androTextDsl.Body;
import hu.bme.mit.androtext.lang.androTextDsl.BodyType;
import hu.bme.mit.androtext.lang.androTextDsl.Box2DOptions;
import hu.bme.mit.androtext.lang.androTextDsl.BoxBody;
import hu.bme.mit.androtext.lang.androTextDsl.ByDouble;
import hu.bme.mit.androtext.lang.androTextDsl.BySingle;
import hu.bme.mit.androtext.lang.androTextDsl.CircleBody;
import hu.bme.mit.androtext.lang.androTextDsl.Color;
import hu.bme.mit.androtext.lang.androTextDsl.ConstantColor;
import hu.bme.mit.androtext.lang.androTextDsl.EntityBindingTarget;
import hu.bme.mit.androtext.lang.androTextDsl.EntityModifier;
import hu.bme.mit.androtext.lang.androTextDsl.Fixture;
import hu.bme.mit.androtext.lang.androTextDsl.Font;
import hu.bme.mit.androtext.lang.androTextDsl.FontType;
import hu.bme.mit.androtext.lang.androTextDsl.FromDouble;
import hu.bme.mit.androtext.lang.androTextDsl.FromSingle;
import hu.bme.mit.androtext.lang.androTextDsl.GameBackground;
import hu.bme.mit.androtext.lang.androTextDsl.GameEntity;
import hu.bme.mit.androtext.lang.androTextDsl.GameMenuItem;
import hu.bme.mit.androtext.lang.androTextDsl.HorizontalAlign;
import hu.bme.mit.androtext.lang.androTextDsl.Joint;
import hu.bme.mit.androtext.lang.androTextDsl.Line;
import hu.bme.mit.androtext.lang.androTextDsl.LineBody;
import hu.bme.mit.androtext.lang.androTextDsl.LogicComponent;
import hu.bme.mit.androtext.lang.androTextDsl.LoopEntityModifier;
import hu.bme.mit.androtext.lang.androTextDsl.MenuScene;
import hu.bme.mit.androtext.lang.androTextDsl.MoveByModifier;
import hu.bme.mit.androtext.lang.androTextDsl.MoveModifier;
import hu.bme.mit.androtext.lang.androTextDsl.Position;
import hu.bme.mit.androtext.lang.androTextDsl.Rectangle;
import hu.bme.mit.androtext.lang.androTextDsl.RotationByModifier;
import hu.bme.mit.androtext.lang.androTextDsl.RotationModifier;
import hu.bme.mit.androtext.lang.androTextDsl.Scene;
import hu.bme.mit.androtext.lang.androTextDsl.ScreenOrientation;
import hu.bme.mit.androtext.lang.androTextDsl.SequenceEntityModifier;
import hu.bme.mit.androtext.lang.androTextDsl.SimpleEntity;
import hu.bme.mit.androtext.lang.androTextDsl.Size;
import hu.bme.mit.androtext.lang.androTextDsl.Sprite;
import hu.bme.mit.androtext.lang.androTextDsl.Text;
import hu.bme.mit.androtext.lang.androTextDsl.TextureRegion;
import hu.bme.mit.androtext.lang.androTextDsl.ToDouble;
import hu.bme.mit.androtext.lang.androTextDsl.ToSingle;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.BooleanExtensions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.ResourceExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class BaseGameActivityMethodGenerator {
  @Inject
  private GeneratorExtensions _generatorExtensions;
  
  public StringConcatenation gameMethods(final BaseGameActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public Engine onLoadEngine() {");
    _builder.newLine();
    _builder.append("\t");
    StringConcatenation _loadEngine = this.loadEngine(activity);
    _builder.append(_loadEngine, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public void onLoadResources() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("BitmapTextureAtlasTextureRegionFactory.setAssetBasePath(\"gfx/\");");
    _builder.newLine();
    _builder.append("\t");
    StringConcatenation _loadResources = this.loadResources(activity);
    _builder.append(_loadResources, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public Scene onLoadScene() {");
    _builder.newLine();
    _builder.append("\t");
    Scene _scene = activity.getScene();
    StringConcatenation _loadScene = this.loadScene(_scene);
    _builder.append(_loadScene, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public void onLoadComplete() {");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("private void initializeScene(Scene scene) {");
    _builder.newLine();
    _builder.append("\t");
    Scene _scene_1 = activity.getScene();
    StringConcatenation _initializeScene = this.initializeScene(_scene_1);
    _builder.append(_initializeScene, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("private void initializeLogic() {");
    _builder.newLine();
    _builder.append("\t");
    Scene _scene_2 = activity.getScene();
    StringConcatenation _initializeLogic = this.initializeLogic(_scene_2);
    _builder.append(_initializeLogic, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("private void initializeBox2D() {");
    _builder.newLine();
    _builder.append("\t");
    Scene _scene_3 = activity.getScene();
    StringConcatenation _initializeBox2D = this.initializeBox2D(_scene_3);
    _builder.append(_initializeBox2D, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      Scene _scene_4 = activity.getScene();
      Resource _eResource = _scene_4.eResource();
      Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(_eResource);
      Iterable<MenuScene> _filter = IterableExtensions.<MenuScene>filter(_allContentsIterable, hu.bme.mit.androtext.lang.androTextDsl.MenuScene.class);
      for(final MenuScene menu : _filter) {
        _builder.append("private void ");
        StringConcatenation _createMenuMethodName = this._generatorExtensions.createMenuMethodName(menu);
        String _string = _createMenuMethodName.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        StringConcatenation _menuSceneFieldName = this._generatorExtensions.menuSceneFieldName(menu);
        String _string_1 = _menuSceneFieldName.toString();
        String _trim_1 = _string_1.trim();
        final String menuFieldName = _trim_1;
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        _builder.append(menuFieldName, "	");
        _builder.append(" = new MenuScene(this.mCamera);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        Scene _scene_5 = activity.getScene();
        StringConcatenation _generateMenuItems = this.generateMenuItems(_scene_5);
        _builder.append(_generateMenuItems, "	");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        _builder.append(menuFieldName, "	");
        _builder.append(".buildAnimations();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        _builder.append(menuFieldName, "	");
        _builder.append(".setBackgroundEnabled(false);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("this.");
        _builder.append(menuFieldName, "	");
        _builder.append(".setOnMenuItemClickListener(this);");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  protected StringConcatenation _generateMenuItems(final Scene scene) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generateMenuItems(final MenuScene scene) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<GameMenuItem> _menuItems = scene.getMenuItems();
      for(final GameMenuItem item : _menuItems) {
        StringConcatenation _type = this.type(item);
        String _string = _type.toString();
        String _trim = _string.trim();
        final String menuItemType = _trim;
        _builder.newLineIfNotEmpty();
        _builder.append("final ");
        _builder.append(menuItemType, "");
        _builder.append("MenuItem ");
        StringConcatenation _variableName = this._generatorExtensions.variableName(item);
        String _string_1 = _variableName.toString();
        String _trim_1 = _string_1.trim();
        _builder.append(_trim_1, "");
        _builder.append(" = new ");
        _builder.append(menuItemType, "");
        _builder.append("MenuItem(");
        String _name = item.getName();
        String _upperCase = _name.toUpperCase();
        _builder.append(_upperCase, "");
        _builder.append(", ");
        StringConcatenation _ctrParameters = this.ctrParameters(item);
        String _string_2 = _ctrParameters.toString();
        String _trim_2 = _string_2.trim();
        _builder.append(_trim_2, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        StringConcatenation _variableName_1 = this._generatorExtensions.variableName(item);
        String _string_3 = _variableName_1.toString();
        String _trim_3 = _string_3.trim();
        _builder.append(_trim_3, "");
        _builder.append(".setBlendFunction(GL10.GL_SRC_ALPHA, GL10.GL_ONE_MINUS_SRC_ALPHA);");
        _builder.newLineIfNotEmpty();
        _builder.append("this.");
        StringConcatenation _menuSceneFieldName = this._generatorExtensions.menuSceneFieldName(scene);
        String _string_4 = _menuSceneFieldName.toString();
        String _trim_4 = _string_4.trim();
        _builder.append(_trim_4, "");
        _builder.append(".addMenuItem(");
        StringConcatenation _variableName_2 = this._generatorExtensions.variableName(item);
        String _string_5 = _variableName_2.toString();
        String _trim_5 = _string_5.trim();
        _builder.append(_trim_5, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation type(final GameMenuItem item) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _text = item.getText();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_text, null);
      if (_operator_notEquals) {
        _builder.append("Text");
        _builder.newLine();
      } else {
        TextureRegion _textureRegion = item.getTextureRegion();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_textureRegion, null);
        if (_operator_notEquals_1) {
          _builder.append("Sprite");
          _builder.newLine();
        } else {
          _builder.append("Wrong model state at GameMenuItem!!!");
          _builder.newLine();
        }
      }
    }
    return _builder;
  }
  
  public StringConcatenation initializeBox2D(final Scene scene) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Resource _eResource = scene.eResource();
      Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(_eResource);
      Iterable<AndroGameLogic> _filter = IterableExtensions.<AndroGameLogic>filter(_allContentsIterable, hu.bme.mit.androtext.lang.androTextDsl.AndroGameLogic.class);
      for(final AndroGameLogic logic : _filter) {
        {
          boolean _containsBox2DObject = this._generatorExtensions.containsBox2DObject(logic);
          if (_containsBox2DObject) {
            _builder.append("this.mPhysicsWorld = new PhysicsWorld(new Vector2(0, ");
            {
              Box2DOptions _box2dOptions = logic.getBox2dOptions();
              boolean _operator_equals = ObjectExtensions.operator_equals(_box2dOptions, null);
              if (_operator_equals) {
                _builder.append("SensorManager.GRAVITY_EARTH");
              } else {
                Box2DOptions _box2dOptions_1 = logic.getBox2dOptions();
                float _gravity = _box2dOptions_1.getGravity();
                _builder.append(_gravity, "");
              }
            }
            _builder.append("), false);");
            _builder.newLineIfNotEmpty();
            _builder.append("// create box2d components");
            _builder.newLine();
            StringConcatenation _generateBox2DComponents = this.generateBox2DComponents(logic);
            _builder.append(_generateBox2DComponents, "");
            _builder.newLineIfNotEmpty();
            _builder.append("this.mScene.registerUpdateHandler(this.mPhysicsWorld);");
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  public StringConcatenation generateBox2DComponents(final AndroGameLogic logic) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<LogicComponent> _logicComponent = logic.getLogicComponent();
      Iterable<Fixture> _filter = IterableExtensions.<Fixture>filter(_logicComponent, hu.bme.mit.androtext.lang.androTextDsl.Fixture.class);
      for(final Fixture fixture : _filter) {
        _builder.append("FixtureDef ");
        String _name = fixture.getName();
        _builder.append(_name, "");
        _builder.append(" = PhysicsFactory.createFixtureDef(");
        float _density = fixture.getDensity();
        _builder.append(_density, "");
        _builder.append("f, ");
        float _restitution = fixture.getRestitution();
        _builder.append(_restitution, "");
        _builder.append("f, ");
        float _friction = fixture.getFriction();
        _builder.append(_friction, "");
        _builder.append("f);");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<LogicComponent> _logicComponent_1 = logic.getLogicComponent();
      Iterable<Body> _filter_1 = IterableExtensions.<Body>filter(_logicComponent_1, hu.bme.mit.androtext.lang.androTextDsl.Body.class);
      for(final Body body : _filter_1) {
        {
          Resource _eResource = logic.eResource();
          Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(_eResource);
          Iterable<Binding> _filter_2 = IterableExtensions.<Binding>filter(_allContentsIterable, hu.bme.mit.androtext.lang.androTextDsl.Binding.class);
          for(final Binding binding : _filter_2) {
            {
              Bindable _bindable = binding.getBindable();
              boolean _equals = _bindable.equals(body);
              if (_equals) {
                BindingTarget _bindingTarget = binding.getBindingTarget();
                GameEntity _entity = this.getEntity(_bindingTarget);
                final GameEntity gameEntity = _entity;
                _builder.newLineIfNotEmpty();
                _builder.append("Body ");
                String _name_1 = body.getName();
                _builder.append(_name_1, "");
                _builder.append("For");
                String _name_2 = gameEntity.getName();
                String _string = _name_2.toString();
                String _trim = _string.trim();
                _builder.append(_trim, "");
                _builder.append(" = PhysicsFactory.create");
                EClass _eClass = body.eClass();
                String _name_3 = _eClass.getName();
                _builder.append(_name_3, "");
                _builder.append("(");
                StringConcatenation _factoryParameters = this.factoryParameters(body, gameEntity);
                String _string_1 = _factoryParameters.toString();
                String _trim_1 = _string_1.trim();
                _builder.append(_trim_1, "");
                _builder.append(");");
                _builder.newLineIfNotEmpty();
                _builder.append("this.mPhysicsWorld.registerPhysicsConnector(new PhysicsConnector(this.");
                StringConcatenation _entityFieldName = this._generatorExtensions.entityFieldName(gameEntity);
                String _string_2 = _entityFieldName.toString();
                String _trim_2 = _string_2.trim();
                _builder.append(_trim_2, "");
                _builder.append(", ");
                String _name_4 = body.getName();
                _builder.append(_name_4, "");
                _builder.append("For");
                String _name_5 = gameEntity.getName();
                _builder.append(_name_5, "");
                _builder.append(", true, true));");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    {
      EList<LogicComponent> _logicComponent_2 = logic.getLogicComponent();
      Iterable<Joint> _filter_3 = IterableExtensions.<Joint>filter(_logicComponent_2, hu.bme.mit.androtext.lang.androTextDsl.Joint.class);
      for(final Joint joint : _filter_3) {
        _builder.append("// TODO: joint generation ");
        String _name_6 = joint.getName();
        _builder.append(_name_6, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected GameEntity _getEntity(final BindingTarget target) {
    return null;
  }
  
  protected GameEntity _getEntity(final EntityBindingTarget target) {
    GameEntity _entity = target.getEntity();
    return _entity;
  }
  
  protected StringConcatenation _factoryParameters(final Body body, final GameEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _factoryParameters(final BoxBody body, final GameEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.mPhysicsWorld, this.");
    StringConcatenation _entityFieldName = this._generatorExtensions.entityFieldName(entity);
    String _string = _entityFieldName.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(", BodyType.");
    BodyType _bodyType = body.getBodyType();
    String _name = _bodyType.name();
    String _lowerCase = _name.toLowerCase();
    String _firstUpper = StringExtensions.toFirstUpper(_lowerCase);
    _builder.append(_firstUpper, "");
    _builder.append("Body, ");
    Fixture _fixture = body.getFixture();
    String _name_1 = _fixture.getName();
    _builder.append(_name_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _factoryParameters(final CircleBody body, final GameEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.mPhysicsWorld, this.");
    StringConcatenation _entityFieldName = this._generatorExtensions.entityFieldName(entity);
    String _string = _entityFieldName.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(", BodyType.");
    BodyType _bodyType = body.getBodyType();
    String _name = _bodyType.name();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append(", ");
    Fixture _fixture = body.getFixture();
    String _name_1 = _fixture.getName();
    _builder.append(_name_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _factoryParameters(final LineBody body, final GameEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.mPhysicsWorld, this.");
    StringConcatenation _entityFieldName = this._generatorExtensions.entityFieldName(entity);
    String _string = _entityFieldName.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(", ");
    Fixture _fixture = body.getFixture();
    String _name = _fixture.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation loadEngine(final BaseGameActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.mCamera = new Camera(0, 0, ");
    Size _size = activity.getSize();
    float _w = _size.getW();
    _builder.append(_w, "");
    _builder.append("f, ");
    Size _size_1 = activity.getSize();
    float _h = _size_1.getH();
    _builder.append(_h, "");
    _builder.append("f); ");
    _builder.newLineIfNotEmpty();
    _builder.append("EngineOptions engineOptions = new EngineOptions(true, ScreenOrientation.");
    ScreenOrientation _orientation = activity.getOrientation();
    String _name = _orientation.name();
    String _upperCase = _name.toUpperCase();
    _builder.append(_upperCase, "");
    _builder.append(", new RatioResolutionPolicy(");
    Size _size_2 = activity.getSize();
    float _w_1 = _size_2.getW();
    _builder.append(_w_1, "");
    _builder.append("f, ");
    Size _size_3 = activity.getSize();
    float _h_1 = _size_3.getH();
    _builder.append(_h_1, "");
    _builder.append("f), this.mCamera);");
    _builder.newLineIfNotEmpty();
    _builder.append("Engine engine = new Engine(engineOptions);");
    _builder.newLine();
    _builder.append("return engine;");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation loadResources(final BaseGameActivity activity) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// load textures");
    _builder.newLine();
    Scene _scene = activity.getScene();
    Resource _eResource = _scene.eResource();
    Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(_eResource);
    Iterable<TextureRegion> _filter = IterableExtensions.<TextureRegion>filter(_allContentsIterable, hu.bme.mit.androtext.lang.androTextDsl.TextureRegion.class);
    Iterable<TextureRegion> regions = _filter;
    _builder.newLineIfNotEmpty();
    Scene _scene_1 = activity.getScene();
    Resource _eResource_1 = _scene_1.eResource();
    Iterable<EObject> _allContentsIterable_1 = ResourceExtensions.allContentsIterable(_eResource_1);
    Iterable<Font> _filter_1 = IterableExtensions.<Font>filter(_allContentsIterable_1, hu.bme.mit.androtext.lang.androTextDsl.Font.class);
    Iterable<Font> fonts = _filter_1;
    _builder.newLineIfNotEmpty();
    {
      for(final TextureRegion texture : regions) {
        _builder.append("BitmapTextureAtlas ");
        String _name = texture.getName();
        _builder.append(_name, "");
        _builder.append(" = new BitmapTextureAtlas(256, 64, TextureOptions.BILINEAR_PREMULTIPLYALPHA);");
        _builder.newLineIfNotEmpty();
        _builder.append("this.");
        StringConcatenation _textureRegionFieldName = this._generatorExtensions.textureRegionFieldName(texture);
        String _string = _textureRegionFieldName.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append(" = BitmapTextureAtlasTextureRegionFactory.createFromAsset(");
        String _name_1 = texture.getName();
        _builder.append(_name_1, "");
        _builder.append(", this, \"");
        String _fileName = texture.getFileName();
        _builder.append(_fileName, "");
        _builder.append("\", 0, 0);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("getEngine().getTextureManager().loadTextures(");
    {
      boolean hasAnyElements = false;
      for(final TextureRegion texture_1 : regions) {
        if (!hasAnyElements) {
          hasAnyElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        String _name_2 = texture_1.getName();
        _builder.append(_name_2, "");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("// load fonts");
    _builder.newLine();
    {
      for(final Font font : fonts) {
        _builder.append("BitmapTextureAtlas ");
        StringConcatenation _textureVariableName = this._generatorExtensions.textureVariableName(font);
        String _string_1 = _textureVariableName.toString();
        String _trim_1 = _string_1.trim();
        _builder.append(_trim_1, "");
        _builder.append(" = new BitmapTextureAtlas(256, 256, TextureOptions.BILINEAR_PREMULTIPLYALPHA);");
        _builder.newLineIfNotEmpty();
        _builder.append("this.");
        StringConcatenation _fontFieldName = this._generatorExtensions.fontFieldName(font);
        String _string_2 = _fontFieldName.toString();
        String _trim_2 = _string_2.trim();
        _builder.append(_trim_2, "");
        _builder.append(" = FontFactory.create(");
        StringConcatenation _textureVariableName_1 = this._generatorExtensions.textureVariableName(font);
        String _string_3 = _textureVariableName_1.toString();
        String _trim_3 = _string_3.trim();
        _builder.append(_trim_3, "");
        _builder.append(", Typeface.create(Typeface.DEFAULT, Typeface.");
        {
          FontType _type = font.getType();
          boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_type, null);
          if (_operator_notEquals) {
            FontType _type_1 = font.getType();
            String _name_3 = _type_1.name();
            String _upperCase = _name_3.toUpperCase();
            _builder.append(_upperCase, "");
          } else {
            _builder.append("NORMAL");
          }
        }
        _builder.append("), ");
        int _size = font.getSize();
        _builder.append(_size, "");
        _builder.append("f, ");
        boolean _isAntialias = font.isAntialias();
        _builder.append(_isAntialias, "");
        _builder.append(", Color.");
        {
          Color _color = font.getColor();
          ConstantColor _constantColor = _color.getConstantColor();
          boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_constantColor, null);
          if (_operator_notEquals_1) {
            Color _color_1 = font.getColor();
            ConstantColor _constantColor_1 = _color_1.getConstantColor();
            String _name_4 = _constantColor_1.name();
            String _upperCase_1 = _name_4.toUpperCase();
            _builder.append(_upperCase_1, "");
          } else {
            Color _color_2 = font.getColor();
            StringConcatenation _argb = this.argb(_color_2);
            _builder.append(_argb, "");
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("getEngine().getTextureManager().loadTexture(");
        StringConcatenation _textureVariableName_2 = this._generatorExtensions.textureVariableName(font);
        String _string_4 = _textureVariableName_2.toString();
        String _trim_4 = _string_4.trim();
        _builder.append(_trim_4, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("getEngine().getFontManager().loadFonts(");
    {
      boolean hasAnyElements_1 = false;
      for(final Font font_1 : fonts) {
        if (!hasAnyElements_1) {
          hasAnyElements_1 = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append("this.");
        StringConcatenation _fontFieldName_1 = this._generatorExtensions.fontFieldName(font_1);
        String _string_5 = _fontFieldName_1.toString();
        String _trim_5 = _string_5.trim();
        _builder.append(_trim_5, "");
      }
    }
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation argb(final Color color) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("argb(");
    float _a = color.getA();
    _builder.append(_a, "");
    _builder.append("*255.0f, ");
    float _r = color.getR();
    _builder.append(_r, "");
    _builder.append("*255.0f, ");
    float _g = color.getG();
    _builder.append(_g, "");
    _builder.append("*255.0f, ");
    float _b = color.getB();
    _builder.append(_b, "");
    _builder.append("*255.0f)");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation loadScene(final Scene scene) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.mScene = new Scene();");
    _builder.newLine();
    _builder.append("IBackground bg = ");
    GameBackground _gameBackground = scene.getGameBackground();
    StringConcatenation _loadBackground = this.loadBackground(_gameBackground);
    String _string = _loadBackground.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("this.mScene.setBackground(bg);");
    _builder.newLine();
    _builder.append("initializeScene(this.mScene);");
    _builder.newLine();
    _builder.append("initializeLogic();");
    _builder.newLine();
    _builder.append("initializeBox2D();");
    _builder.newLine();
    _builder.append("return this.mScene;");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation loadBackground(final GameBackground bg) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Color _color = bg.getColor();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_color, null);
      if (_operator_notEquals) {
        _builder.append("new ColorBackground(");
        Color _color_1 = bg.getColor();
        StringConcatenation _generateColorParameters = this.generateColorParameters(_color_1);
        String _string = _generateColorParameters.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
      } else {
        TextureRegion _textureRegion = bg.getTextureRegion();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_textureRegion, null);
        if (_operator_notEquals_1) {
          _builder.append("new SpriteBackground(new Sprite(0, 0, ");
          TextureRegion _textureRegion_1 = bg.getTextureRegion();
          StringConcatenation _textureRegionFieldName = this._generatorExtensions.textureRegionFieldName(_textureRegion_1);
          String _string_1 = _textureRegionFieldName.toString();
          String _trim_1 = _string_1.trim();
          _builder.append(_trim_1, "");
          _builder.append("))");
          _builder.newLineIfNotEmpty();
        } else {
          _builder.append("Error when processing background!");
          _builder.newLine();
        }
      }
    }
    return _builder;
  }
  
  public StringConcatenation initializeScene(final Scene scene) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// create menus, submenus");
    _builder.newLine();
    StringConcatenation _createMenuScenes = this.createMenuScenes(scene);
    _builder.append(_createMenuScenes, "");
    _builder.newLineIfNotEmpty();
    {
      EList<GameEntity> _entities = scene.getEntities();
      for(final GameEntity e : _entities) {
        StringConcatenation _generate = this.generate(e, null);
        String _string = _generate.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.newLineIfNotEmpty();
        _builder.append("scene.attachChild(this.");
        StringConcatenation _entityFieldName = this._generatorExtensions.entityFieldName(e);
        String _string_1 = _entityFieldName.toString();
        String _trim_1 = _string_1.trim();
        _builder.append(_trim_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _createMenuScenes(final Scene scene) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _createMenuScenes(final MenuScene scene) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.");
    StringConcatenation _createMenuMethodName = this._generatorExtensions.createMenuMethodName(scene);
    String _string = _createMenuMethodName.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append("();");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation generate(final GameEntity e, final GameEntity parent) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.");
    StringConcatenation _entityFieldName = this._generatorExtensions.entityFieldName(e);
    String _string = _entityFieldName.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(" = new ");
    StringConcatenation _type = this._generatorExtensions.type(e);
    String _string_1 = _type.toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "");
    _builder.append("(");
    StringConcatenation _ctrParameters = this.ctrParameters(e);
    String _string_2 = _ctrParameters.toString();
    String _trim_2 = _string_2.trim();
    _builder.append(_trim_2, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    {
      Color _color = e.getColor();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_color, null);
      if (_operator_notEquals) {
        _builder.append("this.");
        StringConcatenation _entityFieldName_1 = this._generatorExtensions.entityFieldName(e);
        String _string_3 = _entityFieldName_1.toString();
        String _trim_3 = _string_3.trim();
        _builder.append(_trim_3, "");
        _builder.append(".setColor(");
        Color _color_1 = e.getColor();
        StringConcatenation _generateColorParameters = this.generateColorParameters(_color_1);
        String _string_4 = _generateColorParameters.toString();
        String _trim_4 = _string_4.trim();
        _builder.append(_trim_4, "");
        _builder.append(");");
      }
    }
    _builder.newLineIfNotEmpty();
    StringConcatenation _generateChildren = this.generateChildren(e);
    _builder.append(_generateChildren, "");
    _builder.newLineIfNotEmpty();
    {
      boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(parent, null);
      if (_operator_notEquals_1) {
        _builder.append("this.");
        StringConcatenation _entityFieldName_2 = this._generatorExtensions.entityFieldName(parent);
        String _string_5 = _entityFieldName_2.toString();
        String _trim_5 = _string_5.trim();
        _builder.append(_trim_5, "");
        _builder.append(".attachChild(this.");
        StringConcatenation _entityFieldName_3 = this._generatorExtensions.entityFieldName(e);
        String _string_6 = _entityFieldName_3.toString();
        String _trim_6 = _string_6.trim();
        _builder.append(_trim_6, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generateColorParameters(final Color color) {
    StringConcatenation _builder = new StringConcatenation();
    float _r = color.getR();
    _builder.append(_r, "");
    _builder.append("f, ");
    float _g = color.getG();
    _builder.append(_g, "");
    _builder.append("f, ");
    float _b = color.getB();
    _builder.append(_b, "");
    _builder.append("f, ");
    {
      float _a = color.getA();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(((Float)_a), null);
      if (_operator_notEquals) {
        float _a_1 = color.getA();
        _builder.append(_a_1, "");
        _builder.append("f");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final GameEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final SimpleEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Position _position = entity.getPosition();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_position, null);
      if (_operator_notEquals) {
        Position _position_1 = entity.getPosition();
        StringConcatenation _position_2 = this.position(_position_1);
        String _string = _position_2.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final Line entity) {
    StringConcatenation _builder = new StringConcatenation();
    FromDouble _from = entity.getFrom();
    StringConcatenation _generate = this.generate(_from);
    String _string = _generate.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(", ");
    ToDouble _to = entity.getTo();
    StringConcatenation _generate_1 = this.generate(_to);
    String _string_1 = _generate_1.toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "");
    _builder.append(" ");
    {
      boolean _operator_and = false;
      float _lineWidth = entity.getLineWidth();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(((Float)_lineWidth), null);
      if (!_operator_notEquals) {
        _operator_and = false;
      } else {
        float _lineWidth_1 = entity.getLineWidth();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(((Float)_lineWidth_1), ((Integer)0));
        _operator_and = BooleanExtensions.operator_and(_operator_notEquals, _operator_notEquals_1);
      }
      if (_operator_and) {
        _builder.append(", ");
        float _lineWidth_2 = entity.getLineWidth();
        _builder.append(_lineWidth_2, "");
        _builder.append("f");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation generate(final FromDouble from) {
    StringConcatenation _builder = new StringConcatenation();
    float _x = from.getX();
    _builder.append(_x, "");
    _builder.append("f, ");
    float _y = from.getY();
    _builder.append(_y, "");
    _builder.append("f");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation generate(final ToDouble to) {
    StringConcatenation _builder = new StringConcatenation();
    float _x = to.getX();
    _builder.append(_x, "");
    _builder.append("f, ");
    float _y = to.getY();
    _builder.append(_y, "");
    _builder.append("f");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final Rectangle entity) {
    StringConcatenation _builder = new StringConcatenation();
    Position _position = entity.getPosition();
    StringConcatenation _position_1 = this.position(_position);
    String _string = _position_1.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(", ");
    Size _size = entity.getSize();
    StringConcatenation _size_1 = this.size(_size);
    String _string_1 = _size_1.toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final Sprite entity) {
    StringConcatenation _builder = new StringConcatenation();
    Position _position = entity.getPosition();
    StringConcatenation _position_1 = this.position(_position);
    String _string = _position_1.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(", ");
    {
      Size _size = entity.getSize();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_size, null);
      if (_operator_notEquals) {
        Size _size_1 = entity.getSize();
        StringConcatenation _size_2 = this.size(_size_1);
        String _string_1 = _size_2.toString();
        String _trim_1 = _string_1.trim();
        _builder.append(_trim_1, "");
        _builder.append(",");
      }
    }
    _builder.append(" this.");
    TextureRegion _textureRegion = entity.getTextureRegion();
    StringConcatenation _textureRegionFieldName = this._generatorExtensions.textureRegionFieldName(_textureRegion);
    _builder.append(_textureRegionFieldName, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final AnimatedSprite entity) {
    StringConcatenation _builder = new StringConcatenation();
    Position _position = entity.getPosition();
    StringConcatenation _position_1 = this.position(_position);
    String _string = _position_1.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(", this.");
    TextureRegion _textureRegion = entity.getTextureRegion();
    StringConcatenation _textureRegionFieldName = this._generatorExtensions.textureRegionFieldName(_textureRegion);
    _builder.append(_textureRegionFieldName, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final Text entity) {
    StringConcatenation _builder = new StringConcatenation();
    Position _position = entity.getPosition();
    StringConcatenation _position_1 = this.position(_position);
    String _string = _position_1.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(", ");
    Font _font = entity.getFont();
    StringConcatenation _fontFieldName = this._generatorExtensions.fontFieldName(_font);
    String _string_1 = _fontFieldName.toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "");
    _builder.append(", \"");
    String _text = entity.getText();
    String _replaceAll = _text.replaceAll("[\\n]", "\\\\n");
    _builder.append(_replaceAll, "");
    _builder.append("\" ");
    {
      HorizontalAlign _halign = entity.getHalign();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_halign, null);
      if (_operator_notEquals) {
        _builder.append(", HorizontalAlign.");
        HorizontalAlign _halign_1 = entity.getHalign();
        String _name = _halign_1.name();
        String _upperCase = _name.toUpperCase();
        _builder.append(_upperCase, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation position(final Position position) {
    StringConcatenation _builder = new StringConcatenation();
    float _x = position.getX();
    _builder.append(_x, "");
    _builder.append("f, ");
    float _y = position.getY();
    _builder.append(_y, "");
    _builder.append("f");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation size(final Size size) {
    StringConcatenation _builder = new StringConcatenation();
    float _w = size.getW();
    _builder.append(_w, "");
    _builder.append("f, ");
    float _h = size.getH();
    _builder.append(_h, "");
    _builder.append("f");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _generateChildren(final GameEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generateChildren(final SimpleEntity entity) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<GameEntity> _children = entity.getChildren();
      for(final GameEntity c : _children) {
        StringConcatenation _generate = this.generate(c, entity);
        String _string = _generate.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation initializeLogic(final Scene scene) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Resource _eResource = scene.eResource();
      Iterable<EObject> _allContentsIterable = ResourceExtensions.allContentsIterable(_eResource);
      Iterable<EntityModifier> _filter = IterableExtensions.<EntityModifier>filter(_allContentsIterable, hu.bme.mit.androtext.lang.androTextDsl.EntityModifier.class);
      for(final EntityModifier modifier : _filter) {
        {
          boolean _operator_and = false;
          boolean _operator_not = BooleanExtensions.operator_not((modifier instanceof LoopEntityModifier));
          if (!_operator_not) {
            _operator_and = false;
          } else {
            boolean _operator_not_1 = BooleanExtensions.operator_not((modifier instanceof SequenceEntityModifier));
            _operator_and = BooleanExtensions.operator_and(_operator_not, _operator_not_1);
          }
          if (_operator_and) {
            StringConcatenation _generate = this.generate(modifier);
            _builder.append(_generate, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      Resource _eResource_1 = scene.eResource();
      Iterable<EObject> _allContentsIterable_1 = ResourceExtensions.allContentsIterable(_eResource_1);
      Iterable<SequenceEntityModifier> _filter_1 = IterableExtensions.<SequenceEntityModifier>filter(_allContentsIterable_1, hu.bme.mit.androtext.lang.androTextDsl.SequenceEntityModifier.class);
      for(final SequenceEntityModifier modifier_1 : _filter_1) {
        StringConcatenation _generate_1 = this.generate(modifier_1);
        _builder.append(_generate_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Resource _eResource_2 = scene.eResource();
      Iterable<EObject> _allContentsIterable_2 = ResourceExtensions.allContentsIterable(_eResource_2);
      Iterable<LoopEntityModifier> _filter_2 = IterableExtensions.<LoopEntityModifier>filter(_allContentsIterable_2, hu.bme.mit.androtext.lang.androTextDsl.LoopEntityModifier.class);
      for(final LoopEntityModifier modifier_2 : _filter_2) {
        StringConcatenation _generate_2 = this.generate(modifier_2);
        _builder.append(_generate_2, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Resource _eResource_3 = scene.eResource();
      Iterable<EObject> _allContentsIterable_3 = ResourceExtensions.allContentsIterable(_eResource_3);
      Iterable<Binding> _filter_3 = IterableExtensions.<Binding>filter(_allContentsIterable_3, hu.bme.mit.androtext.lang.androTextDsl.Binding.class);
      for(final Binding logic : _filter_3) {
        StringConcatenation _generate_3 = this.generate(logic);
        _builder.append(_generate_3, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public StringConcatenation generate(final Binding logic) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Bindable _bindable = logic.getBindable();
      if ((_bindable instanceof EntityModifier)) {
        _builder.append("this.");
        BindingTarget _bindingTarget = logic.getBindingTarget();
        StringConcatenation _generate = this.generate(_bindingTarget);
        String _string = _generate.toString();
        String _trim = _string.trim();
        _builder.append(_trim, "");
        _builder.append(".registerEntityModifier(");
        Bindable _bindable_1 = logic.getBindable();
        String _name = _bindable_1.getName();
        String _string_1 = _name.toString();
        String _trim_1 = _string_1.trim();
        _builder.append(_trim_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected StringConcatenation _generate(final BindingTarget target) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _generate(final EntityBindingTarget target) {
    StringConcatenation _builder = new StringConcatenation();
    GameEntity _entity = target.getEntity();
    StringConcatenation _entityFieldName = this._generatorExtensions.entityFieldName(_entity);
    String _string = _entityFieldName.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation name(final Bindable bindable) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public StringConcatenation name(final Body bindable) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = bindable.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation name(final EntityModifier bindable) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = bindable.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation type(final EntityModifier modifier) {
    StringConcatenation _builder = new StringConcatenation();
    EClass _eClass = modifier.eClass();
    String _name = _eClass.getName();
    _builder.append(_name, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation generate(final EntityModifier modifier) {
    StringConcatenation _builder = new StringConcatenation();
    StringConcatenation _type = this.type(modifier);
    String _string = _type.toString();
    String _trim = _string.trim();
    _builder.append(_trim, "");
    _builder.append(" ");
    String _name = modifier.getName();
    _builder.append(_name, "");
    _builder.append(" = new ");
    StringConcatenation _type_1 = this.type(modifier);
    String _string_1 = _type_1.toString();
    String _trim_1 = _string_1.trim();
    _builder.append(_trim_1, "");
    _builder.append("(");
    StringConcatenation _ctrParameters = this.ctrParameters(modifier);
    String _string_2 = _ctrParameters.toString();
    String _trim_2 = _string_2.trim();
    _builder.append(_trim_2, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final EntityModifier modifier) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final MoveModifier modifier) {
    StringConcatenation _builder = new StringConcatenation();
    float _duration = modifier.getDuration();
    _builder.append(_duration, "");
    _builder.append("f, ");
    FromDouble _from = modifier.getFrom();
    float _x = _from.getX();
    _builder.append(_x, "");
    _builder.append("f, ");
    ToDouble _to = modifier.getTo();
    float _x_1 = _to.getX();
    _builder.append(_x_1, "");
    _builder.append("f, ");
    FromDouble _from_1 = modifier.getFrom();
    float _y = _from_1.getY();
    _builder.append(_y, "");
    _builder.append("f, ");
    ToDouble _to_1 = modifier.getTo();
    float _y_1 = _to_1.getY();
    _builder.append(_y_1, "");
    _builder.append("f");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final MoveByModifier modifier) {
    StringConcatenation _builder = new StringConcatenation();
    float _duration = modifier.getDuration();
    _builder.append(_duration, "");
    _builder.append("f, ");
    ByDouble _by = modifier.getBy();
    float _x = _by.getX();
    _builder.append(_x, "");
    _builder.append("f, ");
    ByDouble _by_1 = modifier.getBy();
    float _y = _by_1.getY();
    _builder.append(_y, "");
    _builder.append("f");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final RotationModifier modifier) {
    StringConcatenation _builder = new StringConcatenation();
    float _duration = modifier.getDuration();
    _builder.append(_duration, "");
    _builder.append("f, ");
    FromSingle _from = modifier.getFrom();
    float _value = _from.getValue();
    _builder.append(_value, "");
    _builder.append("f, ");
    ToSingle _to = modifier.getTo();
    float _value_1 = _to.getValue();
    _builder.append(_value_1, "");
    _builder.append("f");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final RotationByModifier modifier) {
    StringConcatenation _builder = new StringConcatenation();
    float _duration = modifier.getDuration();
    _builder.append(_duration, "");
    _builder.append("f, ");
    BySingle _by = modifier.getBy();
    float _value = _by.getValue();
    _builder.append(_value, "");
    _builder.append("f");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final LoopEntityModifier modifier) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EntityModifier> _modifiers = modifier.getModifiers();
      boolean hasAnyElements = false;
      for(final EntityModifier m : _modifiers) {
        if (!hasAnyElements) {
          hasAnyElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        String _name = m.getName();
        _builder.append(_name, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final SequenceEntityModifier modifier) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EntityModifier> _modifiers = modifier.getModifiers();
      boolean hasAnyElements = false;
      for(final EntityModifier m : _modifiers) {
        if (!hasAnyElements) {
          hasAnyElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        String _name = m.getName();
        _builder.append(_name, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected StringConcatenation _ctrParameters(final GameMenuItem item) {
    StringConcatenation _builder = new StringConcatenation();
    {
      String _text = item.getText();
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(_text, null);
      if (_operator_notEquals) {
        Font _font = item.getFont();
        String _name = _font.getName();
        _builder.append(_name, "");
        _builder.append(", ");
        String _text_1 = item.getText();
        _builder.append(_text_1, "");
      } else {
        TextureRegion _textureRegion = item.getTextureRegion();
        boolean _operator_notEquals_1 = ObjectExtensions.operator_notEquals(_textureRegion, null);
        if (_operator_notEquals_1) {
          _builder.append("this.");
          TextureRegion _textureRegion_1 = item.getTextureRegion();
          StringConcatenation _textureRegionFieldName = this._generatorExtensions.textureRegionFieldName(_textureRegion_1);
          String _string = _textureRegionFieldName.toString();
          String _trim = _string.trim();
          _builder.append(_trim, "");
        } else {
          _builder.append("Wrong model state at GameMenuItem!!!");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation generateMenuItems(final Scene scene) {
    if (scene instanceof MenuScene) {
      return _generateMenuItems((MenuScene)scene);
    } else {
      return _generateMenuItems(scene);
    }
  }
  
  public GameEntity getEntity(final BindingTarget target) {
    if (target instanceof EntityBindingTarget) {
      return _getEntity((EntityBindingTarget)target);
    } else {
      return _getEntity(target);
    }
  }
  
  public StringConcatenation factoryParameters(final Body body, final GameEntity entity) {
    if (body instanceof BoxBody) {
      return _factoryParameters((BoxBody)body, entity);
    } else if (body instanceof CircleBody) {
      return _factoryParameters((CircleBody)body, entity);
    } else if (body instanceof LineBody) {
      return _factoryParameters((LineBody)body, entity);
    } else {
      return _factoryParameters(body, entity);
    }
  }
  
  public StringConcatenation createMenuScenes(final Scene scene) {
    if (scene instanceof MenuScene) {
      return _createMenuScenes((MenuScene)scene);
    } else {
      return _createMenuScenes(scene);
    }
  }
  
  public StringConcatenation ctrParameters(final EObject modifier) {
    if (modifier instanceof LoopEntityModifier) {
      return _ctrParameters((LoopEntityModifier)modifier);
    } else if (modifier instanceof MoveByModifier) {
      return _ctrParameters((MoveByModifier)modifier);
    } else if (modifier instanceof MoveModifier) {
      return _ctrParameters((MoveModifier)modifier);
    } else if (modifier instanceof RotationByModifier) {
      return _ctrParameters((RotationByModifier)modifier);
    } else if (modifier instanceof RotationModifier) {
      return _ctrParameters((RotationModifier)modifier);
    } else if (modifier instanceof SequenceEntityModifier) {
      return _ctrParameters((SequenceEntityModifier)modifier);
    } else if (modifier instanceof EntityModifier) {
      return _ctrParameters((EntityModifier)modifier);
    } else if (modifier instanceof AnimatedSprite) {
      return _ctrParameters((AnimatedSprite)modifier);
    } else if (modifier instanceof Line) {
      return _ctrParameters((Line)modifier);
    } else if (modifier instanceof Rectangle) {
      return _ctrParameters((Rectangle)modifier);
    } else if (modifier instanceof SimpleEntity) {
      return _ctrParameters((SimpleEntity)modifier);
    } else if (modifier instanceof Sprite) {
      return _ctrParameters((Sprite)modifier);
    } else if (modifier instanceof Text) {
      return _ctrParameters((Text)modifier);
    } else if (modifier instanceof GameEntity) {
      return _ctrParameters((GameEntity)modifier);
    } else if (modifier instanceof GameMenuItem) {
      return _ctrParameters((GameMenuItem)modifier);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(modifier).toString());
    }
  }
  
  public StringConcatenation generateChildren(final GameEntity entity) {
    if (entity instanceof SimpleEntity) {
      return _generateChildren((SimpleEntity)entity);
    } else {
      return _generateChildren(entity);
    }
  }
  
  public StringConcatenation generate(final BindingTarget target) {
    if (target instanceof EntityBindingTarget) {
      return _generate((EntityBindingTarget)target);
    } else {
      return _generate(target);
    }
  }
}
