




Abstract

The objectives of the following project were to design and create a software application that offers the user a list of all employees and can convert, transform, format and present the statistical data on a webpage for assessment and evaluation. The system was implemented using the Java EE high-level programming language framework.
The resulting application is a complete system for the collaborating company that still has room for additional development due to the scalable nature of the product.



Introduction 

In times where corporations, companies and organizations are constantly thriving to optimize their work flow and costs productivity, new technologies are being developed and integrated at a very fast pace. Following the organizational tendencies across the world, time supervision and time management, has taken a major part of business activities and day-to-day life in companies. These important features are both a necessity and measurement for companies’ growth, advancement and perservance.

The need of frequent time supervision and time management has been addressed by the computer world in the form of time management systems. These type of systems allow the user to closely observe the staff’s working activity in the company and to take out relevant data for evaluation purposes. The data is stored in the application  and formatted so it can be visually presented to the person managing the system. Thease applications offer a faster, more reliable and efficient methods to measure and collect an employe’s work actions and movement. This way the user can keep in close touch with the work flow as well as the work efficiency in the organization and have the option to generate and examine data for further assessment purposes. 




The current diversity in the corporate world rises yet another problem, the need of flexibility,customer user-friendliness. This is why the company has decided to develop a new time-supervision management system that is going to offer the functionality and benefits of existing systems with similar functionality but add features that satisfies the customer’s preferences and offers more user customizability. 

 Analysis

        User Stories (Wish list)

1.	I want to be able to choose from a list containing all current employees
2.	I want to be able to select a single employee from the list
3.	I want to be able to see the working hours of a selected person
4.	I want to be able to see the lunch break duration of a selected person 
5.	I want to be able to see the statistical data by date
6.	I want to see a picture of the selected employee
7.	I want to see the resulting data displayed in a webpage
8.	I want to be able to run the application on Microsoft Windows 7 OS




        Use Cases

        Use Case Time Management system


Below are the Use-Case scenarios for the User of the Time Management system. It can be seen from the use-cases that the user of the software does not have much to execute. This happens because one of the aims of the program is to offer quick and simple functionality that needs to be one click execution for later evaluation from the person using system.

The full version containing more detailed overview and Use-case description for each Use-case scenario can be found located inside the appendixes of the project.



 
Figure 1 – Use-Case diagram part 1

 
Figure 2 – Use-Case diagram part 2



System Workflow

       Time Management system Activity Diagrams

 
Figure 3 – Overall Activity diagram part 1

 
Figure 4 – Overall Activity diagram part 2

 
Figure 5 – Overall Activity diagram part 3





Requirements

The following list contains the summerized data of the software’s Major requirements that the developer believe are the main foundation of this specific task. The purpose of these is to create and give a general impression of the system’s requirements. More details can be found located in the appendixes of the project.

1.	Create archetecture model from already defined schema.

2.	Allow the software to receive and store source data from existing flat files.

3.	Allow the software to read and handle data correctly.
-	Transform data in consistent format for later manipulation by the software

4.	Allow the User to Choose an employee by name from a list filled with employees.

5.	Allow the software to appropriately format and calculate data based on User’s selection.       


6.	Present the User with final statistical data based on selection as a Webpage
-	Allow the software to transform and present statistical data in HTML format 
-	Allow the software to display the statistics sorted by date













Time Schedule

 
Figure 6 – Time Schedule













Design

      Technological Choices

                    Core Development Language

The developer was not limited by any technological choices or requirements, since there are not any established basics or foundations to this product, which in turn meant it was possible to start the development almost from scratch and not just add to a line of an already existing architecture.
For the back-end of the program there were many suitable high-programming languages available such as: “C”, “Visual Basic”, “Java” and “C#”. Although there were no limitations from development language perspective, considerations were taken based on experience with programming languages from the main developer. After some thinking a decision was made and the chosen computing platform was Java Enterprise Edition. 
Java Enterprise Edition provides and API and runtime environment for developing and running enterprise software, including network and web services and other large-scale, multi-tiered, scalable, reliable and secure network applications. The “Eclipse” integrated development environment (IDE) was used to develop the application with the main factor being that it is mostly written in Java.  
Another good alternative to “Eclipse” (IDE) was the partially open source freeware software framework developed by Microsoft named the “.NET framework”. The Microsoft.NET framework includes a large class library known as Framework Class Library (FCL) and provides language support and interoperability for a variety of programming languages such as “Visual Basic”, ”C#” and others.
Choosing a programming framework was not that easy, this is why a detailed research was made to determine what are the advantages and disadvantages between “.NET” and “Eclipse” in order to choose the more suitable option.



