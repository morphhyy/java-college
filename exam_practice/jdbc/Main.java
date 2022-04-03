package jdbc;
import java.sql.*;
public class Main {
    
    static String Driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/user";
    static String username = "root";
    static String password = "password";

    public static void main(String[] args) throws SQLException{
        try {
            // register driver
            Class.forName(Driver);
            // create conection
            Connection conn = DriverManager.getConnection(url, username, password);
            // create statement
            Statement stmt  = conn.createStatement();
            // execute query
            ResultSet rs = stmt.executeQuery("Select * from users where name = ``");

            //fetch database
            while(rs.next()) {
                // if int getInt, if string getString
                System.out.println(rs.getString(1));
            }
            // connection close
            conn.close();
            //handling mutiple exception like a boss
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
