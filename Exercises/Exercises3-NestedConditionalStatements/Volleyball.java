package com.company;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int weekendsInSofia = 48 - h;
        double numberOfGamesInSofia = weekendsInSofia * (3.0 / 4);
        int numberOfGamesInHometown = h;
        double numberOfGamesInHoliday = p * (2.0 / 3);

        double allGames = numberOfGamesInSofia + numberOfGamesInHometown + numberOfGamesInHoliday;

        if (year.equals("leap")) {
            allGames = allGames + allGames * 0.15;
        }
        System.out.println(Math.floor(allGames));
    }
}