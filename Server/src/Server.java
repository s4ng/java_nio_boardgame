import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.*;
import java.nio.channels.ServerSocketChannel;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException  {
		// ���ӿ� ���� ������ ũ�� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���Ӻ����� ũ�⸦ �����ּ���!");
		int tiles = sc.nextInt();
		
		// ���ӿ� ���� ���� �����ϱ�
		Board b = new Board(tiles); // ���� tiles�� ����
		b.setUpBoard();
		b.displayBoard();

		// �÷��̾� �����
		Player tom = new Player("tom");
		Player jerry = new Player("jerry");
		
		// ���� ����̹��� ���� �����ϱ�
		GameDriver driver = new GameDriver(b, tom, jerry);
		
		//driver.playGame();
	}

}