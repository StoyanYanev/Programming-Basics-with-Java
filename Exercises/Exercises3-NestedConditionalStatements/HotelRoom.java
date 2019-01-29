package com.company;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberOfNights = Integer.parseInt(scanner.nextLine());

        double sumForApartment = 0.0;
        double sumForStudio = 0.0;

        if (month.equals("May") || month.equals("October")) {
            sumForStudio = numberOfNights * 50;
            sumForApartment = numberOfNights * 65;
            if (numberOfNights > 7 && numberOfNights <= 14) {
                sumForStudio = sumForStudio - sumForStudio * 0.05;
            } else if (numberOfNights > 14) {
                sumForStudio = sumForStudio - sumForStudio * 0.30;
                sumForApartment = sumForApartment - sumForApartment * 0.10;
            }
        } else if (month.equals("June") || month.equals("September")) {
            sumForStudio = numberOfNights * 75.20;
            sumForApartment = numberOfNights * 68.70;
            if (numberOfNights > 14) {
                sumForStudio = sumForStudio - sumForStudio * 0.20;
                sumForApartment = sumForApartment - sumForApartment * 0.10;
            }
        } else {
            sumForStudio = numberOfNights * 76;
            sumForApartment = numberOfNights * 77;
            if (numberOfNights > 14) {
                sumForApartment = sumForApartment - sumForApartment * 0.10;
            }
        }
        System.out.printf("Apartment: %.2f lv.", sumForApartment);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", sumForStudio);
    }
}