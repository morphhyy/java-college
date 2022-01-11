import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GridLayoutDemo extends JFrame implements ActionListener{
	JButton add,sub,mul,div;
	JTextField num1,num2,result;
	JLabel num1_label,num2_label,result_label;
	JPanel panel1;
	
	GridLayoutDemo(){
		panel1 = new JPanel();

		num1_label = new JLabel("Number 1: ");
		num2_label = new JLabel("Number 2: ");
		result_label = new JLabel("Result: ");

		num1 = new JTextField();
		num2 = new JTextField();
		result = new JTextField();

		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("x");
		div = new JButton("/");

		add(num1_label);
		add(num1);

		add(num2);
		add(num2);

		add(result_label);
		add(result);

		panel1.add(add);
		panel1.add(sub);
		panel1.add(mul);
		panel1.add(div);

		add(panel1);
		setSize(500,170);
		setVisible(true);
		setLayout(new GridLayout(4,2));
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		try{
			if(e.getSource() == add){
				result.setText(""+(Integer.parseInt(num1.getText())+Integer.parseInt(num2.getText())));
			}else if(e.getSource() == sub){
				result.setText(""+(Integer.parseInt(num1.getText())-Integer.parseInt(num2.getText())));
			}else if(e.getSource() == mul){
				result.setText(""+(Integer.parseInt(num1.getText())*Integer.parseInt(num2.getText())));
			}else if(e.getSource() == div){
				try{
					result.setText(""+(Integer.parseInt(num1.getText())/(double)Integer.parseInt(num2.getText())));
				}catch(ArithmeticException exc){
					result.setText(exc.getMessage());
				}
			}
		}catch(NumberFormatException exc){
			result.setText(exc.getMessage());
		}
	}

	public static void main(String[] args){
		new GridLayoutDemo();
	}
}
