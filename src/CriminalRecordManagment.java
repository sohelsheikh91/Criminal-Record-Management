import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriminalRecordManagment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=null; 
		conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","5545");
		if(conn!=null) {
			System.out.println("The Connection has established successfully");
		}
		else
			System.out.println("Not connected");
		conn.close();

	}

}
