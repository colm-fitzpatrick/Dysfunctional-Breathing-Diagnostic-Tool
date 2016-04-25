package fyp;

import static fyp.report.gusername;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class convertXML {

  public static void main(String gusername) throws Exception {
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); // create document
    DocumentBuilder builder = factory.newDocumentBuilder();
    Document doc = builder.newDocument();
    Element results = doc.createElement("Results"); // create parent element
    doc.appendChild(results);
    Statement st=null,st1=null,st2=null,st3=null,st4=null,st5=null;
    Connection con = DBman.main();
    
    ResultSet resultSet=null,resultSet1=null,resultSet2=null,resultSet3=null,resultSet4=null, resultSet5=null;

    try {
        st = con.createStatement();
        st1 = con.createStatement();
        st2 = con.createStatement();
        st3 = con.createStatement();
        st4 = con.createStatement();
        st5 = con.createStatement();
    } catch (SQLException ex) {
        Logger.getLogger(report.class.getName()).log(Level.SEVERE, null, ex);
    }
    resultSet = st.executeQuery("select * from TWO_MIN_INTERVAL where USERNAME='"+ gusername +"' AND SESSION_NUM=1"); // creating resultsets
    resultSet1 = st1.executeQuery("select * from TWO_MIN_INTERVAL where USERNAME='"+ gusername +"' AND SESSION_NUM=2");
    resultSet2 = st2.executeQuery("select * from TOTAL where USERNAME='"+ gusername +"' AND SESSION_NUM=1");
    resultSet3 = st3.executeQuery("select * from TOTAL where USERNAME='"+ gusername +"' AND SESSION_NUM=2");
    resultSet4 = st4.executeQuery("select * from TOTAL2 where USERNAME='"+ gusername +"'");
    resultSet5 = st5.executeQuery("select * from U_INFO where USERNAME='"+ gusername +"'");
    

    ResultSetMetaData rsmd = resultSet.getMetaData(); // obtaining metadata
    ResultSetMetaData rsmd1 = resultSet1.getMetaData();
    ResultSetMetaData rsmd2 = resultSet2.getMetaData();
    ResultSetMetaData rsmd3 = resultSet3.getMetaData();
    ResultSetMetaData rsmd4 = resultSet4.getMetaData();
    ResultSetMetaData rsmd5 = resultSet5.getMetaData();
    int colCount = rsmd.getColumnCount(); // counting columns
    int colCount1 = rsmd1.getColumnCount();
    int colCount2 = rsmd2.getColumnCount();
    int colCount3 = rsmd3.getColumnCount();
    int colCount4 = rsmd4.getColumnCount();
    int colCount5 = rsmd5.getColumnCount();

    while (resultSet.next()) { // while not at the end of the resultset
      Element row1= doc.createElement("Row1"); // create child element Row1
      results.appendChild(row1); // add element to parent element
      for (int i = 1; i <= colCount; i++) { // scan through rows
        String columnName = rsmd.getColumnName(i); // get column name
        Object value = resultSet.getObject(i); // get column value
        Element node = doc.createElement(columnName); // create node
        node.appendChild(doc.createTextNode(value.toString())); // add node to element
        row1.appendChild(node); // add row1 data to element
      }
    }
    while (resultSet1.next()) { // repeat previous method
      Element row2= doc.createElement("Row2");
      results.appendChild(row2);
      for (int i = 1; i <= colCount1; i++) {
        String columnName = rsmd1.getColumnName(i);
        Object value = resultSet1.getObject(i);
        Element node = doc.createElement(columnName);
        node.appendChild(doc.createTextNode(value.toString()));
        row2.appendChild(node);
      }
    }
    while (resultSet2.next()) {
      Element row3= doc.createElement("Row3");
      results.appendChild(row3);
      for (int i = 1; i <= colCount2; i++) {
        String columnName = rsmd2.getColumnName(i);
        Object value = resultSet2.getObject(i);
        Element node = doc.createElement(columnName);
        node.appendChild(doc.createTextNode(value.toString()));
        row3.appendChild(node);
      }
    }
    while (resultSet3.next()) {
      Element row4= doc.createElement("Row4");
      results.appendChild(row4);
      for (int i = 1; i <= colCount3; i++) {
        String columnName = rsmd3.getColumnName(i);
        Object value = resultSet3.getObject(i);
        Element node = doc.createElement(columnName);
        node.appendChild(doc.createTextNode(value.toString()));
        row4.appendChild(node);
      }
    }
    while (resultSet4.next()) {
      Element row5= doc.createElement("Row5");
      results.appendChild(row5);
      for (int i = 1; i <= colCount4; i++) {
        String columnName = rsmd4.getColumnName(i);
        Object value = resultSet4.getObject(i);
        Element node = doc.createElement(columnName);
        node.appendChild(doc.createTextNode(value.toString()));
        row5.appendChild(node);
      }
    }
    while (resultSet5.next()) {
      Element row6= doc.createElement("Row6");
      results.appendChild(row6);
      for (int i = 1; i <= colCount5; i++) {
        String columnName = rsmd5.getColumnName(i);
        Object value = resultSet5.getObject(i);
        Element node = doc.createElement(columnName);
        node.appendChild(doc.createTextNode(value.toString()));
        row6.appendChild(node);
      }
    }
    DOMSource domSource = new DOMSource(doc);
    TransformerFactory tf = TransformerFactory.newInstance(); // create tranformer 
    Transformer transformer = tf.newTransformer();
    transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes"); // set output type/structure
    transformer.setOutputProperty(OutputKeys.METHOD, "xml");
    transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");

    File sw = new File("C:/Users/Colm/Documents/Final Year Project/reports/DataSet6.xml");
    StreamResult sr = new StreamResult(sw); // write data to file
    transformer.transform(domSource, sr);

    con.close(); // close connections
    resultSet.close();
    resultSet1.close();
    resultSet2.close();
    resultSet3.close();
    resultSet4.close();
    resultSet5.close();
    
    BufferedReader br = new BufferedReader(new FileReader(sw));
    String line;
    StringBuilder sb = new StringBuilder();

    while((line=br.readLine())!= null){
        sb.append(line.trim());
    }
  }
}