package Runner;

import java.util.ArrayList;
import java.util.Random;

public class MineSweeferLogic {
	int width;
	int height;

	int[][] mines;
	
	Random ranGen;

	public MineSweeferLogic(int width, int height) {
		this.width = width;
		this.height = height;

		mines = new int[width][height];
		
		ranGen = new Random();
	}

	public void initializeMines(int totalMines, int[] firstClickLocation) {
		int maxMines = width * height - 1;
		int totalButtons = width * height;

		if (totalMines > maxMines) {
			totalMines = maxMines;
		} else if (totalMines < 1) {
			totalMines = 1;
		}
		
		ArrayList<Integer> mineLocationList = new ArrayList<Integer>();
		
		while (totalMines > 0) {
			int random = ranGen.nextInt(totalButtons);
			while (mineLocationList.contains(random)) {
				random = ranGen.nextInt(totalButtons);
			}
			mineLocationList.add(random);
			totalMines--;
		}
		
		for (int location : mineLocationList) {
			System.out.println(location);
		}
	}
}
