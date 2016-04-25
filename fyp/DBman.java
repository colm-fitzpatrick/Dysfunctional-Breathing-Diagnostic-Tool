package fyp;

import java.sql.*;

/**
 *
 * @author Colm
 */
public class DBman {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
    static final String DB_URL = "FAKE DATABASE URL"; // url to azure VM

    //  Database credentials
    static final String USER = "FAKEUSERNAME";
    static final String PASS = "FAKEPASSWORD";
    
    static Connection conn = null;
    
    
    public static Connection main(){
        
        try {
		Class.forName("oracle.jdbc.driver.OracleDriver"); // find jdbc driver
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

       //STEP 3: Open a connection
       System.out.println("Connecting to database...");
       try {
		conn = DriverManager.getConnection(DB_URL,USER,PASS); // create connection
                System.out.println("Connected!!!");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    return conn; // return connection
    }
}
