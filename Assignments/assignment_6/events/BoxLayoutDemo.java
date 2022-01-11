import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BoxLayoutDemo extends JFrame implements ActionListener {
	
    JButton add,sub,mul,div;
	JTextField num1,num2,result;
	JLabel num1_label,num2_label,result_label;
	JPanel panel1,panel2,panel3,panel4;

	BoxLayoutDemo(){
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();

		num1_label = new JLabel("Number 1: ");
		num2_label = new JLabel("Number 2: ");
		result_label = new JLabel("Result: ");

		num1 = new JTextField();
		num2 = new JTextField();
		result = new JTextField();

		num1.setColumns(5);
		num2.setColumns(5);
		result.setColumns(5);

		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("x");
		div = new JButton("/");

		panel1.add(num1_label);
		panel1.add(num1);

		panel2.add(num2_label);
		panel2.add(num2);

		panel3.add(result_label);
		panel3.add(result);

		panel4.add(add);
		panel4.add(sub);
		panel4.add(mul);
		panel4.add(div);

		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);

		setSize(300,180);
		setVisible(true);
		setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        // pack();
		
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
		new BoxLayoutDemo();
	}
}
