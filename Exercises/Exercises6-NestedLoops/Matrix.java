package com.company;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            for (int j = a; j <= b; j++) {
                for (int k = c; k <= d; k++) {
                    for (int l = c; l <= d; l++) {
                        if (i != j && k != l && (i + l) == (k + j)) {
                            if (cnt++ > 0) System.out.println();
                            System.out.println(i + "" + j);
                            System.out.println(k + "" + l);
                        }
                    }
                }
            }
        }
    }
}