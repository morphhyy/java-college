package color;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
class ColorDemo extends JFrame {
 
    // constructor
    ColorDemo()
    {
        super("color");
 
        // create a new Color
        Color c = Color.yellow;
 
        // create a panel
        JPanel p = new JPanel();
 
        // set the background of the frame
        // to the specified Color
        p.setBackground(c);
 
        setSize(200, 200);
        add(p);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }
 
    // Main Method
    public static void main(String args[]) {
        new ColorDemo();
    }
}