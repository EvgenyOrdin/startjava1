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

	public void generator() {
		Random random = new Random();
		compNum = random.nextInt(100);
		System.out.println("Компьютер загадал число от 0 до 100!");
	}

	public void game() {
		while(true) {
			Scanner scan = new Scanner(System.in);
		
			System.out.print(p1.getName() + " введите число: ");
			p1.setNumber(scan.nextInt());
		
			System.out.print(p2.getName() + " введите число: ");
			p2.setNumber(scan.nextInt());

			if(compNum == p1.getNumber() && p1.getNumber() != p2.getNumber()) {
				System.out.println(p1.getName() + " Победил(а)");
				break;
			} else if(compNum == p2.getNumber() && p1.getNumber() != p2.getNumber()) {
				System.out.println(p2.getName() + " Победил(а)");
				break;
			} else if(p1.getNumber() == p2.getNumber()) {
				System.out.println("Игроки ввели одинаковые числа, победитель может быть только один");
			} else {
				hint1();
				hint2();
				System.out.println("Продолжаем...");
			}
		}
	}

	public void hint1() {
		if (compNum > p1.getNumber()) {
				System.out.println(p1.getName() + "! число компьютера больше чем ваше!");
			} else if (compNum < p1.getNumber()) {
				System.out.println(p1.getName() + "! число компьютера меньше чем ваше!");
			}
	}

	public void hint2() {
		if (compNum > p2.getNumber()) {
				System.out.println(p2.getName() + "! число компьютера больше чем ваше!");
			} else if (compNum < p2.getNumber()) {
				System.out.println(p2.getName() + "! число компьютера меньше чем ваше!");
			}
	}
}