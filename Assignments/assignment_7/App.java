import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class App implements ActionListener {
	JFrame f;

	JPanel navBar;
	JButton fileBtn, editBtn, viewBtn, openBtn;

	JPanel popPanels;

	JPanel popFile;
	JButton newBtn, saveBtn, saveAsBtn;

	JPanel popEdit;
	JButton renameBtn, formatSourceBtn;

	JPanel popView;
	JButton windowViewBtn, webViewBtn;

	JPanel popOpen;
	JButton openFileBtn, openFolderBtn;

	Popup pop;

	PopupFactory popFactory;

	App() {
		// Frame
		f = new JFrame("App");
		f.setSize(800, 800);
		f.setVisible(true);
		f.setLayout(new GridLayout(5, 1, 0, 2));

		// Making the frame closeable
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

		// NavBar
		navBar = new JPanel();

		navBar.setLayout(new GridLayout(1, 8));

		fileBtn = new JButton("File");
		editBtn = new JButton("Edit");
		viewBtn = new JButton("View");
		openBtn = new JButton("Open");

		navBar.add(fileBtn);
		navBar.add(editBtn);
		navBar.add(viewBtn);
		navBar.add(openBtn);

		// popFile
		popFile = new JPanel();
		// Buttons
		newBtn = new JButton("New File");
		saveBtn = new JButton("Save");
		saveAsBtn = new JButton("Save As");
		// Adding btns
		popFile.add(newBtn);
		popFile.add(saveBtn);
		popFile.add(saveAsBtn);
		// Layout
		popFile.setLayout(new GridLayout(3, 1));

		// popEdit
		popEdit = new JPanel();
		// Buttons
		renameBtn = new JButton("Rename");
		formatSourceBtn = new JButton("Format Source");
		// Adding btns
		popEdit.add(renameBtn);
		popEdit.add(formatSourceBtn);
		// Layout
		popEdit.setLayout(new GridLayout(2, 1));

		// popView
		popView = new JPanel();
		// Buttons
		windowViewBtn = new JButton("Window View");
		webViewBtn = new JButton("Web View");
		// Adding btns
		popView.add(windowViewBtn);
		popView.add(webViewBtn);
		// Layout
		popView.setLayout(new GridLayout(2, 1));

		// popOpen
		popOpen = new JPanel();
		// Buttons
		openFileBtn = new JButton("Open File");
		openFolderBtn = new JButton("Open Folder");
		// Adding btns
		popOpen.add(openFileBtn);
		popOpen.add(openFolderBtn);
		// Layout
		popOpen.setLayout(new GridLayout(2, 1));

		// Adding popPanels
		popPanels = new JPanel();
		popPanels.add(popFile);
		popPanels.add(popEdit);
		popPanels.add(popView);
		popPanels.add(popOpen);
		popPanels.setLayout(new GridLayout(1, 4));

		// Adding panels to Frame
		f.add(navBar);
		f.add(popPanels);

		popFile.setVisible(false);
		popEdit.setVisible(false);
		popView.setVisible(false);
		popOpen.setVisible(false);

		fileBtn.addActionListener(this);
		editBtn.addActionListener(this);
		viewBtn.addActionListener(this);
		openBtn.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == fileBtn) {
			popFile.setVisible(true);
			popEdit.setVisible(false);
			popView.setVisible(false);
			popOpen.setVisible(false);
		} else if (e.getSource() == editBtn) {
			popEdit.setVisible(true);
			popFile.setVisible(false);
			popView.setVisible(false);
			popOpen.setVisible(false);
		} else if (e.getSource() == viewBtn) {
			popView.setVisible(true);
			popEdit.setVisible(false);
			popFile.setVisible(false);
			popOpen.setVisible(false);
		} else if (e.getSource() == openBtn) {
			popOpen.setVisible(true);
			popEdit.setVisible(false);
			popFile.setVisible(false);
			popView.setVisible(false);
		}
	}

	public static void main(String[] args) {
		new App();
	}
}
