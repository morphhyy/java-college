package awt;
import java.awt.*;
import java.awt.event.*;

public class In extends Frame {
    In(){
        Label employee = new Label("Employee id: ");
        TextField txt = new TextField();
        Button btn = new Button("Submit");

        employee.setBounds(20, 80, 80, 30);
        txt.setBounds(20, 110, 80, 30);
        btn.setBounds(100, 110, 80, 30);

        add(employee);
        add(txt);
        add(btn);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        setTitle("Employee Info");
        setSize(500, 500);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new In();
    }
}