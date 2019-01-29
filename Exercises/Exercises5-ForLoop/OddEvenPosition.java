package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double inputNumber;
        double evenSum = 0;
        double evenMin = 10000000000.0;
        double evenMax = -10000000000.0;
        double oddSum = 0;
        double oddMin = 10000000000.0;
        double oddMax = -10000000000.0;

        for (int i = 1; i <= n; i++) {
            inputNumber = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += inputNumber;
                if (inputNumber > evenMax) {
                    evenMax = inputNumber;
                }
                if (inputNumber < evenMin) {
                    evenMin = inputNumber;
                }
            } else {
                oddSum += inputNumber;
                if (inputNumber > oddMax) {
                    oddMax = inputNumber;
                }
                if (inputNumber < oddMin) {
                    oddMin = inputNumber;
                }
            }
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("OddSum=" + df.format(oddSum));
        if (oddMin == 10000000000.0) {
            System.out.println("OddMin=No");
        } else {
            System.out.println("OddMin=" + df.format(oddMin));
        }
        if (oddMax == -10000000000.0) {
            System.out.println("OddMax=No");
        } else {
            System.out.println("OddMax=" + df.format(oddMax));
        }
        System.out.println("EvenSum=" + df.format(evenSum));
        if (evenMin == 10000000000.0) {
            System.out.println("EvenMin=No");
        } else {
            System.out.println("EvenMin=" + df.format(evenMin));
        }
        if (evenMax == -10000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            System.out.println("EvenMax=" + df.format(evenMax));
        }
    }
}