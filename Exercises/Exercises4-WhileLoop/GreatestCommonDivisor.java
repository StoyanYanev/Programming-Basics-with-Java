package com.company;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int temp;
        while (a != b) {
            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            a -= b;
        }
        System.out.println(a);
    }
}