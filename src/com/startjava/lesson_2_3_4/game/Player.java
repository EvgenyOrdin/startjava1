package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int index, int number) {
        numbers[index] = number;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(getNumbers(), attempt);
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public void zeroing(int index) {
        Arrays.fill(numbers, 0, index - 1, 0);
    }

}
