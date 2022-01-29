import java.awt.*;
import javax.swing.*;

class Main extends JFrame {
    Main(){
        setSize(700, 700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) 
    {
        //ellipse
        g.setColor(Color.BLACK);
        g.fillOval(150,80,90,50);
        
        //triangle
        g.setColor(Color.RED);
        int x[] = {300,200,50};
        int y[] = {150,250,150};
        g.fillPolygon(x, y, 3);
        
        //circle
		g.setColor(Color.GREEN);
        g.fillOval(30,50,90,90);
        
        //hexagon
        g.setColor(Color.YELLOW);
        int x1[] = {400,600,800,600,400,200};
        int y1[] = {100,100,300,500,500,300};
        g.fillPolygon(x1, y1, 6);

        //pentagon
        g.setColor(Color.BLUE);
        int x2[] = {150,250,200,100,50};
        int y2[] = {300,350,400,400,350};
        g.fillPolygon(x2, y2, 5);
    }

    public static void main(String[] args){
       new Main();
    }
}