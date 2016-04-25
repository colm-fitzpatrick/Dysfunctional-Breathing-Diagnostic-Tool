/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fyp;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Desktop;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Colm
 */
public class retraining extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    private JFrame frame;
    ImageIcon m[], v[];
    int i,l1;
    String videovar;
    public static String gusername;
    
    public retraining() {
        this.setUndecorated(true);
        this.setVisible(true);
        
        initComponents();
        leftarrow.setVisible(false);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize,ysize); // set page size to full screen
        
        video.setVisible(false);
        m = new ImageIcon[12]; // create array of images
        m[0] = new ImageIcon(getClass().getClassLoader().getResource("pics/Slide1.jpg"));
        m[1] = new ImageIcon(getClass().getClassLoader().getResource("pics/Slide2.jpg"));
        m[2] = new ImageIcon(getClass().getClassLoader().getResource("pics/Slide3.jpg"));
        m[3] = new ImageIcon(getClass().getClassLoader().getResource("pics/Slide4.jpg"));
        m[4] = new ImageIcon(getClass().getClassLoader().getResource("pics/Slide5.jpg"));
        m[5] = new ImageIcon(getClass().getClassLoader().getResource("pics/Slide6.jpg"));
        m[6] = new ImageIcon(getClass().getClassLoader().getResource("pics/Slide7.jpg"));
        m[7] = new ImageIcon(getClass().getClassLoader().getResource("pics/Slide8.jpg"));
        m[8] = new ImageIcon(getClass().getClassLoader().getResource("pics/Slide9.jpg"));
        m[9] = new ImageIcon(getClass().getClassLoader().getResource("pics/Slide10.jpg"));
        m[10] = new ImageIcon(getClass().getClassLoader().getResource("pics/Slide11.jpg"));
        m[11] = new ImageIcon(getClass().getClassLoader().getResource("pics/Slide12.jpg"));
        piclab.setIcon(m[0]); // set jlabel icon to first image
        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        pics = new javax.swing.JPanel();
        video = new javax.swing.JButton();
        piclab = new javax.swing.JLabel();
        rightarrow = new javax.swing.JLabel();
        leftarrow = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        nijmegen = new javax.swing.JMenu();
        resptest = new javax.swing.JMenu();
        breathingretraining = new javax.swing.JMenu();
        help = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 765));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pics.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        pics.setMinimumSize(new java.awt.Dimension(720, 960));
        pics.setPreferredSize(new java.awt.Dimension(720, 960));
        pics.setLayout(null);

        video.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/play2.png"))); // NOI18N
        video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                videoActionPerformed(evt);
            }
        });
        pics.add(video);
        video.setBounds(419, 505, 134, 71);

        piclab.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        pics.add(piclab);
        piclab.setBounds(2, 2, 956, 492);

        rightarrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/rsz_2arrowdone.gif"))); // NOI18N
        rightarrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rightarrowMouseClicked(evt);
            }
        });
        pics.add(rightarrow);
        rightarrow.setBounds(590, 505, 118, 71);

        leftarrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/rsz_arrowdone2.gif"))); // NOI18N
        leftarrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leftarrowMouseClicked(evt);
            }
        });
        pics.add(leftarrow);
        leftarrow.setBounds(249, 505, 133, 71);

        getContentPane().add(pics, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 960, 580));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/background1.jpg"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(1500, 750));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1370, 780));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Colm\\Documents\\Final Year Project\\pictures\\arrowdone.gif")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 89, 25));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(175, 35));

        nijmegen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nijmegen.setText("Nijimegen Questionaire");
        nijmegen.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nijmegen.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                nijmegenMenuSelected(evt);
            }
        });
        jMenuBar1.add(nijmegen);

        resptest.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resptest.setText("Respiratory Test");
        resptest.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        resptest.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                resptestMenuSelected(evt);
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

    private void leftarrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leftarrowMouseClicked
        // TODO add your handling code here:
        rightarrow.setVisible(true);
        if(i==0) // if first slide hide left arrow
        {
            leftarrow.setVisible(false);
        }
        else // else change picture
            {
            i=i-1;
            piclab.setIcon(m[i]);
        }
        if(i==7){ // if slide number 7 display play button which likes to pursed lip video
            videovar = "C:/Users/Colm/Documents/Final Year Project/pictures/vids/pursedVid.mp4";
            video.setVisible(true);
            
        }
        else if(i==9){ // if slide number 9 display play button and link video
            videovar = "C:/Users/Colm/Documents/Final Year Project/pictures/vids/abdominalVid.mp4";
            video.setVisible(true);
        }
        else{
            video.setVisible(false);
        }
    }//GEN-LAST:event_leftarrowMouseClicked

    private void rightarrowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rightarrowMouseClicked
        leftarrow.setVisible(true);
        if(i==m.length-1) // if last slide hide right arrow
        {
            rightarrow.setVisible(false);
        }
        else // else change picture
        {
            i=i+1;
            piclab.setIcon(m[i]);
            rightarrow.setVisible(true);
        }
        if(i==7){ // show play button and link video
            videovar = "C:/Users/Colm/Documents/Final Year Project/pictures/vids/pursedVid.mp4";
            video.setVisible(true);
            
        }
        else if(i==9){
            videovar = "C:/Users/Colm/Documents/Final Year Project/pictures/vids/abdominalVid.mp4";
            video.setVisible(true);
        }
        else{
            video.setVisible(false);
        }
    }//GEN-LAST:event_rightarrowMouseClicked

    private void videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_videoActionPerformed
        try {
            // when the play button is clicked play the video in their default media player
            Desktop.getDesktop().open(new File(videovar));
        } catch (IOException ex) {
            Logger.getLogger(retraining.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_videoActionPerformed

    private void nijmegenMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_nijmegenMenuSelected
        // if nijmegen menu item is select change view 
        setVisible(false);
        dispose();
        nijimegen.main(gusername);
    }//GEN-LAST:event_nijmegenMenuSelected

    private void resptestMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_resptestMenuSelected
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        respiratorytest.main(gusername);
    }//GEN-LAST:event_resptestMenuSelected

    private void exitMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_exitMenuSelected
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMenuSelected

    private void breathingretrainingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breathingretrainingMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        retraining.main(gusername);
    }//GEN-LAST:event_breathingretrainingMouseClicked

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Use the left and right arrows to navigate through the breating retraining session.\nWhen available, use the play button to watch a video tutorial of the specified breathing technique");

    }//GEN-LAST:event_helpMouseClicked

    public static void main(String username) {
        
        String lookAndFeel = null;
        gusername = username;
        lookAndFeel = UIManager.getSystemLookAndFeelClassName(); // set look and feel
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
                new retraining().setVisible(true); // call constructor
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu breathingretraining;
    private javax.swing.JMenu exit;
    private javax.swing.JMenu help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel leftarrow;
    private javax.swing.JMenu nijmegen;
    private javax.swing.JLabel piclab;
    private javax.swing.JPanel pics;
    private javax.swing.JMenu resptest;
    private javax.swing.JLabel rightarrow;
    private javax.swing.JButton video;
    // End of variables declaration//GEN-END:variables
}
