package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculate = new Calculator();

		String answer = "yes";

		while(answer.equals("yes")) {
			Scanner scan = new Scanner(System.in);

			System.out.print("Введите первое число:");
			calculate.setX(scan.nextInt());
		
			System.out.print("Введите знак математической операции:");
			calculate.setMathSign(scan.next().charAt(0));
		
			System.out.print("Введите второе число:");
			calculate.setY(scan.nextInt());

			calculate.calc();
			
			do {
				System.out.print("Хотите продолжить ? (yes/no):");
				answer = scan.next();
			} while(!answer.equals("yes") && !answer.equals("no"));
		}
	}
}