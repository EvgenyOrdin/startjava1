package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

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

    public int[] getNumbers() {
        return numbers;
    }

    public int getElementOfNumbers(int index) {
        return numbers[index];
    }

    public int getLength() {
        return numbers.length;
    }

    public void zeroing(int index) {
        index--;
        Arrays.fill(numbers, 0, index, 0);

    }
}
