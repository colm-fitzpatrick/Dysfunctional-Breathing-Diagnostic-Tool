/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fyp;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Colm
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    private static JFrame frame;
    public static float etco2float = 0;
    
    public register() {
        this.setUndecorated(true);
        this.setVisible(true);
        
        initComponents();
        etco2value.setVisible(false);
        etco2var.setVisible(false);
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize,ysize); // setting page size to full screen
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        loginbox = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameVar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        verifypasswordVar = new javax.swing.JPasswordField();
        createaccVar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        secondnameVar = new javax.swing.JTextField();
        firstnameVar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        smokerBox = new javax.swing.JComboBox<>();
        passwordVar = new javax.swing.JPasswordField();
        ageBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        weightVar = new javax.swing.JTextField();
        heightVar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        etco2var = new javax.swing.JTextField();
        etco2value = new javax.swing.JLabel();
        yesRadio = new javax.swing.JRadioButton();
        noRadio = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        login = new javax.swing.JMenu();
        create = new javax.swing.JMenu();
        help = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        loginbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setText("Create An Account");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Username ");

        usernameVar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Password ");

        createaccVar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        createaccVar.setText("Create Account");
        createaccVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccVarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Second Name ");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Weight (kg) ");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Height (ft) ");

        secondnameVar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        secondnameVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondnameVarActionPerformed(evt);
            }
        });

        firstnameVar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("First Name :");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("Age ");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("Smoker");

        smokerBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        smokerBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "Yes", "No" }));

        ageBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        ageBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select An Age", "21 and Under", "22 to 34", "35 to 44", "45 to 54", "55 to 64", "65 and Over" }));

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel11.setText("Verify Password ");

        weightVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightVarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel12.setText("End Tidal CO2 (mmHg)");

        etco2var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etco2varActionPerformed(evt);
            }
        });

        etco2value.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etco2value.setText("ETCO2 Value");
        etco2value.setMaximumSize(new java.awt.Dimension(146, 19));
        etco2value.setMinimumSize(new java.awt.Dimension(146, 19));
        etco2value.setPreferredSize(new java.awt.Dimension(146, 19));

        buttonGroup1.add(yesRadio);
        yesRadio.setText("Yes");
        yesRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(noRadio);
        noRadio.setText("No");
        noRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noRadioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginboxLayout = new javax.swing.GroupLayout(loginbox);
        loginbox.setLayout(loginboxLayout);
        loginboxLayout.setHorizontalGroup(
            loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginboxLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etco2value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginboxLayout.createSequentialGroup()
                        .addComponent(yesRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noRadio))
                    .addComponent(firstnameVar)
                    .addComponent(secondnameVar)
                    .addComponent(usernameVar)
                    .addComponent(passwordVar)
                    .addComponent(verifypasswordVar)
                    .addComponent(ageBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(smokerBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(weightVar)
                    .addComponent(etco2var)
                    .addComponent(heightVar))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginboxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginboxLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginboxLayout.createSequentialGroup()
                        .addComponent(createaccVar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        loginboxLayout.setVerticalGroup(
            loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginboxLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondnameVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(passwordVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(verifypasswordVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yesRadio)
                    .addComponent(noRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etco2var, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etco2value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weightVar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heightVar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(loginboxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smokerBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(createaccVar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        getContentPane().add(loginbox);
        loginbox.setBounds(500, 100, 370, 500);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/background1.jpg"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(1500, 750));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, -70, 1370, 750);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(175, 35));

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
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new FYPGUI().setVisible(true);
    }//GEN-LAST:event_loginMenuSelected

    private void createMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_createMenuSelected
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new register().setVisible(true);
    }//GEN-LAST:event_createMenuSelected

    private void exitMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_exitMenuSelected
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMenuSelected

    private void secondnameVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondnameVarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondnameVarActionPerformed

    private void createaccVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccVarActionPerformed
        try {                                             
            // TODO add your handling code here:
            String firstname,secondname,password,username,verifypassword,age,smoker,tempweight,tempheight,sql,sql2, etco2;
            float weight,height,etco;
            int result=0;
            Connection conn;
            Statement stmt = null, stmt2 = null;
            Object content;
            ResultSet rs=null;
            
            etco2 = etco2var.getText(); // get enter etco2 value
            
            if(!etco2.matches("[a-zA-Z]+")){ // if it is not alphanumeric
                if(etco2 != null && !etco2.isEmpty()){ // if it is not null or empty
                    etco2float = Float.parseFloat(etco2); // store the value 
                }
                else{ // else it is zero
                    etco2float = 0;
                }
                firstname = firstnameVar.getText(); // get entered data
                secondname = secondnameVar.getText();
                username = usernameVar.getText();
                password = new String(passwordVar.getPassword());
                verifypassword = new String(verifypasswordVar.getPassword());
                tempweight = weightVar.getText();
                //weight = Float.parseFloat(tempweight);
                tempheight = heightVar.getText();
                //height = Float.parseFloat(tempheight);
                content = ageBox.getSelectedItem().toString();
                age = (String) content;
                content = smokerBox.getSelectedItem().toString();
                smoker = (String) content;
                Pattern pattern = Pattern.compile("[a-zA-Z]+");
                Matcher matcher = pattern.matcher(tempweight);
                Matcher matcher2 = pattern.matcher(tempheight);

                sql2 = "SELECT * FROM U_INFO WHERE USERNAME = '"+ username +"'"; // check if username is already in use
                conn = DBman.main();

                System.out.println("Creating statement...");
                try {
                    stmt2 = conn.createStatement();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                try {
                    rs = stmt2.executeQuery(sql2);

                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                if(!rs.next()){
                    if(firstname.matches("[a-zA-Z]+")){ // perform necessary data validation
                        if(secondname.matches("[a-zA-Z]+")){
                            if(username.length()>0){
                                if(password.length()>0){
                                    if (buttonGroup1.getSelection()!=null) {
                                        if (password.equals(verifypassword)){
                                            if(matcher.find()){
                                                JOptionPane.showMessageDialog(null,"The Weight Field May Only Contain Numbers");
                                            }
                                            if(tempweight.length()<1){
                                               JOptionPane.showMessageDialog(null,"Please Enter A Value For The Weight Field"); 
                                            }
                                            else {
                                                weight = Float.parseFloat(tempweight);
                                                if(matcher2.find()){
                                                    JOptionPane.showMessageDialog(null,"The Height Field May Only Contain Numbers");
                                                }
                                                if(tempheight.length()<1){
                                                    JOptionPane.showMessageDialog(null,"Please Enter A Value For The Height Field");
                                                }
                                                else {
                                                    if(age=="Please Select An Age"){
                                                        JOptionPane.showMessageDialog(null,"Please Select An Age From The Dropdown List");
                                                    }
                                                    else {
                                                        if(smoker=="Please Select"){
                                                            JOptionPane.showMessageDialog(null,"Please Select A Smoking Status From The Dropdown List");
                                                        }
                                                        else {
                                                            if(etco2float<0 || etco2.length()<1){
                                                                JOptionPane.showMessageDialog(null,"Please Enter A Positive ETCO2 Value");
                                                            }
                                                            else{ // if all data is correct
                                                                height = Float.parseFloat(tempheight);
                                                                System.out.println("Creating statement..."); // insert data to database
                                                                sql = "INSERT INTO U_INFO VALUES('"+ firstname +"','"+ secondname +"','"+ username +"','"+ password +"','"+ weight +"','"+ height +"','"+ age +"','"+ smoker +"','"+ etco2float +"')";
                                                                conn = DBman.main();
                                                                try {
                                                                    stmt = conn.createStatement();
                                                                } catch (SQLException e) {
                                                                    // TODO Auto-generated catch block
                                                                    e.printStackTrace();
                                                                }
                                                                try {
                                                                    result = stmt.executeUpdate(sql);
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

                                                                if (result > 0){
                                                                    JOptionPane.showMessageDialog(null,"You Have Successfully Created An Account");
                                                                    setVisible(false);
                                                                    dispose();
                                                                    new FYPGUI().setVisible(true);
                                                                }
                                                                else{
                                                                    JOptionPane.showMessageDialog(null,"An Error Has Occured. Please Check Internet Connection And Try Again");
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        else{ // else display information message
                                            JOptionPane.showMessageDialog(null,"The Password And Verify Password Values You Have Entered Do Not Match. Please Try Again");
                                            passwordVar.setText("");
                                            verifypasswordVar.setText("");
                                        }
                                    }
                                    else {
                                        JOptionPane.showMessageDialog(null,"Please Select Yes Or No For The ETCO2 Option");
                                    }
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"Please Enter A Value For The Password Field");
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Please Enter A Value For The Username Field");
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(null,"Please Enter A Valid Second Name. It May Only Contain Letters");
                            secondnameVar.setText("");
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Please Enter A Valid First Name. It May Only Contain Letters");
                        firstnameVar.setText("");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"The Username You Have Entered Is Already In Use, Please Try Another");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"The ETCO2 Value May Only Contain Numbers");
            }
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_createaccVarActionPerformed

    private void weightVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightVarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightVarActionPerformed

    private void etco2varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etco2varActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etco2varActionPerformed

    private void noRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noRadioMouseClicked
        // TODO add your handling code here:
        etco2var.setText("0"); // set value of etco2 to zero when the no option is selected
        etco2value.setVisible(false);
        etco2var.setVisible(false);
        etco2float = 0;
    }//GEN-LAST:event_noRadioMouseClicked

    private void yesRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesRadioActionPerformed
        // TODO add your handling code here
        etco2value.setVisible(true);
        etco2var.setVisible(true);
        etco2var.setText("0");
    }//GEN-LAST:event_yesRadioActionPerformed

    private void helpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseClicked
        // display help documentation
        JOptionPane.showMessageDialog(null,"All fields in the registration form are required.\nIf you are unsure or don't know that answer to any of the fields, please consult your respiratory professional");
    }//GEN-LAST:event_helpMouseClicked


    public static void main(String args[]) { // main method
        String lookAndFeel = null;
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
                new register().setVisible(true); // call constructor
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ageBox;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu create;
    private javax.swing.JButton createaccVar;
    private javax.swing.JLabel etco2value;
    private javax.swing.JTextField etco2var;
    private javax.swing.JMenu exit;
    private javax.swing.JTextField firstnameVar;
    private javax.swing.JTextField heightVar;
    private javax.swing.JMenu help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu login;
    private javax.swing.JPanel loginbox;
    private javax.swing.JRadioButton noRadio;
    private javax.swing.JPasswordField passwordVar;
    private javax.swing.JTextField secondnameVar;
    private javax.swing.JComboBox<String> smokerBox;
    private javax.swing.JTextField usernameVar;
    private javax.swing.JPasswordField verifypasswordVar;
    private javax.swing.JTextField weightVar;
    private javax.swing.JRadioButton yesRadio;
    // End of variables declaration//GEN-END:variables
}
