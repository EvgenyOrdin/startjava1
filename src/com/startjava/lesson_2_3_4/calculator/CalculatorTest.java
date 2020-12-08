package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        String answer = "yes";

        while (answer.equals("yes")) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите математическое выражение, разделяя символы пробелом: ");

            String mathExpression = scan.nextLine();

            String[] arguments = mathExpression.split(" ");

            calc.input(arguments);

            System.out.println(calc.calculate());

            do {
                System.out.print("Хотите продолжить ? (yes/no):");
                answer = scan.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}