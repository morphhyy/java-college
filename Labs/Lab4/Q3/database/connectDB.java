package database;
import java.sql.*;

public class connectDB {
	static final String driver = "com.mysql.cj.jdbc.Driver";
    static final String url    = "jdbc:mysql://localhost:3306/jdbc_swing";

	static final String username = "root";
	static final String password = "root";

	public Connection connect(){
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		return con;
	}

}
