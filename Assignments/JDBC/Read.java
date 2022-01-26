import java.sql.*;

public class Read {
    static final String driver = "com.mysql.jdbc.Driver";
    static final String url    = "jdbc:mysql://localhost:3306/jdbc_learn";

	static final String username = "root";
	static final String password = "root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();

			String query = "Select * from users;";
			ResultSet rs = st.executeQuery(query);

			while(rs.next()){
				System.out.println("ID = " + rs.getInt(1));
				System.out.println("First Name = " + rs.getString(2));
				System.out.println("Last Name = " + rs.getString(3));
				System.out.println("Email = " + rs.getString(4));
				System.out.println("==============");
			}

			st.close();
			con.close();
	}
}
