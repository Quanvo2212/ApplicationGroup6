package Nhom6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("Menu Chức Năng");
        setSize(350, 350); // Tăng kích thước để chứa thêm nút
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa cửa sổ

        JButton btnSoLonNhat = new JButton("Tìm số lớn nhất");
        JButton btnDoiXung = new JButton("Kiểm tra số đối xứng");
        JButton btnPTBacNhat = new JButton("Giải phương trình bậc nhất");
        JButton btnUSCLN = new JButton("Tìm USCLN");
        JButton btnSoNhoNhat = new JButton("Tìm số nhỏ nhất");
        JButton btnTangDan = new JButton("Sắp xếp tăng dần");

        // Gắn sự kiện mở cửa sổ tương ứng
        btnSoLonNhat.addActionListener(e -> new TimSoLonNhat());
        btnDoiXung.addActionListener(e -> new KiemTra1SoCoDoiXungKhong());
        btnPTBacNhat.addActionListener(e -> new PT_Bacnhat());
        btnUSCLN.addActionListener(e -> new UCLN());
        btnSoNhoNhat.addActionListener(e -> new soNhoNhat());
        btnTangDan.addActionListener(e -> new tangDan());

        // Giao diện - thay đổi GridLayout từ 5 thành 7 hàng
        setLayout(new GridLayout(7, 1, 10, 10));
        add(new JLabel("Chọn chức năng:", SwingConstants.CENTER));
        add(btnSoLonNhat);
        add(btnDoiXung);
        add(btnPTBacNhat);
        add(btnUSCLN);
        add(btnSoNhoNhat);
        add(btnTangDan);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}

