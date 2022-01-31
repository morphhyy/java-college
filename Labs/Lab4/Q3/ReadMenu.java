import javax.swing.*;
import java.sql.*;
import database.connectDB;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ReadMenu extends JFrame {
	JTable table;
	JScrollPane sp;
	ReadMenu() {
		String columns[] = { "ID", "First Name", "Last Name", "Email" };
		String data[][] = new String[20][4];
		try {
			connectDB DB = new connectDB();
			Connection con = DB.connect();
			Statement st = con.createStatement();
			String query = "SELECT * FROM users;";

			ResultSet rs = st.executeQuery(query);
			int i = 0;
			while(rs.next()){
				int id = rs.getInt("id");
				String fname = rs.getString("fname");
				String lname = rs.getString("lname");
				String email = rs.getString("email");
				data[i][0] = id + "";
				data[i][1] = fname;
				data[i][2] = lname;
				data[i][3] = email;
				i++;
			}

			table = new JTable(data, columns);
			table.setBounds(30,40,200,300);          
			add(table);     
			sp= new JScrollPane(table);    
    		add(sp);               
			setSize(300,400);    
			setVisible(true);  
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		} catch(Exception err){
			System.out.println(err.getMessage());
		}
	}
	public static void main(String[] args) {
		new ReadMenu();
	}
}

