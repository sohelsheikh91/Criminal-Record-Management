import java.sql.SQLException;
import java.util.Scanner;

public class Registration {
	
	public void signup() throws ClassNotFoundException, SQLException {
		
		NewJDBC.Connection();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Criminal Record Managment");
		
		System.out.print("Enter Name :");
		String Name = in.nextLine();

		System.out.print("Enter Usename :");
		String user = in.nextLine();

		System.out.println("Please Password :");
		String Pass = in.nextLine();
		
		System.out.println("Please job Profile :");
		String Job = in.nextLine();
	}
}
