package Graphics;
import java.awt.*;
import java.awt.event.*;
public class Main extends Frame {
    Main(){
        setSize(1000, 1000);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        int rodX[] = {40, 50, 50, 40};
        int rodY[] = {40, 40, 800, 800};

        g.fillPolygon(rodX, rodY, 4);

        //make border now

        int borX[] = {50, 350, 150, 450, 50};
        int borY[] = {40, 350, 350, 600, 600};

        g.fillPolygon(borX, borY, 5);

        //make inside
        int flagX[] = {55, 340, 130, 440, 60};
        int flagY[] = {55, 340, 340, 590, 590};
        g.setColor(Color.RED);
        g.fillPolygon(flagX, flagY, 5);

        g.setColor(Color.WHITE);
        g.fillArc(90, 200, 75, 75, 0, -180);
        g.fillOval(140, 450, 50, 50);
    }  

    public static void main(String[] args) {
        new Main();
    }
}
