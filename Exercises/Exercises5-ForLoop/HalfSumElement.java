package com.company;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int inputNumber;
        int sum = 0;
        int maxElement = 0;
        for (int i = 0; i < n; i++) {
            inputNumber = Integer.parseInt(scanner.nextLine());
            if (inputNumber > maxElement) {
                maxElement = inputNumber;
            }
            sum = sum + inputNumber;
        }

        sum = sum - maxElement;
        if (sum == maxElement) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxElement - sum));
        }
    }
}