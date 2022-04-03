package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class CardLayoutSample extends JFrame implements ActionListener {
    JButton b1,b2,b3;
    Container cPane;
    CardLayout crd;
    CardLayoutSample(){
        cPane = getContentPane();
        crd = new CardLayout();
        cPane.setLayout(crd);

        b1 = new JButton("Apple");
        b2 = new JButton("Boy");
        b3 = new JButton("Cat");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        cPane.add("a", b1);
        cPane.add("b", b2);
        cPane.add("c", b3);

        setSize(500, 600);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        crd.next(cPane);
    }

    public static void main(String[] args){
        new CardLayoutSample();
    }

}
