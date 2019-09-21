import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete extends NewJDBC {
	
	public void delete() throws ClassNotFoundException, SQLException {
		System.out.println("What you want to delete Criminal Record (Press R) or Location (Press L) or Meeting Details (Press M)");
		
		Scanner in = new Scanner(System.in);
		String table = in.next();
		int ID = in.nextInt();
		
		del(table,ID);
		in.close();
	}
	public void del(String table, int ID) throws ClassNotFoundException, SQLException{
				
		NewJDBC.Connection();
		Statement st = conn.createStatement();
		
		String sql = "Delete from "+table+"where criminalID ="+ID;
		int no = st.executeUpdate(sql);
		System.out.println("The No. of Rows are Updated :" + no);
		
	}
	
}
