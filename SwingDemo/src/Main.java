import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JFrame = a GUI window to add components to

        JFrame frame = new JFrame();
        frame.setTitle("JFrame title goes here");  // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit out of application
        frame.setResizable(false);  // prevent frame from being resized
        frame.setSize(420, 420);  // sets the x-dimension, and y-dimension of frame
        frame.setVisible(true);  // make frame visible

        ImageIcon image = new ImageIcon("ogu.png"); // create an ImageIcon
        frame.setIconImage(image.getImage());  // change icon of frame
        frame.getContentPane().setBackground(new Color(255, 204, 153));  // change color of background
//        frame.getContentPane().setBackground(new Color(0xFFCC99));

    }
}