// Import Libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AWTSwingListen{
	static JFrame frame;

	public static void main(String[] args){
		// schedule this for the event dispatch thread (edt)
		//SwingUtilities.invokeLater(new Runnable(){
		//	public void run(){
				displayJFrame();
			//}
		//});
	}

	static void displayJFrame(){
		frame = new JFrame("Our JButton listener example");

		
		// create texbox
		JTextField username = new JTextField("Username");
		JTextField password = new JTextField("Password");
		
		//Create the combo box, select item at index
		String[] divStrings = { "Cmd", "Eng", "Sec", "Med", "Com" };
		JComboBox divList = new JComboBox(divStrings);
		divList.setSelectedIndex(4);
		divList.addActionListener(new ActionListener(){});
		
		// create jbutton
		JButton showDialogButton = new JButton("Login");
    
		// add the listener to the jbutton to handle the "pressed" event
		showDialogButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				// display/center the jdialog when the button is pressed
								
				if(password.getText() == "bob"){
					JDialog dialog = new JDialog(frame, password.getText(), true);
				}
				else{
					JDialog dialog = new JDialog(frame, "is not the password", true);
				};	
				//JDialog dialog = new JDialog(frame, password.getText(), true);
				frame.dialog.setLocationRelativeTo(frame);
				frame.dialog.setVisible(true);
			}
		});

		// put the button on the frame
		frame.getContentPane().setLayout(new FlowLayout());
		frame.add(password);
		frame.add(showDialogButton);
		frame.add(divList);
		// set up the jframe, then display it
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300, 200));
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}