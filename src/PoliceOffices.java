import java.sql.SQLException;

public class PoliceOffices {
	
	public void officer() throws ClassNotFoundException, SQLException {
	
	View v1 = new View();
	
	v1.select();
	
	Update u1 =new Update();
	System.out.println("Please enter Criminal ID and Punishment for criminal ");
	u1.update(2, "Fuck You");
	
	}
}
