import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NewJDBC {
		static Connection conn = null;
	
		public static void Connection() throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","CRIMINALRECORDMANAGMENT","9890165032");
		
	}

}
