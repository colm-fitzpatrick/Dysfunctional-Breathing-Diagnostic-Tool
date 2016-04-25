package fyp;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;

import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class respiratorytest4 extends JFrame implements SerialPortEventListener {

 private TimeSeriesCollection timeSeriesCollection; // Collection of time series data
 private XYDataset xyDataset; // dataset that will be used for the chart
 private TimeSeries seriesX; // X series data
 private TimeSeries seriesY; // Y series data
 
 private BufferedReader input; // input reader
 private OutputStream output; //output reader
 private SerialPort serialPort; // serial port object
 public float data1; // variables for use in the analysis function
 public float data2;
 public static int etco2count = 0;
 public static String gusername;
 public static respiratorytest4 rchart;
 public static JFreeChart chart;
 public static int a = 0;
 public static int b = 0;
 public static int c = 1;
 public static int d;
 public static double average;
 public static double temp = 2;
 public static Connection conn;
 public static PreparedStatement stmt = null;
 public static PreparedStatement stmt3 = null;
 public static PreparedStatement stmt4 = null;
 public static PreparedStatement stmt5 = null;
 public static int count=0;
 public static int [] ccc = new int[10];
 public static String filename = "";
 public static String filename2="";
 //public static float chestA[];
 //public static float abdominalA[];
 public static float[] chestA = new float[9000];
 public static float[] abdominalA = new float[9000];
 public static float[] etco2 = new float[10];
 public static float etco2Total;
 
 public static float[] higha = new float[9000];
 public static float[] lowa = new float[9000];
 public static float [] higha2;
 public static float [] lowa2;
 public static float [] highAbdominal;
 public static float [] lowAbdominal;
 
 public static float[] highc = new float[9000];
 public static float[] lowc = new float[9000];
 public static float[] highc2;
 public static float[] lowc2;
 public static float [] highChest;
 public static float [] lowChest;

 //public static float [] highc3;
 ///public static float [] lowc3;
 public static float [] chestDiff;
 public static float [] abdominalDiff;
 public static float totalChest;
 public static float totalAbdominal;
 public static float totalDiff;
 
 public static float [] timea = new float[9000];
 public static float [] timec = new float[9000];
 public static float [] timea2;
 public static float [] timec2;
 public static float [] chestTime;
 public static float [] abdominalTime;
 public static float [] middleTime;
 public static float [] each_b_diff;
 
 public static float [] aintervalTotal = new float[10];
 public static float [] cintervalTotal = new float[10];
 public static float [] intervalOverall = new float[10];
 
 public static int cc1=0;
 public static int cc2=0;
 public static int cc3=0;
 public static int cc4=0;
 public static int cc5=0;
 
 public static int ac1=0;
 public static int ac2=0;
 public static int ac3=0;
 public static int ac4=0;
 public static int ac5=0;
 
 public static int result2;
 public static int result=0;
 public static int result3;
 public static String sql;
 public static String sql2;
 public static float rr;
 
private static final String PORT_NAMES[] = { // RXTX ports used in windows, mac os and linux
    "/dev/tty.usbserial-A9007UX1", // Mac OS X
    "/dev/ttyUSB0", // Linux
    "COM3", // Windows
};
 
public static void visibility(){ // set chart visable
    rchart.setVisible(false);
    rchart.setVisible(true);
}

public static void analysedata1() throws SQLException, IOException, Exception{ // function to analyse collected respiratory data
    int in=0; // declaring variables
    int out=0;
    int rr1=0;
    int rr2=0;
    int count1 = 0;
    int count2 = 0;
    float count3;
    int e=0;
    float max = 0;
    float min = 2000;
    for(c=0;c<abdominalA.length;c++){ // scanning through abdominal data collected
        if (abdominalA[c]<max){ // if value is smaller than max
                count1 = count1 + 1; // add to counter
                if(count1>15){ // if no bigger value is found for 1.5 seconds 
                    in = 1; // inhalation is complete
                }
        }
        else {
            max = abdominalA[c];
        }
        if (abdominalA[c]>min){ // if value is bigger than min
                count2 = count2 + 1; // add to counter
                if(count2>15){ // if no smaller value found for 1.5 seconds 
                    out = 1; // exhale complete
                }
        }
        else{
            min = abdominalA[c];
        }
        if(in>0 && out>0){ // if both inhale and exhale are complete
            higha[e] = max; // store respiratory peaks
            lowa[e] = min;
            count3 = (c/10);
            timea[e] = count3; // store time of breath
            e = e + 1;
            rr1 = rr1 + 1; // add to respiratory rate
            in = 0; // reset variables
            out = 0;
            max = 0;
            min = 2000;
            count1=0;
            count2=0;
        }
    }
    count1 = 0;
    count2 = 0;
    count3 = 0;
    max = 0;
    min= 2000;
    in = 0;
    out = 0;
    e = 0;
    for(c=0;c<chestA.length;c++){ // repeat same method for chest data
        if (chestA[c]<max){
                count1 = count1 + 1;
                if(count1>15){
                    in = 1;
                }
        }
        else {
            max = chestA[c];
        }
        if (chestA[c]>min){
                count2 = count2 + 1;
                if(count2>15){
                    out = 1;
                }
        }
        else{
            min = chestA[c];
        }
        if(in>0 && out>0){
            highc[e] = max;
            lowc[e] = min;
            count3 = (c/10);
            timec[e] = count3;
            e = e + 1;
            rr2 = rr2 + 1;
            in = 0;
            out = 0;
            max = 0;
            min = 2000;
            count1=0;
            count2=0;
        }
    }
    
    int var1 = 0;
    for( int var2=0;  var2<higha.length;  var2++ ) // copying values from peak value arrays to remove null data
    {
        if (higha[var2] != 0)
            higha[var1++] = higha[var2];
    }
    higha2 = new float[var1];
    System.arraycopy( higha, 0, higha2, 0, var1 );
    
    var1 = 0;
    for( int var2=0;  var2<lowa.length;  var2++ )
    {
        if (lowa[var2] != 0)
            lowa[var1++] = lowa[var2];
    }
    lowa2 = new float[var1];
    System.arraycopy( lowa, 0, lowa2, 0, var1 );
    
    var1 = 0;
    for( int var2=0;  var2<highc.length;  var2++ )
    {
        if (highc[var2] != 0)
            highc[var1++] = highc[var2];
    }
    highc2 = new float[var1];
    System.arraycopy( highc, 0, highc2, 0, var1 );
    
    var1 = 0;
    for( int var2=0;  var2<lowc.length;  var2++ )
    {
        if (lowc[var2] != 0)
            lowc[var1++] = lowc[var2];
    }
    lowc2 = new float[var1];
    System.arraycopy( lowc, 0, lowc2, 0, var1 );
    
    var1 = 0;
    for( int var2=0;  var2<timea.length;  var2++ )
    {
        if (timea[var2] != 0)
            timea[var1++] = timea[var2];
    }
    timea2 = new float[var1];
    System.arraycopy( timea, 0, timea2, 0, var1 );
    
    var1 = 0;
    for( int var2=0;  var2<timec.length;  var2++ )
    {
        if (timec[var2] != 0)
            timec[var1++] = timec[var2];
    }
    timec2 = new float[var1];
    System.arraycopy( timec, 0, timec2, 0, var1 );
    
    if(higha2.length>highc2.length){  // copying contents of arrays to remove inconsistent RR values
        highAbdominal = new float[highc2.length];
        lowAbdominal = new float[highc2.length];
        highChest = new float[highc2.length];
        lowChest = new float[highc2.length];
        chestTime = new float[highc2.length];
        abdominalTime = new float[highc2.length];
        for(int i=0;i<highc2.length;i++){
            highAbdominal[i] = higha2[i];
            lowAbdominal[i] = lowa2[i];
            highChest[i] = highc2[i];
            lowChest[i] = lowc2[i];
            chestTime[i] = timec2[i];
            abdominalTime[i] = timea2[i];
        }
    }
    else if(highc2.length>higha2.length){
        highAbdominal = new float[higha2.length];
        lowAbdominal = new float[higha2.length];
        highChest = new float[higha2.length];
        lowChest = new float[higha2.length];
        chestTime = new float[higha2.length];
        abdominalTime = new float[higha2.length];
        for(int i=0;i<higha2.length;i++){
            highAbdominal[i] = higha2[i];
            lowAbdominal[i] = lowa2[i];
            highChest[i] = highc2[i];
            lowChest[i] = lowc2[i];
            chestTime[i] = timec2[i];
            abdominalTime[i] = timea2[i];
        }
    }
    else{
        highAbdominal = new float[higha2.length];
        lowAbdominal = new float[higha2.length];
        highChest = new float[higha2.length];
        lowChest = new float[higha2.length];
        chestTime = new float[higha2.length];
        abdominalTime = new float[higha2.length];
        for(int i=0;i<higha2.length;i++){
            highAbdominal[i] = higha2[i];
            lowAbdominal[i] = lowa2[i];
            highChest[i] = highc2[i];
            lowChest[i] = lowc2[i];
            chestTime[i] = timec2[i];
            abdominalTime[i] = timea2[i];
        } 
    }
    middleTime = new float[chestTime.length]; // calculating times for each breath taken
    for(int i=0;i<chestTime.length;i++){
        float temp = 0;
        if(chestTime[i] > abdominalTime[i]){
            temp = chestTime[i] - abdominalTime[i];
            temp = temp/2;
            middleTime[i] = abdominalTime[i] + temp;
        }
        else if (abdominalTime[i] > chestTime[i]){
            temp = abdominalTime[i] - chestTime[i];
            temp = temp/2;
            middleTime[i] = chestTime[i] + temp;
        }
        else {
            middleTime[i] = chestTime[i];
        }
    }
    
    chestDiff = new float[highChest.length];
    abdominalDiff = new float[highAbdominal.length];
    each_b_diff = new float[highChest.length];
    for(int f=0;f<highChest.length;f++){ // calculating differnce between chest and abdominal peaks
        chestDiff[f] = highChest[f]-lowChest[f];
        abdominalDiff[f] = highAbdominal[f]-lowAbdominal[f];
        if(abdominalDiff[f] > chestDiff[f]){
            each_b_diff[f] = abdominalDiff[f]-chestDiff[f];
        }
        else {
            each_b_diff[f] = chestDiff[f]-abdominalDiff[f]; // getting difference between chest and abdominal expansion
        }
    }
    
    for(int i=0;i<middleTime.length;i++){ // calculating one minute interval data
        if(middleTime[i]>=300 && middleTime[i]<360){
            cc1 = cc1 + 1;
           cintervalTotal[0] = cintervalTotal[0] + chestDiff[i];
           aintervalTotal[0] = aintervalTotal[0] + abdominalDiff[i];
        }
        if(middleTime[i]>=360 && middleTime[i]<420){
           cc2 = cc2 + 1;
           cintervalTotal[1] = cintervalTotal[1] + chestDiff[i];
           aintervalTotal[1] = aintervalTotal[1] + abdominalDiff[i];
        }
        if(middleTime[i]>=420 && middleTime[i]<480){
           cc3 = cc3 + 1;
           cintervalTotal[2] = cintervalTotal[2] + chestDiff[i];
           aintervalTotal[2] = aintervalTotal[2] + abdominalDiff[i];
        }
        if(middleTime[i]>=480 && middleTime[i]<540){
           cc4 = cc4 + 1;
           cintervalTotal[3] = cintervalTotal[3] + chestDiff[i];
           aintervalTotal[3] = aintervalTotal[3] + abdominalDiff[i];
        }
        if(middleTime[i]>=540 && middleTime[i]<=600){
           cc5 = cc5 + 1;
           cintervalTotal[4] = cintervalTotal[4] + chestDiff[i];
           aintervalTotal[4] = aintervalTotal[4] + abdominalDiff[i];
        }
        if(middleTime[i]>=600 && middleTime[i]<660){
            cc1 = cc1 + 1;
           cintervalTotal[5] = cintervalTotal[5] + chestDiff[i];
           aintervalTotal[5] = aintervalTotal[5] + abdominalDiff[i];
        }
        if(middleTime[i]>=660 && middleTime[i]<720){
           cc2 = cc2 + 1;
           cintervalTotal[6] = cintervalTotal[6] + chestDiff[i];
           aintervalTotal[6] = aintervalTotal[6] + abdominalDiff[i];
        }
        if(middleTime[i]>=720 && middleTime[i]<780){
           cc3 = cc3 + 1;
           cintervalTotal[7] = cintervalTotal[7] + chestDiff[i];
           aintervalTotal[7] = aintervalTotal[7] + abdominalDiff[i];
        }
        if(middleTime[i]>=780 && middleTime[i]<840){
           cc4 = cc4 + 1;
           cintervalTotal[8] = cintervalTotal[8] + chestDiff[i];
           aintervalTotal[8] = aintervalTotal[8] + abdominalDiff[i];
        }
        if(middleTime[i]>=840 && middleTime[i]<=900){
           cc5 = cc5 + 1;
           cintervalTotal[9] = cintervalTotal[9] + chestDiff[i];
           aintervalTotal[9] = aintervalTotal[9] + abdominalDiff[i];
        }
    }
    
    ccc[0] = cc1;
    ccc[1] = cc2;
    ccc[2] = cc3;
    ccc[3] = cc4;
    ccc[4] = cc5;
    ccc[5] = cc1;
    ccc[6] = cc2;
    ccc[7] = cc3;
    ccc[8] = cc4;
    ccc[9] = cc5;
    
    int cccTotal = ccc[0] + ccc[1] + ccc[2] + ccc[3] + ccc[4] + ccc[5] + ccc[6] + ccc[7] + ccc[8] + ccc[9];
    
    for(int i=0;i<cintervalTotal.length;i++){ // calculating interval and overall averages
        cintervalTotal[i] = cintervalTotal[i]/ccc[i];
        aintervalTotal[i] = aintervalTotal[i]/ccc[i];
        totalChest = totalChest + cintervalTotal[i];
        totalAbdominal = totalAbdominal + aintervalTotal[i];
    }
    
    for(int i=0;i<cintervalTotal.length;i++){ // calculating over interval differences 
        if(cintervalTotal[i] > aintervalTotal[i]){
            intervalOverall[i] = cintervalTotal[i] - aintervalTotal[i];
        }
        else {
            intervalOverall[i] = aintervalTotal[i] - cintervalTotal[i];
        }
    }
    
    totalChest = totalChest/cccTotal;
    totalAbdominal = totalAbdominal/cccTotal;
    
    if (totalChest > totalAbdominal){ // getting absolute difference
        totalDiff = totalChest - totalAbdominal;
    }
    else {
        totalDiff = totalAbdominal - totalChest;
    }
    
    if(result3==0){ // if no etco2 value is entered in registration form
        int num;
        for(int i =0;i<10;i++){
            num = i + 1;
            etco2[i] = Float.parseFloat(JOptionPane.showInputDialog("Enter ETCO2 minite " + num + " value : ")); // get user input
        } 
    }
    
    if(result3 == 0){ // getting average etco2 value
        int etco2count = 0;
        for(int i=0;i<etco2.length;i++){
            etco2count = etco2count + 1;
            etco2Total = etco2Total + etco2[i];
        }
        etco2Total = etco2Total/etco2count;
    }
    else {
        etco2Total = result3;
        for(int i=0;i<etco2.length;i++){
            etco2[i] = result3;
        }
    }
    
    for(int i=0;i<ccc.length;i++){ // calculating respiratory rate
        rr= rr + ccc[i];
    }
    rr = rr/10;
    
    addsql();
}

public static void addsql() throws SQLException, IOException, Exception{ // method for inserting each breath data
    
    conn = DBman.main();
    StringBuffer sq = new StringBuffer();
    float temp, percentdiff=0;
    java.util.Date utilDate = new java.util.Date(); // get current date and convert to sql format
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    
    sq.append ("INSERT INTO EACH_BREATH"); // creating sql statment
    sq.append("(USERNAME, SESSION_NUM, SESSION_DATE, SECONDS, CHEST_DIFF, ABDOMINAL_DIFF, OVERALL_DIFF) ");
    sq.append("VALUES ( ");
    sq.append("?, ?, ?, ?, ?, ?, ?");
    sq.append(")");

    for(a=0;a<each_b_diff.length;a++){
        System.out.println("Creating statement...");
        percentdiff = (each_b_diff[a]/((chestDiff[a]+abdominalDiff[a])/2)); // calculating percentage difference
        percentdiff = percentdiff * 100;
        try {
            stmt = conn.prepareStatement(sq.toString()); // inserting values into prepaired statement
            stmt.setString(1, gusername);
            stmt.setInt(2, result2);
            stmt.setDate(3, sqlDate);
            stmt.setFloat(4, middleTime[a]);
            stmt.setFloat(5, chestDiff[a]);
            stmt.setFloat(6, abdominalDiff[a]);
            stmt.setFloat(7, percentdiff);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       try {
            stmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
              //STEP 6: Clean-up environment
       try {
            stmt.close();
        } catch (SQLException e) {
        }
        
    }
    conn.close();
    addsql2();
}

public static void addsql2() throws SQLException, IOException, Exception{ // method for inserting interval data
    
    conn = DBman.main();
    StringBuffer sq = new StringBuffer();
    float temp, percentdiff=0;
    int inumber = 0;
    java.util.Date utilDate = new java.util.Date();
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    
    sq.append ("INSERT INTO TWO_MIN_INTERVAL");
    sq.append("(USERNAME, SESSION_NUM, SESSION_DATE, I_NUMBER, CHEST_DIFF, ABDOMINAL_DIFF, OVERALL_DIFF, ETCO, RR) ");
    sq.append("VALUES ( ");
    sq.append("?, ?, ?, ?, ?, ?, ?, ?, ?");
    sq.append(")");

    for(int a=0;a<intervalOverall.length;a++){
        System.out.println("Creating statement...");
        percentdiff = (intervalOverall[a]/((cintervalTotal[a]+aintervalTotal[a])/2));
        percentdiff = percentdiff * 100;
        inumber = a + 1;
        try {
            stmt3 = conn.prepareStatement(sq.toString());
            stmt3.setString(1, gusername);
            stmt3.setInt(2, result2);
            stmt3.setDate(3, sqlDate);
            stmt3.setInt(4, inumber);
            stmt3.setFloat(5, cintervalTotal[a]);
            stmt3.setFloat(6, aintervalTotal[a]);
            stmt3.setFloat(7, percentdiff);
            stmt3.setFloat(8, etco2[a]);
            stmt3.setFloat(9, ccc[a]);
        } catch (SQLException e) {
            e.printStackTrace();
        }
       try {
            stmt3.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
       try {
            stmt3.close();
        } catch (SQLException e) {
        }
        
    }
    conn.close();
    addsql3();
}

public static void addsql3() throws SQLException, IOException, Exception{ // method to insert session total data
    
    conn = DBman.main();
    StringBuffer sq = new StringBuffer();
    float temp, percentdiff=0;
    int inumber = 0;
    java.util.Date utilDate = new java.util.Date();
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    
    sq.append ("INSERT INTO TOTAL");
    sq.append("(USERNAME, SESSION_NUM, SESSION_DATE, CHEST_DIFF, ABDOMINAL_DIFF, OVERALL_DIFF, ETCO, RR) ");
    sq.append("VALUES ( ");
    sq.append("?, ?, ?, ?, ?, ?, ?, ?");
    sq.append(")");
    
    percentdiff = (totalDiff/((totalChest+totalAbdominal)/2));
    percentdiff = percentdiff * 100;


    System.out.println("Creating statement...");
    try {
        stmt4 = conn.prepareStatement(sq.toString());
        stmt4.setString(1, gusername);
        stmt4.setInt(2, result2);
        stmt4.setDate(3, sqlDate);
        stmt4.setFloat(4, totalChest);
        stmt4.setFloat(5, totalAbdominal);
        stmt4.setFloat(6, percentdiff);
        stmt4.setFloat(7, etco2Total);
        stmt4.setFloat(8, rr);
    } catch (SQLException e) {
        e.printStackTrace();
    }
   try {
        stmt4.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
   try {
        stmt4.close();
    } catch (SQLException e) {
    }

    conn.close();
    
    if(result2 ==2){ // if it is the second session
        addsql4();
    }
    else { // else generate report
        String sess1 = "Session1";
        String sess2 = "";
        report.main(gusername, sess1,sess2, filename2);
    }
}

public static void addsql4() throws SQLException, IOException, Exception{ // method to add session comparison data to database
    
    conn = DBman.main();
    StringBuffer sq = new StringBuffer();
    int nscore1=0,nscore2=0, nscore=0;
    float temp, s1rr=0, s1etco=0,s1chest=0, s1ab=0, s1overall=0, s2chest=0,s2etco=0 ,s2ab=0, s2overall=0,s2rr=0, chest=0, ab=0, overall=0,rr=0,etco=0,percentdiff=0;
    int inumber = 0;
    Statement stmt6 = null;
    Statement stmt7 = null, stmt8=null,stmt9=null;
    ResultSet rs, rs2, rs3, rs4;
    String sql3, sql4;
    java.util.Date utilDate = new java.util.Date();
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
    
    sql = "SELECT * FROM TOTAL WHERE USERNAME ='" + gusername + "' AND SESSION_NUM = 1"; // creating statements
    sql2 = "SELECT * FROM TOTAL WHERE USERNAME ='" + gusername + "' AND SESSION_NUM = 2";
    sql3 = "SELECT * FROM N_SCORE WHERE USERNAME ='" + gusername + "' AND TEST_NUMBER = 1";
    sql4 = "SELECT * FROM N_SCORE WHERE USERNAME ='" + gusername + "' AND TEST_NUMBER = 2";
    
    try {
        stmt6 = conn.createStatement();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    try {
        rs = stmt6.executeQuery(sql); // retreiving session one total data
        rs.next();
        s1chest = rs.getFloat("CHEST_DIFF");
        s1ab = rs.getFloat("ABDOMINAL_DIFF");
        s1overall = rs.getFloat("OVERALL_DIFF");
        s1rr = rs.getFloat("RR");
        s1etco = rs.getFloat("ETCO");
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    try {
        stmt7 = conn.createStatement();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    try {
        rs2 = stmt7.executeQuery(sql2); // retrieveing session two total data
        rs2.next();
        s2chest = rs2.getFloat("CHEST_DIFF");
        s2ab = rs2.getFloat("ABDOMINAL_DIFF");
        s2overall = rs2.getFloat("OVERALL_DIFF");
        s2rr = rs2.getFloat("RR");
        s2etco = rs2.getFloat("ETCO");
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    try {
        stmt8 = conn.createStatement();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    try {
        rs3 = stmt8.executeQuery(sql3); // getting session one NQ score
        rs3.next();
        nscore1 = rs3.getInt("SCORE");
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    try {
        stmt9 = conn.createStatement();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    try {
        rs4 = stmt9.executeQuery(sql4); // getting session two NQ score
        rs4.next();
        nscore2 = rs4.getInt("SCORE");
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    nscore = nscore1 - nscore2; // finding differences between values
    
    chest = s1chest - s2chest;  
    ab = s1ab - s2ab;
    overall = s1overall - s2overall;
    rr = s1rr - s2rr;
    etco = s1etco - s2etco;
    float diff = chest - ab;
    
    percentdiff = (diff/((chest+ab)/2)); // getting percentage difference
    percentdiff = percentdiff * 100;
    
    
    sq.append ("INSERT INTO TOTAL2");
    sq.append("(USERNAME, CHEST_DIFF, ABDOMINAL_DIFF, OVERALL_DIFF, RR, ETCO, NSCORE) ");
    sq.append("VALUES ( ");
    sq.append("?, ?, ?, ?, ?, ?, ?");
    sq.append(")");


    System.out.println("Creating statement...");
    try {
        stmt5 = conn.prepareStatement(sq.toString());
        stmt5.setString(1, gusername);
        stmt5.setFloat(2, chest);
        stmt5.setFloat(3, ab);
        stmt5.setFloat(4, percentdiff);
        stmt5.setFloat(5, rr);
        stmt5.setFloat(6, etco);
        stmt5.setFloat(7, nscore);
    } catch (SQLException e) {
        e.printStackTrace();
    }
   try {
        stmt5.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
   try {
        stmt5.close();
    } catch (SQLException e) {
    }

    conn.close();
    
    String sess1 = "Session1"; // generate report
    String sess2 = "Final";
    report.main(gusername, sess1,sess2, filename2);
}

public respiratorytest4(String title) {
  super(title);
  
  initializeSerial(); // connect to arduino through serial port
  float chestA[];
  float abdominalA[];
  timeSeriesCollection = new TimeSeriesCollection(); // creating timeSeriesCollection object to hold datasets
  seriesX = new TimeSeries("Chest Data");
  seriesY = new TimeSeries("Abdominal Data");
  
  timeSeriesCollection.addSeries(seriesX); // adding datasets to timeSeriesCollection
  timeSeriesCollection.addSeries(seriesY); 
  
  chart = createChart(); // creating chart
  ChartPanel chartPanel = new ChartPanel(chart); // creating chart panel
  chartPanel.setFillZoomRectangle(true);
  chartPanel.setMouseWheelEnabled(true);
  chartPanel.setPreferredSize(new java.awt.Dimension(1000,500));
  setContentPane(chartPanel);
 }

@Override
public synchronized void serialEvent(SerialPortEvent event) { // run when new data is available on the connected port
    if(event.getEventType() == SerialPortEvent.DATA_AVAILABLE)
    {
        try
        {
            String inputLine = input.readLine(); // read data
            Pattern pattern = Pattern.compile("[a-zA-Z]+");
            Matcher matcher, matcher2;
            StringBuffer sq = new StringBuffer();
            java.util.Date utilDate = new java.util.Date();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            if(inputLine.length()>0){
                
                String [] inputValues = inputLine.split(","); // split data by comma
                
                if(inputValues.length>1 && inputValues[0].length()>0 && inputValues[1].length()>0){ // confirm no null values
                    matcher = pattern.matcher(inputValues[0]);
                    matcher2 = pattern.matcher(inputValues[1]);
                    
                    if(!matcher.find() && !matcher2.find()){ // confirm values are numeric
                        data1 = Float.valueOf(inputValues[0]);
                        data2 = Float.valueOf(inputValues[1]);
                        if(data1>0 && data2>0){
                            chestA[b]=data1;
                            abdominalA[b]=data2;
                            b = b + 1;
                            count = count + 1;
                            
                            float in_x = new Float(data1);
                            float in_y = new Float(data2);
                            
                            this.timeSeriesCollection.getSeries(0).add(new Millisecond(),in_x); // add data to dataset
                            this.timeSeriesCollection.getSeries(1).add(new Millisecond(),in_y);
                        }
                    }    
                }
            }
            if (count == 9000){ // if 15 mins has passed 
                JOptionPane.showMessageDialog(null,"You Have Successfully Completed The Test");
                rchart.setVisible(false);
                try{
                    final ChartRenderingInfo info = new ChartRenderingInfo(new StandardEntityCollection()); // get chart rendering info
                    filename = "C:/Users/Colm/Documents/Final Year Project/reports/"+gusername+ "Chart"+ result2 +".PNG";
                    filename2 = "C:/Users/Colm/Documents/Final Year Project/reports/"+gusername+ "Chart";
                    final File file1= new File(filename);
                    ChartUtilities.saveChartAsPNG(file1,chart,600,400,info);// save chart as png file
                }
                catch(Exception e){
            
                }
                
                analysedata1(); // analyse collected respiratory data
                close(); // close connection on serial port
            } 
        }
        catch(Exception ex)
        {
        }
    }
 }
 
 private void initializeSerial() // method to connect to arduino through serial port
 {
  CommPortIdentifier portId = null;
  Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();// store all available ports
  
  while(portEnum.hasMoreElements()) // scan through all ports
  {
   CommPortIdentifier currentPortIdentifier = (CommPortIdentifier)portEnum.nextElement(); // scan through all ports
   for(String portName : PORT_NAMES)// if port is equal to any of the ports stored in variable
   {
    if(currentPortIdentifier.getName().equals(portName))
    {
     portId = currentPortIdentifier; // store port id 
     break;
    }
   }   
  }
  
  if(portId == null)
  {
   //System.out.println("Port not found");
   JOptionPane.showMessageDialog(null,"Port not found. Please check your Ardunio is connected to the computer using a USB");
   respiratorytest.main(gusername);
   return;
  }
  
  try {
   
   serialPort = (SerialPort)portId.open(this.getClass().getName(), 2000); // open port
   serialPort.disableReceiveTimeout(); // set up port options
   serialPort.enableReceiveThreshold(1);
   serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
   
   input = new BufferedReader(new InputStreamReader(serialPort.getInputStream())); // setting up input stream from arduino
   output = serialPort.getOutputStream();// setting up output stream to arduino
   
   serialPort.addEventListener(this);
   serialPort.notifyOnDataAvailable(true); // turn on data availability notifications
   
  } catch (Exception e) {
   System.err.println("Initialization failed : " + e.toString());
  }
 }

 private JFreeChart createChart() {

        JFreeChart chart = ChartFactory.createTimeSeriesChart(
            "Respiratory Test" + result2,  // title
            "Time",             // x-axis label
            "Sensor Value",   // y-axis label
            timeSeriesCollection,            // data
            true,               // create legend
            true,               // generate tooltips
            false               // generate URLs
        );

        chart.setBackgroundPaint(Color.white); // setup options

        XYPlot plot = (XYPlot) chart.getPlot();

        DateAxis axis = (DateAxis) plot.getDomainAxis();
        axis.setAutoRange(true);
        axis.setFixedAutoRange(60000.0);

        return chart;
 }

 public synchronized void close() // close connection on serial port 
 {
  if(serialPort != null)
  {
   serialPort.removeEventListener();
   serialPort.close();
  }
 }
 
 public static void main(String username) { // main method 
    gusername = username;
    conn = DBman.main();
    Statement stmt2 = null, stmt22 = null;
    String sql5;
    sql = "SELECT COUNT(DISTINCT SESSION_NUM) AS rnum FROM EACH_BREATH WHERE USERNAME='"+gusername+"'"; // statment to return session number
    sql5 = "SELECT ETCO FROM U_INFO WHERE USERNAME='"+gusername+"'"; // statement to obtain etco2 value entered during registration
    ResultSet rs, rss;
    try {
        stmt2 = conn.createStatement();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    try {
        rs = stmt2.executeQuery(sql);
        rs.next();
        result2 = rs.getInt("rnum");
        result2 = result2 + 1;
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    
    try {
        stmt22 = conn.createStatement();
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    try {
        rss = stmt22.executeQuery(sql5);
        rss.next();
        result3 = rss.getInt("ETCO");
    } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    rchart = new respiratorytest4("Respiratory Test"); // call constructor
    rchart.pack();
    RefineryUtilities.centerFrameOnScreen(rchart);
    rchart.setVisible(false);
    
    }
}



