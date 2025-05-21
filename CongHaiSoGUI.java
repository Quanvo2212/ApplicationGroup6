package Toan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CongHaiSoGUI extends JFrame {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnCong;

    public CongHaiSoGUI() {
        setTitle("Cộng Hai Số");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa màn hình

        // Tạo các thành phần
        txtSo1 = new JTextField(10);
        txtSo2 = new JTextField(10);
        txtKetQua = new JTextField(10);
        txtKetQua.setEditable(false);

        btnCong = new JButton("Cộng");

        // Gắn sự kiện cho nút
        btnCong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int so1 = Integer.parseInt(txtSo1.getText());
                    int so2 = Integer.parseInt(txtSo2.getText());
                    int ketQua = so1 + so2;
                    txtKetQua.setText(String.valueOf(ketQua));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ.");
                }
            }
        });

        // Tạo layout
        setLayout(new GridLayout(4, 2, 5, 5));
        add(new JLabel("Số thứ nhất:"));
        add(txtSo1);
        add(new JLabel("Số thứ hai:"));
        add(txtSo2);
        add(new JLabel("Kết quả:"));
        add(txtKetQua);
        add(btnCong);

        setVisible(true);
    }

    public static void main(String[] args) {
        new CongHaiSoGUI();
    }
}

