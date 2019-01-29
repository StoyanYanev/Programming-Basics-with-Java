package com.company;

import java.util.Scanner;

public class FamilyHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double bill;
        double sum = 0;

        double sumOfWater = 0;
        double sumOfInternet = 0;
        sumOfWater = months * 20;
        sumOfInternet = months * 15;
        double allSum = 0;

        double sumOfElectricity = 0;
        for (int i = 0; i < months; i++) {
            bill = Double.parseDouble(scanner.nextLine());
            sumOfElectricity += bill;
            sum += (bill + 20 + 15);
            sum += sum * 0.2;
            allSum += sum;
            sum = 0;
        }

        System.out.printf("Electricity: %.2f lv", sumOfElectricity);
        System.out.println();
        System.out.printf("Water: %.2f lv", sumOfWater);
        System.out.println();
        System.out.printf("Internet: %.2f lv", sumOfInternet);
        System.out.println();
        System.out.printf("Other: %.2f lv", allSum);
        System.out.println();
        allSum = (allSum + sumOfWater + sumOfInternet + sumOfElectricity) / months;
        System.out.printf("Average: %.2f lv", allSum);
    }
}