package Nhom6;
import javax.swing.*;
import java.awt.event.*;

public class soNhoNhat {

    public static int minOfTwo(int a, int b) {
        return (a < b) ? a : b;
    }

    public static void showMinOfTwoUI() {
        JFrame frame = new JFrame("Tìm số nhỏ nhất trong hai số");
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

        JButton checkButton = new JButton("Tìm số nhỏ nhất");
        checkButton.setBounds(110, 110, 160, 30);
        frame.add(checkButton);

        JLabel resultLabel = new JLabel("Kết quả:");
        resultLabel.setBounds(30, 160, 330, 25);
        frame.add(resultLabel);

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(fieldA.getText());
                    int b = Integer.parseInt(fieldB.getText());
                    int min = minOfTwo(a, b);
                    resultLabel.setText("Số nhỏ nhất là: " + min);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Vui lòng nhập số nguyên hợp lệ.");
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        showMinOfTwoUI();
    }
}

