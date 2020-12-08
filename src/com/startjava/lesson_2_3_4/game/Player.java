package com.startjava.lesson_2_3_4.game;

public class Player {
	private String name;
	private int[] numbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumbers(int index, int value) {
		this.numbers[index] = value;
	}
		
	public int getElementOfNumbers(int index) {
		return numbers[index];
	}
}