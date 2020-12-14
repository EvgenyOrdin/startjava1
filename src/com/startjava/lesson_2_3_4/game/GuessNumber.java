package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player p1;
    private Player p2;
    private int compNum;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        generateNumber();

        int attempt = 1;
        for (int i = 0; i < 10; i++) {
            inputNumber(i, p1);
            if (compareNumbers(attempt, p1.getNumber(i), p1.getName())) {
                break;
            }

            inputNumber(i, p2);
            if (compareNumbers(attempt, p2.getNumber(i), p2.getName())) {
                break;
            }
            attempt++;
        }
        finishGame(attempt);
    }

    private void generateNumber() {
        Random random = new Random();
        compNum = random.nextInt(100);
        System.out.println("Компьютер загадал число от 0 до 100!");
        System.out.println(compNum); // для тестового прогона
    }

    private void inputNumber(int index, Player p) {
        p.setAttempt(index + 1);
        Scanner scan = new Scanner(System.in);
        System.out.print(p.getName() + ", введите число: ");
        p.setNumber(index, scan.nextInt());
    }

    private boolean compareNumbers(int attemptNum, int number, String name) {
        if (compNum != number) {
            System.out.printf("%s, число компьютера" + (compNum > number ? " больше" : " меньше") + ", чем ваше!\n", name);
            if (attemptNum == 10) {
                System.out.printf("У Вас, %s, закончились попытки!\n ",name);
            }
            return false;
        }
        System.out.printf("\nИгрок %s, ПОБЕДИЛ c попытки № %s ! ", name, attemptNum);
        return true;
    }

    private void displayResult(Player p) {
        System.out.printf("\nПопытки игрока %s : ", p.getName());
        for(int number : p.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
    }

    private void finishGame(int attempt) {
        displayResult(p1);
        displayResult(p2);

        p1.zeroing(attempt);
        p2.zeroing(attempt);
    }
}