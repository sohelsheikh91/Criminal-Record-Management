import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete extends NewJDBC {
	
	public void delete() throws ClassNotFoundException, SQLException {
		try {
		System.out.println("What you want to delete Criminal Record (Press 1) or Location (Press 2) or Meeting Details (Press 3)");
		
		Scanner in = new Scanner(System.in);
		int no = in.nextInt();
		String table="";
		
		if(no==1)
		table ="criminaldetails";
		else if(no == 2) {
			table ="criminallocation";
		}
		else if(no == 3) {
			table ="criminalmetting";
		}
		System.out.println("Enter Criminal ID to Delete");
		int ID = in.nextInt();
		
		del(table,ID);
		in.close();
		}
		catch(Exception e) {
			
			System.out.println("Record Not Found");
		}
	}
	public void del(String table, int ID) throws ClassNotFoundException, SQLException{
				
		NewJDBC.Connection();
		Statement st = conn.createStatement();
		
		String sql = "Delete from "+table+"where criminalID ="+ID;
		int no = st.executeUpdate(sql);
		System.out.println("The No. of Rows are Updated :" + no);
		
	}
	
}
