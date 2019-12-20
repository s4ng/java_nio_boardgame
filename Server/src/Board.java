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

		// �迭�� �������� 1/15Ȯ���� COIN ����
		for(int i = 0; i < tiles; i++) {
			int ranNum = random.nextInt(10);
			if(ranNum == 0) {
				board[i] = 'C';
			}
		}
		
		// �迭�� ���� 1/15 Ȯ���� ICE ����
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