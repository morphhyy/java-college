import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class AnonymouslClass {
    public JFrame frame = new JFrame("Calculator");
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
    AnonymouslClass()
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
        multiply.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(num1Text.getText());
                double number2 = Double.parseDouble(num2Text.getText());
                resultText.setText(String.valueOf(number1*number2));
                
                
            }
        });
        divide.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(num1Text.getText());
                double number2 = Double.parseDouble(num2Text.getText());
                try {
                    if(e.getSource()==divide)
                    {
                    resultText.setText(String.valueOf(number1/number2));
                    }
                    
                } catch (Exception error) {
                    resultText.setText("Invalid"+" "+error.getMessage());
                }
                
                
                
            }
        });
        addition.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(num1Text.getText());
                double number2 = Double.parseDouble(num2Text.getText());
            
                resultText.setText(String.valueOf(number1+number2));
                
                
            }
        });
        subtract.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(num1Text.getText());
                double number2 = Double.parseDouble(num2Text.getText());
                resultText.setText(String.valueOf(number1-number2));
                
                
            }
        });
        
    }
    
    public static void main(String[] args) {
      
        new AnonymouslClass();
    }
}