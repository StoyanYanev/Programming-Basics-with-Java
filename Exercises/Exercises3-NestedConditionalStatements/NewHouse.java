package com.company;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFlowers = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double allSum = 0.0;

        if (typeOfFlowers.equals("Roses")) {
            allSum = numberOfFlowers * 5.00;
            if (numberOfFlowers > 80) {
                allSum = allSum - allSum * 0.10;
            }
        } else if (typeOfFlowers.equals("Dahlias")) {
            allSum = numberOfFlowers * 3.80;
            if (numberOfFlowers > 90) {
                allSum = allSum - allSum * 0.15;
            }
        } else if (typeOfFlowers.equals("Tulips")) {
            allSum = numberOfFlowers * 2.80;
            if (numberOfFlowers > 80) {
                allSum = allSum - allSum * 0.15;
            }
        } else if (typeOfFlowers.equals("Narcissus")) {
            allSum = numberOfFlowers * 3.00;
            if (numberOfFlowers < 120) {
                allSum = allSum + allSum * 0.15;
            }
        } else {
            allSum = numberOfFlowers * 2.50;
            if (numberOfFlowers < 80) {
                allSum = allSum + allSum * 0.20;
            }
        }

        if (budget >= allSum) {
            double savedMoney = budget - allSum;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberOfFlowers, typeOfFlowers, savedMoney);
        } else {
            double neededMoney = allSum - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
        }
    }
}