package com.company;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int inputNumber = Integer.parseInt(scanner.nextLine());
        int maxNumber = inputNumber;

        for (int i = 1; i < n; i++) {
            inputNumber = Integer.parseInt(scanner.nextLine());
            if (maxNumber < inputNumber) {
                maxNumber = inputNumber;
            }
        }
        System.out.println(maxNumber);
    }
}