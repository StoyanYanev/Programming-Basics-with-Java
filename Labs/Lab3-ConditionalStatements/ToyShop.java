package com.company;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        int numberOfPuzzle = Integer.parseInt(scanner.nextLine());
        int numberOfDolls = Integer.parseInt(scanner.nextLine());
        int numberOfBears = Integer.parseInt(scanner.nextLine());
        int numberOfMinions = Integer.parseInt(scanner.nextLine());
        int numberOfTrucks = Integer.parseInt(scanner.nextLine());

        int allToys = numberOfPuzzle + numberOfDolls + numberOfBears + numberOfMinions + numberOfTrucks;
        double allPrice = numberOfPuzzle * 2.60 + numberOfDolls * 3.00 + numberOfBears * 4.10 + numberOfMinions * 8.20 + numberOfTrucks * 2.00;

        if (allToys >= 50) {
            allPrice = allPrice - allPrice * 0.25;
        }
        allPrice = allPrice - allPrice * 0.10;

        if (allPrice >= price) {
            System.out.printf("Yes! %.2f lv left.", allPrice - price);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", price - allPrice);
        }
    }
}