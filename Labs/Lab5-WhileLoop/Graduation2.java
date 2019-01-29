package com.company;

import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double grades;
        double sum = 0;
        int index = 1;
        int excluded = 0;
        while (index <= 12 && excluded <= 1) {
            grades = Double.parseDouble(scanner.nextLine());
            if (grades >= 4.00) {
                sum = sum + grades;
                index++;
            } else {
                excluded++;
            }
        }
        if (excluded <= 1) {
            double average = sum / 12.00;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, index);
        }
    }
}