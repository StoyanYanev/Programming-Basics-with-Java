package com.company;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberOfFishermen = Integer.parseInt(scanner.nextLine());

        double allSum = 0.0;

        if (season.equals("Spring")) {
            allSum = allSum + 3000;
        } else if (season.equals("Summer")) {
            allSum = allSum + 4200;
        } else if (season.equals("Autumn")) {
            allSum = allSum + 4200;
        } else {
            allSum = allSum + 2600;
        }

        if (numberOfFishermen <= 6) {
            allSum = allSum - allSum * 0.10;
        } else if (numberOfFishermen >= 7 && numberOfFishermen <= 11) {
            allSum = allSum - allSum * 0.15;
        } else {
            allSum = allSum - allSum * 0.25;
        }
        if (numberOfFishermen % 2 == 0 && (!season.equals("Autumn"))) {
            allSum = allSum - allSum * 0.05;
        }

        if (budget >= allSum) {
            double savedMoney = budget - allSum;
            System.out.printf("Yes! You have %.2f leva left.", savedMoney);
        } else {
            double neededMoney = allSum - budget;
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        }
    }
}