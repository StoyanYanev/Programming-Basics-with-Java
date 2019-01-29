package com.company;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceOfWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceOfToy = Integer.parseInt(scanner.nextLine());

        double allSum = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                allSum += i * 5;
                allSum -= 1.00;
            } else {
                allSum += priceOfToy;
            }
        }

        if (allSum >= priceOfWashingMachine) {
            System.out.printf("Yes! %.2f", allSum - priceOfWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceOfWashingMachine - allSum);
        }
    }
}