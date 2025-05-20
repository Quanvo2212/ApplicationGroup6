package Jajaja;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField txt1, txt2, result;
    private JButton btnAdd, btnSub, btnMul, btnDiv, btnSolve;
    private JLabel labelResult;

    public Calculator() {
        setTitle("Máy tính đơn giản");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel chính
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10));

        panel.add(new JLabel("Số thứ nhất / a:"));
        txt1 = new JTextField();
        panel.add(txt1);

        panel.add(new JLabel("Số thứ hai / b:"));
        txt2 = new JTextField();
        panel.add(txt2);

        btnAdd = new JButton("Cộng (+)");
        btnSub = new JButton("Trừ (-)");
        btnMul = new JButton("Nhân (×)");
        btnDiv = new JButton("Chia (÷)");
        btnSolve = new JButton("Giải PT ax + b = 0");

        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);
        btnSolve.addActionListener(this);

        panel.add(btnAdd);
        panel.add(btnSub);
        panel.add(btnMul);
        panel.add(btnDiv);
        panel.add(btnSolve);

        labelResult = new JLabel("Kết quả:");
        result = new JTextField();
        result.setEditable(false);

        panel.add(labelResult);
        panel.add(result);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(txt1.getText());
            double b = Double.parseDouble(txt2.getText());

            if (e.getSource() == btnAdd) {
                result.setText(String.valueOf(a + b));
            } else if (e.getSource() == btnSub) {
                result.setText(String.valueOf(a - b));
            } else if (e.getSource() == btnMul) {
                result.setText(String.valueOf(a * b));
            } else if (e.getSource() == btnDiv) {
                if (b == 0) {
                    result.setText("Lỗi: chia cho 0");
                } else {
                    result.setText(String.valueOf(a / b));
                }
            } else if (e.getSource() == btnSolve) {
                if (a == 0) {
                    if (b == 0) result.setText("Vô số nghiệm");
                    else result.setText("Vô nghiệm");
                } else {
                    double x = -b / a;
                    result.setText("x = " + x);
                }
            }
        } catch (NumberFormatException ex) {
            result.setText("Vui lòng nhập số hợp lệ");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

