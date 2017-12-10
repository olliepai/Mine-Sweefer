package Runner;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MineSweeferGFX {
	private JFrame gameFrame;
	private JPanel gamePanel;
	private JButton[][] gameButtons;

	public MineSweeferGFX(int width, int height, ActionListener gameActionListener) {
		gameFrame = new JFrame();
		gamePanel = new JPanel(new GridLayout(width, height));
		gameButtons = new JButton[width][height];

		gamePanel.setPreferredSize(new Dimension(width * 40, height * 50));
		gameFrame.add(gamePanel);

		for (int i = 0; i < gameButtons.length; i++) {
			for (int j = 0; j < gameButtons[0].length; j++) {
				gameButtons[i][j] = new JButton();
				gamePanel.add(gameButtons[i][j]);
				gameButtons[i][j].addActionListener(gameActionListener);
			}
		}

		gameFrame.setVisible(true);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameFrame.pack();
	}

	public int[] getMineLocation(ActionEvent e) {
		JButton clickedMine = (JButton) e.getSource();
		int[] clickedMinePosition = new int[2];
		
		for (int i = 0; i < gameButtons.length; i++) {
			for (int j = 0; j < gameButtons[0].length; j++) {
				if (gameButtons[i][j] == clickedMine) {
					clickedMinePosition[0] = i;
					clickedMinePosition[1] = j;
				}
			}
		}
		
		return clickedMinePosition;
	}
}
