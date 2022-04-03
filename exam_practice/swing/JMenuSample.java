package swing;
import javax.swing.*;

public class JMenuSample extends JFrame{
    JButton button;
    JMenu menu;
    JMenuItem l1,l2,l3,l4;
    
    JMenuSample(){
        button = new JButton("Click me");
        menu = new JMenu("Menu");
        JMenuBar mb = new JMenuBar();
        l1 = new JMenuItem("Item 1");
        l2 = new JMenuItem("Item 2");
        l3 = new JMenuItem("Item 3");
        l4 = new JMenuItem("Item 4");

        button.setBounds(50, 40, 100, 30);
        add(button);

        menu.add(l1);menu.add(l2);menu.add(l3);menu.add(l4);
        mb.add(menu);
        setJMenuBar(mb);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setSize(500,400);  
        setLayout(null);  
        setVisible(true);  
    }

    public static void main(String[] args) {
        new JMenuSample();
    }
}
