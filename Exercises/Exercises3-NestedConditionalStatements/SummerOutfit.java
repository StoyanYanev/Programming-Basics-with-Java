package com.company;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degree = Integer.parseInt(scanner.nextLine());
        String partOfTheDay = scanner.nextLine();

        partOfTheDay = partOfTheDay.toLowerCase();

        if (partOfTheDay.equals("morning")) {
            if (degree >= 10 && degree <= 18) {
                System.out.printf("It's %d degrees, get your %s and %s.", degree, "Sweatshirt", "Sneakers");
            } else if (degree > 18 && degree <= 24) {
                System.out.printf("It's %d degrees, get your %s and %s.", degree, "Shirt", "Moccasins");
            } else {
                System.out.printf("It's %d degrees, get your %s and %s.", degree, "T-Shirt", "Sandals");
            }
        } else if (partOfTheDay.equals("afternoon")) {
            if (degree >= 10 && degree <= 18) {
                System.out.printf("It's %d degrees, get your %s and %s.", degree, "Shirt", "Moccasins");
            } else if (degree > 18 && degree <= 24) {
                System.out.printf("It's %d degrees, get your %s and %s.", degree, "T-Shirt", "Sandals");
            } else {
                System.out.printf("It's %d degrees, get your %s and %s.", degree, "Swim Suit", "Barefoot");
            }
        } else {
            System.out.printf("It's %d degrees, get your %s and %s.", degree, "Shirt", "Moccasins");
        }
    }
}