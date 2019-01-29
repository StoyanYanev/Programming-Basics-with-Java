package com.company;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command;
        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (true) {
            command = scanner.nextLine();
            if (command.equals("END") == true)
                break;
            number = Integer.parseInt(command);
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.printf("Max number: %d", max);
        System.out.println();
        System.out.printf("Min number: %d", min);
    }
}