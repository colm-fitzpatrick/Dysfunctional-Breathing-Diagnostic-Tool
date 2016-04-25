/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

import fyp.DBman;
import fyp.FYPGUI;
import fyp.nijimegen;
import static fyp.register.etco2float;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Colm
 */
public class agileTest {
    Connection conn = DBman.main();
    
    public String signin (String s1, String s2){
        String username,password,sql,sql2,correctusername;
        Connection conn;
        Statement stmt = null,stmt2 = null;
        ResultSet result=null,result2 = null;
        boolean hasRows=false,hasRows2=false;
        int num1=10,num2=10;
        String returnval = "";
        
        sql = "SELECT * FROM U_INFO WHERE USERNAME = '"+ s1 +"'";
        sql2 = "SELECT * FROM U_INFO WHERE U_PASSWORD = '"+ s2 +"' AND USERNAME LIKE '"+ s1 +"'";
        conn = DBman.main();
        
        //STEP 4: Execute a query
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
            if (result.next()){
                if (result2.next()){
                    //JOptionPane.showMessageDialog(null,"You Have Successfully Signed In");
                    returnval = "You Have Successfully Signed In";
                }
                else {
                    //JOptionPane.showMessageDialog(null,"The Password You Have Entered Is Incorrect. Please Try Again");
                    returnval = "The Password You Have Entered Is Incorrect. Please Try Again";
                }
            }
            else {
                //JOptionPane.showMessageDialog(null,"There Is No User Registered With This Username. Please Try Again Or Create An Account");
                returnval = "There Is No User Registered With This Username. Please Try Again Or Create An Account";
            }
        } catch (SQLException ex) {
            Logger.getLogger(FYPGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
                stmt.close();
        } catch (SQLException e) {
        }
       try {
                conn.close();
        } catch (SQLException e) {
        }
       return returnval;
    }
    
    public String register(String firstname, String secondname, String username, String password, String verifypassword, String tempweight, String tempheight,String age, String smoker, String etco2) throws SQLException{
        //String firstname,secondname,password,username,verifypassword,age,smoker,tempweight,tempheight,sql, etco2;
        float weight,height,etco;
        String sql,sql2, returnval="";
        int result=0;
        Connection conn;
        Statement stmt = null, stmt2 = null;
        Object content;
        ResultSet rs=null;
        sql2 = "SELECT * FROM U_INFO WHERE USERNAME = '"+ username +"'";
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
        
     
        if(etco2 != null && !etco2.isEmpty()){
            etco2float = Float.parseFloat(etco2);
        }
        else{
            etco2float = 0;
        }
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(tempweight);
        Matcher matcher2 = pattern.matcher(tempheight);
        
        if(!rs.next()){
            if(firstname.matches("[a-zA-Z]+")){
                if(secondname.matches("[a-zA-Z]+")){
                    if(username.length()>0){
                        if(password.length()>0){
                            if (password.equals(verifypassword)){
                                if(matcher.find()){
                                    //JOptionPane.showMessageDialog(null,"The Weight Field May Only Contain Numbers");
                                    returnval = "The Weight Field May Only Contain Numbers";
                                }
                                else {
                                    weight = Float.parseFloat(tempweight);
                                    if(matcher2.find()){
                                        //JOptionPane.showMessageDialog(null,"The Height Field May Only Contain Numbers");
                                        returnval = "The Height Field May Only Contain Numbers";
                                    }
                                    else {
                                        if(age=="Please Select An Age"){
                                            //JOptionPane.showMessageDialog(null,"Please Select An Age From The Dropdown List");
                                            returnval = "Please Select An Age From The Dropdown List";
                                        }
                                        else {
                                            if(smoker=="Please Select"){
                                                //JOptionPane.showMessageDialog(null,"Please Select A Smoking Status From The Dropdown List");
                                                returnval = "Please Select A Smoking Status From The Dropdown List";
                                            }
                                            else{
                                                if(etco2float<0){
                                                    returnval = "Please Enter A Positive ETCO2 Value";
                                                }
                                                else {
                                                    returnval = "You Have Successfully Created An Account";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else{
                                //JOptionPane.showMessageDialog(null,"The Password And Verify Password Values You Have Entered Do Not Match. Please Try Again");
                                returnval = "The Password And Verify Password Values You Have Entered Do Not Match. Please Try Again";
                            }
                        }
                        else {
                            returnval = "Please Enter A Value For The Password Field";
                        }
                    }
                    else{
                        returnval = "Please Enter A Value For The Username Field";
                    }
                }
                else {
                    //JOptionPane.showMessageDialog(null,"The Second Name Field Can Only Contain Letters");
                    returnval = "The Second Name Field Can Only Contain Letters";
                }
            }
            else {
                    //JOptionPane.showMessageDialog(null,"Your First Name Field Can Only Contain Letters");
                    returnval = "Your First Name Field Can Only Contain Letters";
                }
        }
        else {
            //JOptionPane.showMessageDialog(null,"The Username You Have Entered Is Already In Use, Please Try Another");
            returnval = "The Username You Have Entered Is Already In Use, Please Try Another";
        }
        return returnval;
    }
    
    public String beltdata (String values){
    StringBuffer sq = new StringBuffer();
    float data1,data2;
    float[] chestA = new float[10];
    float[] abdominalA = new float[10];
    String resultval;
    Pattern pattern = Pattern.compile("[a-zA-Z]+");
    Matcher matcher, matcher2;
    int b=0;
    java.util.Date utilDate = new java.util.Date();
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    if(values.length()>0){
        String [] inputValues = values.split(",");
        if(inputValues.length>1 && inputValues[0].length()>0 && inputValues[1].length()>0){
            matcher = pattern.matcher(inputValues[0]);
            matcher2 = pattern.matcher(inputValues[1]);
            if(!matcher.find() && !matcher2.find()){
                data1 = Float.valueOf(inputValues[0]);
                data2 = Float.valueOf(inputValues[1]);
                    if(data1>0 && data2>0){
                        chestA[b]=data1;
                        abdominalA[b]=data2;
                        resultval = "data entered is satisfactory";
                    }
                    else{
                        resultval = "data smaller than 1";
                    }
            }
            else{
                resultval = "belt data is not numeric";
            }
        }
        else{
            resultval="input string format error";
        }
    }
    else{
        resultval = "empty string passed to function";
    }
    
    return resultval;
    }
}
