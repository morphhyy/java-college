import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class OutsideClass {
    public JFrame Jframe = new JFrame("Calculator");
    public JLabel num1 = new JLabel();
    public JTextField num1Text = new JTextField();
    public JLabel num2 = new JLabel();
    public JTextField num2Text = new JTextField();
    public JLabel result = new JLabel();
    public JTextField resultText = new JTextField();
    public JButton addition = new JButton("ADD");
    public JButton subtract = new JButton("Subtract");
    public JButton multiply = new JButton("Multiply");
    public JButton divide = new JButton("Divide");
    OutsideClass()
    {
        num1.setText("Number 1:");
        num1.setBounds(10,50,80,25);
        num1Text.setBounds(100,50,165,25);
        Jframe.add(num1);
        Jframe.add(num1Text);
        num2.setText("Number 2:");
        num2.setBounds(10,100,80,25);
        num2Text.setBounds(100,100,165,25);
        Jframe.add(num2);
        Jframe.add(num2Text);
        result.setText("Result:");
        result.setBounds(10,150,80,25);
        resultText.setBounds(100,150,165,25);
        Jframe.add(result);
        Jframe.add(resultText);
        addition.setBounds(10,200,50,35);
        Jframe.add(addition);
        subtract.setBounds(80,200,50,35);
        Jframe.add(subtract);
        multiply.setBounds(150,200,50,35);
        Jframe.add(multiply);
        divide.setBounds(220,200,50,35);
        Jframe.add(divide);
        divide.setBorder(null);
        multiply.setBorder(null);
        addition.setBorder(null);
        subtract.setBorder(null);
        Jframe.setSize(300,400);
        Jframe.setLayout(null);
        Jframe.setVisible(true);
        multiply.addActionListener(new OutsideClass(this));
        divide.addActionListener(new OutsideClass(this));
        addition.addActionListener(new OutsideClass(this));
        subtract.addActionListener(new OutsideClass(this));
        
    }
    
    public static void main(String[] args) {
        new OutsideClass();
    }
}
class OutsideClass  implements ActionListener
{
	OutsideClass obj;
	public OutsideClass(OutsideClass obj)
	{
        this.obj = obj;

    }
    @Override
    public void actionPerformed(ActionEvent event) {
    
        double number1 = Double.parseDouble(obj.num1Text.getText());
        double number2 = Double.parseDouble(obj.num2Text.getText());
        try {
            if(event.getSource()==obj.addition)
            {
            obj.resultText.setText(String.valueOf(number1+number2));
            }
            if(event.getSource()==obj.subtract)
            {
            obj.resultText.setText(String.valueOf(number1-number2));
            }
            if(event.getSource()==obj.multiply)
            {
            obj.resultText.setText(String.valueOf(number1*number2));
            }
            if(event.getSource()==obj.divide)
            {
            obj.resultText.setText(String.valueOf(number1/number2));
            }
            
        }
        catch (Exception e) {
            obj.resultText.setText("Invalid"+" "+e.getMessage());
        }
        
    }
}