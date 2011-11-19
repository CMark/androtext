# AndroText #

AndroText is a model-driven development tool for the Android Platform. 
Provides rapid prototyping development process with the AndroText language (based on Xtext framework). 
Provides a fully automated generator, that generates an entire Android application from scratch based on the models of the Android components.
Integrates with Eclipse and comes with IDE support (content assist, error checking validation).

# RoadMap #

RoadMap Date: 2011. 11. 19.

* 1.0
 * Language improvements
  * Finalize AndroText grammar
  * Add all GUI feature to AndroGui Contents (easy layouting, all widgets, etc.)
  * Add simple nagivations, invokes between the Activities, URLs, etc.
  * Add menu support
  * Add notification support
 * Generator improvements
  * Generate ContentProvider/DataBaseManager from AndroData models
  * Generate navigations
  * Generate menus
  * Generate notifications
 * Create 1.0 release
* Future plans
 * Find out how to model Services/BroadCastReceivers
 * Use Google Guice, Roboguice for injecting Views and resources into Activity classes.
 * Write validation constraints. Use [EMF INCQuery](http://viatra.inf.mit.bme.hu/incquery/base#Overview)
 
# Installation #

1. Get Eclipse with Xtext 2.1
2. Get AndroText from Github as Zip or Clone the repository
3. Start Eclipse and import all project from the *tooling* directory into your workspace
4. Start a Runtime Eclipse with the newly imported plugins.
5. Create a simple Java project (later a AndroText project), and create *.androtext files.
6. See the example project in the *examples* folder.

## License ##

All files of AndroText project are licensed under the [EPL](http://www.eclipse.org/legal/epl-v10.html).

## Contributions ##

 * Current contributors
  * Czotter Mark ([CMark](http://github.com/CMark))

If you want to contribute:

1. Look at the [issues](https://github.com/CMark/androtext/issues).
2. Clone AndroText and do your changes.
3. Send a pull request.