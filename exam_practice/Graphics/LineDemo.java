package Graphics;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
class LineDemo extends Frame
{
	public LineDemo()
	{
		super("Drawing Line");
		setSize(900, 1000);
		setVisible(true);
	}

	public void paint(Graphics g) {
        g.setColor(Color.BLUE);
		g.drawString("Hello World!", 50, 80);

		g.setColor(Color.RED);

		//line
		g.drawLine(20, 40, 80, 90);

		//rectangle
		g.drawRect(40, 50, 70, 60);
		g.fillRect(120, 50, 70, 70);
		g.fillRoundRect(200, 50, 70, 70, 20, 60);

		//ellipses and circles
		
		g.drawOval(280, 50, 30, 30);
		g.fillOval(350, 50, 30, 100);

	}

	public static void main(String[] args)
	{
		new LineDemo();
	}

}