Eclipse IDE
As mentioned Eclipse is an integrated development environment (IDE) that contains a base workspace and an extensible plug-in system for customizing the environment. It can be used to develop applications mostly in Java but it may also be used to develop applications in other programming languages (C, C++, PHP, Pearl, JavaScript, ABAP etc.).

Pros:
-	It generally starts, reacts and runs faster
-	Takes up less memory
-	Flexible/has many plugins
-	Auto-import when needed 


Cons:
-	More bugs
-	Old documentation/Website is out of date



Microsoft.NET framework
Programs written for .NET execute in a software environment, known as Common Language Runtime (CLR), which is an application virtual machine that provides services such as security, memory management, and exception handling. The Framework Class Library (FCL) together with the Common Language Runtime (CLR) constitute the .NET framework.

Pros:
-	Huge variety of easy-to-use tools that may increase productivity
-	Has a strong framework for building rich graphical user interfaces
-	Gives developers choice of working in more than 20 programming languages
-	Tightly integrated with Microsoft’s operating system which can be an advantage or disadvantage

Cons:
-	As stated above the framework runs only on Windows, restricting vendor choice
-	Scalability and transaction capability are questionable
-	Getting older application to run in new .NET environment may require effort



After some considerations and thinking a decision was made to use Java Enterprise Edition with the Eclipse IDE. The main reason to come to this conclusion was that the .NET framework is heavier and it is only partially-open source as well as that Eclipse is written mostly in Java.





                    Information Handling and Software Output

One limitation comes in the form of what data will the software work with and output as result. Due to the plain text-based nature of the source data (flat data) the transportation, transformation and communication between the modules is made via suitable java archive (JAR) file (opencsv-2.3.jar executable Jar File). 
The main idea behind the software is to read, transform and store the plain text data as objects so they can be used and manipulated by the object-oriented Java high-level programming language. The data is then converted to an XML format using the JAXB which is a Java Architecture for XML Binding and allows developers to map Java classes to XML representations and to turn Java objects into XML as well as the inverse. It is one of the API’s in the Java EE platform. 
The final step is to use XSLT (Extensible Stylesheet Language Transformation) to transform the XML into HTML format in order to display the final statistical output in a web page for evaluation purposes to the User managing the application.





                     Front-End Development
Next on the list of software components is the Front-End part of the application. For this no limitations were imposed and the decision was entirely up to the developer. After a detailed research, a list of all possible choices for front-end development was produced. The two main choices were Windows Forms because of the past experience and relative ease of use and Java Swing which provides Java programs with a graphical user interface (GUI). Windows Forms is a graphical class library included as a part of Microsoft.NET Framework similarly this is the case for Java Swing which is included in the Eclipse platform. 

Java Swing

Pros:
-	Part of Java library, no need for additional native libraries
-	Integrated GUI Editor in Eclipse
-	Good online tutorials 
-	Supported by official Java extensions

Cons:
-	Native look and feel may behave different from the real native system
-	Heavy components hide swing components, but it is mostly rare







Windows Forms

Pros:

-	Less customizability which could be considered a con or a pro
-	Smaller memory footprint compared to other graphical user applications like Windows Presentation Foundation (WPF)
-	According to the Microsoft Community Win Forms are a better third party software for Design development
Cons:

-	There are rumors that Microsoft might discontinue the Windows Forms, it could also be speculations
-	No markup language for design, this means when designing there needs to be a lot of setting of variables via properties window


Choosing to work with Windows Forms meant that the programming framework needed to be Microsoft.NET and in the end a final decision was made to use the Java Foundation Classes (JFC) because the already chosen core programming language was Java Enterprise Edition. The implementation of the front-end was accomplished using Java Swing together with the Abstract Window Toolkit (AWT) which is the original Java windowing, graphics and user interface widget toolkit.
Of course, there are other UI Developer tools available for Java and .NET but they tend to focus more on cross-browser, cross-platform implementations such as Silverlight and SWT.












Patterns

MVC (Model View Controller)
                            
        Pattern description
