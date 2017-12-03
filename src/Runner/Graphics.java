package Runner;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphics {
	static private Graphics instance = null;
	
	private JFrame gameFrame;
	private JPanel gamePanel;
	private JButton[][] mines;

	private Graphics(int width, int height) {
		gameFrame = new JFrame();
		gamePanel = new JPanel(new GridLayout(width, height));
		mines = new JButton[width][height];

		gamePanel.setPreferredSize(new Dimension(width * 40, height * 50));
		gameFrame.add(gamePanel);

		for (int i = 0; i < mines.length; i++) {
			for (int j = 0; j < mines[0].length; j++) {
				mines[i][j] = new JButton();
				gamePanel.add(mines[i][j]);
			}
		}

		gameFrame.setVisible(true);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.pack();
	}
	
	public static Graphics getInstance() {
		if (instance == null) {
			instance = new Graphics(10, 10);
		}
		
		return instance;
	}
}
