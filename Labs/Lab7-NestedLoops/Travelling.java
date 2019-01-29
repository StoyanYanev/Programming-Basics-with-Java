package com.company;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination;
        double budget;
        double allSum = 0;
        double currentSum = 0;

        destination = scanner.nextLine();
        while (!destination.equals("End")) {
            budget = Double.parseDouble(scanner.nextLine());
            while (budget > allSum) {
                currentSum = Double.parseDouble(scanner.nextLine());
                allSum += currentSum;
            }
            System.out.println("Going to " + destination + "!");
            allSum = 0;
            destination = scanner.nextLine();
        }
    }
}