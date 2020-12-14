package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("У вас 10 попыток, что бы угадать число!");

        Scanner scan = new Scanner(System.in);

        System.out.print("Первый игрок, назовите себя : ");
        Player p1 = new Player(scan.next());

        System.out.print("Второй игрок, назовите себя : ");
        Player p2 = new Player(scan.next());

        String answer = "yes";

        while (answer.equals("yes")) {
            GuessNumber game = new GuessNumber(p1, p2);
            game.start();

            do {
                System.out.print("\nПродолжаем?(yes/no): ");
                answer = scan.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}