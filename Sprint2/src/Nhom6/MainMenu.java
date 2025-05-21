package Nhom6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("Menu Chức Năng");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa cửa sổ

        JButton btnSoLonNhat = new JButton("Tìm số lớn nhất");
        JButton btnDoiXung = new JButton("Kiểm tra số đối xứng");

        // Gắn sự kiện mở cửa sổ tương ứng
        btnSoLonNhat.addActionListener(e -> new TimSoLonNhat());
        btnDoiXung.addActionListener(e -> new KiemTra1SoCoDoiXungKhong());

        // Giao diện
        setLayout(new GridLayout(3, 1, 10, 10));
        add(new JLabel("Chọn chức năng:", SwingConstants.CENTER));
        add(btnSoLonNhat);
        add(btnDoiXung);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}

