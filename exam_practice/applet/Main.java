package applet;
import java.applet.Applet;
import java.awt.Graphics;

public class Main extends Applet{
    public void init(){
        System.out.println("Intializing applet");
    }

    public void start(){
        System.out.println("Starting..");
    }

    public void paint(Graphics g){
        g.drawString("hello world", 50, 50);
    }

    public void stop(){
        System.out.println("Stopping..");

    }

    public void destory(){
        System.out.println("Destroyed!");
    }

}
