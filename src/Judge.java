import java.sql.SQLException;
import java.util.Scanner;

public class Judge {
	
	public static void judge() throws ClassNotFoundException, SQLException {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Following are Menu Options");
		System.out.println("Press 1 for View\n"
				+ " Press 2 for Insert\n"
				+ "Press 3 for Update\n"
				+ "Press 4 for Delete\n");
		
		int no1 = in.nextInt();
		if(no1 ==1) {
		View v1 = new View();
		v1.select();
		}
		else if (no1==2) {
		
			Insert p1 = new Insert();
			p1.location();
		
		}
		
		else if(no1 == 3) {
			Update u1 =new Update();
			System.out.println("Please enter Criminal ID and Punishment for criminal ");
			int no = in.nextInt();
			String str = in.nextLine();
			u1.update(no, str);
		}
		
		else if (no1 == 4) {
			Delete d1 = new Delete();
			d1.delete();
			
		}
		in.close();
	}
	
}
