package fyp;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Colm
 */
public class respiratorytest extends javax.swing.JFrame {

    
    //Creates new form register
     

    
    private JFrame frame;
    public float[] ardata = new float[600];
    public static String gusername;
    public static respiratorytest rtest;
    

    public static void success() throws IOException{
        retraining.main(gusername);
    }
    
    public respiratorytest() {
        this.setUndecorated(true);
        this.setVisible(true);
        
        initComponents();
        video1.setVisible(false);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize,ysize); // set screen size to full screen
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        video1 = new javax.swing.JButton();
        video = new javax.swing.JButton();
        showgraph = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        nijmegen = new javax.swing.JMenu();
        resptest = new javax.swing.JMenu();
        breathingretraining = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 765));
        setResizable(false);
        getContentPane().setLayout(null);

        video1.setText("Show Graph");
        video1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        video1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                video1ActionPerformed(evt);
            }
        });
        getContentPane().add(video1);
        video1.setBounds(620, 520, 140, 70);

        video.setIcon(new javax.swing.ImageIcon("C:\\Users\\Colm\\Documents\\Final Year Project\\pictures\\play2.png")); // NOI18N
        video.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                videoActionPerformed(evt);
            }
        });
        getContentPane().add(video);
        video.setBounds(620, 520, 134, 71);

        showgraph.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        showgraph.setText("Respiratory Belt Application Tutorial");
        getContentPane().add(showgraph);
        showgraph.setBounds(550, 480, 290, 30);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Click Start To Begin Respiratory Test");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(480, 20, 430, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/start.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(530, 110, 330, 320);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/background1.jpg"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(1500, 750));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, -70, 1370, 740);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(175, 35));

        nijmegen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nijmegen.setText("Nijimegen Questionaire");
        nijmegen.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nijmegen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nijmegenMouseClicked(evt);
            }
        });
        jMenuBar1.add(nijmegen);

        resptest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resptest.setText("Respiratory Test");
        resptest.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        resptest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resptestMouseClicked(evt);
            }
        });
        jMenuBar1.add(resptest);

        breathingretraining.setText("Breathing Retraining");
        breathingretraining.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        breathingretraining.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                breathingretrainingMouseClicked(evt);
            }
        });
        jMenuBar1.add(breathingretraining);

        jMenu1.setText("Help");
        jMenu1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        exit.setText("Exit");
        exit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        exit.setMargin(new java.awt.Insets(0, 4, 0, 4));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jMenuBar1.add(exit);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // when the start button is clicked 
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/loading.gif"))); // display loading gif
        video.setVisible(false);
        video1.setVisible(true);
        showgraph.setVisible(false);
        try {
            respiratorytest4.main(gusername); // run respiratory test
        } catch (Exception ex) {
            Logger.getLogger(respiratorytest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_videoActionPerformed
        String videovar="C:/Users/Colm/Documents/Final Year Project/pictures/vids/beltVid.mp4"; // link video
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().open(new File(videovar)); // play on default media player
        } catch (IOException ex) {
            Logger.getLogger(retraining.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_videoActionPerformed

    private void video1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_video1ActionPerformed
        // TODO add your handling code here:
        respiratorytest4.visibility();
    }//GEN-LAST:event_video1ActionPerformed

    private void nijmegenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nijmegenMouseClicked
        // change view 
        setVisible(false);
        dispose();
        nijimegen.main(gusername);
    }//GEN-LAST:event_nijmegenMouseClicked

    private void resptestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resptestMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        respiratorytest.main(gusername);
    }//GEN-LAST:event_resptestMouseClicked

    private void breathingretrainingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breathingretrainingMouseClicked
        setVisible(false);
        dispose();
        retraining.main(gusername);
    }//GEN-LAST:event_breathingretrainingMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // display help documentation
        JOptionPane.showMessageDialog(null,"Before beginning the repiratory test please ensure the following: \n\n1. Ensure that the patient is fully rested and is not being influenced by factors such as fatigue \n2. Ensure both respiratory belts are fitted correctly. Click the play button to watch a belt application tutorial\nOnce you are happy the patient is prepaired for the respiratory test, click the start button.\n\nDuring the test, click the View Graph button to view the real-time respiratory graph");
    }//GEN-LAST:event_jMenu1MouseClicked

    
    public static void main(String username) {
        gusername = username;
        String lookAndFeel = null;
        lookAndFeel = UIManager.getSystemLookAndFeelClassName(); // set look and view 
        try {
            UIManager.setLookAndFeel(lookAndFeel);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                rtest = new respiratorytest(); // call constructor
                rtest.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu breathingretraining;
    private javax.swing.JMenu exit;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu nijmegen;
    private javax.swing.JMenu resptest;
    private javax.swing.JLabel showgraph;
    private javax.swing.JButton video;
    private javax.swing.JButton video1;
    // End of variables declaration//GEN-END:variables
}
