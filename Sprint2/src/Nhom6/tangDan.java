package Nhom6;

import javax.swing.*;
import java.awt.event.*;

public class tangDan {

    public static String sortTwoNumbers(int a, int b) {
        return (a < b) ? a + ", " + b : b + ", " + a;
    }

    public static void showSortTwoNumbersUI() {
        JFrame frame = new JFrame("Sắp xếp 2 số theo thứ tự tăng dần");
        frame.setSize(400, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel labelA = new JLabel("Số a:");
        labelA.setBounds(30, 30, 100, 25);
        frame.add(labelA);

        JTextField fieldA = new JTextField();
        fieldA.setBounds(130, 30, 200, 25);
        frame.add(fieldA);

        JLabel labelB = new JLabel("Số b:");
        labelB.setBounds(30, 70, 100, 25);
        frame.add(labelB);

        JTextField fieldB = new JTextField();
        fieldB.setBounds(130, 70, 200, 25);
        frame.add(fieldB);

        JButton sortButton = new JButton("Sắp xếp");
        sortButton.setBounds(130, 110, 120, 30);
        frame.add(sortButton);

        JLabel resultLabel = new JLabel("Kết quả:");
        resultLabel.setBounds(30, 160, 300, 25);
        frame.add(resultLabel);

        sortButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(fieldA.getText());
                    int b = Integer.parseInt(fieldB.getText());
                    String sorted = sortTwoNumbers(a, b);
                    resultLabel.setText("Thứ tự tăng dần: " + sorted);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Vui lòng nhập số nguyên hợp lệ.");
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        showSortTwoNumbersUI();
    }
}

