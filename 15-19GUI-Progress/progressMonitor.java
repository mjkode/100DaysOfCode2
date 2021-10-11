//IMPORT    
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//
public class progressMonitor{
	//DECLARE
	static ProgressMonitor monitor;
	static int progress;
	static Timer timer;
	//
	public static void main(String args[]) {
		//CREATE		
		JFrame frame = new JFrame("Progress Monitor");
		JButton progressButton = new JButton("Click This!");
		JProgressBar progressBar = new JProgressBar (0, 100);
		ActionListener progressButtonActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Component parent = (Component) actionEvent.getSource();
				
			    UIManager.put("ProgressBar.selectionBackground", Color.black);
				UIManager.put("ProgressBar.selectionForeground", Color.white);
				UIManager.put("ProgressBar.foreground", new Color(0,128,0));
				
				//monitor = new ProgressMonitor(parent, "Loading Progress", "Getting Started...", 0, 100);
				progress = 0;		
				
				if (monitor != null) {
					if (timer == null) {
						timer = new Timer(250, new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if (monitor == null) {
									return;
								}
								if (monitor.isCanceled()) {
									System.out.println("Monitor canceled");
									timer.stop();
								} else {
									progress += 2;
									monitor.setProgress(progress);
									monitor.setNote("Loading:  " + progress + "%");
									if (progress > 50) {
										UIManager.put("ProgressBar.foreground", new Color(128,128,0));
										monitor.setNote("Half Way There:  " + progress + "%");
									};
								}
							}
						});
					}
					timer.start();
				}
			}
        };
		//LISTENER 
        progressButton.addActionListener(progressButtonActionListener);
		//
        frame.getContentPane().add(progressButton);
        frame.getContentPane().setLayout(new GridLayout(0, 1));
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}