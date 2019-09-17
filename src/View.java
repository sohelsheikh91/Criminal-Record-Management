import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View extends NewJDBC{
	
	public void select() throws ClassNotFoundException, SQLException {
	
		NewJDBC.Connection();
	
		Statement st = conn.createStatement();
		String sql = "Select * from CriminalDetails order by CriminalID";
		ResultSet s = st.executeQuery(sql);
		//System.out.println("CriminalID       Name        Type    CriminalDetails     BloodGroup   DNA  HealthCondition  Punishment  CrimeDate");
		
		while(s.next()) {
			
	
			System.out.println("CriminalID : "+ s.getInt(1)+"| Name : "+
			s.getString(2)+" Type : "+
			s.getString(3)+" CriminalDetails : "+
			s.getString(4)+" BloodGroup : "+
			s.getString(5)+" DNA : "+
			s.getString(6)+" HealthCondition : "+
			s.getString(7)+" Punishment : "+
			s.getString(8)+" CrimeDate : "+
			s.getDate(9)
			);	
		}
		
	
	}

}
