package com.company;

import java.util.Scanner;

public class ThreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstBrother = Double.parseDouble(scanner.nextLine());
        double secondBrother = Double.parseDouble(scanner.nextLine());
        double thirdBrother = Double.parseDouble(scanner.nextLine());
        double father = Double.parseDouble(scanner.nextLine());

        double allTime = 1 / (1 / firstBrother + 1 / secondBrother + 1 / thirdBrother);
        allTime = allTime + allTime * 0.15;
        double timeLeft = father - allTime;

        if (timeLeft > 0) {
            System.out.printf("Cleaning time: %.2f %nYes, there is a surprise - time left -> %.0f hours.", allTime, Math.floor(timeLeft));
        } else {
            timeLeft = Math.abs(timeLeft);
            System.out.printf("Cleaning time: %.2f %nNo, there isn't a surprise - shortage of time -> %.0f hours.", allTime, Math.ceil(timeLeft));
        }
    }
}