In object-oriented programming development, model-view-controller (MVC) is the name of methodology or design pattern for successfully and efficiently relating the User interface to underlying data models. The pattern is widely used in program development with programming languages such as “Java”, “C”, “C++” and “Smalltalk”. The MVC has been heralded by many developers as a useful pattern for the reuse of objet code and a pattern that allows them to significantly reduce the time it takes to develop applications with user interfaces. It proposes three main components to be used in software development. The separate components are called “Model”, “View” and “Controller”.



Components

         Model:
The central component of the MVC pattern, the model, captures the behavior of the application in terms of its problem domain, independent of the user interface. The model directly manages the data, logic and rules of the application.

•	Represents the Data.
•	Represents the Entity as a class.
•	Model classes are non-visual classes that encapsulate the application’s data and business logic.
•	The model classes are responsible for managing the application’s source data.
•	The model classes are responsible for ensuring data consistency and validity by encapsulating the required business rules and data validation logic.
•	The model classes do not directly reference the view or any view model classes and have dependency on how they are implemented.
•	They model classes typically provide property and collection change notification events through different interfaces
•	This allows them to be easily bounded to a data in the view part of the software 
•	Model classes that represent collections of objects are typically derived from the ObservableCollection<T> class.
•	The model classes typically provide data validation and error reporting through the IDataErrorInfo or INotifyDataErrorInfo interfaces
•	They are typically used in conjunction with a service or repository that encapsulates data access and caching.
•	It is not required to know the type of service to get the data.
•	They may contain validation




View:

The view can be any output or visual representation of the model data, it is thus acting as a presentation filter. The component is a collection of classes representing the elements in the user’s interface. All of the things s user can see and respond to on the screen, such as buttons, display boxes, and so forth.

•	It is a visual element, such as a window, page, user control, or data template.
•	It defines the controls contained in the view classes and their look and feel, visual layout and styling.
•	The view references the view model through its data context property.
•	The controls in the view are data bounded to the properties and commands exposed by the controller component.
•	The view may customize the data binding behavior between the view and the controller. For example the view may use value converters to format the data to be displayed in the UI (User Interface), or it may use validation rules to provide additional input data validation to the user.
•	The view defines and handles UI visual behavior, such as animations and transitions that may be triggered from a state change in the controller or through the user’s interaction with the use interface.
•	The code-behind the view may define UI logic to implement visual behavior that is difficult to express or that requires direct references to a specific UI controls defined in the view.



Controller:

The controller components is primarily for co-ordination between the view and the model. It provides model data to the view, and interprets user actions. The controller tightly depends on the view and the model, in some cases the controller and the view are the same object. The controller receives a user output, translates it into the appropriate messages and passes these messages on to one or more views.

•	The controller handles and interprets user actions.
•	The controller class is the link between the user and the system.
•	It provides the user with input by arranging relevant view or views to present themselves in appropriate places on the screen.
•	It provides means for user output by presenting the user with menus or other means of giving commands and data.
•	The controller may define logical states that the view can represent visually to the user.
•	It encapsulates the presentation logic required to support a user case or user task in the application.
•	It implements properties and commands to which the view can data bind.
•	It notifies the view of any state changes via notification events interfaces.
•	It may convert or manipulate data so that it can be easily consumed by the view component.


Advantages of the MVC 

The model view controller is simply a separation paradigm. It separates the model, view and controller components, thus it is ideal to avoid mixing code from three main categories into one class. The view should not have code on where to retrieve data from, or what its native model structure is like. The actual data handling happens in the controller. This separation of responsibilities between the model, view and controller elements allows for more flexibility and also this way unnecessary complexity, which leads to buggy software and expensive maintenance, is avoided.


Iterator 
The iterator pattern is very commonly used design pattern in Java and .Net programming environment. The pattern is used to get a way to access element of collection object in sequential manner without any need to know its underlying representation. The iterator falls under behavioral pattern category.

To decide whether or not a class should use an iterator, certain questions must be answered:
•	In exactly which classes should the pattern be implemented?
•	Where should we use the pattern instead of an algorithm? 

In the end, it was concluded that there are classes in the software that can use this behavioral pattern. The iterator can be used when there is need to remove an element while we iterate over an array content. If an iterator is not used and there is a loop inside the class to remove elements it is possible to get exceptions because the content of an array changes while it is iterated. For example an array size could be 10 at the start of the loop but it this will not be the case once an element is removed.



