package com.company;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double moneyOnHand = Double.parseDouble(scanner.nextLine());
        String action;
        double sum;
        int numberOfSpendDays = 0;
        int daysPassed = 0;

        while (true) {
            action = scanner.nextLine();
            sum = Double.parseDouble(scanner.nextLine());
            if (action.equals("spend") == true) {
                moneyOnHand = moneyOnHand - sum;
                numberOfSpendDays++;
                if (moneyOnHand < sum) {
                    moneyOnHand = 0;
                }
            } else {
                numberOfSpendDays = 0;
                moneyOnHand = moneyOnHand + sum;
            }
            daysPassed++;
            if (numberOfSpendDays >= 5) {
                System.out.println("You can't save the money.");
                System.out.println(daysPassed);
                break;
            }
            if(moneyOnHand >= money){
                System.out.printf("You saved the money for %d days.", daysPassed);
                break;
            }
        }
    }
}