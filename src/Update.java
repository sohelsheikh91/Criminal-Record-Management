import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update extends NewJDBC{
	
	public void update(String punishment,int id) throws ClassNotFoundException, SQLException {
		
		
		NewJDBC.Connection();
		Statement st = conn.createStatement();
		String sql = "update criminaldetails set punishment='"+punishment+"' where criminalid="+id;
		int rowsaffected = st.executeUpdate(sql);
		System.out.println("rows updated"+rowsaffected);
		
	}
	

}
