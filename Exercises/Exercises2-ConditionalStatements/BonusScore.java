package com.company;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());
        double bonusScore = 0.0;

        if (score <= 100) {
            bonusScore = bonusScore + 5;
        } else if (score > 100 && score <= 1000) {
            bonusScore = bonusScore + (score * 0.2);
        } else if (score > 100) {
            bonusScore = bonusScore + (score * 0.1);
        }

        if (score % 2 == 0) {
            bonusScore = bonusScore + 1;
        } else if (score % 10 == 5) {
            bonusScore = bonusScore + 2;
        }

        double allScore = score + bonusScore;
        System.out.println(bonusScore);
        System.out.println(allScore);
    }
}