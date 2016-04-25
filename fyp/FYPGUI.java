/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fyp;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Colm
 */
public class FYPGUI extends javax.swing.JFrame {

    
    //creates new form FYPGUI
    public FYPGUI() {
        this.setUndecorated(true);
        this.setVisible(true);
        
        initComponents();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth(); // obtaining screen size
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize,ysize); // setting window size to full screen
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginbox = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameVar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passwordVar = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        login = new javax.swing.JMenu();
        create = new javax.swing.JMenu();
        help = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DS Diagnosis Tool");
        getContentPane().setLayout(null);

        loginbox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.gray));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Username : ");

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Password : ");

        loginbutton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginboxLayout = new javax.swing.GroupLayout(loginbox);
        loginbox.setLayout(loginboxLayout);
        loginboxLayout.setHorizontalGroup(
            loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginboxLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginboxLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31))
                    .addGroup(loginboxLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)))
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameVar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordVar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
            .addGroup(loginboxLayout.createSequentialGroup()
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginboxLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel2))
                    .addGroup(loginboxLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginboxLayout.setVerticalGroup(
            loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginboxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginboxLayout.createSequentialGroup()
                        .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(passwordVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addComponent(loginbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(loginbox);
        loginbox.setBounds(510, 150, 370, 260);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/background1.jpg"))); // NOI18N
        jLabel4.setText("jdhcjdhs");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1380, 660);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(175, 30));

        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        login.setText("Login");
        login.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        login.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                loginMenuSelected(evt);
            }
        });
        jMenuBar1.add(login);

        create.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        create.setText("Create An Account");
        create.setAlignmentX(4.0F);
        create.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        create.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                createMenuSelected(evt);
            }
        });
        jMenuBar1.add(create);

        help.setText("Help");
        help.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpMouseClicked(evt);
            }
        });
        jMenuBar1.add(help);

        exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        exit.setText("Exit");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        exit.setMargin(new java.awt.Insets(0, 4, 0, 4));
        exit.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                exitMenuSelected(evt);
            }
        });
        jMenuBar1.add(exit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_loginMenuSelected

    usernameVar.setText(""); // just clear fields as it is the same page
    passwordVar.setText("");
    }//GEN-LAST:event_loginMenuSelected

    private void createMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_createMenuSelected
        setVisible(false);// hide 
        dispose();
        register.main(null); // display registration page
    }//GEN-LAST:event_createMenuSelected

    private void exitMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_exitMenuSelected
    System.exit(0); // close program
    }//GEN-LAST:event_exitMenuSelected

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        String username,password,sql,sql2,correctusername;
        Connection conn;
        Statement stmt = null,stmt2 = null;
        ResultSet result=null,result2 = null;
        boolean hasRows=false,hasRows2=false;
        int num1=10,num2=10;
        
        username = usernameVar.getText(); // fetch values from login form
        password = new String(passwordVar.getPassword());
        
        sql = "SELECT * FROM U_INFO WHERE USERNAME = '"+ username +"'"; // statement to check if username provided is correct
        sql2 = "SELECT * FROM U_INFO WHERE U_PASSWORD = '"+ password +"' AND USERNAME LIKE '"+ username +"'"; // statement to check is password provided matches username
        conn = DBman.main(); // connect to database
        
        // execute a query
        System.out.println("Creating statement...");
        try {
                stmt = conn.createStatement();
                stmt2 = conn.createStatement();
        } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
       try {
            result = stmt.executeQuery(sql);
            result2 = stmt2.executeQuery(sql2);
                
        } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }

        try {
            if (result.next()){ // if username is correct
                if (result2.next()){ // is password matches username
                    correctusername = username;
                    JOptionPane.showMessageDialog(null,"You Have Successfully Signed In"); // display confirmation message
                    usernameVar.setText("");
                    passwordVar.setText(""); 
                    setVisible(false);
                    dispose();
                    nijimegen.main(correctusername); // change view
                }
                else { // if password is incorrect
                    JOptionPane.showMessageDialog(null,"The Password You Have Entered Is Incorrect. Please Try Again");
                    usernameVar.setText("");
                    passwordVar.setText("");
                }
            }
            else { // if username is incorrect
                JOptionPane.showMessageDialog(null,"There Is No User Registered With This Username. Please Try Again Or Create An Account");
                usernameVar.setText("");
                passwordVar.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FYPGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            stmt.close();
            stmt2.close();
        } catch (SQLException e) {
        }
       try {
            conn.close();
        } catch (SQLException e) {
        }

        
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        // display help documentation
        JOptionPane.showMessageDialog(null,"If you are a new user, please navigate to the Create An Account page and register your details.\nOtherwise, please enter your username and password into the fields of the login form and click the Login button to log into your account");
    }//GEN-LAST:event_helpMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException, Exception {
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
            java.util.logging.Logger.getLogger(FYPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FYPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FYPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FYPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        String lookAndFeel;
        lookAndFeel = UIManager.getSystemLookAndFeelClassName();
        try {
            /* Set the Nimbus look and feel */
            UIManager.setLookAndFeel(lookAndFeel);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FYPGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu create;
    private javax.swing.JMenu exit;
    private javax.swing.JMenu help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu login;
    private javax.swing.JPanel loginbox;
    private javax.swing.JButton loginbutton;
    private javax.swing.JPasswordField passwordVar;
    private javax.swing.JTextField usernameVar;
    // End of variables declaration//GEN-END:variables
}
