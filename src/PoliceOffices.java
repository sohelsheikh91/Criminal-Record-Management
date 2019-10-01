import java.sql.SQLException;
import java.util.Scanner;

public class PoliceOffices {
	
	public static void officer() throws ClassNotFoundException, SQLException {
	Scanner in = new Scanner(System.in);
	try {
	System.out.println("Do you want View Record or Update Record");
	System.out.println("Press 1 for Yes or Press 2 for Update");
	
	int no1 = in.nextInt();
	if(no1 ==1) {
	View v1 = new View();
	
	v1.select();
	}else if (no1 ==2) {
	Update u1 =new Update();
	System.out.println("Please enter Criminal ID and Punishment for criminal ");
	int no = in.nextInt();
	String str = in.nextLine();
	
	u1.update(no, str);
	}
	}catch(Exception e){
		
		System.out.println("Invalid Input");
		
	}
	}
}
