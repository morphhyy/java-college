package swing;
import javax.swing.*;
import java.awt.event.*;

public class JButtonSample extends JFrame{
    JButtonSample(){
        JButton button = new JButton("Click me");
        JTextField txt = new JTextField();

        txt.setBounds(20, 30, 100, 20);
        button.setBounds(20, 100, 100, 30);

        add(txt);
        add(button);

        setSize(500,500);
        setLayout(null);
        setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String host = txt.getText();
                try {
                    String ip = java.net.InetAddress.getByName(host).getHostAddress();
                    txt.setText(ip);
                } catch (Exception ev) {
                    ev.printStackTrace();
                }
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonSample();
    }
}
