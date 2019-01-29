package com.company;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMin = Integer.parseInt(scanner.nextLine());
        int numMax = Integer.parseInt(scanner.nextLine());
        int cnt = 0;
        for (int i = numMin; i <= numMax; i++) {
            String numStr = Integer.toString(i);
            int sumOdd = 0;
            int sumEven = 0;
            for (int j = 1; j <= numStr.length(); j++) {
                String s = "" + numStr.charAt(j - 1);
                int n = Integer.parseInt(s);
                if (j % 2 == 0) sumEven += n;
                else sumOdd += n;
            }
            if (sumOdd != 0 && sumOdd == sumEven) {
                if (cnt++ > 0) {
                    System.out.print(" " + numStr);
                } else {
                    System.out.print(numStr);
                }
            }
        }
    }
}