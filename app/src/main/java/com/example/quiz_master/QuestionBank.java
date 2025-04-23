package com.example.quiz_master;



import java.util.HashMap;

public class QuestionBank {

    public static HashMap<String, String[]> getQuestions(String topic) {
        HashMap<String, String[]> questions = new HashMap<>();

        switch (topic.toLowerCase()) {
            case "ajp":
                questions.put("What is Java?", new String[]{"Programming Language", "Car", "Fruit", "City"});
                questions.put("Which is not a Java keyword?", new String[]{"static", "try", "Integer", "switch"});
                questions.put("What is JVM?", new String[]{"Java Virtual Machine", "Just Verify Machine", "Java Visualize Machine", "None of these"});
                questions.put("What is JRE?", new String[]{"Java Runtime Environment", "Java Real Environment", "Java Run Environment", "None of these"});
                questions.put("Which is not a feature of Java?", new String[]{"Dynamic", "Architecture Neutral", "Use of pointers", "Object-oriented"});
                questions.put("Which of the following is a class?", new String[]{"String", "Integer", "Boolean", "All of these"});
                questions.put("What is inheritance?", new String[]{"New class from existing class", "All programs have it", "None of these", "Use of pointers"});
                questions.put("What is Polymorphism?", new String[]{"Different forms", "Same form", "Many forms", "None of these"});
                questions.put("What is abstraction?", new String[]{"Hiding implementation", "Showing implementation", "To do", "None of these"});
                questions.put("What is Encapsulation?", new String[]{"Binding data and code", "Unwrapping", "Destroying", "None of these"});
                questions.put("What is an interface?", new String[]{"Blueprint of a class", "A type of class", "None of these", "A method"});
                questions.put("What are lambda expressions?", new String[]{"Anonymous functions", "Methods", "Functioning Interface", "None of these"});
                questions.put("What are streams?", new String[]{"Sequence of elements", "Java 8", "Collection", "Data"});
                questions.put("What is multithreading?", new String[]{"Multiple threads", "Multiple devices", "Different forms", "All"});
                questions.put("What are generics?", new String[]{"Type safety", "Method safety", "Variable Safety", "All of these"});
                questions.put("What is serialization?", new String[]{"Convert objects to stream", "Convert strings", "None of these", "To serialize data"});
                questions.put("What are annotations?", new String[]{"Metadata", "Tags", "Data", "Variables"});
                questions.put("What are design patterns?", new String[]{"Reusable solutions", "Reusable classes", "Reusable method", "All"});
                questions.put("What is Hibernate?", new String[]{"ORM tool", "None of these", "To hibernate", "Method"});
                questions.put("What is Spring?", new String[]{"Framework", "Class", "File", "Data"});
                questions.put("What is Maven?", new String[]{"Build automation tool", "IDE", "Class", "None of these"});
                questions.put("Give the abbreviation of AWT ?", new String[]{"Applet Windowing Toolkit", "Abstract Windowing Toolkit", "Absolute Windowing Toolkit", "None of the above"});
                questions.put("Which is the container that contain title bar and can have MenuBars. It can have other components like button, textfield etc.?", new String[]{"Panel", "Frame", "Window", "Container"});
                questions.put("Which is a component in AWT that can contain another components like buttons, textfields, labels etc.?", new String[]{"Window", "Container", "Panel", "Frame"});
                questions.put("AWT is used for GUI programming in java?", new String[]{"True", "False"});
                questions.put("Which class provides many methods for graphics programming?", new String[]{"java.awt", "java.Graphics", "java.awt.Graphics", "None of the above"});
                questions.put("These two ways are used to create a Frame By creating the object of Frame class (association) By extending Frame class (inheritance)?", new String[]{"True", "False"});
                questions.put("Which is the container that doesn't contain titlebar and MenuBars. It can have other components like button, textfield etc?", new String[]{"Window", "Frame", "Panel", "Container"});
                questions.put("How many types of controls does AWT supports these controls are subclasses of component?", new String[]{"7", "6", "5", "8"});
                questions.put("Which are passive controls that do not support any interaction with the user?", new String[]{"Choice", "List", "Labels", "Checkbox"});
                questions.put("By which method You can set or change the text in a Label ?", new String[]{"setText()", "getText()", "Both A & B", "None of the above"});
                questions.put("Which class is used to create a pop‐up list of items from which the user may choose?", new String[]{"List", "Choice", "Labels", "Checkbox"});
                questions.put("Which object can be constructed to show any number of choices in the visible window?", new String[]{"Labels", "Choice", "List", "Checkbox"});
                questions.put("Which is used to store data and partial results, as well as to perform dynamic linking, return values for methods, and dispatch exceptions?", new String[]{"Window", "Panel", "Frame", "Container"});
                questions.put("The following way is used to create a frame is by creating the object of Frame class?", new String[]{"inheritance", "association", "Both A & B", "None of the above"});
                questions.put("AWT more powerful components like tables, lists, scroll panes, color chooser, tabbed pane etc.?", new String[]{"True", "False"});
                questions.put("These four methods commonly used in? (i) public void add(Component c) (ii) public void setSize(int width,int height) (iii) public void setLayout(LayoutManager m) (iv) public void setVisible(boolean)", new String[]{"Graphics class", "Component class", "Both A & B", "None of the above"});
                questions.put("In Graphics class which method is used to draws a rectangle with the specified width and height?", new String[]{"public void drawRect(int x, int y, int width, int height)", "public abstract void fillRect(int x, int y, int width, int height)", "public abstract void drawLine(int x1, int y1, int x2, int y2)", "public abstract void drawOval(int x, int y, int width, int height)"});
                questions.put("Implement the Listener interface and overrides its methods is required to perform in event handling?", new String[]{"True", "False"});
                questions.put("Public class MenuBar extends .", new String[]{"MenuComponent", "MenuContainer", "ComponentMenu", "MenuBar"});
                questions.put("Which of the following is true about AWT and Swing components?", new String[]{"AWT components creates a process where as swing components creates a thread", "AWT components creates a thread whereas swing components creates a process", "Both AWT and Swing components creates a process", "Both AWT and swing components creates a thread"});
                questions.put("Give the abbreviation of AWT ?", new String[]{"Applet Windowing Toolkit", "Abstract Windowing Toolkit", "Absolute Windowing Toolkit", "None of the above"});
                questions.put("Which is the container that contain title bar and can have MenuBars. It can have other components like button, textfield etc.?", new String[]{"Panel", "Frame", "Window", "Container"});
                questions.put("Which is a component in AWT that can contain another components like buttons, textfields, labels etc.?", new String[]{"Window", "Container", "Panel", "Frame"});
                questions.put("AWT is used for GUI programming in java?", new String[]{"True", "False"});
                questions.put("Which class provides many methods for graphics programming?", new String[]{"java.awt", "java.Graphics", "java.awt.Graphics", "None of the above"});
                questions.put("These two ways are used to create a Frame By creating the object of Frame class (association) By extending Frame class (inheritance)?", new String[]{"True", "False"});
                questions.put("Which is the container that doesn't contain titlebar and MenuBars. It can have other components like button, textfield etc?", new String[]{"Window", "Frame", "Panel", "Container"});
                questions.put("How many types of controls does AWT supports these controls are subclasses of component?", new String[]{"7", "6", "5", "8"});
                questions.put("Which are passive controls that do not support any interaction with the user?", new String[]{"Choice", "List", "Labels", "Checkbox"});
                questions.put("By which method You can set or change the text in a Label ?", new String[]{"setText()", "getText()", "Both A & B", "None of the above"});
                questions.put("Which class is used to create a pop‐up list of items from which the user may choose?", new String[]{"List", "Choice", "Labels", "Checkbox"});
                questions.put("Which object can be constructed to show any number of choices in the visible window?", new String[]{"Labels", "Choice", "List", "Checkbox"});
                questions.put("Which is used to store data and partial results, as well as to perform dynamic linking, return values for methods, and dispatch exceptions?", new String[]{"Window", "Panel", "Frame", "Container"});
                questions.put("The following way is used to create a frame is by creating the object of Frame class?", new String[]{"inheritance", "association", "Both A & B", "None of the above"});
                questions.put("AWT more powerful components like tables, lists, scroll panes, color chooser, tabbed pane etc.?", new String[]{"True", "False"});
                questions.put("These four methods commonly used in? (i) public void add(Component c) (ii) public void setSize(int width,int height) (iii) public void setLayout(LayoutManager m) (iv) public void setVisible(boolean)", new String[]{"Graphics class", "Component class", "Both A & B", "None of the above"});
                questions.put("In Graphics class which method is used to draws a rectangle with the specified width and height?", new String[]{"public void drawRect(int x, int y, int width, int height)", "public abstract void fillRect(int x, int y, int width, int height)", "public abstract void drawLine(int x1, int y1, int x2, int y2)", "public abstract void drawOval(int x, int y, int width, int height)"});
                questions.put("Implement the Listener interface and overrides its methods is required to perform in event handling?", new String[]{"True", "False"});
                questions.put("Public class MenuBar extends .", new String[]{"MenuComponent", "MenuContainer", "ComponentMenu", "MenuBar"});
                questions.put("Which of the following is true about AWT and Swing components?", new String[]{"AWT components creates a process where as swing components creates a thread", "AWT components creates a thread whereas swing components creates a process", "Both AWT and Swing components creates a process", "Both AWT and swing components creates a thread"});
                questions.put("Panel is defined as .", new String[]{"The Panel class is a concrete subclass of Container.", "A Panel is a window that does not contain titlebar, menubar and border.", "Panel is a superclass of Applet.", "All of the above."});
                questions.put("What is API?", new String[]{"Application Programming Interchange", "Application Programming Interaction", "Application Programming Interface", "None of these"});
                questions.put("What is default layout for Dialog?", new String[]{"FlowLayout", "GridLayout", "CardLayout", "BorderLayout"});
                questions.put("Which method is used to count the number of items is the List.", new String[]{"getItem( )", "getSelectedItem( )", "getItemCount( )", "getCount( )"});
                questions.put("The correct hierarchy for Panel is", new String[]{"Component – Container – Window – Panel", "Component – Container – Applet – Panel", "Component – Container – Panel", "Container – Component – Panel"});
                questions.put("Which is the correct constructor of GridLayout.", new String[]{"GridLayout(int a)", "GridLayout(int num_rows, int num_columns)", "GridLayout(int rows, int cols, int vert)", "GridLayout(int hor)"});
                questions.put("What are the types of DialogBox?", new String[]{"Modal DialogBox", "Modal and Modeless DialogBox", "Modam", "None of the above"});
                questions.put("In the give constructor what third parameter indicates : ScrollBar s = new ScrollBar(0,10,20,0,1000);", new String[]{"size of thumb", "minimum value", "Increment value", "Initial Value"});
                questions.put("Which class is used to represent a single line textbox with password character facility?", new String[]{"TextField", "TextArea", "Label", "Checkbox"});
                questions.put("To set the title to the Frame window method is used.", new String[]{"void setTitle(String str)", "void setText(String str)", "void settitle(String str)", "None of the above"});
                questions.put("Suppose a Panel is added to a Frame and a Button is added to the Panel. If the Frame’s font is set to 12 point Times New Roman, the panel’s font is set 10 points Times New Roman and the Button’s font is not set. What font will be used to display the Button’s label?", new String[]{"12 point Times New Roman", "11 point Times New Roman", "10 point Times New Roman", "9 point Times New Roman"});
                questions.put("Which of the following is true about FlowLayout?", new String[]{"FlowLayout can use multiple rows if the horizontal space in the container is too small to hold the component.", "FlowLayout is the default layout manager of panel and applet.", "It is the default layout manager for window.", "Both A & B."});
                questions.put("Which of the method can be used to output a String in an Applet?", new String[]{"display( )", "print( )", "drawString( )", "transient( )"});
                questions.put("positions are the components into 5 regions east, west, south, north, center.", new String[]{"CardLayout", "BorderLayout", "GridLayout", "FlowLayout"});
                questions.put("What is API?", new String[]{"Application Programming Interchange", "Application Programming Interaction", "Application Programming Interface", "None of these"});
                questions.put("Panel is defined as", new String[]{"Panel class is a concrete sub‐class of container", "A Panel is a window that does not contain a title bar, menu bar or border", "Panel is the superclass of Applet", "All of above"});
                questions.put("Which component of AWT provides compact, multichoice, scrolling component?", new String[]{"List", "Choice", "Panel", "TextArea"});
                questions.put("When there is a switching condition like ON or OFF, which control is used of following?", new String[]{"Button", "RadioButton", "ToggleButton", "TextField"});
                questions.put("Which method is used to set password characterfor a TextField?", new String[]{"setPasswordCharacter( )", "setEchoChar( )", "setPassChar( )", "setEchoCharacter( )"});
                questions.put("The getContentPane( ) method is of which class?", new String[]{"JApplet", "JFrame", "JButton", "None of these"});
                questions.put("Which class defines setSize( ) method?", new String[]{"Frame", "Applet", "Component", "Panel"});
                questions.put("is a swing class that allows to enter a single line of text.", new String[]{"TextField", "JTextField", "EditTextField", "TextArea"});
                questions.put("Which Text Component method is used to set a TextComponent to the read‐only state?", new String[]{"Editable", "NonEditable", "setEchoChar", "setEditable"});
                questions.put("How would you set the color of graphics context called g to cyan?", new String[]{"g.setColor(“cyan”);", "g.setCurrentColor(cyan);", "g.setColor(“Color.cyan”);", "g.setColor(Color.cyan);"});
                questions.put("What is use of second parameter in given constructor Lable(String,int)", new String[]{"specifies height of label", "specifies width of label in terms of pixel", "specifies the alignment of text in label in terms of pixel", "specifies width of label"});
                questions.put("The setBackground() method is part of which of the following class java.awt package?", new String[]{"Component", "Applet", "Object", "Graphics"});
                questions.put("What does the following line of code do? TextField tf = new TextField(10);", new String[]{"will set 10 to TextField as its initial text.", "Will set the character capacity to 10", "Both A & B", "None of These"});
                questions.put("Frame is a standard window, which is of Window class from AWT hierarchy?", new String[]{"Derived class / Subclass", "Base class / Super class", "Root class", "Family class"});
                questions.put("A is a passive AWT control that do not generate any event?", new String[]{"Button", "RadioButton", "Choice", "Label"});
                questions.put("The default layout manager of Frame is", new String[]{"FlowLayout", "BorderLayout", "GridLayout", "CardLayout"});
                questions.put("Which method is used to check the status of checkbox?", new String[]{"getStatus( )", "getState( )", "isChecked( )", "getChecked( )"});
                questions.put("Which of the following method is used to set a TextComponent to read‐only mode?", new String[]{"Editable( )", "nonEditable( )", "setEchoChar( )", "setEditable( )"});
                questions.put("generates action events when an item is double‐clicked.", new String[]{"List", "Checkbox", "MenuItem", "TextField"});
                questions.put("Which of the following does not have its default layout as BorderLayout.", new String[]{"Frame", "Dialog", "JApplet", "All of Above"});
                questions.put("Which of the following statement about GUI component is wrong?", new String[]{"swing exists since the version 1.2 of the JDK", "AWT stands for Abstract Window Toolkit", "You cannot place AWT component on swing container.", "The AWT classes are deprecated."});
                questions.put("Which of the following package is used for Graphical User Interface?", new String[]{"java.applet", "java.awt", "java.awt.image", "java.io"});
                questions.put("What are the variables defined in Dimension?", new String[]{"length and width", "height and length", "height and width", "None of these"});
                questions.put("Which AWT component is not editable?", new String[]{"Button", "TextField", "FlowLayout", "Label"});
                questions.put("Current text of Label can be obtained using", new String[]{"setAlignment( )", "getAlignment( )", "getText( )", "setText( )"});
                questions.put("The method places a Menu m into the MenuBar mb.", new String[]{"mb.addMenuItem(m)", "mb.addItem(m)", "mb.add(m)", "None of these"});
                questions.put("Which of these Components cannot be added to Frame?", new String[]{"Label", "Button", "CheckboxGroup", "All of above"});
                questions.put("What is use of second parameter given in Label constructor : Label(String, int)", new String[]{"Specifies height of label in terms of pixels.", "specifies width of label in terms of pixels.", "specifies the alignment of text in label in terms of pixels.", "Specifies maximum numbers of characters in label."});
                questions.put("Which of these classes can be added to any Container class, using the add method defined in Container class?", new String[]{"Button", "CheckboxMenuItem", "Menu", "MenuBar"});
                questions.put("What is the use of setEchoChar( ) method?", new String[]{"to set echo in symbol form", "to set char in symbol form", "Both A & B", "to create password in symbol form"});
                questions.put("method returns currently selected item in choice.", new String[]{"getSelectedItem( )", "getSelectedElement( )", "getSelectedIndex( )", "getItem( )"});
                questions.put("Which statement with respect to inner class is true. A. It is a way of logically grouping classes that are only used in one place. B. It increases encapsulation. C. It can lead to more readable and maintainable code.", new String[]{"Only A statement is true.", "Only B statement is true.", "Only C statement is true.", "All A,B and C are true."});
                questions.put("The default layout of Applet is", new String[]{"GridLayout", "CardLayout", "FlowLayout", "BorderLayout"});
                questions.put("Java Applets are used to create applications.", new String[]{"Graphical", "user interactive", "Both A & B", "None of these"});
                questions.put("The following example shows the creation of applet import java.applet.*; import java.awt.*; public class Main extends Applet { public void paint(Graphics g) { g.drawString(\"Welcome in Java Applet.\",40,20); } }", new String[]{"Banner using Applet", "Basic Applet", "Display clock", "None of the above"});
                questions.put("Which of the following is a valid HTML file to run an applet program store in MyApplet.java file?", new String[]{"<APPLET CODE = \"MyApplet.class\"></APPLET>", "<APPLET CODE=\"MyApplet.java\" WIDTH=250 HEIGHT=200>", "<applet code=\"MyApplet.class\" width=250 height=200></applet>", "<applet code=\"MyApplet\" height =”250” width =”200”></applet>"});
                questions.put("Which of the following sets the frame, say frame to 300 pixels wide by 200 high?", new String[]{"frame.setSize( 300, 200 );", "frame.setSize( 300, 200 );", "frame.paint( 300, 200 );", "frame.setVisible( 300, 200 );"});
                questions.put("Fill in the blanks so that this program displays a Frame: import java.awt.*; public class microGUI { public static void main ( String[] args ) { Frame frm = new ( ); frm. ( 150, 100 ); frm. ( true ); } }", new String[]{"Form, setVisible, setOn", "Frame, setSize, setVisible", "Frame, setVisible, setSize", "Window, setSize, paint"});
                questions.put("What is the length of the application box made by this program? import java.awt.*; import java.applet.*; public class myapplet extends Applet { public void paint(Graphics g) { g.drawString(\"A Simple Applet\", 20, 20); } }", new String[]{"20", "50", "100", "System Dependent"});
                questions.put("Which components are used in the following output?", new String[]{"Label, TextField, Button", "Applet, Label", "Applet, Button", "Grid Layout, Label, Button"});
                break;

            case "man":
                questions.put("What does MAN stand for?", new String[]{"Metropolitan Area Network", "Mini Area Network", "Mega Area Network", "Medium Access Network"});
                questions.put("Which is a MAN protocol?", new String[]{"DQDB", "TCP", "HTTP", "SMTP"});
                break;

            case "eti":
                questions.put("What is ETI in electronics?", new String[]{"Electronic Test Instrumentation", "Ethernet Transfer Interface", "Embedded Telecom Interface", "Electronic Transfer Input"});
                questions.put("Which tool is used in ETI?", new String[]{"Oscilloscope", "Thermometer", "Altimeter", "Speedometer"});

                break;

            default:
                questions.put("No questions available for this topic", new String[]{"N/A", "N/A", "N/A", "N/A"});
                break;
        }

        return questions;
    }

