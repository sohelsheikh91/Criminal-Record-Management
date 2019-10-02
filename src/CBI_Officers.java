import java.sql.SQLException;
import java.util.Scanner;

public class CBI_Officers {
	
	public static void CBI() throws ClassNotFoundException, SQLException {
	Scanner in = new Scanner(System.in);
		try {
			View v1 = new View();
			
			v1.select();
		}catch(SQLException e){
			
			System.out.println("Invalid Input");
			
		}
		
	}
	
}
