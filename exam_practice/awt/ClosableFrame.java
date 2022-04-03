package awt;

import java.awt.*;
import java.awt.event.*;

public class ClosableFrame extends Frame {

    ClosableFrame() {

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new ClosableFrame();
    }
}
