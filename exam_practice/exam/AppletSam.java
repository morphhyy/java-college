package exam;
import java.awt.*;
import java.applet.Applet;

public class AppletSam extends Applet {
    public void paint(Graphics g){
        g.setFont(new Font("Times New Roman", Font.BOLD, 20));
        g.drawString("Pokhara Univeristy", 25, 40);
    }
}


// <applet code="AppletSam.class" width="300" height="300"></applet>