import java.util.Random;
import java.util.Scanner;

public class GameDriver {

	private Board b;
	private Player p1;
	private Player p2;
	
	public GameDriver(Board b, Player p1, Player p2) {
		this.b = b;
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public void playGame() {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Let's game begin.");
		int turns = 0, insert, ran;
		while(true) {
			if(b.board[b.tiles - 1] == '1' ||
			   b.board[b.tiles - 1] == '2' ) {
				System.out.printf("player%c win!!",b.board[b.tiles - 1]);
				break;
			}
			if(turns % 2 == 0) {
				System.out.print("Player 1 turns, type any word : ");
				in.next();
				ran = random.nextInt(6);
				b.playerChange('1', ran+1);
				System.out.printf("player%c go %d!\n", '1', ran+1);
				b.displayBoard();
			}
			else if(turns % 2 == 1) {
				System.out.print("Player 2 turns, type any word : ");
				in.next();
				ran = random.nextInt(6);
				b.playerChange('2', ran+1);
				System.out.printf("player%c go %d!\n", '1', ran+1);
				b.displayBoard();
			}
			turns++;
		}
	}
}