Iterator pattern implementation in Java
Different programming languages implements iterator differently. Some languages like “C++” and “Python” standardize the syntax. “Java” implements the pattern using the “Iterable” interface. Objects implementing an iterator, can be traversed using the enhanced for loop syntax.  The collection interface from the Java framework extends the “Iterable” interface.







Model Classes Diagrams (Project Design over-all)

In this section the software application will be described by the help of the most important class diagrams and modules. The different implementations and usage of sections in the software are described in greater details below. In the section “Classes and Components” the developer provides an in-depth analysis on why, how and where each part is used. Code snippets are also included when necessary. 

The whole structure and design of the software application is such that the main parts are separated and defined by different classes. This way, if there is a problem, coming from a module or there are problems with some specific part in the software, it is easier for the tester to find and identify a problem. This structure is also preferred by other important reasons, such as scalability and easier maintenance. With this architecture, it is possible to re-implement or re-design some of the modulated classes and replace them without reworking the whole code but just a specific section of it. This way improvements ca be completed and accomplished much safer and easier.

The components needed to achieve the desired performance and functionality from the software are listed below:
             The Model:
-	Employee List class
-	Employee Holder class
-	Employee Statistic class
-	Employee Statistic Holder class
-	Model manager class
-	Object factory class (generated by JAXB)

             The View:
-	Simple Example View class
-	Loading Bar class
-	Daily Info class
-	Button Listener class
-	Item Listener class


             The Controller:
-	Controller class
-	Functionality class
-	Comma Separated Values Reader class
-	Convertors class
-	Object To Xml Transformer class
-	Xml To Html Transformer class





Every class in the application is implemented as a “Module”. From the beginning of the project work the developer concluded that this is the suitable structure because there were no visible negatives from using this approach. This way the developer was able to save a lot of time during the initial development phase.

The real key feature of the software is the Controller module. It contains classes that are responsible for handling and manipulating the source data as well as all the transformation processes. One of the most important requirements of the software is to display the appropriate, correct data to the user managing the application based on the user’s selection. As stated before, the developer had some experience working with the MVC design pattern but the implementation proved to be harder than expected. This created small problems and inconsistencies during coding.

The separation of the different sections of the software does not mean that there is a single class guiding the whole process. All methods are intertwined into a chain of operations in order to produce the final output. 








Below you will find the class diagrams from the different modules of the software.


 
Figure 7 – Model Class Diagram part1

 

Figure 8 – Model Class Diagram part2


 
Figure 9 – View  Class Diagram part1

 
Figure 10 – View Class Diagram part2



 
Figure 11 – Controller Class Diagram part1

 
Figure 12 – Controller Class Diagram  part2
















Implementation (Classes and Components)


   Model

 
Figure 13 – Model classes 


The application’s “Model” (Fig.13) is implemented using Java high-level programming language together with Java Architecture for XML Binding or JAXB. The entirety of the “EmployeeList.java” class is generated using an already existing XML Schema that describes the stricture of an XML document. The Schema language is also referred to as XML Schema Definition (XSD)

This XML schema defines what elements can appear in a document, the attributes that will appear, which elements are child elements, order of child elements, number of child elements, data types for elements and attributes as well as any default and fixed values for elements and attributes. It is written in XML and one of the main benefits from using it is that there is no need to learn a new programming language and it can be easily transformed, parsed and manipulated using XSLT which is a style sheet language for XML documents and it is used commonly to transform XML documents into other formats, such as XHTML.

For this project the following XML Schema Definition file (Fig.14, Fig.15) was used to generate the “EmployeeList.java” model class for the software application.

 
Figure 14 – schema.xsd part 1
 
Figure 15 – schema.xsd part 2


 The “schema.xsd” has main a public class called “EmployeeList.java” and in it there several inner public static classes named “Employee”, “EmployeeInfo”, “EnterDateList”, “Enter”, “ExitDateList” and “Exit” (Fig.15, lines 4, 10, 18, 21, 32 and 35 respectively). The “EmployeeList.java” class is filled with auto generated “getter” and “setter” methods which are needed for retrieval and manipulation of any defined private variables in the XSD document. The “getter” method retrieves an attribute compared to the “setter” method which sets the value of an attribute.

