import java.sql.SQLException;
import java.util.Scanner;

public class CriminalRecordManagment {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	System.out.println("Welcome to Criminal Record Managment System");
	System.out.println("Do you want to Register or Login");
	Boolean run = true;
	while(run==true) {
		run = false;
		try {
						
				System.out.println("Press 1 for Registration or 2 for Login");
				int temp = in.nextInt();
				if(temp==1) {
					
					Registration.signup();
				}
				else if(temp == 2) {
					Login.login();
					
				}else {
					
					System.out.println("Please Enter Valid Option");
					run = true;
				}
				
	
			}
		catch(Exception e)
		{
			
				System.out.println("Invalid Input");
				
		}
	
	}
	
	
}
}
