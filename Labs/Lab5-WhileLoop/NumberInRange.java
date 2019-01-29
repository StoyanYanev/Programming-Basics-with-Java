package com.company;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Еnter a number in the range [1...100]: ");
        int number = Integer.parseInt(scanner.nextLine());
        while (number < 1 || number > 100) {
            System.out.println("Invalid number!");
            System.out.println("Еnter a number in the range [1...100]: ");
            number = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The number is: %d", number);
    }
}