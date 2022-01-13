import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Stacking {

	public static void main(String[] args) {

		JPanel cards;

		JFrame frame = new JFrame("CardLayout Demo");

		JPanel card1 = new JPanel();
		card1.add(new JLabel("Card 1"));
		card1.setBackground(new Color(255, 150, 150));

		JPanel card2 = new JPanel();
		card2.add(new JLabel("Card 2"));
		card2.setBackground(new Color(150, 255, 150));

		JPanel card3 = new JPanel();
		card3.add(new JLabel("Card 3"));
		card3.setBackground(new Color(150, 150, 255));

		cards = new JPanel(new CardLayout());
		cards.add(card1);
		cards.add(card2);
		cards.add(card3);

		class Events implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout) (cards.getLayout());
				String cmd = e.getActionCommand();

				if (cmd.equals("FIRST")) {
					cl.first(cards);
				} else if (cmd.equals("NEXT")) {
					cl.next(cards);
				} else if (cmd.equals("PREVIOUS")) {
					cl.previous(cards);
				} else if (cmd.equals("LAST")) {
					cl.last(cards);
				}
			}
		}
		Events cal = new Events();

		JButton btn1 = new JButton("First");
		btn1.setActionCommand("FIRST");
		btn1.addActionListener(cal);

		JButton btn2 = new JButton("Next");
		btn2.setActionCommand("NEXT");
		btn2.addActionListener(cal);

		JButton btn3 = new JButton("Previous");
		btn3.setActionCommand("PREVIOUS");
		btn3.addActionListener(cal);

		JButton btn4 = new JButton("Last");
		btn4.setActionCommand("LAST");
		btn4.addActionListener(cal);

		JPanel controlButtons = new JPanel();
		controlButtons.add(btn1);
		controlButtons.add(btn2);
		controlButtons.add(btn3);
		controlButtons.add(btn4);

		Container pane = frame.getContentPane();
		pane.add(cards, BorderLayout.CENTER);
		pane.add(controlButtons, BorderLayout.PAGE_END);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}
