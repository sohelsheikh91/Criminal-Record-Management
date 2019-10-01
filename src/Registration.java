import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration extends NewJDBC  {
	
	public static void signup() throws ClassNotFoundException, SQLException {
		
		NewJDBC.Connection();
		Statement st = conn.createStatement();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Criminal Record Managment");
		
		System.out.print("Enter Your Name :");
		String Name = in.nextLine();
		Boolean run  = true;
		
		String user = "";
		try {
		while(run == true) {
			run = false;
			System.out.print("Enter the Usename :");
			user = in.nextLine();
		ResultSet s = st.executeQuery("select username from registration where username ="+"'"+user+"'");

		s.next();
		
		String DBuser = s.getString(1);
		
		
		if(user.equals( DBuser)) {
			
			System.out.println("Username Already Taken");
			run = true;
		}
		
		}}catch(Exception e) {
			//System.out.println("Exception occurred");
			
		}
		
		System.out.println("Please Enter New Password :");
		System.out.println("one uppercase letter , one lowercase letter, special character except" + 
				"space and numbers. ");
		String Pass = in.nextLine();
		
		String Pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,12}$";
		
		
		while(!Pass.matches(Pattern)) {
			System.out.println("Please Enter Password in Specified Format");
			Pass = in.nextLine();
			
		}
		
		System.out.println("Select The JOB Profile\r\n"
				+ "1. Jail Superintendent.\r\n" + 
				"2. Police Officers.\r\n" + 
				"3. CBI Officers.\r\n" + 
				"4. Administrator.\r\n" + 
				"5. Judge\r\n"
				+ "Enter 1 or 2 or 3 or 4 or 5");
		int JobId = in.nextInt();
		String Job = "";
		run  = true;
		while(run == true) {
			run  = false;
		if(JobId ==1 ||JobId ==2||JobId ==3||JobId ==4||JobId ==5) {
		switch(JobId) {
		
			case 1 : Job = "Jailer";
					break;
			case 2 : Job = "Police";
					break;
			case 3 : Job = "CBI";
					break;
			case 4 : Job = "Admin";
					break;
			case 5 : Job = "Judge"; 
					break;
			
			}
		
		}
		else {
			
			System.out.println("Please Enter Valid Option");
			run = true;
			JobId = in.nextInt();
		}
		}
	//	Statement st = conn.createStatement();
		PreparedStatement mystr=null;
		
		try {
			String sql = "insert into registration values(?,?,?,?)";
			
			mystr = conn.prepareStatement(sql);
			
			mystr.setString(1,Name);
			mystr.setString(2,user);
			mystr.setString(3,Pass);
			mystr.setString(4,Job);
			mystr.executeQuery();
			System.out.println("Sucessfully Registred\r\n");
			System.out.println("Do You Want to Login");
			run=true;
			while(run == true) {
			run= false;
			
			System.out.println("Enter Yes or No");
			String str = in.next();
			if(str.toUpperCase()=="YES") {
				
				Login.login();
			
			}
			else if(str.toUpperCase()=="NO") {
				
				System.out.println("Thank You");
			}else {
				System.out.println("Please Enter Valid Option");
			run= true;
			}
			}
		}
		catch(Exception e){
			System.out.println("Please Enter Valid Information");
			
		}
	}
}
