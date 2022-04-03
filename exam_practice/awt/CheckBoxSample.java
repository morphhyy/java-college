package awt;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxSample extends Frame{
    CheckBoxSample(){
        Label label = new Label();
        CheckboxGroup gfc = new CheckboxGroup();
        Checkbox sample = new Checkbox("C+=", gfc, false);
        Checkbox sample2 = new Checkbox("Java", gfc, true);

        sample.setBounds(100, 100, 50, 50);
        sample2.setBounds(100, 150, 50, 50);
        label.setBounds(100, 20, 200, 50);
        add(sample);
        add(sample2);
        add(label);

        setTitle("Checkbox Sample");
        setSize(500, 500);
        setLayout(null);
        setVisible(true);

        sample.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                label.setText("C++ Checkbox " + (e.getStateChange() == 1 ?"checked":"unchecked"));
            }
        });

        sample2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                label.setText("java Checkbox " + (e.getStateChange() == 1 ? "checked" : "unchecked"));
            }
        });


    }

    public static void main(String[] args) {
        new CheckBoxSample();
    }
}
