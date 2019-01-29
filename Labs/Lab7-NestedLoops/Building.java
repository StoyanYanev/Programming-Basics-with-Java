package com.company;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int i = floors; i > 0; i--) {
            for (int j = 0; j < rooms; j++) {
                if (i == floors) {
                    System.out.printf("L%d" + j, i);
                } else {
                    if (i % 2 == 0) {
                        System.out.printf("O%d" + j, i);
                    } else {
                        System.out.printf("A%d" + j, i);
                    }
                }
                if (j + 1 < rooms) {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}