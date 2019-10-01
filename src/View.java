import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class View extends NewJDBC{
	
	public void select() throws ClassNotFoundException, SQLException {
	
		NewJDBC.Connection();
		Scanner in = new Scanner(System.in);
Boolean run = true;
		
		while(run == true ) {
			
	try {
		run = false; 
	
		System.out.println("What Do you want View Criminal Record or OutSider Meeting Record");
		System.out.println("Press 1 for Yes or Press 2  for LogOut");
		Statement st = conn.createStatement();
		
		int no1 = in.nextInt();
		if(no1 ==1) {
		
		String sql = "select * from CriminalDetails order by CriminalID";
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
		}else if(no1 == 2) {
		//--------------------------------------------------
			String sql = "Select * from CriminalMeetings order by SRNO";
			ResultSet s = st.executeQuery(sql);
		//System.out.println("CriminalID       Name        Type    CriminalDetails     BloodGroup   DNA  HealthCondition  Punishment  CrimeDate");
		
		while(s.next()) {
	
			System.out.println("SRNO : "+ s.getInt(1)+"| OutsiderName : "+
			s.getString(2)+" CriminalID : "+
			s.getInt(3)+" MeetDate : "+
			s.getDate(4)
			
			);	
		}
		}
	}catch(Exception e) {
		
		System.out.println("DataBase Exception No Record Found");
		//run = true;
	}
	}

}
}
