import javax.swing.*;
import java.awt.*;

public class MainApp extends JFrame {
    private JTextField txtA, txtB, txtDau, txtCuoi, txtDai, txtRong, txtKetQua;
    private JButton btnCong, btnTru, btnNhan, btnTinhNuoc, btnDienTich;

    public MainApp() {
        setTitle("Ứng dụng tính toán");
        setSize(450, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Khởi tạo các trường nhập
        txtA = new JTextField(10);
        txtB = new JTextField(10);
        txtDau = new JTextField(10);
        txtCuoi = new JTextField(10);
        txtDai = new JTextField(10);
        txtRong = new JTextField(10);
        txtKetQua = new JTextField(20);
        txtKetQua.setEditable(false);

        // Khởi tạo các nút chức năng
        btnCong = new JButton("Cộng");
        btnTru = new JButton("Trừ");
        btnNhan = new JButton("Nhân");
        btnTinhNuoc = new JButton("Tính Tiền Nước");
        btnDienTich = new JButton("Tính Diện Tích HCN");

        // Xử lý sự kiện
        btnCong.addActionListener(e -> {
            try {
                int a = Integer.parseInt(txtA.getText());
                int b = Integer.parseInt(txtB.getText());
                txtKetQua.setText("Kết quả: " + CongHaiSo.tinh(a, b));
            } catch (Exception ex) {
                showError();
            }
        });

        btnTru.addActionListener(e -> {
            try {
                int a = Integer.parseInt(txtA.getText());
                int b = Integer.parseInt(txtB.getText());
                txtKetQua.setText("Kết quả: " + TruHaiSo.tinh(a, b));
            } catch (Exception ex) {
                showError();
            }
        });

        btnNhan.addActionListener(e -> {
            try {
                int a = Integer.parseInt(txtA.getText());
                int b = Integer.parseInt(txtB.getText());
                txtKetQua.setText("Kết quả: " + NhanHaiSo.tinh(a, b));
            } catch (Exception ex) {
                showError();
            }
        });

        btnTinhNuoc.addActionListener(e -> {
            try {
                int dau = Integer.parseInt(txtDau.getText());
                int cuoi = Integer.parseInt(txtCuoi.getText());
                txtKetQua.setText("Tiền nước: " + TinhTienNuoc.tinh(dau, cuoi) + " VNĐ");
            } catch (Exception ex) {
                showError();
            }
        });

        btnDienTich.addActionListener(e -> {
            try {
                int dai = Integer.parseInt(txtDai.getText());
                int rong = Integer.parseInt(txtRong.getText());
                txtKetQua.setText("Diện tích HCN: " + TinhDienTichHCN.tinh(dai, rong));
            } catch (Exception ex) {
                showError();
            }
        });

        // Giao diện
        setLayout(new GridLayout(10, 2, 5, 5));
        add(new JLabel("Nhập số A:")); add(txtA);
        add(new JLabel("Nhập số B:")); add(txtB);
        add(btnCong); add(btnTru);
        add(btnNhan);

        add(new JLabel("Số đầu đồng hồ:")); add(txtDau);
        add(new JLabel("Số cuối đồng hồ:")); add(txtCuoi);
        add(btnTinhNuoc);

        add(new JLabel("Chiều dài HCN:")); add(txtDai);
        add(new JLabel("Chiều rộng HCN:")); add(txtRong);
        add(btnDienTich);

        add(new JLabel("Kết quả:")); add(txtKetQua);

        setVisible(true);
    }

    private void showError() {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập số nguyên hợp lệ!");
    }

    public static void main(String[] args) {
        new MainApp();
    }
}

