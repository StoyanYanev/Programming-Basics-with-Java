package com.company;

import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;
        int next = 0;
        while (next <= n) {
            System.out.println(current);
            next = current * 2 + 1;
            current = next;
        }
    }
}