    public static HashMap<String, String> getAnswers(String topic) {
        HashMap<String, String> answers = new HashMap<>();

        switch (topic.toLowerCase()) {
            case "ajp":
                answers.put("What is Java?", "Programming Language");
                answers.put("Which is not a Java keyword?", "Integer");
                answers.put("What is JVM?", "Java Virtual Machine");
                answers.put("What is JRE?", "Java Runtime Environment");
                answers.put("Which is not a feature of Java?", "Use of pointers");
                answers.put("Which of the following is a class?", "All of these");
                answers.put("What is inheritance?", "New class from existing class");
                answers.put("What is Polymorphism?", "Many forms");
                answers.put("What is abstraction?", "Hiding implementation");
                answers.put("What is Encapsulation?", "Binding data and code");
                answers.put("What is an interface?", "Blueprint of a class");
                answers.put("What are lambda expressions?", "Anonymous functions");
                answers.put("What are streams?", "Sequence of elements");
                answers.put("What is multithreading?", "Multiple threads");
                answers.put("What are generics?", "Type safety");
                answers.put("What is serialization?", "Convert objects to stream");
                answers.put("What are annotations?", "Metadata");
                answers.put("What are design patterns?", "Reusable solutions");
                answers.put("What is Hibernate?", "ORM tool");
                answers.put("What is Spring?", "Framework");
                answers.put("What is Maven?", "Build automation tool");
                answers.put("Give the abbreviation of AWT ?", "Abstract Windowing Toolkit");
                answers.put("Which is the container that contain title bar and can have MenuBars. It can have other components like button, textfield etc.?", "Frame");
                answers.put("Which is a component in AWT that can contain another components like buttons, textfields, labels etc.?", "Container");
                answers.put("AWT is used for GUI programming in java?", "True");
                answers.put("Which class provides many methods for graphics programming?", "java.awt.Graphics");
                answers.put("These two ways are used to create a Frame By creating the object of Frame class (association) By extending Frame class (inheritance)?", "True");
                answers.put("Which is the container that doesn't contain titlebar and MenuBars. It can have other components like button, textfield etc?", "Panel");
                answers.put("How many types of controls does AWT supports these controls are subclasses of component?", "7");
                answers.put("Which are passive controls that do not support any interaction with the user?", "Labels");
                answers.put("By which method You can set or change the text in a Label ?", "setText()");
                answers.put("Which class is used to create a pop‐up list of items from which the user may choose?", "Choice");
                answers.put("Which object can be constructed to show any number of choices in the visible window?", "List");
                answers.put("Which is used to store data and partial results, as well as to perform dynamic linking, return values for methods, and dispatch exceptions?", "Frame");
                answers.put("The following way is used to create a frame is by creating the object of Frame class?", "association");
                answers.put("AWT more powerful components like tables, lists, scroll panes, color chooser, tabbed pane etc.?", "True");
                answers.put("These four methods commonly used in? (i) public void add(Component c) (ii) public void setSize(int width,int height) (iii) public void setLayout(LayoutManager m) (iv) public void setVisible(boolean)", "Component class");
                answers.put("In Graphics class which method is used to draws a rectangle with the specified width and height?", "public abstract void fillRect(int x, int y, int width, int height)");
                answers.put("Implement the Listener interface and overrides its methods is required to perform in event handling?", "True");
                answers.put("Public class MenuBar extends .", "MenuComponent");
                answers.put("Which of the following is true about AWT and Swing components?", "Both AWT and Swing components creates a process");
                answers.put("Give the abbreviation of AWT ?", "Abstract Windowing Toolkit");
                answers.put("Which is the container that contain title bar and can have MenuBars. It can have other components like button, textfield etc.?", "Frame");
                answers.put("Which is a component in AWT that can contain another components like buttons, textfields, labels etc.?", "Container");
                answers.put("AWT is used for GUI programming in java?", "True");
                answers.put("Which class provides many methods for graphics programming?", "java.awt.Graphics");
                answers.put("These two ways are used to create a Frame By creating the object of Frame class (association) By extending Frame class (inheritance)?", "True");
                answers.put("Which is the container that doesn't contain titlebar and MenuBars. It can have other components like button, textfield etc?", "Panel");
                answers.put("How many types of controls does AWT supports these controls are subclasses of component?", "7");
                answers.put("Which are passive controls that do not support any interaction with the user?", "Labels");
                answers.put("By which method You can set or change the text in a Label ?", "setText()");
                answers.put("Which class is used to create a pop‐up list of items from which the user may choose?", "Choice");
                answers.put("Which object can be constructed to show any number of choices in the visible window?", "List");
                answers.put("Which is used to store data and partial results, as well as to perform dynamic linking, return values for methods, and dispatch exceptions?", "Frame");
                answers.put("The following way is used to create a frame is by creating the object of Frame class?", "association");
                answers.put("AWT more powerful components like tables, lists, scroll panes, color chooser, tabbed pane etc.?", "True");
                answers.put("These four methods commonly used in? (i) public void add(Component c) (ii) public void setSize(int width,int height) (iii) public void setLayout(LayoutManager m) (iv) public void setVisible(boolean)", "Component class");
                answers.put("In Graphics class which method is used to draws a rectangle with the specified width and height?", "public abstract void fillRect(int x, int y, int width, int height)");
                answers.put("Implement the Listener interface and overrides its methods is required to perform in event handling?", "True");
                answers.put("Public class MenuBar extends .", "MenuComponent");
                answers.put("Which of the following is true about AWT and Swing components?", "Both AWT and Swing components creates a process");
                answers.put("Panel is defined as .", "All of the above.");
                answers.put("What is API?", "Application Programming Interface");
                answers.put("What is default layout for Dialog?", "FlowLayout");
                answers.put("Which method is used to count the number of items is the List.", "getItemCount( )");
                answers.put("The correct hierarchy for Panel is", "Component – Container – Panel");
                answers.put("Which is the correct constructor of GridLayout.", "GridLayout(int num_rows, int num_columns)");
                answers.put("What are the types of DialogBox?", "Modal and Modeless DialogBox");
                answers.put("In the give constructor what third parameter indicates : ScrollBar s = new ScrollBar(0,10,20,0,1000);", "size of thumb");
                answers.put("Which class is used to represent a single line textbox with password character facility?", "TextField");
                answers.put("To set the title to the Frame window method is used.", "void setTitle(String str)");
                answers.put("Suppose a Panel is added to a Frame and a Button is added to the Panel. If the Frame’s font is set to 12 point Times New Roman, the panel’s font is set 10 points Times New Roman and the Button’s font is not set. What font will be used to display the Button’s label?", "10 point Times New Roman");
                answers.put("Which of the following is true about FlowLayout?", "Both A & B.");
                answers.put("Which of the method can be used to output a String in an Applet?", "drawString( )");
                answers.put("positions are the components into 5 regions east, west, south, north, center.", "BorderLayout");
                answers.put("What is API?", "Application Programming Interface");
                answers.put("Panel is defined as", "All of above");
                answers.put("Which component of AWT provides compact, multichoice, scrolling component?", "List");
                answers.put("When there is a switching condition like ON or OFF, which control is used of following?", "ToggleButton");
                answers.put("Which method is used to set password characterfor a TextField?", "setEchoChar( )");
                answers.put("The getContentPane( ) method is of which class?", "None of these");
                answers.put("Which class defines setSize( ) method?", "Component");
                answers.put("is a swing class that allows to enter a single line of text.", "JTextField");
                answers.put("Which Text Component method is used to set a TextComponent to the read‐only state?", "setEditable");
                answers.put("How would you set the color of graphics context called g to cyan?", "g.setColor(Color.cyan);");
                answers.put("What is use of second parameter in given constructor Lable(String,int)", "specifies the alignment of text in label in terms of pixel");
                answers.put("The setBackground() method is part of which of the following class java.awt package?", "Component");
                answers.put("What does the following line of code do? TextField tf = new TextField(10);", "Will set the character capacity to 10");
                answers.put("Frame is a standard window, which is of Window class from AWT hierarchy?", "Derived class / Subclass");
                answers.put("A is a passive AWT control that do not generate any event?", "Label");
                answers.put("The default layout manager of Frame is", "GridLayout");
                answers.put("Which method is used to check the status of checkbox?", "getState( )");
                answers.put("Which of the following method is used to set a TextComponent to read‐only mode?", "setEditable( )");
                answers.put("generates action events when an item is double‐clicked.", "MenuItem");
                answers.put("Which of the following does not have its default layout as BorderLayout.", "All of Above");
                answers.put("Which of the following statement about GUI component is wrong?", "You cannot place AWT component on swing container.");
                answers.put("Which of the following package is used for Graphical User Interface?", "java.awt");
                answers.put("What are the variables defined in Dimension?", "height and width");
                answers.put("Which AWT component is not editable?", "Label");
                answers.put("Current text of Label can be obtained using", "getText( )");
                answers.put("The method places a Menu m into the MenuBar mb.", "mb.add(m)");
                answers.put("Which of these Components cannot be added to Frame?", "CheckboxGroup");
                answers.put("What is use of second parameter given in Label constructor : Label(String, int)", "specifies the alignment of text in label in terms of pixels.");
                answers.put("Which of these classes can be added to any Container class, using the add method defined in Container class?", "Button");
                answers.put("What is the use of setEchoChar( ) method?", "Both A & B");
                answers.put("method returns currently selected item in choice.", "getSelectedItem( )");
                answers.put("Which statement with respect to inner class is true. A. It is a way of logically grouping classes that are only used in one place. B. It increases encapsulation. C. It can lead to more readable and maintainable code.", "All A,B and C are true.");
                answers.put("The default layout of Applet is", "FlowLayout");
                answers.put("Java Applets are used to create applications.", "Both A & B");
                answers.put("The following example shows the creation of applet import java.applet.*; import java.awt.*; public class Main extends Applet { public void paint(Graphics g) { g.drawString(\"Welcome in Java Applet.\",40,20); } }", "Basic Applet");
                answers.put("Which of the following is a valid HTML file to run an applet program store in MyApplet.java file?", "<applet code=\"MyApplet.class\" width=250 height=200></applet>");
                answers.put("Which of the following sets the frame, say frame to 300 pixels wide by 200 high?", "frame.setSize( 300, 200 );");
                answers.put("Fill in the blanks so that this program displays a Frame: import java.awt.*; public class microGUI { public static void main ( String[] args ) { Frame frm = new ( ); frm. ( 150, 100 ); frm. ( true ); } }", "Frame, setSize, setVisible");
                answers.put("What is the length of the application box made by this program? import java.awt.*; import java.applet.*; public class myapplet extends Applet { public void paint(Graphics g) { g.drawString(\"A Simple Applet\", 20, 20); } }", "20");
                answers.put("Which components are used in the following output?", "Label, TextField, Button");


                break;

            case "man":
                answers.put("What does MAN stand for?", "Metropolitan Area Network");
                answers.put("Which is a MAN protocol?", "DQDB");
                break;

            case "eti":
                answers.put("What is ETI in electronics?", "Electronic Test Instrumentation");
                answers.put("Which tool is used in ETI?", "Oscilloscope");
                break;

            default:
                answers.put("No questions available for this topic", "N/A");
                break;
        }

        return answers;
    }
}
