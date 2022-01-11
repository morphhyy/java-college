import java.awt.*;    
import javax.swing.*;   

public class GridLayoutDemo extends JFrame {
	public GridLayoutDemo(){
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");

		add(btn1);add(btn2);add(btn3);
		add(btn4);add(btn5);add(btn6);

		setSize(300,300);
		setVisible(true);
		setLayout(new GridLayout(3,3,10,20));
	}

	public static void main(String[] args){
		new GridLayoutDemo();
	}
}
