import java.sql.SQLException;
import java.util.Scanner;

public class JailSuperIntendant extends Insert {

	public static void Jailer(String name) throws ClassNotFoundException, SQLException {
		System.out.println("Welcome "+name);
		Scanner in = new Scanner(System.in);
		
		Boolean run = true;
		
		while(run == true ) {
			run= false;
			
		try {
			
	
		
			Insert p1 = new Insert();
			//p1.Details();
			p1.location();
			//p1.meetings();
			System.out.println("Do you want Insert More Record");
			System.out.println("Press 1 for Yes or Any Other Key For Next Menu");
			int no1 = in.nextInt();
			if(no1 ==1)
				run = true;
			
			
		}
		
		catch(Exception e){
			
			System.out.println("Invalid Input");
			run = true;
		}
		}
		run = true;
//		Insert p1 = new Insert();
//		p1.Details();
//		p1.location();
//		p1.meetings();
//		
	//	Delete d1 = new Delete();
		//d1.delete();
//		Update u1 =new Update();
		while(run == true ) {
		run= false;
		

		
		try
		{
		System.out.println("Do you want View Record");
		System.out.println("Press 1 for Yes or Press Any Key for LogOut");
		
		int no1 = in.nextInt();
		
		if(no1 ==1) {
		View v1 = new View();
			v1.select();
		}
			
		else
			System.out.println("Succesfully LogOut");
		
		}
		catch(Exception e){
			
			System.out.println("Invalid Input Given");
			run = true;
		}
		
		//Login l1 = new Login();
	//	Login.login();
	//	Registration.signup();
		
	}
		}

}
