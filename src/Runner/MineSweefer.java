package Runner;

public class MineSweefer {
	Graphics gfx;
	
	public static void main(String[] args) {
		MineSweefer gameObject = new MineSweefer();
		gameObject.startGame();
	}
	
	public void startGame() {
		gfx = Graphics.getInstance();
	}
}
