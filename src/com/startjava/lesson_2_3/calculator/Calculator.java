package com.startjava.lesson_2_3.calculator;

public class Calculator {
	private int x; 
	private int y; // числа вводимые пользователем
	private char mathSign;
		
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setMathSign(char mathSign) {
		this.mathSign = mathSign;
	}

	public void calc() {
		switch(mathSign) {
			case '+' :
				System.out.println(x + " " + mathSign + " " + y + " = " + (x + y));
				break;
			case '-' :
				System.out.println(x + " " + mathSign + " " + y + " = " + (x - y));
				break;
			case '%' :
				System.out.println(x + " " + mathSign + " " + y + " = " + (x % y));
				break;
			case '*' :
				System.out.println(x + " " + mathSign + " " + y + " = " + (x * y));
				break;
			case '/' :
				System.out.println(x + " " + mathSign + " " + y + " = " + ((double)x / y));
				break;
			case '^' :
				long result = x;
				for (int i = 1; i < y; i++) {
					result *= x;
				}
				System.out.println(x + " " + mathSign + " " + y + " = " + result);
				break;
			default :
				System.out.println("Введите корректный знак");			
			}
		}
}