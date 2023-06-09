/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas.pbo;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        DBConnector.initDBConnection();
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    
     public String md5Java(String message)
    {
        String digest = null;
        try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] hash = md.digest(message.getBytes("UTF-8"));
                //merubah byte array ke dalam String Hexadecimal
                StringBuilder sb = new StringBuilder(2*hash.length);
                for(byte b : hash)
                {
                        sb.append(String.format("%02x", b&0xff));
                }
                digest = sb.toString();
            } catch (UnsupportedEncodingException ex)
                {
                    JOptionPane.showMessageDialog(null, ex);
                } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
                        return digest;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lf_username = new javax.swing.JTextField();
        lf_loginButton = new javax.swing.JButton();
        lf_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  LoginForm");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Masukkan Username dan Password Anda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(0, 280));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("Username :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText("Password :");

        lf_username.setText("username");
        lf_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lf_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lf_usernameFocusLost(evt);
            }
        });

        lf_loginButton.setBackground(new java.awt.Color(254, 254, 254));
        lf_loginButton.setText("Login");
        lf_loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lf_loginButtonActionPerformed(evt);
            }
        });

        lf_password.setText("password");
        lf_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lf_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lf_passwordFocusLost(evt);
            }
        });
        lf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lf_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lf_loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lf_username, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(lf_password))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lf_username)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lf_password, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lf_loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lf_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lf_usernameFocusGained
        String uss = lf_username.getText();
        if(uss.equals("username")){
            lf_username.setText("");
        }
    }//GEN-LAST:event_lf_usernameFocusGained

    private void lf_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lf_usernameFocusLost
        String uss = lf_username.getText();
        if(uss.equals("")){
            lf_username.setText("username"); 
        }
    }//GEN-LAST:event_lf_usernameFocusLost

    private void lf_loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lf_loginButtonActionPerformed
       String uss = lf_username.getText();
       String pass = lf_password.getText();
       String passnew = md5Java(pass);
       
       try{
            Statement stmt = DBConnector.connection.createStatement();
            String sql = "SELECT * FROM admin Where username = '"+uss+"' AND password = '"+passnew+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
               JOptionPane.showMessageDialog(this, "Berhasil Login");
               MainWindow frame = new MainWindow();
               frame.setVisible(true);
               this.dispose();
            } else{
                 JOptionPane.showMessageDialog(this, "Username atau Password salah","Gagal Login",JOptionPane.ERROR_MESSAGE);
            }
       } catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
           
       }
    }//GEN-LAST:event_lf_loginButtonActionPerformed

    private void lf_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lf_passwordFocusGained
        String pass = lf_password.getText();
        if(pass.equals("password")){
           lf_password.setText("");
        }
    }//GEN-LAST:event_lf_passwordFocusGained

    private void lf_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lf_passwordFocusLost
        String pass = lf_password.getText();
        if(pass.equals("")){
           lf_password.setText("password");
        }
    }//GEN-LAST:event_lf_passwordFocusLost

    private void lf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lf_passwordActionPerformed
         String uss = lf_username.getText();
       String pass = lf_password.getText();
       String passnew = md5Java(pass);
       
       try{
            Statement stmt = DBConnector.connection.createStatement();
            String sql = "SELECT * FROM admin Where username = '"+uss+"' AND password = '"+passnew+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
               JOptionPane.showMessageDialog(this, "Berhasil Login");
               MainWindow frame = new MainWindow();
               frame.setVisible(true);
               this.dispose();
            } else{
                 JOptionPane.showMessageDialog(this, "Username atau Password salah","Gagal Login",JOptionPane.ERROR_MESSAGE);
            }
       } catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
           
       }
    }//GEN-LAST:event_lf_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton lf_loginButton;
    private javax.swing.JPasswordField lf_password;
    private javax.swing.JTextField lf_username;
    // End of variables declaration//GEN-END:variables
}
