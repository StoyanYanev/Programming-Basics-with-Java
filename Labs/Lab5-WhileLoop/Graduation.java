package com.company;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        String name = scanner.nextLine();
        double grades;
        double sum = 0;
        int index = 1;
        while (index <= 12) {
            grades = Double.parseDouble(scanner.nextLine());
            if (grades >= 4.00) {
                sum = sum + grades;
                index++;
            }
        }
        double average = sum / 12.00;
        System.out.printf("%s graduated. Average grade: %.2f", name, average);
    }
}