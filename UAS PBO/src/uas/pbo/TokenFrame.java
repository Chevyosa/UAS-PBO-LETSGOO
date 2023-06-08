/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uas.pbo;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author M IQBAL
 */
public class TokenFrame extends javax.swing.JFrame {
    private static final String DIGITS = "0123456789";
    private static final int TOKEN_LENGTH = 20;
    /**
     * Creates new form TokenFrame
     */
    public TokenFrame() {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initComponents();
        generateToken();
        this.setLocationRelativeTo(null);
        
    }
    
     private void generateToken() {        
        StringBuilder token = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < TOKEN_LENGTH; i++) {
            int index = random.nextInt(DIGITS.length());
            char randomDigit = DIGITS.charAt(index);
            token.append(randomDigit);
        }
        tf_token.setText(token.toString());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_token = new javax.swing.JTextField();
        CloseTokenCodeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tf_token.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        tf_token.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_token.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tokenActionPerformed(evt);
            }
        });

        CloseTokenCodeButton.setBackground(new java.awt.Color(204, 0, 51));
        CloseTokenCodeButton.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        CloseTokenCodeButton.setForeground(new java.awt.Color(255, 255, 255));
        CloseTokenCodeButton.setText("X");
        CloseTokenCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseTokenCodeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_token, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CloseTokenCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CloseTokenCodeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_token, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_tokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tokenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_tokenActionPerformed

    private void CloseTokenCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseTokenCodeButtonActionPerformed
        MainWindow frame = new MainWindow();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CloseTokenCodeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TokenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TokenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TokenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TokenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TokenFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseTokenCodeButton;
    private javax.swing.JTextField tf_token;
    // End of variables declaration//GEN-END:variables
}
