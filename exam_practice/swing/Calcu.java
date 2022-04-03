package swing;
import java.awt.*;
import java.awt.event.*;
// import javax.swing.*;

public class Calcu extends Frame implements ActionListener {
    Button addi, subt, divi, mult;
    Label num1Label, num2Label, result;
    TextField num1Text, num2Text;
    Calcu(){
        addi = new Button("Addition");
        subt = new Button("Subtraction");
        mult = new Button("Mulitiplication");
        divi = new Button("Division");

        num1Label = new Label("Num1: ");
        num2Label = new Label("Num2: ");
        result = new Label();

        num1Text = new TextField();
        num2Text = new TextField();

        num1Label.setBounds(50, 30, 100, 50);
        num2Label.setBounds(50, 80, 100, 50);

        num1Text.setBounds(150, 45, 100, 30);
        num2Text.setBounds(150, 95, 100, 30);

        
        addi.setBounds(50, 250, 150, 50);
        subt.setBounds(200, 250, 150, 50);
        mult.setBounds(350, 250, 150, 50);
        divi.setBounds(500, 250, 150, 50);

        result.setBounds(50, 350, 100, 50);

        add(addi);add(subt);add(mult);add(divi);
        add(num1Label);add(num2Label);
        add(num1Text);add(num2Text);;
        add(result);

        addi.addActionListener(this);
        subt.addActionListener(this);
        mult.addActionListener(this);
        divi.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });

        setSize(600, 600);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(num1Text.getText().length() != 0 && num2Text.getText().length() != 0){
            float num1 = Integer.parseInt(num1Text.getText());
            float num2 = Integer.parseInt(num2Text.getText());
            float floatResult = 0;
            if(e.getSource() == addi){
                floatResult = num1 + num2;
            }else if(e.getSource() == subt){
                floatResult = num1 - num2;
            }else if(e.getSource() == mult){
                floatResult = num1 * num2;
            }else if(e.getSource() == divi){
                floatResult = num1 / num2;
            }
            result.setText(String.valueOf(floatResult));
        }

    }

    public static void main(String[] args){
        new Calcu();
    }
}
