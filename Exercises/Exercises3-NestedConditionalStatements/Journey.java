package com.company;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double spendMoney = 0.0;
        String destination;
        String holiday;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                holiday = "Camp";
                spendMoney = budget * 0.30;
            } else {
                holiday = "Hotel";
                spendMoney = budget * 0.70;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                holiday = "Camp";
                spendMoney = budget * 0.40;
            } else {
                holiday = "Hotel";
                spendMoney = budget * 0.80;
            }
        } else {
            destination = "Europe";
            holiday = "Hotel";
            spendMoney = budget * 0.90;
        }
        System.out.printf("Somewhere in %s", destination);
        System.out.println();
        System.out.printf("%s - %.2f", holiday, spendMoney);
    }
}