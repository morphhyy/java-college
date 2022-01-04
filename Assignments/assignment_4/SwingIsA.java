import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

class SwingIsA extends JFrame
{
    public SwingIsA()
    {
        JLabel label1 = new JLabel("Number 1");
        label1.setBounds(30,40,70,50);
        
        JTextField tf1 = new JTextField();
        tf1.setBounds(110,50,150,30);

        JLabel label2 = new JLabel("Number 2");
        label2.setBounds(30,70,70,100);

        JTextField tf2 = new JTextField();
        tf2.setBounds(110,100,150,30);

        JButton addButton = new JButton("Add");
        addButton.setBounds(40,170,60,30);

        JButton subButton = new JButton("Subtract");
        subButton.setBounds(130,170,100,30);

        JButton mulButton = new JButton("Multiply");
        mulButton.setBounds(250,170,80,30);

        JButton divButton = new JButton("Divide");
        divButton.setBounds(350,170,80,30);

        add(label1);
        add(tf1);
        add(label2);
        add(tf2);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);

        setSize(700,550);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new SwingIsA();
    }
}