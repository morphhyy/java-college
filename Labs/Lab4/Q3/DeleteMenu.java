import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import database.connectDB;

public class DeleteMenu extends JFrame implements ActionListener{
	JButton delete;
	JLabel name_label, result;
	JTextField name;

	DeleteMenu(){
		name_label = new JLabel("Name: ");
		name_label.setBounds(30, 40, 60, 50);

		name = new JTextField();
		name.setBounds(100, 50, 100, 30);

		delete = new JButton("Delete");
		delete.setBounds(30, 100, 90, 30);

		result = new JLabel();
		result.setForeground(Color.red);
		result.setBounds(30, 150, 400, 50);
		
		add(name_label);
		add(name);
		add(delete);
		add(result);


		setSize(400, 500);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		delete.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		String name_text = name.getText();
		if(name_text.length() == 0){
			result.setText("Nothing to search. Please type name");		
		} else {
			String query = "DELETE FROM users where fname = ?";
			try {
				connectDB DB = new connectDB();
				Connection con = DB.connect();
				
				PreparedStatement ps = con.prepareStatement(query);  
				ps.setString(1, name_text);
				int row = ps.executeUpdate();
				if(row == 0){
					result.setText("Users doesn't exist");
				} else {
					result.setText("Deleted Successfully!");
				}

			} catch(Exception err){
				System.out.println(err.getMessage());
				}
		}
	}

	public static void main(String[] args){
		new DeleteMenu();
	}
}
