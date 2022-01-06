import java.applet.Applet;
import java.awt.Graphics;

class Main extends Applet{
    public void init(){
        System.out.println('Initializing');
    }

    public void start(){
        System.out.println("Starting the program");
    }

    public void paint(Graphics g){
        g.drawString("Hello World!");
    }

    public void stop(){
        System.out.println("Stopping");
    }

    public void destroy(){
        System.out.println("Destroyed!");
    }
}