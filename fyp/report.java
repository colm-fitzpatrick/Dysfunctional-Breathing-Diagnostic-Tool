/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fyp;

import com.reportmill.base.RMXMLWriter;
import com.reportmill.base.ReportMill;
import com.reportmill.shape.RMDocument;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 *
 * @author Colm
 */
public class report {
    
    public static String gusername;
    
    
    
    public static void main(String username, String sess,String sess2, String filename) throws SQLException, IOException, Exception{
        
        ReportMill.setLicense("COLM18E-6A08113A202842"); // reportmill licence
        gusername = username;
        String xmlresult;
        
        Connection conn;
        conn = DBman.main();
        Statement st=null,st1=null,st2=null,st3=null,st4=null,st5=null;
        ResultSet resultSet=null,resultSet1=null,resultSet2=null,resultSet3=null,resultSet4=null,resultSet5=null;

        try {
            st = conn.createStatement();
            st1 = conn.createStatement();
            st2 = conn.createStatement();
            st3 = conn.createStatement();
            st4 = conn.createStatement();
            st5 = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
        }
        resultSet = st.executeQuery("select * from TWO_MIN_INTERVAL where USERNAME='"+gusername+"' AND SESSION_NUM=1"); // creating resultsets
        resultSet1 = st1.executeQuery("select * from TWO_MIN_INTERVAL where USERNAME='"+gusername+"' AND SESSION_NUM=2");
        resultSet2 = st2.executeQuery("select * from TOTAL where USERNAME='"+gusername+"' AND SESSION_NUM=1");
        resultSet3 = st3.executeQuery("select * from TOTAL where USERNAME='"+gusername+"' AND SESSION_NUM=2");
        resultSet4 = st4.executeQuery("select * from TOTAL2 where USERNAME='"+gusername+"'");
        resultSet5 = st5.executeQuery("select * from U_INFO where USERNAME='"+gusername+"'");

        Map map = new HashMap(); // mapping multiple resultsets to single haphash object
        map.put("Row1", resultSet);
        map.put("Row2", resultSet1);
        map.put("Row3", resultSet2);
        map.put("Row4", resultSet3);
        map.put("Row5", resultSet4);
        map.put("Row6", resultSet5);
        

        
        // generate XML for ResultSet (only do this once)
        //convertXML.main(gusername);
        
        
        // load template from reportmill template file
        RMDocument template = new RMDocument("C:/Users/Colm/Documents/Final Year Project/reports/template3.rpt");

        // generate report from result set
        RMDocument report = template.generateReport(map);
        String file_1 = "";
        String file_2 = "";
        String filename1 = "";
        String filename2= "";
        filename1 = filename +"1.PNG";
        filename2 = filename +"2.PNG";
        int temp = 2;
        if(sess2.equals("Final")){
        file_1 = "C:/Users/Colm/Documents/Final Year Project/reports/"+gusername+"Report"+ sess2 + ".pdf";
        file_2 = "C:/Users/Colm/Documents/Final Year Project/reports/"+gusername+"Report"+ sess + ".pdf";
        temp=3;
        }
        else {
        file_1 = "C:/Users/Colm/Documents/Final Year Project/reports/"+gusername+"Report"+ sess + ".pdf";
        file_2 = "C:/Users/Colm/Documents/Final Year Project/reports/"+gusername+"Report.pdf";  
        temp = 2;
        }
        
        report.write(file_2); // write report to file
        JavaWritePDF.main(file_1,file_2, filename1,filename2,temp); // add chart png files to report
    }
    
}
