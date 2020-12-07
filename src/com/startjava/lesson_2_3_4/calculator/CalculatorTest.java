package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculate = new Calculator();

		String answer = "yes";

		while(answer.equals("yes")) {
			Scanner scan = new Scanner(System.in);

			calculate.input();

			System.out.println(calculate.calc());

			do {
				System.out.print("Хотите продолжить ? (yes/no):");
				answer = scan.next();
			} while(!answer.equals("yes") && !answer.equals("no"));
		}
	}
}