import javax.swing.JFrame;
import java.awt.*;

class Flag extends JFrame{
	Flag(){
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g){

		Color red = new Color(221,13,57);

		int xCordFill[] = {100,60,140};
		int yCordFill[] = {40,120,120};
		Polygon filledTriangle = new Polygon(xCordFill,yCordFill,xCordFill.length);
		g.setColor(Color.BLUE);
		g.fillPolygon(filledTriangle);

		int xCordLine[] = {100,60,140};
		int yCordLine[] = {40,120,120};
		Polygon lineTriangle = new Polygon(xCordLine,yCordLine,xCordLine.length);
		g.setColor(Color.GREEN);
		g.drawPolygon(lineTriangle);

		int xNepalFlagBlue[] = {20,200,80,200,20};
		int yNepalFlagBlue[] = {130,230,230,340,340};
		Polygon flagBorder = new Polygon(xNepalFlagBlue,yNepalFlagBlue,xNepalFlagBlue.length);
		g.setColor(Color.BLUE);
		g.fillPolygon(flagBorder);

		int xNepalFlagRed[] = {26,170,65,180,30};
		int yNepalFlagRed[] = {142,224,224,332,332};
		Polygon internal = new Polygon(xNepalFlagRed,yNepalFlagRed,xNepalFlagRed.length);
		g.setColor(red);
		g.fillPolygon(internal);

		g.setColor(Color.WHITE);
		g.fillArc(45,165,60,60,0,-180);

		g.setColor(red);
		g.fillArc(44,175,62,40,0,-180);


		g.setColor(Color.WHITE);
		int xNepalFlagStar[] = {65,70,75,85,80,85,75,70,65,55,60,55};
		int yNepalFlagStar[] = {280,265,280,280,290,300,300,315,300,300,290,280};

		g.fillPolygon(xNepalFlagStar,yNepalFlagStar,xNepalFlagStar.length);
	}
	public static void main(String[] args){
		new Flag();
	}
}