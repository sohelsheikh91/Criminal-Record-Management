import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NewJDBC {
		static Connection conn = null;
	
		public static void Connection() throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","CRIMINALRECORDMANAGMENT","9890165032");
		
//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "5545");
//		if(conn!=null) {
//			System.out.println("Connected");
////			Statement st = conn.createStatement();
////			st.executeUpdate("CREATE TABLE sohel{ID NUMBER;"
////					+ "}");
//		}
//		else
//			System.out.println("Notconnected");
//		conn.close();
	}

}
