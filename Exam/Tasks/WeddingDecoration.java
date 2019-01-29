package com.company;

import java.util.Scanner;

public class WeddingDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String type;
        int numbers;

        int numberOfBalloons = 0;
        int numberOfFlowers = 0;
        int numberOfCandles = 0;
        int numberOfRibbon = 0;

        double currentSum = 0;

        while (budget - currentSum > 0) {
            type = scanner.nextLine();
            if (type.equals("stop")) break;
            numbers = Integer.parseInt(scanner.nextLine());

            if (type.equals("balloons")) {
                currentSum += numbers * 0.1;
                numberOfBalloons += numbers;
            } else if (type.equals("flowers")) {
                currentSum += numbers * 1.5;
                numberOfFlowers += numbers;
            } else if (type.equals("candles")) {
                currentSum += numbers * 0.5;
                numberOfCandles += numbers;
            } else if (type.equals("ribbon")) {
                currentSum += numbers * 2;
                numberOfRibbon += numbers;
            }
            if (budget - currentSum <= 0) break;
        }

        if (budget - currentSum <= 0) {
            System.out.println("All money is spent!");
            System.out.printf("Purchased decoration is %d balloons, %d m ribbon, %d flowers and %d candles.", numberOfBalloons, numberOfRibbon, numberOfFlowers, numberOfCandles);
        } else {
            System.out.printf("Spend money: %.2f", currentSum);
            System.out.println();
            System.out.printf("Money left: %.2f", budget - currentSum);
            System.out.println();
            System.out.printf("Purchased decoration is %d balloons, %d m ribbon, %d flowers and %d candles.", numberOfBalloons, numberOfRibbon, numberOfFlowers, numberOfCandles);
        }

    }
}