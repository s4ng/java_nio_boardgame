import java.util.Random;

public class Board {
	private int tiles;
	private char[] board;
	
	public Board(int t) {
		tiles = t;
		board = new char[tiles];
		for(int i = 0; i < tiles; i++) board[i] = '#';
	}
	
	public void setUpBoard() {
		Random random = new Random();
		
		int loc = random.nextInt(100) + 5;

		// ¹è¿­¿¡ ·£´ýÀ¸·Î 1/15È®·ü·Î COIN »ðÀÔ
		for(int i = 0; i < tiles; i++) {
			int ranNum = random.nextInt(10);
			if(ranNum == 0) {
				board[i] = 'C';
			}
		}
		
		// ¹è¿­¿¡ ·£´ý 1/15 È®·ü·Î ICE »ðÀÔ
		for(int i = 0; i < tiles; i++) {
			int ranNum = random.nextInt(10);
			if(ranNum == 0) {
				board[i] = 'I';
			}
		}
	}
	public void displayBoard() {
		for(int i = 0; i < tiles; i++) {
			System.out.printf("%c ", board[i]);
		}
	}
}