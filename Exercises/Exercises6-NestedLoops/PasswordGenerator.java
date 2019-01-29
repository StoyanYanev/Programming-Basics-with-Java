package com.company;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner Scan_SPG = new Scanner(System.in);

        int n = Integer.parseInt(Scan_SPG.nextLine());
        int l = Integer.parseInt(Scan_SPG.nextLine());

        String input = " ";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 97; k < 97 + l; k++) {
                    for (int z = 97; z < 97 + l; z++) {
                        for (int m = 1; m <= n; m++) {
                            if (m > i && m > j) {
                                System.out.print(input + i + j + (char) k + (char) z + m);
                            }
                        }
                    }
                }
            }
        }
    }
}