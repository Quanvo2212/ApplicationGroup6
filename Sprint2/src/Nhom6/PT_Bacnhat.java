package Nhom6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PT_Bacnhat extends JFrame {
    private JTextField aField, bField;
    private JLabel resultLabel;
    private JButton solveButton;
    
    public PT_Bacnhat() {
        setTitle("Giải Phương Trình Bậc Nhất ax + b = 0");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JPanel aPanel = new JPanel(new BorderLayout(10, 0));
        aPanel.add(new JLabel("Hệ số a:"), BorderLayout.WEST);
        aField = new JTextField();
        aPanel.add(aField, BorderLayout.CENTER);
        
        JPanel bPanel = new JPanel(new BorderLayout(10, 0));
        bPanel.add(new JLabel("Hệ số b:"), BorderLayout.WEST);
        bField = new JTextField();
        bPanel.add(bField, BorderLayout.CENTER);
        
        // Button giải phương trình
        solveButton = new JButton("Giải Phương Trình");
        
        // Label kết quả
        resultLabel = new JLabel("Kết quả: ");
        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        
        mainPanel.add(aPanel);
        mainPanel.add(bPanel);
        mainPanel.add(solveButton);
        mainPanel.add(resultLabel);
        
        solveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solveEquation();
            }
        });
        
        add(mainPanel);
        setVisible(true);
    }
    
    private void solveEquation() {
        try {
            double a = Double.parseDouble(aField.getText());
            double b = Double.parseDouble(bField.getText());
            
            // Kiểm tra a = 0
            if (a == 0) {
                if (b == 0) {
                    resultLabel.setText("Phương trình vô số nghiệm");
                } else {
                    resultLabel.setText("Phương trình vô nghiệm");
                }
            } else {
                // Tính nghiệm x = -b/a
                double x = -b / a;
                resultLabel.setText("Nghiệm x = " + String.format("%.4f", x));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                "Vui lòng nhập số hợp lệ!", 
                "Lỗi", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PT_Bacnhat();
            }
        });
    }
}