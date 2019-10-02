import java.awt.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Insert extends NewJDBC{

public void Details () throws SQLException, ClassNotFoundException {
		
		NewJDBC.Connection();
		
		Scanner in = new Scanner(System.in);

		Boolean run  = true;
		while(run == true) {
		
			try 
			{
				run = false;
				
				System.out.println("Do you want to insert Single Criminal Record Or Multiple");
				System.out.println("Press 1 for Single or Press 2 for Multiple");
				int no = in.nextInt();
				
				
				if( no==1||no==2) {
//					System.out.println("How Many Records You want to enter");
//				
//					int NoRecords = in.nextInt();
					ArrayList<NoOfCriminals> list = new ArrayList<NoOfCriminals>();
					Boolean srun = true;
					while(srun==true) {	
					srun=false;
					
					NoOfCriminals criminal = new NoOfCriminals();
					list.add(criminal);
					
					System.out.println("Please Enter Criminal Details");
					in.nextLine();
					System.out.print("Enter Criminal name : ");
					criminal.setName(in.nextLine());
			
					System.out.print("Enter Type of Criminal :");
					
					criminal.setType(in.nextLine());
			
					System.out.println("Please Enter Crime Detail :");
	
					criminal.setCdetails(in.nextLine());
					
					System.out.println("Please Enter Blood Group :");
					
					criminal.setBG(in.nextLine());
					
					
					System.out.println("Please Enter DNA :");
					
					criminal.setDNA(in.nextLine());
					
					System.out.println("Please Enter Health :");
					
					criminal.setHealth(in.nextLine());
					
					System.out.println("Please Enter PUNISHMENT :");
				
					criminal.setPu(in.nextLine());
					 if(no==2) {
						System.out.println("Do You Want To Add More Record");
						System.out.println("IF Yes Then Press 1 If No Then Any Other Key");
						int tem = in.nextInt();
						if(tem ==1)
							srun =true;
					 }
				}
					
				Statement st = conn.createStatement();
				PreparedStatement mystr=null;
				
				for(int i =0;i< list.size();i++) {
				
				ResultSet s = st.executeQuery("select max(criminalID) from criminaldetails");
				s.next();
				int Max = s.getInt(1);
				
				++Max;
				
				String sql = "insert into criminaldetails  values(?,?,?,?,?,?,?,?,sysdate)";
	
				mystr = conn.prepareStatement(sql);
				mystr.setInt(1,Max);
				mystr.setString(2,list.get(i).getName());
				mystr.setString(3,list.get(i).getType());
				mystr.setString(4,list.get(i).getCdetails());
				mystr.setString(5,list.get(i).getBG());
				mystr.setString(6,list.get(i).getDNA());
				mystr.setString(7,list.get(i).getHealth());
				mystr.setString(8,list.get(i).getPu());
				
				mystr.executeUpdate();
				
				System.out.println();
				}
				conn.close();	
				}
				else {
					System.out.println("Invalid Input Entered");
					run = true;
				}
			}
			
			catch(Exception e)
			{
				
				System.out.println("Invalid Input Please Enter Again");
				run = true;
				
			}
			
	}

	}

public void location () throws ClassNotFoundException, SQLException {
	
	NewJDBC.Connection();
	
	Scanner in = new Scanner(System.in);
	Boolean run = true;
	while(run == true) {
		run=false;
	try {
		
	
	System.out.println("Please Enter Criminals Location Details");
	
	System.out.print("Enter Cell No : ");
	int cellno = in.nextInt();
	
	in.nextLine();
	System.out.print("Enter Jail Name :");
	String jailname = in.nextLine();

	System.out.println("Enter Criminal ID :");
	int ID = in.nextInt();
	
	Statement st = conn.createStatement();
	PreparedStatement mystr=null;
	
		
		String sql = "insert into criminallocation values(?,?,?)";

		mystr = conn.prepareStatement(sql);
		mystr.setInt(1,cellno);
		mystr.setString(2,jailname);
		mystr.setInt(3,ID);
		
		mystr.executeUpdate();
		
		
		
	}catch(SQLException se){
	      
	      System.out.println("Similar Record Found Enter Different CriminalID");
	      run = true;
	   }
	catch(Exception e)
	{
		System.out.println("Invalid Input Given Enter Different cell no");
		run= true;
	
	}
	
	}
}

public void meetings() throws ClassNotFoundException, SQLException {

	NewJDBC.Connection();
	
	Scanner in = new Scanner(System.in);
	
	Boolean run = true;
	while(run == true) {
		
	try {
		run = false;
			
		System.out.println("Please Enter Outsider  Details");
		
		
		System.out.println("Enter Outsider Name :");
		String name = in.nextLine();
		
		System.out.println("Enter Criminal ID:");
		int criminalID = in.nextInt();
	
	
		
		Statement st = conn.createStatement();
		PreparedStatement mystr=null;
		
		
			ResultSet s = st.executeQuery("select max(srno) from criminalmeetings");
			
			s.next();
			
			int srno = s.getInt(1);
		
			String sql = "insert into criminalmeetings values(?,?,?,sysdate)";
	
			mystr = conn.prepareStatement(sql);
			
			mystr.setInt(1,srno+1);
			mystr.setString(2,name);
			mystr.setInt(3,criminalID);
			
			mystr.executeUpdate();
			System.out.println("SuccessFully Updated\n");
			System.out.println();
//			conn.close();	
//			in.close();
//			
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input Given enter again");
			run = true;
					in.nextLine();
		}
	}
	
}

//public void punishment() throws ClassNotFoundException, SQLException {
//
//		NewJDBC.Connection();
//		
//		Scanner in = new Scanner(System.in);
//		Boolean run = true;
//			while(run == true) {
//				
//			try {
//			System.out.println("Please Enter punishment in years");
//			
//			
//			System.out.print("Enter Cell No : ");
//			String name = in.nextLine();
//	
//			System.out.print("Enter Jail Name :");
//			int criminalID = in.nextInt();
//	
//	
//			
//			Statement st = conn.createStatement();
//			PreparedStatement mystr=null;
//			
//			
//				ResultSet s = st.executeQuery("select max(srno) from criminalmeetings");
//				
//				s.next();
//				
//				int srno = s.getInt(1);
//			
//				String sql = "insert into criminalmeetings values(?,?,?,sysdate)";
//	
//				mystr = conn.prepareStatement(sql);
//				
//				mystr.setInt(1,srno);
//				mystr.setString(2,name);
//				mystr.setInt(3,criminalID);
//				
//				mystr.executeUpdate();
//				
//				System.out.println();
//				conn.close();	
//				in.close();
//				
//			}
//			catch(Exception e)
//			{
//				System.out.println("Invalid Input");
//			}
			
}
	

