import java.util.Random;

public class Board {
	private int p1 = 0, p2 = 0;
	public int tiles;
	public char[] board;
	
	public Board(int t) {
		tiles = t;
		board = new char[tiles];
		for(int i = 0; i < tiles; i++) board[i] = '-';
	}
	
	public void setUpBoard() {
		Random random = new Random();
		
		int loc = random.nextInt(100) + 5;

		// ¹è¿­¿¡ ·£´ıÀ¸·Î 1/15È®·ü·Î COIN »ğÀÔ
		for(int i = 0; i < tiles; i++) {
			int ranNum = random.nextInt(10);
			if(ranNum == 0) {
				board[i] = 'C';
			}
		}
		
		// ¹è¿­¿¡ ·£´ı 1/15 È®·ü·Î ICE »ğÀÔ
		for(int i = 0; i < tiles; i++) {
			int ranNum = random.nextInt(10);
			if(ranNum == 0) {
				board[i] = 'I';
			}
		}
	}
	
	private int playerCheck(char p) {
		for(int i = 0; i < tiles; i++) {
			if(board[i] == p) {
				return i;
			}
		}
		return -1;
	}

	public void playerChange(char p, int num) {
		int pPosition = playerCheck(p);

		if(pPosition + num == '-') {
			board[pPosition + num] = p;
			if(pPosition != -1)
				board[pPosition] = '-';
		}
		else if(pPosition + num == 'I') {
			playerChange(p, pPosition + num - 1);
			if(pPosition != -1)
				board[pPosition] = '-';
		}
		else if(pPosition + num == 'C') {
			playerChange(p, pPosition + num + 1);
			if(pPosition != -1)
				board[pPosition] = '-';
		}
		else {
			char loser = board[pPosition + num];
			board[pPosition + num] = p;
			if(pPosition != -1)
				board[pPosition] = '-';
		}
	}

	public void displayBoard() {
		for(int i = 0; i < tiles; i++) {
			System.out.printf("%c", board[i]);
		}
	}
}