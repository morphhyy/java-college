package Graphics;
import java.awt.*;
import java.awt.event.*;
public class Flag extends Frame {
    Flag(){
        setSize(1000,1000);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });

    }

    public void paint(Graphics g){
        g.drawString("Hello world", 30, 40);

        int rodx[] = {40, 50, 50, 40};
        int rody[] = {40, 40, 800, 800};

        g.setColor(Color.BLUE);
        g.fillPolygon(rodx, rody, 4);

        //border
        int borx[] = {50, 350, 150, 450, 50};
        int bory[] = {40, 350, 350, 600, 600};
        g.fillPolygon(borx, bory, 5);

        //flag
        int flagx[] = {55, 340, 135, 440, 45};
        int flagy[] = {55, 345, 345, 595, 595};
        g.setColor(Color.RED);
        g.fillPolygon(flagx, flagy, 5);

        // drawing shapes
        g.setColor(Color.WHITE);
        g.fillArc(80, 200, 75, 75, 0, -180);
        g.fillOval(90, 400, 75, 75);
    }

    public static void main(String[] args){
        new Flag();
    }
}
