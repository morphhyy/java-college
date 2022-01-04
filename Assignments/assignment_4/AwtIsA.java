import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;

class AwtIsA extends Frame
{
    public AwtIsA()
    {
        Label label1 = new Label("Number 1");
        label1.setBounds(30,40,70,50);
        
        TextField tf1 = new TextField("");
        tf1.setBounds(110,50,150,30);

        Label label2 = new Label("Number 2");
        label2.setBounds(30,70,70,100);

        TextField tf2 = new TextField();
        tf2.setBounds(110,100,150,30);

        Button addButton = new Button("Add");
        addButton.setBounds(40,170,60,30);

        Button subButton = new Button("Subtract");
        subButton.setBounds(120,170,60,30);

        Button mulButton = new Button("Multiply");
        mulButton.setBounds(200,170,60,30);

        Button divButton = new Button("Divide");
        divButton.setBounds(280,170,60,30);

        add(label1);
        add(tf1);
        add(label2);
        add(tf2);
        add(addButton);
        add(subButton);
        add(mulButton);
        add(divButton);

        setSize(700,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new AwtIsA();
    }
}