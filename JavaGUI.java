// Java with AWTGUI New Branch

//IMPORT.
import java.awt.*;
import java.awt.event.*;
 
//File is called JavaGUI.
public class JavaGUI {
 
    // Declare a variables for types. Frame, Label, Button. 
    Frame frame;
	Label label;
    Button button;
 
	// Method: Create Objects With Name and title.
    public JavaGUI() {
        frame = new Frame("I am a Frame");
		label = new Label("I am a Label");
        button = new Button("I am a button"); 
    }
 
	// Main: Name of Java main method;
	// Public:Access Modifier; Static:No need to instantiate class; Void:Nothing Returned;
	// String[] args: Array of type java.lang.String class. Stores Java command line arguments.
    public static void main(String[] args) {
 

        // Create instance of JavaGUI.
        JavaGUI window = new JavaGUI();

		// Set label size/position.
		window.label.setBounds(50,20,100,30);

		// Set button size/position.	
		window.button.setBounds(50,60,100,30);    

		// Set window size.
        window.frame.setSize(400, 400);
 
        // Set window layout.
        window.frame.setLayout(null);

        // Add label to frame so button can be seen.
        window.frame.add(window.label);
		
       // Add button to frame so button can be seen.
		window.frame.add(window.button);
 
        // Register window listener event to frame so window can be closed.
        window.frame.addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                }
        );
 
        // Set frame visability so window can be seen.
        window.frame.setVisible(true);
    }
}