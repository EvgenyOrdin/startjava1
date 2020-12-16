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

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public void setNumber(int number) {
        numbers[attempt - 1] = number;
    }

    public int getLastNumber() {
        return numbers[attempt - 1];
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(numbers, attempt);
    }

    public void zeroing() {
        Arrays.fill(numbers, 0, attempt, 0);
        attempt = 0;
    }
}
