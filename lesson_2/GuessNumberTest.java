import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
	public static void main(String[] args) {
		String answer = "yes";
		Scanner scan = new Scanner(System.in);

		System.out.print("Первый игрок, назовите себя : ");
		Player p1 = new Player(scan.next());
			
		System.out.print("Второй игрок,назовите себя : ");
		Player p2 = new Player(scan.next());

		while(answer.equals("yes")) {
			GuessNumber game = new GuessNumber(p1, p2);
			
			game.generator();
			
			game.game();
			
			do {
				System.out.println("Продолжаем?(yes/no)");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		}
	}
}