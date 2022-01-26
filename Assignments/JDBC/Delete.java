import java.util.Scanner;
import java.sql.*;

class Delete {

    static final String driver = "com.mysql.cj.jdbc.Driver";
    static final String url    = "jdbc:mysql://localhost:3306/jdbc_learn";

	static final String username = "root";
	static final String password = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user's first_name:");
        String name = sc.nextLine();

        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, username, password);

        Statement st = con.createStatement();

        String query = "DELETE FROM users where first_name = '" + name + "';";

        System.out.println(query);
        
        int row = st.executeUpdate(query);

        if (row == 0){
            System.out.println ("User doesn'ot exist");
        } else{
            System.out.println ("Removed successfully");
        }
    }
}
