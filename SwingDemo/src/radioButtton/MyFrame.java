package radioButtton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;
    ImageIcon pizzaIconn;
    ImageIcon hamburgerIconn;
    ImageIcon hotdogIconn;


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaIconn = new ImageIcon("pizza.png");
        hamburgerIconn = new ImageIcon("hamburger.png");
        hotdogIconn = new ImageIcon("hotdog.png");

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotdogButton = new JRadioButton("hotdog");

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIconn);
        hamburgerButton.setIcon(hamburgerIconn);
        hotdogButton.setIcon(hotdogIconn);
        
        pizzaButton.setFocusable(false);
        hamburgerButton.setFocusable(false);
        hotdogButton.setFocusable(false);

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) {
            System.out.println("You ordered pizza!");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered hamburger!");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("You ordered hotdog!!");
        }
    }
}
