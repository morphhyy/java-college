package awt;

import java.awt.*;  
import java.awt.event.*;

public class DialogSample {  
    private static Dialog d;  
    DialogSample() {  
        Frame f= new Frame();  
        d = new Dialog(f , "Dialog Example", true);  
        d.setLayout( new FlowLayout() );  
        Button b = new Button ("OK");  
        b.addActionListener ( new ActionListener(){  
            public void actionPerformed( ActionEvent e )  
            {  
                DialogSample.d.setVisible(false);  
            }  
        });  
        d.add( new Label ("Click button to continue."));  
        d.add(b);   
        d.setSize(300,300);    
        d.setVisible(true);  
    }  
    public static void main(String args[])  
    {  
        new DialogSample();   
    }  
}  
