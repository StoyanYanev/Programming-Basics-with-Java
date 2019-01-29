package com.company;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int inputNumber = Integer.parseInt(scanner.nextLine());
        int minNumber = inputNumber;

        for (int i = 1; i < n; i++) {
            inputNumber = Integer.parseInt(scanner.nextLine());
            if (minNumber > inputNumber) {
                minNumber = inputNumber;
            }
        }
        System.out.println(minNumber);
    }
}