By using JAXB it is possible to generate the classes “ObjectFactory.java” and “package-info.java”. The “ObjectFactory.java” class is used to programmatically construct new instances of Java representation or objects for XML content and includes factory methods for each declaration provided in this class. In order to be able to do that the XSD schema needs to be in the Project folder together with the appropriate “jaxb.jar” files:









                 Where

The system needs a consistent and reliable model that represents the data in the application. 


                Why

It is basically the Entity of program and it is used to bound data to the View module. Every system needs a model. 



                How


The binding from XML schema to Java was accomplished using Eclipse’s Wizard by selecting “File”, “New”, “Other” and choosing “Generate JAXB Classes from a Schema” after the schema has been structured in a suitable for the application way . The figure (Fig.16).below shows the above described procedure in better detail.











 
Figure 16 – JAXB Classes from Schema


The “EmployeeHolder.java” class is the one that is used to add and get employees and it uses the “ObjectFactory.java” to create new Java objects. Figure 17 shows a code snippet from the implementation of the “EmployeeHolder.java” class.

 
Figure 17 – EmployeeHolder.java 

The “EmployeeHolder.java” class creates an employee list object named “el” using the “EmployeeList.java” class (Fig.17, line 10) and it is used in the code to get an employee by name, add employees and to get an employee by index number in the array. In the constructor of the class we have a new object factory object named “factory”. With this object it is possible to call the method “createEmployeeList()” (Fig.17, line 17)from the “ObjectFactory.java” class and create a new employee list of objects. This is needed because after all Java is an object-oriented programming language.

Similarly there is an “EmployeeStatisticHolder.java” which contains methods such as “getWorkingDays()”, “getWorkedForDayTime()” and “getLunchBreak()” which are used to get the number of working days, calculate the worked time for a day and to calculate the lunch break duration of employees. The “Statistic.java” is the class that has the appropriate “setter” and “getter” methods that are required. It must be noted that the statistical data the class is working with is been delivered to the class, sorted and if necessary formatted state and it is then manipulated by the methods inside it.

Finally the “ModelManager.java” in the Model reads the flat data files (csv data), by using the “readAllFilesInFolder()” method in its constructor. Also the “con” object initialized from the “Controller.java” class requests the object from the “ModelManager.java” in the constructor of the class. The method “readAllFilesInFolder()” does just that ,it reads the files located in the specific folder. The location of the folder is specified in the constructor of the class as well and  the “readAllFilesInFolder()” method than calls the method from the “CSVRead,java” class named “readAll()” using the “csvr” object. The “readAll()” method is the one that actually reads  and obtains all the necessary data from the comma separated values files (“csv” files located in the “tracker” folder) and it is used in the “readAllFilesInFolder()” method (“csvr” object calls the method).






  Controller

 
Figure 18 – Controller classes 










           Where

The application’s Controller module contains some of the most important classes and methods that are fundamental software parts of the system.  In order to be able to read, store, manipulate, transform employee data the system needs the appropriate classes with suitable functionality.


           Why

The application needs to create different XSLT transformation files, this is why it was decided that a simple, yet effective methods should be provided. Furthermore the final statistical data has to be transformed and presented on a Webpage which leads to the need of other transformation processes like XML to XHTML files.


           How

The use of the MVC (Model-View-Controller) design pattern means that the software application is divided into three interconnected parts, in such a way that there is a separation between the internal representations of information and the presented or accepted data by the user. The user users the Controller to manipulate the Model which in turn updates the View and the final result is presented back to the user.










One of the requirements of the system is to store data located in comma separated values files (tracker folder). That is the purpose of the “CSVRead.java” class. The class reads CSV files which basically plain text files, that contain organized information with one record on each line and each field is separated by comma. CSV files are primarily used in migration processes where data can be transported between different applications of different formats through a software program. There are many ways to write and read CSV files in Java, in this case the program is using an open source 3rd Part tool called “OpenCSV” (opencsv-2.3.jar is needed in the project’s build path).

At the beginning of the “CSVRead.java” class two variables are created named “Enter” and “Exit” respectively. Both variables are “private” (variables visible only to the class they belong), “static” (associated only with the class and not objects of the class), “final” (the values of the variables cannot be changed) and are given values “Eingang” and “Ausgang” which correspond to the English “Enter” and “Exit” words. These names need to be given because the comma separated values files (flat data) has them and they need to be the same from XML to Java respectively (Fig.19, 20).

 

