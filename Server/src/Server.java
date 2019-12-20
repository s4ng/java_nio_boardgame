import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.*;
import java.nio.channels.ServerSocketChannel;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException  {
		// 게임에 사용될 보드의 크기 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("게임보드의 크기를 정해주세요!");
		int tiles = sc.nextInt();
		
		// 게임에 사용될 보드 생성하기
		Board b = new Board(tiles); // 길이 tiles인 보드
		b.setUpBoard();
		b.displayBoard();

		// 플레이어 만들기
		Player tom = new Player("tom");
		Player jerry = new Player("jerry");
		
		// 게임 드라이버로 게임 시작하기
		GameDriver driver = new GameDriver(b, tom, jerry);
		
		//driver.playGame();
	}

}