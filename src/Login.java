import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login extends NewJDBC {

public static void login() throws ClassNotFoundException, SQLException {

		NewJDBC.Connection();
		
		Scanner in = new Scanner(System.in);
		Boolean run  = true;
		while(run = true) {
		
			try 
			{
			
				run = false;
				
					
				System.out.println("Enter the Username");
				
				String user = in.next();
				
				Statement st = conn.createStatement();
				
				ResultSet s = st.executeQuery("select password from registration where username ="+"'"+user+"'");
				
				System.out.println("Enter the Password");
				
				String pass = in.next();
				
				s.next();
				
				String DBpass = s.getString(1);
				
				System.out.println("Enter the Password");
				
				
				if(DBpass.equals(pass))
				{
					System.out.println("Login Succesuful");
				}
				else 
				{
					System.out.println("Please enter Correct Password"); 
				}
				
			}
			catch(Exception e) {
				e.printStackTrace();
//				System.out.println(" Please Enter Valid Username");
//				run = true;
//				
			}
		}
			in.close();

	}
}