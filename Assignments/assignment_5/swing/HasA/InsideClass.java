import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class InsideClass implements ActionListener{
    public static JFrame frame = new JFrame("Calculator");
    public static JLabel num1 = new JLabel();
    public static JTextField num1Text = new JTextField();
    public static JLabel num2 = new JLabel();
    public static JTextField num2Text = new JTextField();
    public static JLabel result = new JLabel();
    public static JTextField resultText = new JTextField();
    public static JButton addition = new JButton("ADD");
    public static JButton subtract = new JButton("Subtract");
    public static JButton multiply = new JButton("Multiply");
    public static JButton divide = new JButton("Divide");
    InsideClass()
    {
        num1.setText("Number 1:");
        num1.setBounds(10,50,80,25);
        num1Text.setBounds(100,50,165,25);
        frame.add(num1);
        frame.add(num1Text);
        num2.setText("Number 2:");
        num2.setBounds(10,100,80,25);
        num2Text.setBounds(100,100,165,25);
        frame.add(num2);
        frame.add(num2Text);
        result.setText("Result:");
        result.setBounds(10,150,80,25);
        resultText.setBounds(100,150,165,25);
        frame.add(result);
        frame.add(resultText);
        addition.setBounds(10,200,50,35);
        frame.add(addition);
        subtract.setBounds(80,200,50,35);
        frame.add(subtract);
        multiply.setBounds(150,200,50,35);
        frame.add(multiply);
        divide.setBounds(220,200,50,35);
        frame.add(divide);
        divide.setBorder(null);
        multiply.setBorder(null);
        addition.setBorder(null);
        subtract.setBorder(null);
        frame.setSize(300,400);
        frame.setLayout(null);
        frame.setVisible(true);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        addition.addActionListener(this);
        subtract.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event){
        double number1 = Double.parseDouble(num1Text.getText());
        double number2 = Double.parseDouble(num2Text.getText());
        try {
            if(event.getSource()==addition)
            {
            resultText.setText(String.valueOf(number1+number2));
            }
            if(event.getSource()==subtract)
            {
            resultText.setText(String.valueOf(number1-number2));
            }
            if(event.getSource()==multiply)
            {
            resultText.setText(String.valueOf(number1*number2));
            }
            if(event.getSource()==divide)
            {
            resultText.setText(String.valueOf(number1/number2));
            }
            
        } catch (Exception e) {
            resultText.setText("Invalid"+" "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        new InsideClass();
    }
}