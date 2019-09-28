import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Registration extends NewJDBC  {
	
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
		
		
		Statement st = conn.createStatement();
		PreparedStatement mystr=null;
		try {
			String sql = "insert into registration  values(?,?,?,?,?,?,?,?,sysdate)";
			
			mystr = conn.prepareStatement(sql);
			
			mystr.setString(1,Name);
			mystr.setString(2,user);
			mystr.setString(3,Pass);
			mystr.setString(4,Job);
			mystr.executeQuery();
			
		}
		catch(Exception e){
			
			
		}
	}
}
