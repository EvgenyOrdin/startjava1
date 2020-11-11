import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	private Player p1;
	private Player p2;
	private int compNum;

	public GuessNumber(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public void start() {
		generateNumber();
		
		while(true) {
			Scanner scan = new Scanner(System.in);
		
			System.out.print(p1.getName() + " введите число: ");
			p1.setNumber(scan.nextInt());

			boolean check = compareNumbers(p1.getNumber(), p1.getName());

			if(check) {
				break;
			}
		
			System.out.print(p2.getName() + " введите число: ");
			p2.setNumber(scan.nextInt());

			check = compareNumbers(p2.getNumber(), p2.getName());

			if(check) {
				break;
			}	
		}
	}

	private void generateNumber() {
		Random random = new Random();
		compNum = random.nextInt(100);
		System.out.println("Компьютер загадал число от 0 до 100!");
	}

	private boolean compareNumbers(int number, String name) {
		if (compNum != number) {
				System.out.println(name + (compNum > number ? "! число компьютера больше чем ваше!" : "! число компьютера меньше чем ваше!"));
				return false;
			} else {
				System.out.println(name + ", ВЫ ПОБЕДИЛИ!");
				return true;
			}
	}
}