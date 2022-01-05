import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class AnonumousClass extends Frame{
    public Label num1 = new Label();
    public TextField num1Text = new TextField();
    public Label num2 = new Label();
    public TextField num2Text = new TextField();
    public Label result = new Label();
    public TextField resultText = new TextField();
    public Button addition = new Button("ADD");
    public Button subtract = new Button("Subtract");
    public Button multiply = new Button("Multiply");
    public Button divide = new Button("Divide");
    AnonumousClass()
    {
        num1.setText("Number 1:");
        num1.setBounds(10,50,80,25);
        num1Text.setBounds(100,50,165,25);
        add(num1);
        add(num1Text);
        num2.setText("Number 2:");
        num2.setBounds(10,100,80,25);
        num2Text.setBounds(100,100,165,25);
        add(num2);
        add(num2Text);
        result.setText("Result:");
        result.setBounds(10,150,80,25);
        resultText.setBounds(100,150,165,25);
        add(result);
        add(resultText);
        addition.setBounds(10,200,50,35);
        add(addition);
        subtract.setBounds(80,200,50,35);
        add(subtract);
        multiply.setBounds(150,200,50,35);
        add(multiply);
        divide.setBounds(220,200,50,35);
        add(divide);
        setTitle("Calculator");
        setSize(300,400);
        setLayout(null);
        setVisible(true);
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
        new AnonumousClass();
    }
}