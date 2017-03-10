
package com.client;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author Sara 
 */
public class Login extends javax.swing.JFrame {

  
	private static final long serialVersionUID = 1L;
    /**
     * Creates new form Login
     */
    public Login() {
        
        initComponents();
        setSize(345,720);
        setMinimumSize(new Dimension(345, 525));
        setBackground(new Color(255,97,45));
        jPanel1.setSize(320,720);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        mailTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        signButton = new javax.swing.JButton();
        SignUpLabel = new javax.swing.JLabel();
        forgetPasswordLabel = new javax.swing.JLabel();
        loginMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hms Messanger");
        setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        setForeground(new java.awt.Color(0, 153, 153));
        setMinimumSize(new java.awt.Dimension(200, 500));

        jPanel1.setBackground(new java.awt.Color(76, 102, 164));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Messanger ID");

        PasswordField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(204, 204, 204));
        PasswordField.setText("yuiiiiiiiiiiiiiiiii");
        PasswordField.setAutoscrolls(false);
        PasswordField.setPreferredSize(new java.awt.Dimension(25, 20));
        PasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordFieldMouseClicked(evt);
            }
        });
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        mailTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mailTextField.setForeground(new java.awt.Color(204, 204, 204));
        mailTextField.setText("yourEmailId@hmss.com/ UserName");
        mailTextField.setPreferredSize(new java.awt.Dimension(25, 20));
        mailTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mailTextFieldMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        signButton.setBackground(new java.awt.Color(255, 255, 255));
        signButton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        signButton.setText("Sign In");
        signButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signButtonActionPerformed(evt);
            }
        });

        SignUpLabel.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        SignUpLabel.setForeground(new java.awt.Color(255, 255, 255));
        SignUpLabel.setText("Get A New Hms! ID");
        SignUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUpLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUpLabelMouseExited(evt);
            }
        });

        forgetPasswordLabel.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        forgetPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        forgetPasswordLabel.setText("Forget password");
        forgetPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetPasswordLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgetPasswordLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgetPasswordLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(signButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SignUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(forgetPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(signButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(SignUpLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(forgetPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        loginMenuBar.setBackground(new java.awt.Color(76, 102, 164));

        jMenu1.setBackground(new java.awt.Color(76, 102, 164));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Hms Messenger   ");
        jMenu1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jMenuItem2.setText("About Us");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        loginMenuBar.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(76, 102, 164));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Help    ");
        jMenu2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jMenuItem1.setText("Messenger Help");
        jMenu2.add(jMenuItem1);

        loginMenuBar.add(jMenu2);

        setJMenuBar(loginMenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signButtonActionPerformed
        // TODO add your handling code here:
    	/* Create and display the form */
    	 this.setVisible(false);
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	
            	Client c=new Client(mailTextField.getText(),jPanel1);
            	c.setVisible(true);
            	c.setTitle("Client "+mailTextField.getText());
            }
        });
    }//GEN-LAST:event_signButtonActionPerformed

    private void SignUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpLabelMouseClicked
    //    mainController.showSignUpForm(this);
    }//GEN-LAST:event_SignUpLabelMouseClicked

    private void SignUpLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpLabelMouseEntered
        SignUpLabel.setForeground(Color.RED);
    }//GEN-LAST:event_SignUpLabelMouseEntered

    private void SignUpLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpLabelMouseExited
        SignUpLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_SignUpLabelMouseExited

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       // AboutDialog ad = new AboutDialog(this, rootPaneCheckingEnabled);
      //  ad.setVisible(true);
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
         WindowEvent winclose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void mailTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailTextFieldMouseClicked
        mailTextField.setText(null);
        mailTextField.setForeground(Color.BLACK);
    }//GEN-LAST:event_mailTextFieldMouseClicked

    private void PasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordFieldMouseClicked
        PasswordField.setText(null);
        PasswordField.setForeground(Color.BLACK);
    }//GEN-LAST:event_PasswordFieldMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      //  AboutDialog d = new AboutDialog(this, true);
       // d.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void forgetPasswordLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetPasswordLabelMouseClicked
       // mainController.showForgetPassword();
    }//GEN-LAST:event_forgetPasswordLabelMouseClicked

    private void forgetPasswordLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetPasswordLabelMouseEntered
        forgetPasswordLabel.setForeground(Color.RED);
    }//GEN-LAST:event_forgetPasswordLabelMouseEntered

    private void forgetPasswordLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetPasswordLabelMouseExited
        forgetPasswordLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_forgetPasswordLabelMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel SignUpLabel;
    private javax.swing.JLabel forgetPasswordLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar loginMenuBar;
    private javax.swing.JTextField mailTextField;
    private javax.swing.JButton signButton;
}
