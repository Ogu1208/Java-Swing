import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("JFrame title goes here");  // sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit out of application
        this.setResizable(false);  // prevent this from being resized
        this.setSize(420, 420);  // sets the x-dimension, and y-dimension of this
        this.setVisible(true);  // make this visible

        ImageIcon image = new ImageIcon("ogu.png"); // create an ImageIcon
        this.setIconImage(image.getImage());  // change icon of this
        this.getContentPane().setBackground(new Color(255, 204, 153));  // change color of background
    }
}
