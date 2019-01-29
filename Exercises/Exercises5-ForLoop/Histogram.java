package com.company;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int inputNumber;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 0; i < n; i++) {
            inputNumber = Integer.parseInt(scanner.nextLine());
            if (inputNumber < 200) {
                p1++;
            } else if (inputNumber >= 200 && inputNumber < 400) {
                p2++;
            } else if (inputNumber >= 400 && inputNumber < 600) {
                p3++;
            } else if (inputNumber >= 600 && inputNumber < 800) {
                p4++;
            } else {
                p5++;
            }
        }
        System.out.printf("%.2f", (double) p1 / n * 100);
        System.out.println("%");
        System.out.printf("%.2f", (double) p2 / n * 100);
        System.out.println("%");
        System.out.printf("%.2f", (double) p3 / n * 100);
        System.out.println("%");
        System.out.printf("%.2f", (double) p4 / n * 100);
        System.out.println("%");
        System.out.printf("%.2f", (double) p5 / n * 100);
        System.out.println("%");
    }
}