Figure 19 – CSVRead.java class


 
Figure 20 – csv data

The “CSVRead.java” contains the “readAll()”  method which reads and obtains data from the tracker folder (csv files). We can see that at the beginning of the class that an object named “con” is created from the “Convertors.java”. This is done in order to be able to obtain only the necessary data from the flat data files. For example when there is need to obtain only the name of an employee, the method “getNameOnly()” is called and when there is need to obtain the chip ID of an employee the method “getIdOnly()” with the help of the  “con” object needed to call the methods inside “Convertors.java” class. Figure 19 shows a very small code snippet of the whole “readAll()” method and how the above functions are called inside it. 



 

Figure 21 – Code snippet from “readAll()” method




As mentioned above the “Convertors.java” class is used for parsing, formatting and converting the comma separated values files data. For example the method inside the class named “getTimeFromString()” is used to get only the time from a very big “String” inside the csv files. The “Convertors.java” class is implemented using the String Tokenizer class which allows strings to be broken into tokens. The object named “tok” is used for the tokenizing process as well as for the parsing of data types from XML to Java. For example the comma separated values files contain a long string shown on Figure 20.

 
Figure 22 – csv string 


In order to be able to obtain only the formatted date time “13/11/2008” the use of the “StringTokenizer” class and the “tok” is required. On Figure 21 it is shown how the above object is used to tokenize the long csv string inside the “getTimeFromString()” method located in the “Convertors.java” class from Figure 20 by specifying the tokenization which in this case is formatted by ( “/: “).  The string tokenizer’s purpose is to split a long line called a string to a smaller tokens of strings based on the formatting statement (Fig.21 line 14)


 
Figure 23 – Convertors.java 

The parsing of data types is done in lines 17 to 22 and as we can see the “tok” object is used to call the “nextToken()” method from the “StringTokenizer.java” class which is included in the Java utilities (the class is not implemented manually). The formatting is specified in line 14 from the code snippet. The parsing of day, month, year, hour, minutes and seconds is required because the data comes in as a “String” and it must be converted/parsed into an integer “int” data type. It is not possible to create a date time when the day, month, year, hour, minutes and seconds are of type “String”.

One of the main purposes of the software is to be able to transform XML to XHTML. The transformation is achieved using the XSLT language for transforming XML to other XML documents (or XHTML). But in order to do that, first it is needed to transform the Java objects into XML again. This is the purpose of the “ObjectToXmlConverter.java” class. First we create the method “write()” and inside it we create a new “jc” object from the “JAXBContext.java” and we specify a new instance for the model (Fig.23, line 21) and then we create xml file  (Fig.23, line 24) called in this case “MyNosferatu.xml” which contains the data from the Java objects in XML. In the end we marshal/transform (Fig.23, line 26) the object into xml with the help of the “m” object created from the “Marshaller.java” class (both “Marshaller.java” and “JAXBContext.java” are from “javax.xml.bind*;” API – they are not implemented manually)


 
Figure 24 – ObjectToXmlConverter.java









