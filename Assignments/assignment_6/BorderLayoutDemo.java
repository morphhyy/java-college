import java.awt.*;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame {
	public BorderLayoutDemo() {
		JButton northBtn = new JButton("NORTH");
		JButton southBtn = new JButton("SOUTH");
		JButton eastBtn = new JButton("EAST");
		JButton westBtn = new JButton("WEST");
		JButton centerBtn = new JButton("CENTER");

		add(northBtn, BorderLayout.NORTH);
		add(southBtn, BorderLayout.SOUTH);
		add(eastBtn, BorderLayout.EAST);
		add(westBtn, BorderLayout.WEST);
		add(centerBtn, BorderLayout.CENTER);
		
		setSize(300, 300);    
    	setVisible(true);    
		//setLayout(new BorderLayout(20,30));
	}

	public static void main(String[] args){
		new BorderLayoutDemo();
	}
}
