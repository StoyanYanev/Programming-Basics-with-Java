package com.company;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int firstPair;
        int secondPair;
        int sum = 0;
        int sumOfPreviousPair = 0;
        int maxDifference = 0;
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            firstPair = Integer.parseInt(scanner.nextLine());
            secondPair = Integer.parseInt(scanner.nextLine());

            sum = firstPair + secondPair;
            if (sum == sumOfPreviousPair) {
                counter++;
            }
            if (Math.abs(sum - sumOfPreviousPair) > maxDifference && i != 1) {
                maxDifference = Math.abs(sum - sumOfPreviousPair);
            }
            sumOfPreviousPair = sum;
        }

        if (counter == n - 1) {
            System.out.printf("Yes, value=%d", sum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDifference);

        }
    }
}