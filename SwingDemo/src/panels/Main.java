package panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("sample.jpg");

        JLabel label = new JLabel();
        label.setText("Hi OGU!");
        label.setIcon(icon);
//        label.setVerticalAlignment(JLabel.BOTTOM);   // using border layout
//        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100, 100, 150, 150);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
