package Runner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MineSweefer implements ActionListener {
	MineSweeferGFX gfx;
	MineSweeferLogic logic;
	
	private boolean firstClick = false;
	
	public static void main(String[] args) {
		MineSweefer gameObject = new MineSweefer();
		gameObject.startGame();
	}
	
	public void startGame() {
		gfx = new MineSweeferGFX(10, 10, this);
		logic = new MineSweeferLogic(10, 10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Clicked at position (" + gfx.getMineLocation(e)[0] + ", " + gfx.getMineLocation(e)[1] + ")");
		
		if (!firstClick) {
			firstClick = true;
			logic.initializeMines(10, gfx.getMineLocation(e));
		}
	}
}
