package swing;
import javax.swing.*;
public class JTableExample extends JFrame {
    JTableExample(){
        String[][] data = {{"1", "Bibek", "11"},{"2", "Ajit", "22"},{"3", "Dipesh", "20"}};
        String[] columns = {"S.N", "Name", "ROLL"};

        JTable jt = new JTable(data, columns);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        add(sp);
        setSize(300, 400);
        setVisible(true);
        setLayout(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTableExample();
    }
}
