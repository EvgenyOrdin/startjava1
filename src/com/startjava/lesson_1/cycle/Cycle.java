package com.startjava.lesson_1.cycle;

public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int g = 6;
		while(g >= -6) {
			System.out.println(g);
			g -= 2;
		}

		int e = 11;
		int sum = 0;
		do {
			sum += e;
			e += 2;
		} while(e < 20);
		System.out.println(sum);
	}
}