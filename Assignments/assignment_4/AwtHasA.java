import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;

class AwtHasA{
    public static void main(String[] args)
    {
        Frame frame = new Frame("AWT with Association");

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

        frame.add(label1);
        frame.add(tf1);
        frame.add(label2);
        frame.add(tf2);
        frame.add(addButton);
        frame.add(subButton);
        frame.add(mulButton);
        frame.add(divButton);

        frame.setSize(700,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}