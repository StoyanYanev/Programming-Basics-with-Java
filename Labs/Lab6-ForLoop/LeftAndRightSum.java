package com.company;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int inputNumber;
        int sumOfLeftElements = 0;
        int sumOfRightElements = 0;

        for (int i = 0; i < n; i++) {
            inputNumber = Integer.parseInt(scanner.nextLine());
            sumOfLeftElements += inputNumber;
        }

        for (int i = 0; i < n; i++) {
            inputNumber = Integer.parseInt(scanner.nextLine());
            sumOfRightElements += inputNumber;
        }

        int difference = Math.abs(sumOfLeftElements - sumOfRightElements);
        if (difference == 0) {
            System.out.printf("Yes, sum = %d", sumOfLeftElements);
        } else {
            System.out.printf("No, diff = %d", difference);
        }
    }
}