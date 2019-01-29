package com.company;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        category = category.toLowerCase();

        double priceOfVipTicket = 499.99;
        double priceOfNormalTicket = 249.99;

        double moneyForTravel = 0.0;
        double moneyForTicket = 0.0;

        if (numberOfPeople >= 1 && numberOfPeople <= 4) {
            moneyForTravel = moneyForTravel + budget * 0.75;
        } else if (numberOfPeople >= 5 && numberOfPeople <= 9) {
            moneyForTravel = moneyForTravel + budget * 0.6;
        } else if (numberOfPeople >= 10 && numberOfPeople <= 24) {
            moneyForTravel = moneyForTravel + budget * 0.5;
        } else if (numberOfPeople >= 25 && numberOfPeople <= 49) {
            moneyForTravel = moneyForTravel + budget * 0.4;
        } else {
            moneyForTravel = moneyForTravel + budget * 0.25;
        }

        budget = budget - moneyForTravel;

        if (category.equals("normal")) {
            moneyForTicket = numberOfPeople * priceOfNormalTicket;
        } else {
            moneyForTicket = numberOfPeople * priceOfVipTicket;
        }

        if (budget >= moneyForTicket) {
            System.out.printf("Yes! You have %.2f leva left.", budget - moneyForTicket);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", moneyForTicket - budget);
        }
    }
}