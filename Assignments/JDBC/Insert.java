import java.sql.*;

public class Insert {
	static final String driver = "com.mysql.cj.jdbc.Driver";
    static final String url    = "jdbc:mysql://localhost:3306/jdbc_learn";

	static final String username = "root";
	static final String password = "root";

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
	
		Statement st = con.createStatement();

		String query = "INSERT INTO users(`first_name`, `last_name`, `email`) VALUES('Ram', 'Kumar', 'ramkumar@gmail.com')";

		st.executeUpdate(query);
		System.out.println("Successfully Inserted");
		
		con.close();
	}
}
