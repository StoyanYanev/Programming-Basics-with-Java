package com.company;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 1;
        int i = 0;
        while (number <= n) {
            for (int j = 0; j <= i; j++) {
                System.out.printf(number + " ");
                number++;
                if (number > n) break;
            }
            i++;
            System.out.println();
        }
    }
}