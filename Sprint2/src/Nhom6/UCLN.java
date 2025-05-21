package Nhom6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UCLN extends JFrame {
    private JTextField firstNumberField, secondNumberField;
    private JLabel resultLabel;
    private JButton calculateButton;
    
    public UCLN() {
        setTitle("Tìm Ước Số Chung Lớn Nhất");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JPanel firstPanel = new JPanel(new BorderLayout(10, 0));
        firstPanel.add(new JLabel("Số thứ nhất:"), BorderLayout.WEST);
        firstNumberField = new JTextField();
        firstPanel.add(firstNumberField, BorderLayout.CENTER);
        
        JPanel secondPanel = new JPanel(new BorderLayout(10, 0));
        secondPanel.add(new JLabel("Số thứ hai:"), BorderLayout.WEST);
        secondNumberField = new JTextField();
        secondPanel.add(secondNumberField, BorderLayout.CENTER);
        
        calculateButton = new JButton("Tìm USCLN");
        
        resultLabel = new JLabel("USCLN: ");
        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        
        mainPanel.add(firstPanel);
        mainPanel.add(secondPanel);
        mainPanel.add(calculateButton);
        mainPanel.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateGCD();
            }
        });
        
        // Thêm panel vào frame
        add(mainPanel);
        setVisible(true);
    }
    
    private void calculateGCD() {
        try {
            // Lấy giá trị hai số
            int a = Math.abs(Integer.parseInt(firstNumberField.getText()));
            int b = Math.abs(Integer.parseInt(secondNumberField.getText()));
            
            // Tính USCLN
            int gcd = findGCD(a, b);
            
            // Hiển thị kết quả
            resultLabel.setText("UCLN: " + gcd);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                "Vui lòng nhập số nguyên hợp lệ!", 
                "Lỗi", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Thuật toán Euclid tìm USCLN
    private int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
    
    public static void main(String[] args) {
        // Chạy ứng dụng
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UCLN();
            }
        });
    }
}