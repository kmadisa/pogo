# Changelog

#### Pogo-9.6.21 - 27/05/2019:
    Remove extra ";" warning (#60)

#### Pogo-9.6.20 - 21/05/2019:
    Improve additional files management in CMakelist.txt 

#### Pogo-9.6.19 - 10/05/2019:
    Henance exception management if a non xmi file is loaded

#### Pogo-9.6.18 - 15/11/2018:
    Fix a bug in copy/paste object.

#### Pogo-9.6.17 - 09/11/2018:
    Fix a bug in dimX/dimY on java image attributes.

#### Pogo-9.6.16 - 03/10/2018:
    When generate html doc, if NO_PDF=true, does not generate (Soleil request)

#### Pogo-9.6.15 - 09/07/2018:
    Fix a problem LowerCase/UpperCase.

#### Pogo-9.6.14 - 09/07/2018:
    Fix a bug in relative path for inheritance (PR code)

#### Pogo-9.6.13 - 19/06/2018:
    Fix bug in relative path for multiple classes.
    It is now possible to load a server even a class has not be found.

#### Pogo-9.6.12 - 11/06/2018:
    Add protected regions in dynamic attribute and command classes

#### Pogo-9.6.11 - 04/06/2018:
    Fix a problem on dynamic attributes when no database.

#### Pogo-9.6.9 - 03/04/2018:
    Fix aproblem in CMakelist.txt file.
    Add new feature to get enum labels from file.

#### Pogo-9.6.6 - 12/03/2018:
    Fix aproblem in Enum labels for java classes.

#### Pogo-9.6.5 - 23/02/2018:
    Fix a bug on heritance path.
    Generate Makefile or CMakeList.txt from commande line.

#### Pogo-9.6.4 - 12/01/2018:
    Change default (1000) and minimum (5) values for polling
    Remove references to Pogo-6 (too old)

#### Pogo-9.6.3 - 09/10/2017:
    Fix a NPE in AttributeDialog.java

#### Pogo-9.6.2 - 06/10/2017:
    Allow to generate ENUM attribute as spectrum and image in C++.

#### Pogo-9.6.1 - 25/09/2017:
    Fix a NPE in PyHL new class creation.

#### Pogo-9.6.0 - 15/09/2017:
    PyHL package is now memorized for next reload/generate action.
    Fix bug in Pogo command line.

#### Pogo-9.5.2 - 12/08/2017:
    CMakeList added for widows (thanks to Sebastien)

#### Pogo-9.5.1 - 10/08/2017:
    Add release notes and remove unused files.

#### Pogo-9.5.0 - 09/08/2017:
    Mavenized project (thanks to Igor)

#### Pogo-9.4.6a - 19/04/2017:
    Cosmetic changes

#### Pogo-9.4.6 - 13/01/2017:
    Add a pdf file in doc_html on linux (if wkhtmltopdf found in path)
    Fix a bug in html protected regions.
    Fix a bug in key word management.
    Add polling for State/Status in java.

#### Pogo-9.4.5 - 08/12/2016:
    A pom.xml file could be generated for java server.
    Path must be in respect with maven structure (--/--/src/main/java)

#### Pogo-9.4.4 - 06/12/2016:
    Manage mandatory properties in java templates.

#### Pogo-9.4.3 - 02/12/2016:
    Remove RcsId in C++ files.

#### Pogo-9.4.2 - 25/11/2016:
    On python templates, fix Copyright on multi lines bug, some pep8 warnings, state and status when overloaded, .....

#### Pogo-9.4.1 - 13/09/2016:
    Improve Python templates.
    Generate CMakeLists.txt only if cmake_tango.opt found.

#### Pogo-9.4.0 - 12/09/2016:
    CMakeLists.txt file could be generated for cmake usage (linux/cpp)..
    Fix a bug in Python for set_change/archive_event. The 2nd parameter was inverted.

#### Pogo-9.3.0 - 04/08/2016:
    Fix bug in property default values in Python code.

#### Pogo-9.2.9 - 12/07/2016:
    Fix problem on resize nodes.
    Check MonoClass/MutiClasses to open chooser.

#### Pogo-9.2.8 - 28/06/2016:
    Manage state machine for dynamic attributes and commands

#### Pogo-9.2.7 - 27/06/2016:
    Template management added.

#### Pogo-9.2.6 - 20/05/2016:
    Fix a problem with event for java dynamic attributes

#### Pogo-9.2.5 - 08/04/2016:
    Add a clone class/device property option menu.
    Add an editor for class description.

#### Pogo-9.2.4 - 07/03/2016:
    Pb in pipe is_allowed method fixed.
    Pb in pipe argument name fixed.

#### Pogo-9.2.3 - 25/02/2016:
    Use of entry_points in setup.py for better compatibility.

#### Pogo-9.2.2 - 04/02/2016:
    Fix a bug in HTML generation with a command description empty

#### Pogo-9.2.1 - 04/02/2016:
    Improve Python and PythonHL templates for inheritance

#### Pogo-9.2.0 - 20/01/2016:
    Improve check name for forwarded attributes.

#### Pogo-9.1.12 - 02/12/2015:
    Fix a problem in relative path for multi classes project.

#### Pogo-9.1.11 - 01/12/2015:
    Bugs in dynamic commands fixed.

#### Pogo-9.1.10 - 25/11/2015:
    Fix bug in DevLong64 java property type
    Improve Python templates (path handling bug fix, protected region for run method)

#### Pogo-9.1.9 - 20/11/2015:
    Fix a bug protected area when rename attribute on c++.
    Fix a problem in relative path for multi classes project.

#### Pogo-9.1.8 - 19/11/2015:
    Add a potected region in main method for java code.
    Add colors on State objects.

#### Pogo-9.1.7 - 02/10/2015:
    Manage relative path for inheritance and multiple classes project.
    Improve State machine window.

#### Pogo-9.1.6 - 17/09/2015:
    Improve Python HL templates once more.

#### Pogo-9.1.5 - 25/08/2015:
    Attribute name can start with '_'

#### Pogo-9.1.4 - 14/08/2015:
    Remove DevVarBooleanArray for command (not supported)

#### Pogo-9.1.3 - 04/08/2015:
    Add move class on multi classes tree
    Improve attribute summary
    Improve State machine dialog size management.
    Add protected region at end of state machine file.

#### Pogo-9.1.2 - 30/06/2015:
    Visual C++ 12 project are available for Tango-9
    Improve Python HL templates.
    Add several missing types for properties.

#### Pogo-9.1.0 - 12/05/2015:
    Pogo is now compiled using java 1.7
    Double cotes supported in class description and title,

#### Pogo-9.0.6 - 06/05/2015:
    Java forwarded attributes are available.
    Improve enum management.
    Fix a bug with void argin on dynamic command

#### Pogo-9.0.5 - 27/04/2015:
    Problem on void dynamic command fixed.

#### Pogo-9.0.4 - 19/03/2015:
    PythonHL bug fixes.
    PythonHL test added.

#### Pogo-9.0.3 - 20/01/2015:
    PythonHL bug fixes.
    PythonHL Project directory added.

#### Pogo-9.0.2 - 16/12/2014:
    Fix a problem in path management for multiple classes tool.

#### Pogo-9.0.1 - 29/10/2014:
    PythonHL code generation added (not tested).

#### Pogo-9.0.0 - 01/10/2014:
    Tango-9 features added for C++ and java.

#### Pogo-8.4.8 - 29/08/2014:
    Fix bugs on adding state and property type display.

#### Pogo-8.4.7 - 18/06/2014:
    Fix a problem in linuxMakefile for additional files.

#### Pogo-8.4.6 - 12/06/2014:
    Add an environment variable (MANAGE_WRITE_METHOD=false) to do not modify write_xxx method.

#### Pogo-8.4.5 - 23/04/2014:
    Inverse order between allocation and mandatory test in init_device().

#### Pogo-8.4.4 - 07/04/2014:
    Fix a problem with pushEvent in java classes.
    Remove evironment variable _812_ (tango-8.1.2)

#### Pogo-8.4.3 - 25/03/2014:
    Improve python dynamic attribute management.

#### Pogo-8.4.2 - 19/03/2014:
    Fix problem in python when memorized attribute does not have property.
    Fix problem on scalar attribute value.

#### Pogo-8.4.0 - 26/02/2014:
    Replace TangORB.jar and ATK*.jar by a tango_ulight.jar file,
    containing only 2 tangorb classes and 5 atk classes,
    to decrease the org.tango.pogo.jar size (~14 Mbytes).

#### Pogo-8.3.5 - 20/02/2014:
    Add a protected region in main method for python class

#### Pogo-8.3.4 - 27/01/2014:
    Add a protected region for programmer methods in python class
    Fix a problem in changing language.

#### Pogo-8.3.3 - 17/01/2014:
    Fix a bug in Pogo Multiple classes.
    Modified linux Makefile for shared libs

#### Pogo-8.3.2 - 17/01/2014:
    Fix another problem on python class with inheritance.

#### Pogo-8.3.1 - 07/01/2014:
    Fix a problem on python class with inheritance.

#### Pogo-8.3.0 - 29/11/2013:
    First release with packaging feature.
    Add javadoc throw tag for java classes.;

#### Pogo-8.2.7 - 28/11/2013:
    Fix a problem in property default values for java classes.

#### Pogo-8.2.6 - 18/11/2013:
    Fix problem in case of exception thrown by an inherited class during startup phase.
    Update Tango kernel link for inheritance documentation.

#### Pogo-8.2.5 - 15/11/2013:
    Fix bug in void returning commands in python classes.

#### Pogo-8.2.4 - 08/11/2013:
    Improve State and Status execute method code in Python classes.
    Manage state machine for write attribute in Python classes.

#### Pogo-8.2.3 - 06/11/2013:
    Problem to overload State and Status commands in Python classes fixed.
    Problem in String attribute initialization for Java classes fixed

#### Pogo-8.2.2 - 17/10/2013:
    Fix a NullPointerException when class come from pogo-6 class without TangoClassID.txt file.

#### Pogo-8.2.1 - 15/10/2013:
    Fix problems in multiple classes server Makefile.
    Add new Tango logo.

#### Pogo-8.2.0 - 14/10/2013:
    Add event management for java.

#### Pogo-8.1.18 - 01/10/2013:
    Change boolean attribute java method name.

#### Pogo-8.1.17 - 13/09/2013:
    Improve properties and Attribute/Command/Property dialogs.

#### Pogo-8.1.16 - 11/09/2013:
    Crash reporting management added on main.cpp.

#### Pogo-8.1.15 - 02/09/2013:
    Improve get<Attribute> method for java class.

#### Pogo-8.1.14 - 26/06/2013:
    Add Tango-8.1.2 specific features.
    Fix a problem with state machine when attribute is modified.
    Improve documentation generation to be used by Class2www classes.

#### Pogo-8.1.13 - 03/05/2013:
    Improve documentation generation to be used by Class2www cleasses.

#### Pogo-8.1.12 - 02/05/2013:
    Improve edit source file feature.

#### Pogo-8.1.11 - 26/04/2013:
    Problem on READ_WITH_WRITE fixed.

#### Pogo-8.1.10 - 05/04/2013:
    State/Status polling problem fixed.
    Problem on makefile for multi classes with inheritance fixed.

#### Pogo-8.1.9 - 04/03/2013:
    Fix problem on string dynamic attribute does not compile due to a mix of const char * and char * data type

#### Pogo-8.1.8 - 08/02/2013:
    Check for special char on state description.
    Force to not memorized for spectrum/image attribute cloned from a scalar one.

#### Pogo-8.1.7 - 07/02/2013:
    Fix problem in include path in VC9 projects.

#### Pogo-8.1.6 - 06/02/2013:
    Fix a problem with bad char in VC9 project.
    Change lib and include pathes in VC9 projects.

#### Pogo-8.1.5 - 18/01/2013:
    Problem in command using DevEncoded fixed.

#### Pogo-8.1.4 - 15/01/2013:
    Eclipse project added for C++ classes.
    Add a popup menu on main window to change language.
    Problem in string spectrum write attribute fixed.

#### Pogo-8.1.3 - 19/11/2012:
    Fix problem in class/device property description for python.

#### Pogo-8.1.2 - 05/11/2012:
    Fix a problem on inheritance.
    Fix a problem on remove dynamic attribute.

#### Pogo-8.1.1 - 23/10/2012:
    Problems in python due to generated file name fixed.
    Remove the Soleil special case.
    Problem links to sub-directory in java fixed.

#### Pogo-8.1.0 - 22/10/2012:
    XTend replaces XPand to define templates.
    C++ and html templates have been re written using xtend.
    Java and Python generators are now available.

#### Pogo-8.0.8 - 10/08/2012:
    Add methods for future compatibility.

#### Pogo-8.0.7 - 07/08/2012:
    Pb in generate dialog for multi class project fixed.

#### Pogo-8.0.7 - 27/06/2012:
    Problem in allocation data member when inherited fixed.

#### Pogo-8.0.6 - 21/06/2012:
    Problem in write dynamic attribute fixed.

#### Pogo-8.0.5 - 11/06/2012:
    VC 10 pb with dll fixed.

#### Pogo-8.0.4 - 04/06/2012:
    zmq.lib added to vc9 project.

#### Pogo-8.0.3 - 29/05/2012:
    Improve vc10 project.
    Modify file filter for java classes.

#### Pogo-8.0.2 - 03/05/2012:
    Bug on abstract command inherited fixed.

#### Pogo-8.0.1 - 05/04/2012:
    Pb with inherited object when DevRestart command received fixed.
    Event criteria management added for attributes (new Tango 8 feature)
    Pb in inheritance for attribute_factory() fixed.

#### Pogo-8.0.0 - 05/03/2012:
    Improve inheritance
    Add polling on State and Status
    Make corrections to remove warnings when compile with -Wall
    Add ULong64 and ULong64Array.
    Add DevEncoded for Command.
    Fix a problem in non double dynamic attribute.

#### Pogo-7.5.0 - 30/01/2012:
    Win64/VC10 project added.
    Call for init/delete device and command factory added when class is inherited.

#### Pogo-7.4.0 - 01/12/2011:
    Workflow upgrade (Eclipse-3.7, XText-2.0, XPand-1.1)

#### Pogo-7.3.2 - 08/09/2011:
    Bug with DevVarLongStringArray and DevVarDoubleStringArray fixed.

#### Pogo-7.3.1 - 27/07/2011:
    Pb with dev_state() method in case of ALARM state fixed.
    Pb in case of main.cpp missing (convertion from pogo-6) fixed.
    Buttons for java projects added.

#### Pogo-7.3.0 - 27/07/2011:
    Dynamic attributes management added.

#### Pogo-7.2.7 - 15/06/2011:
    Problem in property dialog (description & default value) fixed.

#### Pogo-7.2.6 - 19/05/2011:
    Mandatory device property management added.
    Change ToolTips management.

#### Pogo-7.2.5 - 16/05/2011:
    Litle bug in checkLinesToRemove() method fixed.
    Problem with omniORB library release number in vc project files fixed.

#### Pogo-7.2.4 - 02/05/2011:
    Pb in headers when class name has changed fixed.

#### Pogo-7.2.3 - 19/04/2011:
    Associated attribute for READ_WITH_WRITE added.
    Fixe a pb between Long and Long64.

#### Pogo-7.2.2 - 15/04/2011:
    Does not generate read_xxx() metod if xxx attribute is WRITE type.
    Add a filter on Tango types for commands.

#### Pogo-7.2.1 - 14/03/2011:
    Tools to modified keys (for compatibility with PogoDsl changes) in xmi file added.
    Exclude not generated files from vcX_proj dir for workflow.

#### Pogo-7.2.0 - 16/02/2011:
    Multi classes manager tool added.
    Additional files added for Makefile and vc9 projects.
    VC9 project templates improved.
    Bug in multi lines attribute description fixed.

#### Pogo-7.1.1 - 14/02/2011:
    Does not generate Classfactory.cpp and main.cpp if clas is abstract.
    Pb in commands table fixed.

#### Pogo-7.1.0 - 10/02/2011:
    Class name change is now managed.
    If a xmi file is in current directory, it is proposed to be loaded.

#### Pogo-7.0.8 - 07/02/2011:
    Pb in command factory (args description) fixed.
    Fire DatReady event added on attribute.

#### Pogo-7.0.7 - 01/02/2011:
    VC9 project generation added.

#### Pogo-7.0.6 - 27/01/2011:
    The files and sub directories not scaned at workflow is now passed dynamicaly to the workflow.

#### Pogo-7.0.5 - 26/01/2011:
    Some files and sub directories are not scaned any more at workflow.

#### Pogo-7.0.4 - 04/01/2011:
    Pb with inherited class path for Pogo-6 convertion fixed.

#### Pogo-7.0.3 - 20/12/2010:
    Pb with DevVarLongArray and DevVarULongArray fixed.
    Pb with special characters in comments fixed.

#### Pogo-7.0.2 - 15/12/2010:
    Pb on command polled (by default) fixed.

#### Pogo-7.0.1 - 30/11/2010:
    State/Status polling forbidden.

#### Pogo-7.0.0 - 24/09/2010:
    First release for Tango distribution.
