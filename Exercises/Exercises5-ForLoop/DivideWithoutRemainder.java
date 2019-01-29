package com.company;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int inputNumber;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 0; i < n; i++) {
            inputNumber = Integer.parseInt(scanner.nextLine());
            if (inputNumber % 2 == 0){
                p1++;
            }
            if (inputNumber % 3 == 0){
                p2++;
            }
            if (inputNumber % 4 == 0){
                p3++;
            }
        }
        System.out.printf("%.2f", (double) p1 / n * 100);
        System.out.println("%");
        System.out.printf("%.2f", (double) p2 / n * 100);
        System.out.println("%");
        System.out.printf("%.2f", (double) p3 / n * 100);
        System.out.println("%");
    }
}