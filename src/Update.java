import java.sql.SQLException;
import java.sql.Statement;

public class Update extends NewJDBC{
	
	public void update(int id,String punishment) throws ClassNotFoundException, SQLException {
		
		
		NewJDBC.Connection();
		try {
		Statement st = conn.createStatement();
		String sql = "update criminaldetails set punishment='"+punishment+"' where criminalid="+id;
		
		int rowsaffected = st.executeUpdate(sql);
		
		System.out.println("rows updated"+rowsaffected);
		}
		catch(Exception e) {
			
			System.out.println("No Record Found Per Criminal ID");
		}
	}
	

}
