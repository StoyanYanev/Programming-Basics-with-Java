package com.company;

import java.util.Scanner;

public class WeddingParty {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGuests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        int price = numberOfGuests * 20;

        if (price <= budget) {
            int leftMoney = budget - price;
            double fireworks = leftMoney * 0.4;
            double donation = leftMoney - fireworks;
            System.out.printf("Yes! %.0f lv are for fireworks and %.0f lv are for donation.", fireworks, donation);
        } else {
            System.out.printf("They won't have enough money to pay the covert. They will need %d lv more.", price - budget);
        }
    }
}