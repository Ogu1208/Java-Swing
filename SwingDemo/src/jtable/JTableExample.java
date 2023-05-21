package jtable;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

class Main {
    JFrame jFrame;
    JScrollPane jScrollPane;
    JTable jTable;
    String[] col;
    Object[][] data;

    Main() {
        jFrame = new JFrame("JTable Demo");
        col = new String[] {"Accounts", "Amount"};
        data = getData();
        jTable = new JTable(data, col);
        jScrollPane = new JScrollPane(jTable);
        jFrame.add(jScrollPane);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    Object[][] getData () {
        try {
            String path = FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
            BufferedReader br = new BufferedReader(new FileReader(path + "/bills.csv"));
            ArrayList<String> list = new ArrayList<>();
            String str = "";
            while ((str = br.readLine()) != null) {
                list.add(str);
                System.out.println(str);
            }

            int n = list.get(0).split(",").length; // how many clumns
            Object[][] data = new Object[list.size()][n];
            for (int i = 0; i < list.size(); i++) {
                data[i] = list.get(i).split(",");
            }
            br.close(); // close file
            return data;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

public class JTableExample {
    public static void main(String[] args) {
        new Main();
    }

}
