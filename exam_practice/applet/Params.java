package applet;
import java.applet.Applet;
import java.awt.Graphics;

public class Params extends Applet{

    public void paint(Graphics g){
        String name = getParameter("name");
        g.drawString(name, 50, 50);
    }
}
