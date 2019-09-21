import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert extends NewJDBC{

public void Details () throws SQLException, ClassNotFoundException {
		
		NewJDBC.Connection();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter Criminal Details");
		
		System.out.print("Enter Criminal name : ");
		String Name = in.nextLine();

		System.out.print("Enter Type of Criminal :");
		String Type = in.nextLine();

		System.out.println("Please Enter Crime Detail :");
		String Cdetail = in.nextLine();
		
		System.out.println("Please Enter Blood Group :");
		String BG = in.nextLine();
		
		System.out.println("Please Enter DNA :");
		String DNA = in.nextLine();
		
		System.out.println("Please Enter Health :");
		String Health = in.nextLine();
		
		System.out.println("Please Enter PUNISHMENT :");
		String Pu = in.nextLine();

		Statement st = conn.createStatement();
		PreparedStatement mystr=null;
		
		try {
			
			ResultSet s = st.executeQuery("select max(criminalID) from criminaldetails");
			s.next();
			int Max = s.getInt(1);
			
			++Max;
			
			String sql = "insert into criminaldetails  values(?,?,?,?,?,?,?,?,sysdate)";

			mystr = conn.prepareStatement(sql);
			mystr.setInt(1,Max);
			mystr.setString(2,Name);
			mystr.setString(3,Type);
			mystr.setString(4,Cdetail);
			mystr.setString(5,BG);
			mystr.setString(6,DNA);
			mystr.setString(7,Health);
			mystr.setString(8,Pu);
			
			mystr.executeUpdate();
			
			System.out.println();
			conn.close();	
		}
		catch(Exception e)
		{
			
			System.out.println("Got an Exception");
			
		}
		finally
		{
			if (mystr != null) {
				mystr.close();
			}

			if (in != null) {
				in.close();
			}

			if (conn != null) {
				conn.close();
			}

		


	}

	}

public void location () throws ClassNotFoundException, SQLException {
	
	NewJDBC.Connection();
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Please Enter Criminals Location Details");
	
	System.out.print("Enter Cell No : ");
	int cellno = in.nextInt();

	System.out.print("Enter Jail Name :");
	String jailname = in.nextLine();

	System.out.println("Enter Criminal ID :");
	int ID = in.nextInt();
	
	//Statement st = conn.createStatement();
	PreparedStatement mystr=null;
	
	try 
	{
		
		
		String sql = "insert into criminallocations values(?,?,?)";

		mystr = conn.prepareStatement(sql);
		mystr.setInt(1,cellno);
		mystr.setString(2,jailname);
		mystr.setInt(3,ID);
		
		mystr.executeUpdate();
		
		System.out.println();
		conn.close();	
		in.close();
		
	}
	catch(Exception e)
	{
		System.out.println("Got an Exception");
	}
	
}

public void meetings() throws ClassNotFoundException, SQLException {

	NewJDBC.Connection();
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Please Enter Outsider  Details");
	
	
	System.out.print("Enter Cell No : ");
	String name = in.nextLine();

	System.out.print("Enter Jail Name :");
	int criminalID = in.nextInt();


	
	Statement st = conn.createStatement();
	PreparedStatement mystr=null;
	
	try 
	{
		ResultSet s = st.executeQuery("select max(srno) from criminalmeetings");
		
		s.next();
		
		int srno = s.getInt(1);
	
		String sql = "insert into criminalmeetings values(?,?,?,sysdate)";

		mystr = conn.prepareStatement(sql);
		
		mystr.setInt(1,srno);
		mystr.setString(2,name);
		mystr.setInt(3,criminalID);
		
		mystr.executeUpdate();
		
		System.out.println();
		conn.close();	
		in.close();
		
	}
	catch(Exception e)
	{
		System.out.println("Got an Exception");
	}
}

public void punishment() throws ClassNotFoundException, SQLException {

		NewJDBC.Connection();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter punishment in years");
		
		
		System.out.print("Enter Cell No : ");
		String name = in.nextLine();

		System.out.print("Enter Jail Name :");
		int criminalID = in.nextInt();


		
		Statement st = conn.createStatement();
		PreparedStatement mystr=null;
		
		try 
		{
			ResultSet s = st.executeQuery("select max(srno) from criminalmeetings");
			
			s.next();
			
			int srno = s.getInt(1);
		
			String sql = "insert into criminalmeetings values(?,?,?,sysdate)";

			mystr = conn.prepareStatement(sql);
			
			mystr.setInt(1,srno);
			mystr.setString(2,name);
			mystr.setInt(3,criminalID);
			
			mystr.executeUpdate();
			
			System.out.println();
			conn.close();	
			in.close();
			
		}
		catch(Exception e)
		{
			System.out.println("Got an Exception");
		}
			
}
	
}
