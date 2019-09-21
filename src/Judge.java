import java.sql.SQLException;
import java.util.Scanner;

public class Judge {
	
	public void judge() throws ClassNotFoundException, SQLException {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		View v1 = new View();
		v1.select();
		
		Update u1 =new Update();
		System.out.println("Please enter Criminal ID and Punishment for criminal ");
		
		u1.update(2, str);
	}
	
}
