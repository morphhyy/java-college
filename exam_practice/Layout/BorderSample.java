package Layout;
import javax.swing.*;
import java.awt.*;

public class BorderSample extends JFrame {
    JButton b1, b2, b3, b4, b5;
    BorderSample(){
        b1 = new JButton("North");
        b2 = new JButton("East");
        b3 = new JButton("West");
        b4 = new JButton("South");
        b5 = new JButton("Center");

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.EAST);
        add(b3, BorderLayout.WEST);
        add(b4, BorderLayout.SOUTH);
        add(b5, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(300,400);
        setVisible(true);
        setLayout(new BorderLayout(1,2));

    }

    public static void main(String[] args) {
        new BorderSample();
    }
}
