package exam;
import java.sql.*;
public class JD {

    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/db_name";
    static final String USERNAME = "root";
    static final String PASSWORD = "password";

    public static void main(String[] args){
        String query = "SELECT * from employess where salary >= 25000";
        String query2 = "UPDATE employye set salary=5000 where post='Manager'";
        try {
            Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, 1);
            ps.setString(2, "Bibek");
            int n = ps.executeUpdate();
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("post"));
            }

            conn.close();

            
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
