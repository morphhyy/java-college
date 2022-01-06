import java.applet.Applet;
import java.awt.Graphics;

class ParamApplet extends Applet
{
    public void init()
    {
        String name =  getParameter("name");
    }

    public void paint(Graphics g)
    {
        g.drawString(name, 100, 100);
    }
}
