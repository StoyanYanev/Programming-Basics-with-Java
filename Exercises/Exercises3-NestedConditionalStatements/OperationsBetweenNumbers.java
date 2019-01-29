package com.company;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        double result = 0;
        String evenOrOdd;

        if (operator == '+') {
            result = firstNumber + secondNumber;
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
            System.out.printf("%d + %d = %.0f - %s", firstNumber, secondNumber, result, evenOrOdd);
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
            System.out.printf("%d - %d = %.0f - %s", firstNumber, secondNumber, result, evenOrOdd);
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
            System.out.printf("%d * %d = %.0f - %s", firstNumber, secondNumber, result, evenOrOdd);
        } else if (operator == '/' && secondNumber != 0) {
            result = (double) firstNumber / secondNumber;
            System.out.printf("%d / %d = %.2f", firstNumber, secondNumber, result);
        } else if (operator == '%' && secondNumber != 0) {
            result = firstNumber % secondNumber;
            System.out.print(firstNumber);
            System.out.print(" % ");
            System.out.printf("%d = %.0f", secondNumber, result);
        } else {
            System.out.printf("Cannot divide %d by zero", firstNumber);
        }
    }
}