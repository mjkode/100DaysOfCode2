import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
public class ProgressBarGUI extends JFrame{
	JProgressBar progress;  
  
	ProgressBarGUI(){
    // Create the progressBar
//		progress = new JProgressBar(0,1000);	
    // Set the position of the progressBar
//		progress.setBounds(35,40,165,30);
	// Set the color	
//		progress.setForeground(Color.GREEN);
    // Initialize the progressBar to 0   
//		progress.setValue(0);  
    // Show the progress string
//		progress.setStringPainted(true);  

		
	// Create a spinner
		JSpinner spinner = new JSpinner();		
	// Set Bounds for spinner
		spinner.setBounds(100, 100, 50, 50);	
	
	
	// Create a label	
		JLabel label = new JLabel("TEST");
		label.setBounds(150, 150, 50, 50);
		label.setOpaque(true);
		label.setBackground(Color.RED);
	
	// create a button	
		JButton button = new JButton("press");
		//class MyActionListener implements ActionListener {
			//public void actionPerformed(ActionEvent e) {
				//System.out.println("Tickles!");
				//.setText("ok");
			//}
		//}
		//button.addActionListener(new MyActionListener());
		button.setBounds(200, 200, 50, 50);
		button.setOpaque(true);
		button.setBackground(Color.RED);
		
		// Add action linstener on button press
		class MyActionListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Tickles!");
				label.setText(spinner.getValue().toString());
				progress.setMaximum(Integer.parseInt(spinner.getValue().toString().trim()));
			}
		}
		button.addActionListener(new MyActionListener());

// Create the progressBar
		progress = new JProgressBar(0, Integer.parseInt(spinner.getValue().toString().trim()));	
    // Set the position of the progressBar
		progress.setBounds(35,40,165,30);
	// Set the color	
		progress.setForeground(Color.GREEN);
    // Initialize the progressBar to 0   
		progress.setValue(0);  
    // Show the progress string
		progress.setStringPainted(true);  


	
	// Add the progressBar to the frame
		add(progress);  
		add(spinner);
		add(label);
		add(button);
		
		
		setSize(500,500);  
		setLayout(null);
		setVisible(true); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}  


	// function to increase the progressBar
	public void loop(){
		int i=0; 
		while(i <= 1000){
		// fills the bar
			progress.setValue(i);  
			i = i + 10;  
			if (i < 334){
				progress.setString("Getting Started");
			}else if (i > 333 && i < 667){
				progress.setString("Working Fine");
				progress.setForeground(Color.YELLOW);
				//progress.setselectionForeground(Color.BLACK);
			}else if (i > 666 && i < 1000) {
				progress.setString("Almost There");
				progress.setForeground(Color.RED);
			}else{
				progress.setString("Done");
				progress.setForeground(Color.BLUE);
			}try{
			// delay the thread 
				Thread.sleep(120);
			}
			catch(Exception e){}
		}
	}
  
	public static void main(String[] args) {  
		ProgressBarGUI frame = new ProgressBarGUI();   
		frame.loop();  
	}  
}