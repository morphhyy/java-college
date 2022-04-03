package swing;
import javax.swing.*;
import java.awt.event.*;
public class Main extends JFrame {
    Main(){
        JButton button = new JButton("Click");
        button.setBounds(50, 50, 100, 50);

        add(button);
        setTitle("Click");
        setSize(600,600);
        setLayout(null);
        setVisible(true);

        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
