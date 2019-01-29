package com.company;

import java.util.Scanner;

public class NameWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String winName = "";
        int currentScore = 0;
        int maxScore = 0;
        while (!name.equals("STOP")) {
            for (int i = 0; i < name.length(); i++) {
                currentScore += (int) name.charAt(i);
            }
            if (currentScore > maxScore) {
                winName = name;
                maxScore = currentScore;
            }
            name = scanner.nextLine();
            currentScore = 0;
        }
        System.out.printf("Winner is %s - %d!", winName, maxScore);
    }
}