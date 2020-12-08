package com.startjava.lesson_2_3_4.game;

import java.sql.SQLOutput;
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

		for (int i = 0; i < 10; i++) {
			inputNumber(i, p1);

			if (compareNumbers(i, p1.getElementOfNumbers(i), p1.getName())) {
				break;
			}

			inputNumber(i, p2);

			if (compareNumbers(i, p2.getElementOfNumbers(i), p2.getName())) {
				break;
			}
		}
	}

	private void generateNumber() {
		Random random = new Random();
		compNum = random.nextInt(100);
		System.out.println("Компьютер загадал число от 0 до 100!");
	}

	private boolean compareNumbers(int attempt, int number, String name) {
		if (compNum != number) {
			System.out.printf("%s, число компьютера" + (compNum > number ? " больше" : " меньше") + ", чем ваше! ", name);
			if (attempt == 9) {
				System.out.println("У Вас, " + name + ", закончились попытки! ");
			}
			return false;
		}
		System.out.println("Игрок" + name + ", ПОБЕДИЛ c попытки" + attempt + "! ");
		return true;
	}

	private void inputNumber(int index, Player p) {
		if (index <= 9) {
			Scanner scan = new Scanner(System.in);
			System.out.print(p.getName() + ", введите число: ");
			p.setNumbers(index, scan.nextInt());
		}
	}
}