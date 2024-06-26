/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.XacThuc;

import static Controller.KiemSoatLoiInput.kiemtraEmail;
import static Controller.KiemSoatLoiInput.kiemtraTrongInput;
import DAO.XacThuc.MaHoaMD5;
import Model.NguoiDung;
import View.Tong.FormMain;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Kaiser
 */
public class DangNhap extends javax.swing.JFrame {

    /**
     * Creates new form DangNhap
     */
    public DangNhap() {
        initComponents();
        setTitle("Đăng nhập");
        setLocationRelativeTo(null);
        pnDangNhap.setBackground(new Color(175, 217, 243, 196));
        tudienDangNhap();

    }
    private boolean showPassword = false;
    private ImageIcon eyeIcon = new ImageIcon(getClass().getResource("/Images/icon2/eye.png"));
    private ImageIcon closeIcon = new ImageIcon(getClass().getResource("/Images/icon2/read.png"));

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnDangNhap = new javax.swing.JPanel();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbMatKhau = new javax.swing.JLabel();
        lbDangNhap = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        ckDangNhap = new javax.swing.JCheckBox();
        txtTaoTKMoi = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        hienMatKhau = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnDangNhap.setBackground(new java.awt.Color(175, 217, 243));

        lbEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon2/mail.png"))); // NOI18N

        txtEmail.setBackground(new java.awt.Color(175, 217, 243));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.setOpaque(true);

        lbMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        lbMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon2/lock.png"))); // NOI18N

        lbDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        lbDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon2/user.png"))); // NOI18N
        lbDangNhap.setText("   Đăng nhập");

        btnLogIn.setBackground(new java.awt.Color(22, 72, 99));
        btnLogIn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("Login");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        ckDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ckDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        ckDangNhap.setText("Lưu đăng nhập");

        txtTaoTKMoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTaoTKMoi.setForeground(new java.awt.Color(255, 255, 255));
        txtTaoTKMoi.setText("Tạo tài khoản mới");
        txtTaoTKMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTaoTKMoiMouseClicked(evt);
            }
        });

        txtMatKhau.setBackground(new java.awt.Color(175, 217, 243));
        txtMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        hienMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        hienMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        hienMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon2/eye.png"))); // NOI18N
        hienMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hienMatKhauMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnDangNhapLayout = new javax.swing.GroupLayout(pnDangNhap);
        pnDangNhap.setLayout(pnDangNhapLayout);
        pnDangNhapLayout.setHorizontalGroup(
            pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangNhapLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDangNhapLayout.createSequentialGroup()
                        .addComponent(lbDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDangNhapLayout.createSequentialGroup()
                        .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnDangNhapLayout.createSequentialGroup()
                                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnDangNhapLayout.createSequentialGroup()
                                        .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmail))
                                    .addGroup(pnDangNhapLayout.createSequentialGroup()
                                        .addComponent(lbMatKhau)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(hienMatKhau)))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDangNhapLayout.createSequentialGroup()
                        .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnDangNhapLayout.createSequentialGroup()
                                .addComponent(txtTaoTKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addComponent(btnLogIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115))))
        );
        pnDangNhapLayout.setVerticalGroup(
            pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangNhapLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lbDangNhap)
                .addGap(18, 18, 18)
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail))
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDangNhapLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hienMatKhau))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(pnDangNhapLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbMatKhau)
                        .addGap(21, 21, 21)))
                .addComponent(ckDangNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTaoTKMoi)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(pnDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon2/pexels-jess-bailey-designs-788946.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 403));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTaoTKMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTaoTKMoiMouseClicked
        DangKy dk = new DangKy();
        dk.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtTaoTKMoiMouseClicked

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        boolean isValid = kiemtraHopLe(txtEmail, txtMatKhau);
        if (isValid) {
            String user = txtEmail.getText();
            String password = String.valueOf(txtMatKhau.getPassword());

            MaHoaMD5 md5 = new MaHoaMD5();

            String hashedPassword = md5.hashPassword(password);

            DAO.XacThuc.DangNhapDAO lg = new DAO.XacThuc.DangNhapDAO();
            NguoiDung ndl = lg.dangNhap(user, hashedPassword);

            if (ndl == null) {
                JOptionPane.showMessageDialog(null, "Email hoặc mật khẩu sai");
            } else {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
                System.out.println(hashedPassword);
                if (ckDangNhap.isSelected()) {
                    luuDangNhap(user, password);
                } else {
                    xoaDangNhap();
                }

                FormMain main = new FormMain();
                main.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnLogInActionPerformed

    private void hienMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hienMatKhauMouseClicked
        doiTrangThaiMK();
    }//GEN-LAST:event_hienMatKhauMouseClicked

    public static boolean kiemtraHopLe(JTextField txtEmail, JTextField txtMatKhau) {
        try {
            String email = txtEmail.getText();
            String matKhau = txtMatKhau.getText();
            String thongBaoLoi = "";
            if (kiemtraTrongInput(matKhau)) {
                thongBaoLoi += "Mật khẩu không được để trống\n";
            }
            if (kiemtraTrongInput(email)) {
                thongBaoLoi += "Email không được để trống\n";
            } else if (!kiemtraEmail(email)) {
                JOptionPane.showMessageDialog(null, "Email không hợp lệ");
                return false;
            }
            if (!thongBaoLoi.isEmpty()) {
                JOptionPane.showMessageDialog(null, thongBaoLoi.trim());
                return false;
            }
        } catch (HeadlessException e) {
            return false;
        }
        return true;
    }

    private void doiTrangThaiMK() {
        char echoChar = showPassword ? '\u0000' : '*';
        txtMatKhau.setEchoChar(echoChar);

        if (showPassword) {
            hienMatKhau.setIcon(closeIcon);
        } else {
            hienMatKhau.setIcon(eyeIcon);
        }

        showPassword = !showPassword;
    }

    private void luuDangNhap(String email, String password) {
        try {
            FileWriter writer = new FileWriter("ls_dangnhap.txt");
            writer.write(email + "," + password);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void xoaDangNhap() {
        File file = new File("ls_dangnhap.txt");
        if (file.exists()) {
            file.delete();
        }
    }

    private void tudienDangNhap() {
        // Đọc từ file dữ liệu và tự điền vào form
        File file = new File("ls_dangnhap.txt");

        // Nếu file không tồn tại, tạo file
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (file.exists()) {
            // Đọc thông tin đăng nhập từ file
            try {
                FileReader reader = new FileReader("ls_dangnhap.txt");
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line = bufferedReader.readLine();
                if (line != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 2) {
                        String email = parts[0];
                        String hashedPassword = parts[1];
                        txtEmail.setText(email);
                        txtMatKhau.setText(hashedPassword);
                        ckDangNhap.setSelected(true);
                    }
                }
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JCheckBox ckDangNhap;
    private javax.swing.JLabel hienMatKhau;
    private javax.swing.JLabel lbDangNhap;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbMatKhau;
    private javax.swing.JPanel pnDangNhap;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JLabel txtTaoTKMoi;
    // End of variables declaration//GEN-END:variables
}
