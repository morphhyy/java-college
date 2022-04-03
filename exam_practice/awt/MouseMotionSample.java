package awt;
import java.awt.event.*;
import java.awt.*;

public class MouseMotionSample extends Frame implements MouseMotionListener {
    Label l;
    MouseMotionSample(){
        l = new Label();
        
        l.setBounds(10, 10, 50, 50);
        add(l);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        
        addMouseMotionListener(this);

        addWindowListener (new WindowAdapter() {    
            public void windowClosing (WindowEvent e) {    
                dispose();    
            }    
        });    
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 20, 20);
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        l.setText("X = "+ e.getX() + ", Y = " + e.getY());
        
    }

    public static void main(String[] args) {
        new MouseMotionSample();
    }
}