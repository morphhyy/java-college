package awt;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuSample extends JFrame{
    JMenu menu;
    JMenuBar mb;
    JMenuItem l1,l2,l3;
    MenuSample(){
        menu = new JMenu("Menu");
        mb = new JMenuBar();
        l1 = new JMenuItem("Item 1");
        l2 = new JMenuItem("Item 2");
        l3 = new JMenuItem("Item 3");
        menu.add(l1);menu.add(l2);menu.add(l3);
        mb.add(menu);
        setJMenuBar(mb);

        setSize(500,600);
        setLayout(null);
        setVisible(true);
        setBackground(Color.RED);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new MenuSample();
    }
}
