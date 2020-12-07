package com.startjava.lesson_2_3_4.game;

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
		
		do {
			inputNumber(p1);

			if(compareNumbers(p1.getNumber(), p1.getName())) {
				break;
			}
			
			inputNumber(p2);

		} while(!compareNumbers(p2.getNumber(), p2.getName()));
	}

	private void generateNumber() {
		Random random = new Random();
		compNum = random.nextInt(100);
		System.out.println("Компьютер загадал число от 0 до 100!");
	}

	private boolean compareNumbers(int number, String name) {
		if (compNum != number) {
			System.out.printf("%s, число компьютера" + (compNum > number ? " больше" : " меньше") + ", чем ваше! ",name);
			return false;
		}
			System.out.println(name + ", ВЫ ПОБЕДИЛИ!");
			return true;		
	}

	private void inputNumber(Player p) {
		Scanner scan = new Scanner(System.in);
		System.out.print(p.getName() + ", введите число: ");
		p.setNumber(scan.nextInt());
	}
}