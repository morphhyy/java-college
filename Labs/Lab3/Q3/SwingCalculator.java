import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class SwingCalculator extends JFrame implements ActionListener {
    JButton addition, subtraction;
    JLabel label1, label2, result;
    JTextField tf1, tf2, resultText;

    public SwingCalculator(){
        label1 = new JLabel("Number 1: ");
        label1.setBounds(100,50,80,25);
        tf1 = new JTextField();
        tf1.setBounds(180,50,165,25);

        label2 = new JLabel("Number 2: ");
        label2.setBounds(100,100,80,25);
        tf2 = new JTextField();
        tf2.setBounds(180,100,165,25);

        result = new JLabel("Result: ");
        result.setBounds(100,150,80,25);
        resultText = new JTextField();
        resultText.setBounds(180,150,165,25);

        addition = new JButton("Addition");
        subtraction = new JButton("Subtraction");

        addition.setBounds(50,210,90,90);
        subtraction.setBounds(170,210,90,90);

        add(label1);add(tf1);
        add(label2);add(tf2);
        add(result);add(resultText);
        add(addition);add(subtraction);

        setLayout(new BorderLayout());
        setSize(300,300);
        setVisible(true);

        addition.addActionListener(this);
        subtraction.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        double number1 = Double.parseDouble(tf1.getText());
        double number2 = Double.parseDouble(tf2.getText());

        if(e.getSource() == addition){
           resultText.setText(String.valueOf(number1+number2));
        }

        if(e.getSource() == subtraction){
            resultText.setText(String.valueOf(number1-number2));
        }

    }

    public static void main(String[] args){
        new SwingCalculator();
    }
}
