import java.sql.SQLException;
import java.util.Scanner;

public class Administrator {
	
	public static void Admin() throws ClassNotFoundException, SQLException {
		
		Scanner in = new Scanner(System.in);
		try {
		System.out.println("Do you want View Record");
		System.out.println("Press 1 for Yes");
		
		int no1 = in.nextInt();
		if(no1 ==1) {
		View v1 = new View();
		
		v1.select();
		}else {System.out.println("Invalid Input");}
		}catch(Exception e){
			
			System.out.println("Invalid Input");
			
		}
		
	}
	
}
