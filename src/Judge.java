import java.sql.SQLException;
import java.util.Scanner;

public class Judge {
	
	public void judge() throws ClassNotFoundException, SQLException {
		
		Scanner in = new Scanner(System.in);
		
		View v1 = new View();
		v1.select();
		
		Insert p1 = new Insert();
		p1.location();
				
		Update u1 =new Update();
		System.out.println("Please enter Criminal ID and Punishment for criminal ");
		String str = in.nextLine();
		u1.update(2, str);
		
		Delete d1 = new Delete();
		d1.delete();
		in.close();
		
	}
	
}
