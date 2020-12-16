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

        for (int i = 1; i < 11; i++) {
          if (stepGame(i, p1)) {
              break;
          } else if (stepGame(i, p2)) {
              break;
          }
        }
        finishGame();
    }

    private void generateNumber() {
        Random random = new Random();
        compNum = random.nextInt(100);
        System.out.println("Компьютер загадал число от 0 до 100!");
        System.out.println(compNum); // для тестового прогона
    }

    private void inputNumber(int index, Player p) {
        p.setAttempt(index);
        Scanner scan = new Scanner(System.in);
        System.out.print(p.getName() + ", введите число: ");
        p.setNumber(scan.nextInt());
    }

    private boolean compareNumbers(Player p) {
        if (compNum != p.getLastNumber()) {
            System.out.printf("%s, число компьютера" + (compNum > p.getLastNumber() ? " больше" : " меньше") + ", чем ваше!\n", p.getName());
            return false;
        }
        System.out.printf("Игрок %s, ПОБЕДИЛ c попытки № %s ! ", p.getName(), p.getAttempt());
        return true;
    }

    private void displayResult(Player p) {
        System.out.printf("\nПопытки игрока %s : ", p.getName());
        for(int number : p.getEnteredNumbers()) {
            System.out.print(number + " ");
        }
    }

    private boolean stepGame(int attempt, Player p) {
        inputNumber(attempt, p);
        boolean win = compareNumbers(p);
        checkAttempt(p);
        return win;
    }

    private void checkAttempt(Player p) {
        if (p.getAttempt() == 10) {
            System.out.printf("У Вас, %s, закончились попытки!\n ",p.getName());
        }
    }

    private void finishGame() {
        displayResult(p1);
        displayResult(p2);

        p1.zeroing();
        p2.zeroing();
    }
}