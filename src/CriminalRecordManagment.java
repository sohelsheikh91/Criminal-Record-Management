import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class CriminalRecordManagment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn=null; 
		conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","CRIMINALRECORDMANAGMENT","9890165032");
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
//		
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

}
