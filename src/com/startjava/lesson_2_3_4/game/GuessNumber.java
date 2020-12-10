package com.startjava.lesson_2_3_4.game;


import java.util.Arrays;
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
            if (compareNumbers(attempt, p1.getElementOfNumbers(i), p1.getName())) {
                break;
            }

            inputNumber(i, p2);
            if (compareNumbers(attempt, p2.getElementOfNumbers(i), p2.getName())) {
                break;
            }
            attempt++;
        }
        finishing(attempt);
    }

    private void generateNumber() {
        Random random = new Random();
        compNum = random.nextInt(100);
        System.out.println("Компьютер загадал число от 0 до 100!");
        System.out.println(compNum); // для тестового прогона
    }

    private boolean compareNumbers(int attemptNum, int number, String name) {
        if (compNum != number) {
            System.out.printf("%s, число компьютера" + (compNum > number ? " больше" : " меньше") + ", чем ваше!\n", name);
            if (attemptNum == 10) {
                System.out.println("У Вас, " + name + ", закончились попытки! ");
            }
            return false;
        }
        System.out.println("Игрок " + name + ", ПОБЕДИЛ c попытки" + " № " + attemptNum + "! ");
        return true;
    }

    private void inputNumber(int index, Player p) {
        Scanner scan = new Scanner(System.in);
        System.out.print(p.getName() + ", введите число: ");
        p.setNumbers(index, scan.nextInt());
    }

    private void displayTheResult(Player p, int attempt) {
        int[] numbersCopy = new int[0];
        if (attempt > 10) {
            numbersCopy = Arrays.copyOf(p.getNumbers(), p.getLength());
        } else {
            numbersCopy = Arrays.copyOf(p.getNumbers(), attempt);
        }
        System.out.printf("Попытки игрока %s : %s\n", p.getName(), Arrays.toString(numbersCopy));
    }

    private void finishing(int attempt) {
        displayTheResult(p1, attempt);
        displayTheResult(p2, attempt);

        p1.zeroing(attempt);
        p2.zeroing(attempt);
    }
}