// Import Swing GUI componets
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SwingGUI{
	
	// Component method: Creat, set, add to panel
	private static void placeComponents(JPanel panel) {
		panel.setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField("Enter Name", 20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		passwordText.setEchoChar((char)0);
		passwordText.setText("enter password");
		panel.add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
		
		JButton registerButton = new JButton("register");
		registerButton.setBounds(180, 80, 80, 25);
		panel.add(registerButton);
	}
	

	// Main method: Entry point
	public static void main(String[] args) {
		JFrame frame = new JFrame("Demo application"); // Create
		frame.setSize(300, 150); // Size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close

		JPanel panel = new JPanel(); // Create
		frame.add(panel); //Add panel to frame
		placeComponents(panel); // Run Add componets to panel
		frame.setLocationRelativeTo(null); // Set window position to center of screen
		frame.setVisible(true);
	}


}
