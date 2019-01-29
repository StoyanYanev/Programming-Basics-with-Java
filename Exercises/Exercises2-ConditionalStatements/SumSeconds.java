package com.company;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secondsOfFirstPlayer = Integer.parseInt(scanner.nextLine());
        int secondsOfSecondPlayer = Integer.parseInt(scanner.nextLine());
        int secondsOfThirdPlayer = Integer.parseInt(scanner.nextLine());

        int allSeconds = secondsOfFirstPlayer + secondsOfSecondPlayer + secondsOfThirdPlayer;

        int minutes = allSeconds / 60;
        int seconds = allSeconds % 60;

        if (seconds < 10) {
            System.out.println(minutes + ":0" + seconds);
        } else {
            System.out.println(minutes + ":" + seconds);
        }
    }
}