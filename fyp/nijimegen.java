package fyp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Colm
 */
public class nijimegen extends javax.swing.JFrame {


    //Creates new form register

    private JFrame frame;
    public static int result1;
    public static int result2;
    public static int result3;
    public static int result4;
    public static int result5;
    public static int result6;
    public static int result7;
    public static int result8;
    public static int result9;
    public static int result10;
    public static int result11;
    public static int result12;
    public static int result13;
    public static int result14;
    public static int result15;
    public static int result16;
    static String gusername;
    
    public nijimegen() { // constructor
        this.setUndecorated(true);
        this.setVisible(true);
        
        initComponents(); // setting GUI components
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize,ysize); // setting screen size
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        submitButton = new javax.swing.JButton();
        loginbox = new javax.swing.JPanel();
        b15 = new javax.swing.JRadioButton();
        b14 = new javax.swing.JRadioButton();
        b11 = new javax.swing.JRadioButton();
        b165 = new javax.swing.JRadioButton();
        b21 = new javax.swing.JRadioButton();
        b22 = new javax.swing.JRadioButton();
        b23 = new javax.swing.JRadioButton();
        b13 = new javax.swing.JRadioButton();
        b24 = new javax.swing.JRadioButton();
        b25 = new javax.swing.JRadioButton();
        b31 = new javax.swing.JRadioButton();
        b32 = new javax.swing.JRadioButton();
        b33 = new javax.swing.JRadioButton();
        b34 = new javax.swing.JRadioButton();
        b35 = new javax.swing.JRadioButton();
        b41 = new javax.swing.JRadioButton();
        b42 = new javax.swing.JRadioButton();
        b43 = new javax.swing.JRadioButton();
        b44 = new javax.swing.JRadioButton();
        b45 = new javax.swing.JRadioButton();
        b51 = new javax.swing.JRadioButton();
        b52 = new javax.swing.JRadioButton();
        b53 = new javax.swing.JRadioButton();
        b54 = new javax.swing.JRadioButton();
        b55 = new javax.swing.JRadioButton();
        b61 = new javax.swing.JRadioButton();
        b62 = new javax.swing.JRadioButton();
        b63 = new javax.swing.JRadioButton();
        b64 = new javax.swing.JRadioButton();
        b65 = new javax.swing.JRadioButton();
        b75 = new javax.swing.JRadioButton();
        b74 = new javax.swing.JRadioButton();
        b73 = new javax.swing.JRadioButton();
        b72 = new javax.swing.JRadioButton();
        b71 = new javax.swing.JRadioButton();
        b81 = new javax.swing.JRadioButton();
        b82 = new javax.swing.JRadioButton();
        b83 = new javax.swing.JRadioButton();
        b84 = new javax.swing.JRadioButton();
        b85 = new javax.swing.JRadioButton();
        b95 = new javax.swing.JRadioButton();
        b94 = new javax.swing.JRadioButton();
        b93 = new javax.swing.JRadioButton();
        b92 = new javax.swing.JRadioButton();
        b91 = new javax.swing.JRadioButton();
        b101 = new javax.swing.JRadioButton();
        b102 = new javax.swing.JRadioButton();
        b103 = new javax.swing.JRadioButton();
        b104 = new javax.swing.JRadioButton();
        b105 = new javax.swing.JRadioButton();
        b115 = new javax.swing.JRadioButton();
        b114 = new javax.swing.JRadioButton();
        b113 = new javax.swing.JRadioButton();
        b112 = new javax.swing.JRadioButton();
        b111 = new javax.swing.JRadioButton();
        b121 = new javax.swing.JRadioButton();
        b122 = new javax.swing.JRadioButton();
        b123 = new javax.swing.JRadioButton();
        b124 = new javax.swing.JRadioButton();
        b125 = new javax.swing.JRadioButton();
        b135 = new javax.swing.JRadioButton();
        b134 = new javax.swing.JRadioButton();
        b133 = new javax.swing.JRadioButton();
        b132 = new javax.swing.JRadioButton();
        b131 = new javax.swing.JRadioButton();
        b141 = new javax.swing.JRadioButton();
        b142 = new javax.swing.JRadioButton();
        b143 = new javax.swing.JRadioButton();
        b144 = new javax.swing.JRadioButton();
        b145 = new javax.swing.JRadioButton();
        b155 = new javax.swing.JRadioButton();
        b154 = new javax.swing.JRadioButton();
        b153 = new javax.swing.JRadioButton();
        b152 = new javax.swing.JRadioButton();
        b151 = new javax.swing.JRadioButton();
        b12 = new javax.swing.JRadioButton();
        b161 = new javax.swing.JRadioButton();
        b162 = new javax.swing.JRadioButton();
        b163 = new javax.swing.JRadioButton();
        b164 = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        nijmegen = new javax.swing.JMenu();
        resptest = new javax.swing.JMenu();
        breathingretraining = new javax.swing.JMenu();
        help = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1500, 765));
        setResizable(false);
        getContentPane().setLayout(null);

        submitButton.setBackground(new java.awt.Color(0, 0, 0));
        submitButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(submitButton);
        submitButton.setBounds(570, 620, 190, 50);

        loginbox.setLayout(null);

        buttonGroup1.add(b15);
        b15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        loginbox.add(b15);
        b15.setBounds(1060, 70, 21, 21);

        buttonGroup1.add(b14);
        b14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        loginbox.add(b14);
        b14.setBounds(860, 70, 21, 21);

        buttonGroup1.add(b11);
        b11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b11.setMaximumSize(new java.awt.Dimension(23, 23));
        b11.setMinimumSize(new java.awt.Dimension(23, 23));
        b11.setPreferredSize(new java.awt.Dimension(23, 23));
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        loginbox.add(b11);
        b11.setBounds(280, 70, 20, 20);

        buttonGroup16.add(b165);
        b165.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b165ActionPerformed(evt);
            }
        });
        loginbox.add(b165);
        b165.setBounds(1060, 520, 20, 20);

        buttonGroup2.add(b21);
        b21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        loginbox.add(b21);
        b21.setBounds(280, 100, 21, 21);

        buttonGroup2.add(b22);
        b22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        loginbox.add(b22);
        b22.setBounds(480, 100, 21, 21);

        buttonGroup2.add(b23);
        b23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });
        loginbox.add(b23);
        b23.setBounds(670, 100, 21, 21);

        buttonGroup1.add(b13);
        b13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        loginbox.add(b13);
        b13.setBounds(670, 70, 20, 20);

        buttonGroup2.add(b24);
        b24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });
        loginbox.add(b24);
        b24.setBounds(860, 100, 20, 20);

        buttonGroup2.add(b25);
        b25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });
        loginbox.add(b25);
        b25.setBounds(1060, 100, 20, 20);

        buttonGroup3.add(b31);
        b31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b31ActionPerformed(evt);
            }
        });
        loginbox.add(b31);
        b31.setBounds(280, 130, 20, 20);

        buttonGroup3.add(b32);
        b32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b32ActionPerformed(evt);
            }
        });
        loginbox.add(b32);
        b32.setBounds(480, 130, 20, 20);

        buttonGroup3.add(b33);
        b33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b33ActionPerformed(evt);
            }
        });
        loginbox.add(b33);
        b33.setBounds(670, 130, 20, 20);

        buttonGroup3.add(b34);
        b34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b34ActionPerformed(evt);
            }
        });
        loginbox.add(b34);
        b34.setBounds(860, 130, 21, 20);

        buttonGroup3.add(b35);
        b35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b35ActionPerformed(evt);
            }
        });
        loginbox.add(b35);
        b35.setBounds(1060, 130, 20, 20);

        buttonGroup4.add(b41);
        b41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b41ActionPerformed(evt);
            }
        });
        loginbox.add(b41);
        b41.setBounds(280, 160, 20, 20);

        buttonGroup4.add(b42);
        b42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b42ActionPerformed(evt);
            }
        });
        loginbox.add(b42);
        b42.setBounds(480, 160, 20, 20);

        buttonGroup4.add(b43);
        b43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b43ActionPerformed(evt);
            }
        });
        loginbox.add(b43);
        b43.setBounds(670, 160, 20, 20);

        buttonGroup4.add(b44);
        b44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b44ActionPerformed(evt);
            }
        });
        loginbox.add(b44);
        b44.setBounds(860, 160, 20, 20);

        buttonGroup4.add(b45);
        b45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b45ActionPerformed(evt);
            }
        });
        loginbox.add(b45);
        b45.setBounds(1060, 160, 20, 20);

        buttonGroup5.add(b51);
        b51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b51ActionPerformed(evt);
            }
        });
        loginbox.add(b51);
        b51.setBounds(280, 190, 20, 20);

        buttonGroup5.add(b52);
        b52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b52ActionPerformed(evt);
            }
        });
        loginbox.add(b52);
        b52.setBounds(480, 190, 20, 20);

        buttonGroup5.add(b53);
        b53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b53ActionPerformed(evt);
            }
        });
        loginbox.add(b53);
        b53.setBounds(670, 190, 20, 20);

        buttonGroup5.add(b54);
        b54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b54ActionPerformed(evt);
            }
        });
        loginbox.add(b54);
        b54.setBounds(860, 190, 20, 20);

        buttonGroup5.add(b55);
        b55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b55ActionPerformed(evt);
            }
        });
        loginbox.add(b55);
        b55.setBounds(1060, 190, 20, 20);

        buttonGroup6.add(b61);
        b61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b61ActionPerformed(evt);
            }
        });
        loginbox.add(b61);
        b61.setBounds(280, 220, 20, 20);

        buttonGroup6.add(b62);
        b62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b62ActionPerformed(evt);
            }
        });
        loginbox.add(b62);
        b62.setBounds(480, 220, 20, 20);

        buttonGroup6.add(b63);
        b63.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b63ActionPerformed(evt);
            }
        });
        loginbox.add(b63);
        b63.setBounds(670, 220, 20, 20);

        buttonGroup6.add(b64);
        b64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b64ActionPerformed(evt);
            }
        });
        loginbox.add(b64);
        b64.setBounds(860, 220, 20, 20);

        buttonGroup6.add(b65);
        b65.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b65ActionPerformed(evt);
            }
        });
        loginbox.add(b65);
        b65.setBounds(1060, 220, 20, 20);

        buttonGroup7.add(b75);
        b75.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b75ActionPerformed(evt);
            }
        });
        loginbox.add(b75);
        b75.setBounds(1060, 250, 20, 20);

        buttonGroup7.add(b74);
        b74.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b74ActionPerformed(evt);
            }
        });
        loginbox.add(b74);
        b74.setBounds(860, 250, 20, 20);

        buttonGroup7.add(b73);
        b73.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b73ActionPerformed(evt);
            }
        });
        loginbox.add(b73);
        b73.setBounds(670, 250, 20, 20);

        buttonGroup7.add(b72);
        b72.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b72ActionPerformed(evt);
            }
        });
        loginbox.add(b72);
        b72.setBounds(480, 250, 20, 20);

        buttonGroup7.add(b71);
        b71.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b71ActionPerformed(evt);
            }
        });
        loginbox.add(b71);
        b71.setBounds(280, 250, 20, 20);

        buttonGroup8.add(b81);
        b81.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b81ActionPerformed(evt);
            }
        });
        loginbox.add(b81);
        b81.setBounds(280, 280, 20, 20);

        buttonGroup8.add(b82);
        b82.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b82ActionPerformed(evt);
            }
        });
        loginbox.add(b82);
        b82.setBounds(480, 280, 20, 20);

        buttonGroup8.add(b83);
        b83.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b83ActionPerformed(evt);
            }
        });
        loginbox.add(b83);
        b83.setBounds(670, 280, 20, 20);

        buttonGroup8.add(b84);
        b84.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b84ActionPerformed(evt);
            }
        });
        loginbox.add(b84);
        b84.setBounds(860, 280, 20, 20);

        buttonGroup8.add(b85);
        b85.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b85ActionPerformed(evt);
            }
        });
        loginbox.add(b85);
        b85.setBounds(1060, 280, 20, 20);

        buttonGroup9.add(b95);
        b95.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b95ActionPerformed(evt);
            }
        });
        loginbox.add(b95);
        b95.setBounds(1060, 310, 20, 20);

        buttonGroup9.add(b94);
        b94.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b94ActionPerformed(evt);
            }
        });
        loginbox.add(b94);
        b94.setBounds(860, 310, 20, 20);

        buttonGroup9.add(b93);
        b93.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b93ActionPerformed(evt);
            }
        });
        loginbox.add(b93);
        b93.setBounds(670, 310, 20, 20);

        buttonGroup9.add(b92);
        b92.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b92ActionPerformed(evt);
            }
        });
        loginbox.add(b92);
        b92.setBounds(480, 310, 20, 20);

        buttonGroup9.add(b91);
        b91.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b91ActionPerformed(evt);
            }
        });
        loginbox.add(b91);
        b91.setBounds(280, 310, 20, 20);

        buttonGroup10.add(b101);
        b101.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b101ActionPerformed(evt);
            }
        });
        loginbox.add(b101);
        b101.setBounds(280, 340, 20, 20);

        buttonGroup10.add(b102);
        b102.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b102ActionPerformed(evt);
            }
        });
        loginbox.add(b102);
        b102.setBounds(480, 340, 20, 20);

        buttonGroup10.add(b103);
        b103.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b103ActionPerformed(evt);
            }
        });
        loginbox.add(b103);
        b103.setBounds(670, 340, 20, 20);

        buttonGroup10.add(b104);
        b104.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b104ActionPerformed(evt);
            }
        });
        loginbox.add(b104);
        b104.setBounds(860, 340, 20, 20);

        buttonGroup10.add(b105);
        b105.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b105ActionPerformed(evt);
            }
        });
        loginbox.add(b105);
        b105.setBounds(1060, 340, 20, 20);

        buttonGroup11.add(b115);
        b115.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b115ActionPerformed(evt);
            }
        });
        loginbox.add(b115);
        b115.setBounds(1060, 370, 20, 20);

        buttonGroup11.add(b114);
        b114.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b114ActionPerformed(evt);
            }
        });
        loginbox.add(b114);
        b114.setBounds(860, 370, 20, 20);

        buttonGroup11.add(b113);
        b113.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b113ActionPerformed(evt);
            }
        });
        loginbox.add(b113);
        b113.setBounds(670, 370, 20, 20);

        buttonGroup11.add(b112);
        b112.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b112ActionPerformed(evt);
            }
        });
        loginbox.add(b112);
        b112.setBounds(480, 370, 20, 20);

        buttonGroup11.add(b111);
        b111.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b111ActionPerformed(evt);
            }
        });
        loginbox.add(b111);
        b111.setBounds(280, 370, 20, 20);

        buttonGroup12.add(b121);
        b121.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b121ActionPerformed(evt);
            }
        });
        loginbox.add(b121);
        b121.setBounds(280, 400, 20, 20);

        buttonGroup12.add(b122);
        b122.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b122ActionPerformed(evt);
            }
        });
        loginbox.add(b122);
        b122.setBounds(480, 400, 20, 20);

        buttonGroup12.add(b123);
        b123.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b123ActionPerformed(evt);
            }
        });
        loginbox.add(b123);
        b123.setBounds(670, 400, 20, 20);

        buttonGroup12.add(b124);
        b124.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b124ActionPerformed(evt);
            }
        });
        loginbox.add(b124);
        b124.setBounds(860, 400, 20, 20);

        buttonGroup12.add(b125);
        b125.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b125ActionPerformed(evt);
            }
        });
        loginbox.add(b125);
        b125.setBounds(1060, 400, 20, 20);

        buttonGroup13.add(b135);
        b135.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b135ActionPerformed(evt);
            }
        });
        loginbox.add(b135);
        b135.setBounds(1060, 430, 20, 20);

        buttonGroup13.add(b134);
        b134.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b134ActionPerformed(evt);
            }
        });
        loginbox.add(b134);
        b134.setBounds(860, 430, 20, 20);

        buttonGroup13.add(b133);
        b133.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b133ActionPerformed(evt);
            }
        });
        loginbox.add(b133);
        b133.setBounds(670, 430, 20, 20);

        buttonGroup13.add(b132);
        b132.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b132ActionPerformed(evt);
            }
        });
        loginbox.add(b132);
        b132.setBounds(480, 430, 20, 20);

        buttonGroup13.add(b131);
        b131.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b131ActionPerformed(evt);
            }
        });
        loginbox.add(b131);
        b131.setBounds(280, 430, 20, 20);

        buttonGroup14.add(b141);
        b141.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b141ActionPerformed(evt);
            }
        });
        loginbox.add(b141);
        b141.setBounds(280, 460, 20, 20);

        buttonGroup14.add(b142);
        b142.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b142ActionPerformed(evt);
            }
        });
        loginbox.add(b142);
        b142.setBounds(480, 460, 20, 20);

        buttonGroup14.add(b143);
        b143.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b143ActionPerformed(evt);
            }
        });
        loginbox.add(b143);
        b143.setBounds(670, 460, 20, 20);

        buttonGroup14.add(b144);
        b144.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b144ActionPerformed(evt);
            }
        });
        loginbox.add(b144);
        b144.setBounds(860, 460, 20, 20);

        buttonGroup14.add(b145);
        b145.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b145ActionPerformed(evt);
            }
        });
        loginbox.add(b145);
        b145.setBounds(1060, 460, 20, 20);

        buttonGroup15.add(b155);
        b155.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b155ActionPerformed(evt);
            }
        });
        loginbox.add(b155);
        b155.setBounds(1060, 490, 20, 20);

        buttonGroup15.add(b154);
        b154.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b154ActionPerformed(evt);
            }
        });
        loginbox.add(b154);
        b154.setBounds(860, 490, 20, 20);

        buttonGroup15.add(b153);
        b153.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b153ActionPerformed(evt);
            }
        });
        loginbox.add(b153);
        b153.setBounds(670, 490, 20, 20);

        buttonGroup15.add(b152);
        b152.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b152ActionPerformed(evt);
            }
        });
        loginbox.add(b152);
        b152.setBounds(480, 490, 20, 20);

        buttonGroup15.add(b151);
        b151.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b151ActionPerformed(evt);
            }
        });
        loginbox.add(b151);
        b151.setBounds(280, 490, 20, 20);

        buttonGroup1.add(b12);
        b12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        loginbox.add(b12);
        b12.setBounds(480, 70, 20, 20);

        buttonGroup16.add(b161);
        b161.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b161ActionPerformed(evt);
            }
        });
        loginbox.add(b161);
        b161.setBounds(280, 520, 20, 20);

        buttonGroup16.add(b162);
        b162.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b162ActionPerformed(evt);
            }
        });
        loginbox.add(b162);
        b162.setBounds(480, 520, 20, 20);

        buttonGroup16.add(b163);
        b163.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b163ActionPerformed(evt);
            }
        });
        loginbox.add(b163);
        b163.setBounds(670, 520, 20, 20);

        buttonGroup16.add(b164);
        b164.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b164ActionPerformed(evt);
            }
        });
        loginbox.add(b164);
        b164.setBounds(860, 520, 20, 20);

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        submit.setText("Submit");
        loginbox.add(submit);
        submit.setBounds(280, 600, 180, 40);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setText("How Often Do You Experience ...");
        loginbox.add(jLabel2);
        jLabel2.setBounds(440, 0, 360, 32);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/nijimegen table pic2.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginbox.add(jLabel3);
        jLabel3.setBounds(0, 30, 1180, 520);

        getContentPane().add(loginbox);
        loginbox.setBounds(80, 30, 1180, 550);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/background1.jpg"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(1500, 750));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-20, -70, 1370, 780);

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

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        // TODO add your handling code here:
        result2 = 2;
    }//GEN-LAST:event_b23ActionPerformed

    private void b115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b115ActionPerformed
        // TODO add your handling code here:
        result11 = 4;
    }//GEN-LAST:event_b115ActionPerformed

    private void b164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b164ActionPerformed
        // TODO add your handling code here:
        result16 = 3;
    }//GEN-LAST:event_b164ActionPerformed

    private void b32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b32ActionPerformed
        // TODO add your handling code here:
        result3 = 1;
    }//GEN-LAST:event_b32ActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // checking if an option has been selected for each of the button groups
        if (buttonGroup1.getSelection()==null || buttonGroup2.getSelection()==null || buttonGroup3.getSelection()==null 
            || buttonGroup4.getSelection()==null || buttonGroup5.getSelection()==null || buttonGroup6.getSelection()==null 
                || buttonGroup7.getSelection()==null || buttonGroup8.getSelection()==null || buttonGroup9.getSelection()==null 
                    || buttonGroup10.getSelection()==null || buttonGroup11.getSelection()==null || buttonGroup12.getSelection()==null
                         || buttonGroup13.getSelection()==null || buttonGroup14.getSelection()==null || buttonGroup15.getSelection()==null
                            || buttonGroup16.getSelection()==null){
            JOptionPane.showMessageDialog(null,"Please select an answer for all questions");
        }
        else { // if all questions have been answered
            // add all scores together to get result
            int finalResult = result1 + result2 + result3 + result4 + result5 + result6 + result7 + result8 + result9 + result10 + result11 + result12 + result13+ result14 + result15 + result16;
            Connection conn;
            Statement stmt = null,stmt2 = null;
            String sql,sql2;
            ResultSet rs;
            int result=0,result2=0;

            sql = "SELECT COUNT(*) AS total FROM N_SCORE WHERE USERNAME = '"+ gusername +"'"; // get session number
            conn = DBman.main();

            System.out.println("Creating statement...");
            try {
                stmt = conn.createStatement();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
           try {
                rs = stmt.executeQuery(sql);
                rs.next();
                result = rs.getInt("total");
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            result = result + 1;
            sql2 = "INSERT INTO N_SCORE VALUES('"+ gusername +"','"+ result +"','"+ finalResult +"')"; // insert results

            System.out.println("Creating statement...");
            try {
                stmt2 = conn.createStatement();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
           try {
                result = stmt.executeUpdate(sql2);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
                  //STEP 6: Clean-up environment
           try {
                stmt.close();
            } catch (SQLException e) {
            }
           try {
                conn.close();
            } catch (SQLException e) {
            }

            if (result > 0){ // if insert is successful 
                JOptionPane.showMessageDialog(null,"You Have Successfully Completed The Quiz");
                setVisible(false);
                dispose();
                respiratorytest.main(gusername); // change view
             }
             else{ // if insert is unsuccessful
                 JOptionPane.showMessageDialog(null,"An Error Has Occured. Please Try Again");
             } 
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void b151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b151ActionPerformed
        // TODO add your handling code here:
        result15 = 0;
    }//GEN-LAST:event_b151ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        // TODO add your handling code here:
        result1 = 0;
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        // TODO add your handling code here:
        result1 = 1;
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        // TODO add your handling code here:
        result1 = 2;
    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        // TODO add your handling code here:
        result1 = 3;
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        // TODO add your handling code here:
        result1 = 4;
    }//GEN-LAST:event_b15ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        // TODO add your handling code here:
        result2 = 0;
    }//GEN-LAST:event_b21ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        // TODO add your handling code here:
        result2 = 1;
    }//GEN-LAST:event_b22ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
        // TODO add your handling code here:
        result2 = 3;
    }//GEN-LAST:event_b24ActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
        // TODO add your handling code here:
        result2 = 4;
    }//GEN-LAST:event_b25ActionPerformed

    private void b31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b31ActionPerformed
        // TODO add your handling code here:
        result3 = 0;
    }//GEN-LAST:event_b31ActionPerformed

    private void b33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b33ActionPerformed
        // TODO add your handling code here:
        result3 = 2;
    }//GEN-LAST:event_b33ActionPerformed

    private void b34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b34ActionPerformed
        // TODO add your handling code here:
        result3 = 3;
    }//GEN-LAST:event_b34ActionPerformed

    private void b35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b35ActionPerformed
        // TODO add your handling code here:
        result3 = 4;
    }//GEN-LAST:event_b35ActionPerformed

    private void b41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b41ActionPerformed
        // TODO add your handling code here:
        result4 = 0;
    }//GEN-LAST:event_b41ActionPerformed

    private void b42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b42ActionPerformed
        // TODO add your handling code here:
        result4 = 1;
    }//GEN-LAST:event_b42ActionPerformed

    private void b43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b43ActionPerformed
        // TODO add your handling code here:
        result4 = 2;
    }//GEN-LAST:event_b43ActionPerformed

    private void b44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b44ActionPerformed
        // TODO add your handling code here:
        result4 = 3;
    }//GEN-LAST:event_b44ActionPerformed

    private void b45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b45ActionPerformed
        // TODO add your handling code here:
        result4 = 4;
    }//GEN-LAST:event_b45ActionPerformed

    private void b51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b51ActionPerformed
        // TODO add your handling code here:
        result5 = 0;
    }//GEN-LAST:event_b51ActionPerformed

    private void b52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b52ActionPerformed
        // TODO add your handling code here:
        result5 = 1;
    }//GEN-LAST:event_b52ActionPerformed

    private void b53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b53ActionPerformed
        // TODO add your handling code here:
        result5 = 2;
    }//GEN-LAST:event_b53ActionPerformed

    private void b54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b54ActionPerformed
        // TODO add your handling code here:
        result5 = 3;
    }//GEN-LAST:event_b54ActionPerformed

    private void b55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b55ActionPerformed
        // TODO add your handling code here:
        result5 = 4;
    }//GEN-LAST:event_b55ActionPerformed

    private void b61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b61ActionPerformed
        // TODO add your handling code here:
        result6 = 0;
    }//GEN-LAST:event_b61ActionPerformed

    private void b62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b62ActionPerformed
        // TODO add your handling code here:
        result6 = 1;
    }//GEN-LAST:event_b62ActionPerformed

    private void b63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b63ActionPerformed
        // TODO add your handling code here:
        result6 = 2;
    }//GEN-LAST:event_b63ActionPerformed

    private void b64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b64ActionPerformed
        // TODO add your handling code here:
        result6 = 3;
    }//GEN-LAST:event_b64ActionPerformed

    private void b65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b65ActionPerformed
        // TODO add your handling code here:
        result6 = 4;
    }//GEN-LAST:event_b65ActionPerformed

    private void b71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b71ActionPerformed
        // TODO add your handling code here:
        result7 = 0;
    }//GEN-LAST:event_b71ActionPerformed

    private void b72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b72ActionPerformed
        // TODO add your handling code here:
        result7 = 1;
    }//GEN-LAST:event_b72ActionPerformed

    private void b73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b73ActionPerformed
        // TODO add your handling code here:
        result7 = 2;
    }//GEN-LAST:event_b73ActionPerformed

    private void b74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b74ActionPerformed
        // TODO add your handling code here:
        result7 = 3;
    }//GEN-LAST:event_b74ActionPerformed

    private void b75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b75ActionPerformed
        // TODO add your handling code here:
        result7 = 4;
    }//GEN-LAST:event_b75ActionPerformed

    private void b81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b81ActionPerformed
        // TODO add your handling code here:
        result8 = 0;
    }//GEN-LAST:event_b81ActionPerformed

    private void b82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b82ActionPerformed
        // TODO add your handling code here:
        result8 = 1;
    }//GEN-LAST:event_b82ActionPerformed

    private void b83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b83ActionPerformed
        // TODO add your handling code here:
        result8 = 2;
    }//GEN-LAST:event_b83ActionPerformed

    private void b84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b84ActionPerformed
        // TODO add your handling code here:
        result8 = 3;
    }//GEN-LAST:event_b84ActionPerformed

    private void b85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b85ActionPerformed
        // TODO add your handling code here:
        result8 = 4;
    }//GEN-LAST:event_b85ActionPerformed

    private void b91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b91ActionPerformed
        // TODO add your handling code here:
        result9 = 0;
    }//GEN-LAST:event_b91ActionPerformed

    private void b92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b92ActionPerformed
        // TODO add your handling code here:
        result9 = 1;
    }//GEN-LAST:event_b92ActionPerformed

    private void b93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b93ActionPerformed
        // TODO add your handling code here:
        result9 = 2;
    }//GEN-LAST:event_b93ActionPerformed

    private void b94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b94ActionPerformed
        // TODO add your handling code here:
        result9 = 3;
    }//GEN-LAST:event_b94ActionPerformed

    private void b95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b95ActionPerformed
        // TODO add your handling code here:
        result9 = 4;
    }//GEN-LAST:event_b95ActionPerformed

    private void b101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b101ActionPerformed
        // TODO add your handling code here:
        result10 = 0;
    }//GEN-LAST:event_b101ActionPerformed

    private void b102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b102ActionPerformed
        // TODO add your handling code here:
        result10 = 1;
    }//GEN-LAST:event_b102ActionPerformed

    private void b103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b103ActionPerformed
        // TODO add your handling code here:
        result10 = 2;
    }//GEN-LAST:event_b103ActionPerformed

    private void b104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b104ActionPerformed
        // TODO add your handling code here:
        result10 = 3;
    }//GEN-LAST:event_b104ActionPerformed

    private void b105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b105ActionPerformed
        // TODO add your handling code here:
        result10 = 4;
    }//GEN-LAST:event_b105ActionPerformed

    private void b111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b111ActionPerformed
        // TODO add your handling code here:
        result11 = 0;
    }//GEN-LAST:event_b111ActionPerformed

    private void b112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b112ActionPerformed
        // TODO add your handling code here:
        result11 = 1;
    }//GEN-LAST:event_b112ActionPerformed

    private void b113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b113ActionPerformed
        // TODO add your handling code here:
        result11 = 2;
    }//GEN-LAST:event_b113ActionPerformed

    private void b114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b114ActionPerformed
        // TODO add your handling code here:
        result11 = 3;
    }//GEN-LAST:event_b114ActionPerformed

    private void b121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b121ActionPerformed
        // TODO add your handling code here:
        result12 = 0;
    }//GEN-LAST:event_b121ActionPerformed

    private void b122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b122ActionPerformed
        // TODO add your handling code here:
        result12 = 1;
    }//GEN-LAST:event_b122ActionPerformed

    private void b123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b123ActionPerformed
        // TODO add your handling code here:
        result12 = 2;
    }//GEN-LAST:event_b123ActionPerformed

    private void b124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b124ActionPerformed
        // TODO add your handling code here:
        result12 = 3;
    }//GEN-LAST:event_b124ActionPerformed

    private void b125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b125ActionPerformed
        // TODO add your handling code here:
        result12 = 4;
    }//GEN-LAST:event_b125ActionPerformed

    private void b131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b131ActionPerformed
        // TODO add your handling code here:
        result13 = 0;
    }//GEN-LAST:event_b131ActionPerformed

    private void b132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b132ActionPerformed
        // TODO add your handling code here:
        result13 = 1;
    }//GEN-LAST:event_b132ActionPerformed

    private void b133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b133ActionPerformed
        // TODO add your handling code here:
        result13 = 2;
    }//GEN-LAST:event_b133ActionPerformed

    private void b134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b134ActionPerformed
        // TODO add your handling code here:
        result13 = 3;
    }//GEN-LAST:event_b134ActionPerformed

    private void b135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b135ActionPerformed
        // TODO add your handling code here:
        result13 = 4;
    }//GEN-LAST:event_b135ActionPerformed

    private void b141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b141ActionPerformed
        // TODO add your handling code here:
        result14 = 0;
    }//GEN-LAST:event_b141ActionPerformed

    private void b142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b142ActionPerformed
        // TODO add your handling code here:
        result14 = 1;
    }//GEN-LAST:event_b142ActionPerformed

    private void b143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b143ActionPerformed
        // TODO add your handling code here:
        result14 = 2;
    }//GEN-LAST:event_b143ActionPerformed

    private void b144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b144ActionPerformed
        // TODO add your handling code here:
        result14 = 3;
    }//GEN-LAST:event_b144ActionPerformed

    private void b145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b145ActionPerformed
        // TODO add your handling code here:
        result14 = 4;
    }//GEN-LAST:event_b145ActionPerformed

    private void b152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b152ActionPerformed
        // TODO add your handling code here:
        result15 = 1;
    }//GEN-LAST:event_b152ActionPerformed

    private void b153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b153ActionPerformed
        // TODO add your handling code here:
        result15 = 2;
    }//GEN-LAST:event_b153ActionPerformed

    private void b154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b154ActionPerformed
        // TODO add your handling code here:
        result15 = 3;
    }//GEN-LAST:event_b154ActionPerformed

    private void b155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b155ActionPerformed
        // TODO add your handling code here:
        result15 = 4;
    }//GEN-LAST:event_b155ActionPerformed

    private void b161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b161ActionPerformed
        // TODO add your handling code here:
        result16 = 0;
    }//GEN-LAST:event_b161ActionPerformed

    private void b162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b162ActionPerformed
        // TODO add your handling code here:
        result16 = 1;
    }//GEN-LAST:event_b162ActionPerformed

    private void b163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b163ActionPerformed
        // TODO add your handling code here:
        result16 = 2;
    }//GEN-LAST:event_b163ActionPerformed

    private void b165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b165ActionPerformed
        // TODO add your handling code here:
        result16 = 4;
    }//GEN-LAST:event_b165ActionPerformed

    private void nijmegenMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_nijmegenMenuSelected
        // if nijmegen questionnaire menu item is selected change view to that page
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

    private void breathingretrainingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_breathingretrainingMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        retraining.main(gusername);
    }//GEN-LAST:event_breathingretrainingMouseClicked

    private void exitMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_exitMenuSelected
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMenuSelected

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"For each of the symptoms listed on the left, select a button which corresponds to the frequency you experience the symptom");
    }//GEN-LAST:event_helpMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String username) {
        gusername = username;
        String lookAndFeel = null;
        lookAndFeel = UIManager.getSystemLookAndFeelClassName(); // setting look and feel
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
                new nijimegen().setVisible(true); // calling constructor
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton b101;
    private javax.swing.JRadioButton b102;
    private javax.swing.JRadioButton b103;
    private javax.swing.JRadioButton b104;
    private javax.swing.JRadioButton b105;
    private javax.swing.JRadioButton b11;
    private javax.swing.JRadioButton b111;
    private javax.swing.JRadioButton b112;
    private javax.swing.JRadioButton b113;
    private javax.swing.JRadioButton b114;
    private javax.swing.JRadioButton b115;
    private javax.swing.JRadioButton b12;
    private javax.swing.JRadioButton b121;
    private javax.swing.JRadioButton b122;
    private javax.swing.JRadioButton b123;
    private javax.swing.JRadioButton b124;
    private javax.swing.JRadioButton b125;
    private javax.swing.JRadioButton b13;
    private javax.swing.JRadioButton b131;
    private javax.swing.JRadioButton b132;
    private javax.swing.JRadioButton b133;
    private javax.swing.JRadioButton b134;
    private javax.swing.JRadioButton b135;
    private javax.swing.JRadioButton b14;
    private javax.swing.JRadioButton b141;
    private javax.swing.JRadioButton b142;
    private javax.swing.JRadioButton b143;
    private javax.swing.JRadioButton b144;
    private javax.swing.JRadioButton b145;
    private javax.swing.JRadioButton b15;
    private javax.swing.JRadioButton b151;
    private javax.swing.JRadioButton b152;
    private javax.swing.JRadioButton b153;
    private javax.swing.JRadioButton b154;
    private javax.swing.JRadioButton b155;
    private javax.swing.JRadioButton b161;
    private javax.swing.JRadioButton b162;
    private javax.swing.JRadioButton b163;
    private javax.swing.JRadioButton b164;
    private javax.swing.JRadioButton b165;
    private javax.swing.JRadioButton b21;
    private javax.swing.JRadioButton b22;
    private javax.swing.JRadioButton b23;
    private javax.swing.JRadioButton b24;
    private javax.swing.JRadioButton b25;
    private javax.swing.JRadioButton b31;
    private javax.swing.JRadioButton b32;
    private javax.swing.JRadioButton b33;
    private javax.swing.JRadioButton b34;
    private javax.swing.JRadioButton b35;
    private javax.swing.JRadioButton b41;
    private javax.swing.JRadioButton b42;
    private javax.swing.JRadioButton b43;
    private javax.swing.JRadioButton b44;
    private javax.swing.JRadioButton b45;
    private javax.swing.JRadioButton b51;
    private javax.swing.JRadioButton b52;
    private javax.swing.JRadioButton b53;
    private javax.swing.JRadioButton b54;
    private javax.swing.JRadioButton b55;
    private javax.swing.JRadioButton b61;
    private javax.swing.JRadioButton b62;
    private javax.swing.JRadioButton b63;
    private javax.swing.JRadioButton b64;
    private javax.swing.JRadioButton b65;
    private javax.swing.JRadioButton b71;
    private javax.swing.JRadioButton b72;
    private javax.swing.JRadioButton b73;
    private javax.swing.JRadioButton b74;
    private javax.swing.JRadioButton b75;
    private javax.swing.JRadioButton b81;
    private javax.swing.JRadioButton b82;
    private javax.swing.JRadioButton b83;
    private javax.swing.JRadioButton b84;
    private javax.swing.JRadioButton b85;
    private javax.swing.JRadioButton b91;
    private javax.swing.JRadioButton b92;
    private javax.swing.JRadioButton b93;
    private javax.swing.JRadioButton b94;
    private javax.swing.JRadioButton b95;
    private javax.swing.JMenu breathingretraining;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JMenu exit;
    private javax.swing.JMenu help;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel loginbox;
    private javax.swing.JMenu nijmegen;
    private javax.swing.JMenu resptest;
    private javax.swing.JButton submit;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
