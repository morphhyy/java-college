import java.sql.*;

public class Create {
	static final String driver = "com.mysql.jdbc.Driver";
    static final String url    = "jdbc:mysql://localhost:3306/jdbc_learn";

	static final String username = "root";
	static final String password = "root";

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
	
		Statement st = con.createStatement();

		String query = "CREATE TABLE IF NOT EXISTS users"+
			"(id INT AUTO_INCREMENT PRIMARY KEY,"+
				"first_name varchar(10) NOT NULL,"+
				"last_name varchar(10) NOT NULL,"+
				"email varchar(20) NOT NULL)";

		st.executeUpdate(query);
		System.out.println("Table Created!");
		
		st.close();
		con.close();
	}
}
