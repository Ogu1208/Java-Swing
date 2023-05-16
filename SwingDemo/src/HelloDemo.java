import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloDemo extends JFrame{
    private JPanel panelMain;
    private JTextField txtName;
    private JButton btnClick;

    public HelloDemo() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick, txtName.getText() + ", Hello");
            }
        });
    }

    public static void main(String[] args) {
        HelloDemo helloDemo = new HelloDemo();
        helloDemo.setContentPane(helloDemo.panelMain);
        helloDemo.setTitle("Hello");
        helloDemo.setBounds(600, 200, 200, 200);
//        helloDemo.setSize(300, 400);
        helloDemo.setVisible(true);
        helloDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
