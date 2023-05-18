package progressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 500); // default : 0 to 100
    JButton button;

    ProgressBarDemo() {

        bar.setValue(0);
        bar.setBounds(0, 0, 420, 50);
        bar.setStringPainted(true);  // add Percentage in Progress bar.
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(new Color(0x99CC99));   // set the color of bar
        bar.setBackground(Color.BLACK);

        frame.add(bar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
//        bar.setValue(10);  // start at 10
        int counter = 0;

        /*
        while(counter <= 100) {
            bar.setValue(counter);
            try {
            // If you want to simulate the progress bar increasing over time we can use `Thread.sleep`
                Thread.sleep(1000);  // every second
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter += 10;
        }
        */

        /*
        while(counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(50);  // every second
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter += 1;
        }

        bar.setString("Done! :D");
        */

        // HP Bar
        counter = 500;
        while (counter > 0) {
            bar.setValue(counter);
            try {
                Thread.sleep(10);  // every second
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter -= 1;
        }

        bar.setString("You Died! X(");
        button.setEnabled(true);
    }



}
