import javax.swing.*;  
import java.awt.*;
public class ProgressBarGUI extends JFrame{
	JProgressBar progress;  
  
	ProgressBarGUI(){
    // Create the progressBar
		progress = new JProgressBar(0,1000);
		
		progress.setForeground(Color.GREEN);
		
    // Set the position of the progressBar
		progress.setBounds(35,40,165,30);
    // Initialize the progressBar to 0   
		progress.setValue(0);  
    // Show the progress string
		progress.setStringPainted(true);  
    // Add the progressBar to the frame
		add(progress);  
		setSize(250,150);  
		setLayout(null);  
	}  
  
	// function to increase the progressBar
	public void loop(){
		int i=0; 
		while(i <= 1000){
		// fills the bar
			progress.setValue(i);  
			i = i + 10;  
			if (i < 501)
				progress.setString("wait for few soconds");
			else if (i > 500 && i < 900)
				progress.setString("almost done loading");
			else
				progress.setString("loading initiated");
			try{
			// delay the thread 
				Thread.sleep(120);
			}
			catch(Exception e){}
		}
	}
  
	public static void main(String[] args) {  
		ProgressBarGUI frame = new ProgressBarGUI();  
    	frame.setVisible(true);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.loop();  
	}  
}