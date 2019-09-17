import java.sql.SQLException;

public class JailSuperIntendant extends Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Insert p1 = new Insert();
		p1.insert();
		View v1 = new View();
		v1.select();
	}

}
