package exam;
import java.awt.event.*;
import javax.swing.*;

public class SwingSample extends JFrame implements ActionListener {
    JButton button;
    JTextField txt1, txt2;
    SwingSample(){
        button = new JButton("Check");

        txt1 = new JTextField();
        txt2 = new JTextField();

        txt1.setBounds(30, 40, 70, 30);
        txt2.setBounds(30, 80, 70, 30);
        button.setBounds(30, 120, 100, 30);

        add(txt1);
        add(txt2);
        add(button);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);

        button.addActionListener(this);
        // button.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e){
                
    }
        // });

        public void actionPerformed(ActionEvent e){
            int data = Integer.parseInt(txt1.getText());
            if(data == 0){
                txt2.setText("Nor Even nor ODD");
            }else if(data % 2 == 0){
                    txt2.setText("Even");
                }else{
                    txt2.setText("Odd");
                }
        }
    
    
    public static void main(String[] args){
        new SwingSample();
    }
}
