import java.sql.SQLException;

public class JailSuperIntendant extends Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Insert p1 = new Insert();
		p1.Details();
		p1.location();
		p1.meetings();
		
		Delete d1 = new Delete();
		d1.delete();
//		Update u1 =new Update();
//		u1.update("Fuck You", 2);
//		
//		View v1 = new View();
//		v1.select();
		
	}

}
