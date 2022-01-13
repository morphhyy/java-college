import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class OddEven extends JFrame implements ActionListener {
    JButton check;
    JLabel label1, result;
    JTextField tf1, resultText;

    public OddEven(){
        label1 = new JLabel("Number: ");
        label1.setBounds(30, 0,150,40);
        
        tf1 = new JTextField();
        tf1.setBounds(150, 0, 150,40);
        
        result = new JLabel("Result: ");
        result.setBounds(30, 50,150,40);
        
        resultText = new JTextField();
        resultText.setBounds(150, 50,150,40);


        check = new JButton("Check");
        check.setBounds(150, 100,150,40);



        add(label1);add(tf1);
        add(check);
        add(result);add(resultText);

        setSize(300,300);
        setDefaultCloseOperation(3);
        setLayout(null);
        setVisible(true);

        check.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e){
        double number1 = Double.parseDouble(tf1.getText());
        resultText.setText(number1 % 2 == 0 ? "even" : "odd");

    }

    public static void main(String[] args){
        new OddEven();
    }
}
