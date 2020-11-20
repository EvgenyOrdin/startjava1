package com.startjava.lesson_1.calculator;

public class Calculator {
	public static void main(String[] args) {
		int x = 10; 
		int y = 11; // числа вводимые пользователем
		char mathSymbol = '/';
		double result;
		
		if (mathSymbol == '%') {
			result = x % y;
			System.out.println(x + " " + mathSymbol + " " + y + " = " + result);
		} else if (mathSymbol == '+') {
			result = x + y;
			System.out.println(x + " " + mathSymbol + " " + y + " = " + result);
		} else if (mathSymbol == '-') {
			result = x - y;
			System.out.println(x + " " + mathSymbol + " " + y + " = " + result);
		} else if (mathSymbol == '*') {
			result = x * y;
			System.out.println(x + " " + mathSymbol + " " + y + " = " + result);
		} else if (mathSymbol == '/') {
			result = (double)x / y;
			System.out.println(x + " " + mathSymbol + " " + y + " = " + result);
		} else if (mathSymbol == '^' && y > 0) {
			result = x;
			for (int i = 1; i < y; i++) {
				result *= x;
			}
			System.out.println(x + " " + mathSymbol + " " + y + " = " + result);
		}
	}
}