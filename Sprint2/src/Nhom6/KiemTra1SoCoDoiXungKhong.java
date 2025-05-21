package Nhom6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KiemTra1SoCoDoiXungKhong extends JFrame {
    private JTextField txtSo, txtKetQua;
    private JButton btnKiemTra;

    public KiemTra1SoCoDoiXungKhong() {
        setTitle("Kiểm tra số đối xứng");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa cửa sổ

        txtSo = new JTextField(10);
        txtKetQua = new JTextField(20);
        txtKetQua.setEditable(false);

        btnKiemTra = new JButton("Kiểm Tra");

        btnKiemTra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(txtSo.getText());
                    if (isDoiXung(number)) {
                        txtKetQua.setText(number + " là số đối xứng");
                    } else {
                        txtKetQua.setText(number + " không phải là số đối xứng");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên hợp lệ!");
                }
            }
        });

        setLayout(new GridLayout(3, 2, 5, 5));
        add(new JLabel("Nhập số:"));
        add(txtSo);
        add(btnKiemTra);
        add(new JLabel("Kết quả:"));
        add(txtKetQua);

        setVisible(true);
    }

    // Hàm kiểm tra đối xứng
    private boolean isDoiXung(int n) {
        String s = String.valueOf(n);
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        new KiemTra1SoCoDoiXungKhong();
    }
}