The class that handles the XML to XHTML file transformation is called “XmlToHtmlTransformer.java” and contains the “transform2()” method. The actual XSLT transformation is here using the “tf” object created from the “TransformerFactory.java” class which comes from the “javax.xml.transform*;” Java API (not manually implemented). After that we create a new XSL file (“MyTest.xsl” Fig.23, line 13) using an “xslt” object. This XSL file determines the look of the HTML output file. Finally in the “transform2()” method inside the class we call the “transform()” (different from transform2()) using the “transformer” object created from the  “javax.xml.transform.Transformer;” API (and specify the location and name of the html document (Fig.23, line 24).


 

Figure 25 – XmlToHtmlTransformer.java 


Finally in the Controller module we have the “Functionality.java” class which is the core of the software application and handles the most important functions of the system. The class contains some of the most important methods such as “sortEnterDateList()” and “sortExitDateList()” which are implemented to sort the entry and the exit dates of employees by ascending order. The sorting is achieved by obtaining the enter and exit dates from the “EmployeeHolder.java” and “EmployeeList.java” classes, then by calling the methods “getTimeFromString()” we get only the time from the big csv string and sort the date time by calling another method from the “Convertor.java” class named “sortDateTime()” to sort the obtained time. Then we create a new enter date list using the “fac” object and pass the argument to the “e” object which is created in advance from the inner class “Enter” located inside “EmployeeList.java” class and create a new sorted enter list.  The method for exit dates is almost the same and has the same purpose but it works with exit dates.

Another very important method located in the “Functionality.java” class is the “calculateStatsTimeForEmployee()” function. First we create two array lists called “tempEnter” and “temExit” and set them to “null” which means we create two empty lists. We get enter and exit dates and store them in the above objects from the “EmployeeHolder.java” and “EmployeeList.java” classes. The methods “setWorkingDayStartTime()” , “setWorkingDayEndTime()”, “setLbStartTime()” and “setLbEndTime()” which are implemented inside the same class are then called to set the start time, end time, lunch break start and lunch break end statistics. The next step is to call the “calculateDifferences()” method which calculates the exact lunch break and the start of the work day. Then we create an array list object named “al” in which we add the new statistics using the “sh” object and call an instance of the “EmployeeStatisticHolder.java” and add the new statistics stored in the array list “al” object.


















       View
 

Figure 26 – View classes 



The User Interface or the “View” module is implemented using “java.swing” and “java.awt” which are widget tools for Java used for the development of graphical user interface (GUI) applications for programs written in Java. Swing is developed to provide more sophisticated set of GUI components that AWT but in this software they are both used in combination to achieve the final look and functionality.











            Where 

The system can produce a result or output without engaging the graphical user interface so it can be stated that, in a way, this is an optional module. But in order to transform and store the data in an HTML document (Webpage) the user needs to use the interface. The interface is automatically displayed when the program is started.



            Why

One of the needs and requirements is to create and obtain the data from the comma separated values files and store it in an HTML document as mentioned above. This means that there is a bit of XSLT transformation but the software does everything behind the scenes, so the user does not need to be familiar with XML or XSLT to generate this file.

            How

As stated above, the User Interface is implemented using SWING and AWT utilities. They use the Java language for the definitions of the different components and controls. The interface consists of several buttons, a search bar, image icon, combo box, menu bar and a daily info window which pops up after choosing an employee by name from the list (by double clicking on the statistics). 















The actual look and design of the Interface is made mainly in the “View.java” class but all of the other classes are needed because most of the functionality of the graphical user interface is implemented there. In the “View.java” class we initialize an array called “pictures” which is used to display photos of the employees (pictures are passed as values in an array), when an employee has been selected either by name search or by choosing from the list of names (Fig.23). Then in the method “getPicture()” we use the created “pictures” array to collect the image and display them to the user(Fig.24).




 

Figure 27





 
Figure 28




This class also contains code that is responsible for some of the controls of the GUI like the “Upload”, “Transform”, “Save” and “List” buttons as well as the menu items on the top of the interface named “File”, “Edit” and “Help” and their submenus. The controller is used to initialize the View because the application is designed using the Model View Controller design pattern.

The “ButtonListener.java” class contains the actual functionality of the “List” button and the “Transform” button. The “List” button lists the total working days of an already selected employee (from search bar or combo box list) and the “Transform” button, when clicked on, the software saves the statistical data in an HTML document for evaluation purposes. 



The class called “DailyInfoWindow.java” contains implementation that offers the exit and enter dates of a single employee. The user needs to have selected an employee in advance and if he is interested to see the enter time and exit time of the selected employee he needs to double click on the displayed statistical data (Fig.26). Double clicking on a preferred date displays enter & exit statistic for the specified day only.





 
Figure 29




My “ItemListener.java” class is the class which determines what to do when the user chooses an employee from the combo box list. The search bar functionality is implemented in the “Search.java” class. The “AutoComplete.java” class together with the “CompletionService.java” class are responsible for the auto completion process of an employee name when using the GUI’s search bar. The user needs to know at least the first name and the first letter of the employee’s family name and then press the “enter” if he wants to review the statistical data (Fig.27).


The last class in the View the “LoadingBar.java” class contains code implementation for the loading bar that gives visual information of the progress comma separated values files reading progress. The loading bar is loaded every time the program is started because at the start of every run the software reads the plain source data (csv files) and stores in the Java application. It is implemented so with the main purpose of giving additional information to the user (how much time it takes to read the csv files located in the tracker folder).





Testing

Test Items 
1.	Model creation from defined XSD schema
2.	Transforming Java objects to XML
3.	XSLT functions or XML to HTML transformation
4.	Conversion functions for time units
5.	GUI responsiveness and functionality


          Features to be tested
The following is a list, by version and release, of the items to be tested:  

A.	 Model creation from defined XSD schema 
a.	Create classes 

B.	Transforming Java objects to XML
a.	Write method
b.	JAXB library functions

C.	XSLT functions /XML to HTML transformation
a.	XSLT functions 
b.	XSL to HTML 
c.	HTML file output


D.	Conversion functions for units of time
a.	JODA time library functions
b.	Sort & format the time
c.	Get the time


E.	GUI responsiveness and functionality
a.	User interface buttons responsiveness
b.	User interface functionality

         Features not to be tested
The following is a list of the areas that will not be specifically addressed. All testing in these areas will be indirect as a result of other testing efforts.
  
A.	Common separated values flat data source integrity
B.	Microsoft Windows 7 OS compatibility

          Testing aim

Data Integrity ­ measures the capability of the software to save and load files. Such files might be word templates as well as transformation files. A transformation file MIGHT persist inside the word template. The software must to load, save and transform the data. Such tests must be performed to guarantee the user experience after deployment. 
  
Test Objective: 	Verify System capability of keeping data integrity while performing saves, loads or other complex data operations. 
Technique: 	Execute the save, load and transform options with expected outcome to validate the integrity. 
Completion Criteria: 	All the expected results must appear at the expected time and location. A time frame for the response has not been pointed yet. A reasonable response is considered between up to one minute. 
Special Considerations: 	None 


Custom System Features ­ must measure the capability of the different software subjects to output the correct data. Correct data can be tested by preparing test scenarios with expected result. The models to be tested are listed under the section of “Features to be Tested” The Goal of the tests is to ensure the system functionality.  
  
Test Objective: 	Verify System Functionality. 
Technique: 	Prepared Tests with pre calculated expected results. Such tests will be created for each of the modules. 
Completion Criteria: 	The criteria will be predetermined by the different tests. The criteria to pass is that no test must fail in order to have a functional software. 
Special Considerations: 	The tests will be prepared  by the main developer individually 



Functional tests 
 
Test ID 	Description 	Expected Results 
 
  Test 1 	Start Time Reader	Load out the Time Reader UI
  Test 2 	Load Source Structure	Load and save data from schema 
  Test 3	Selecting an item	Selection of a single specific item
  Test 4 	Manipulation of target data	Extract, store and get formatted data
  Test 5 	Transform data for presentation	Display the selected data as expected 





Design Decisions 

A big part of the design process was to determine what classes and modules are going to be used and how. The decisions were based on previous discussions between former colleagues. There were no discussions during the project period, because there was only one member working on the project.
The decisions making was not that easy and straightforward because there were many thing to consider such as design patterns, what data types to use in Java to the programming framework. One of the biggest pluses working alone was that personal opinion did matter and it was a very important factor when there was need to make a design or technological choice.
Unfortunately by being the lone developer meant that there were no major discussions between team members which could have major effect on the software. This meant that many features and new ideas were implemented and added along the way.
One of the biggest design decisions for the developer was the one regarding what kind of technology should be used for the User Interface of the software. There was a long internal discussion for the developer but in the end the available opportunities were analyzed and pros and cons were extracted which helped with the final decision.







Conclusion


The creation of the system was challenging but rewarding process in which the participant was acting on the behalf of the development team and the stakeholder. This was very frustrating sometimes because it was difficult to play both roles, especially from the stakeholder’s point of view because he had no experience with such a role. Little by little things started to clear up and there was a better understanding on how to act on behalf of both sides and this problem slowly ceased to exist.

Another small setback, was with the use of the core development technologies. The developer was not very familiar with some of the programming languages but this was eliminated with a thorough detailed research.

The system serves its purpose as the current version of it fulfills the stakeholder’s requirements and it is functional. The work will continue after the examination period because the software has future potential and can be expanded.

In conclusion there is a fully functional working time management system that takes, stores, manipulates and transforms data taken from external flat sources. There are still limitations towards the XSLT transformation, picture upload and graphical user interface functions but these items could be updated and implemented better.



