package Nhom6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TimSoLonNhat extends JFrame {
    private JTextField txtA, txtB, txtC, txtKetQua;
    private JButton btnTim;

    public TimSoLonNhat() {
        setTitle("Tìm số lớn nhất");
        setSize(350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        txtA = new JTextField(10);
        txtB = new JTextField(10);
        txtC = new JTextField(10);
        txtKetQua = new JTextField(20);
        txtKetQua.setEditable(false);

        btnTim = new JButton("Tìm số lớn nhất");

        btnTim.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtA.getText());
                    int b = Integer.parseInt(txtB.getText());
                    int c = Integer.parseInt(txtC.getText());
                    int max = Math.max(a, Math.max(b, c));
                    txtKetQua.setText("Số lớn nhất là: " + max);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ!");
                }
            }
        });

        setLayout(new GridLayout(5, 2, 5, 5));
        add(new JLabel("Số A:"));
        add(txtA);
        add(new JLabel("Số B:"));
        add(txtB);
        add(new JLabel("Số C:"));
        add(txtC);
        add(btnTim);
        add(new JLabel("Kết quả:"));
        add(txtKetQua);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TimSoLonNhat();
    }
}

