import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//from   w ww . j  a  v a 2  s . co  m
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class Main {
  static JProgressBar pb = new JProgressBar();
  static int progress;

  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.add(pb);
    f.pack();
    f.setVisible(true);

    Timer timer = new Timer(50, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        progress += 1;
        if (progress >= 100) {
          progress = 100;
          ((Timer) e.getSource()).stop();
        }
        pb.setValue(progress);
      }
    });
    timer.start();
  }
}
