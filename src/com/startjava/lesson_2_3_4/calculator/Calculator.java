package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
	private int x;
	private int y; // числа вводимые пользователем
	private String mathSign;

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите математическое выражение, разделяя символы пробелом: ");
		String str = scan.nextLine();
		String[] arguments = str.split(" ");
		x = Integer.parseInt(arguments[0]);
		mathSign = arguments[1];
		y = Integer.parseInt(arguments[2]);
	}

	public double calc() {
		double result = 0;
		switch (mathSign) {
			case "+" -> result = Math.addExact(x, y);
			case "-" -> result = Math.subtractExact(x, y);
			case "%" -> result = Math.floorMod(x, y);
			case "*" -> result = Math.multiplyExact(x, y);
			case "/" -> result = Math.floorDiv(x, y);
			case "^" -> result = Math.pow(x, y);
			default -> System.out.println("Введите корректный знак");
		}
		return result;
	}
}