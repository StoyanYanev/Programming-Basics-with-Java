package com.company;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lv = Double.parseDouble(scanner.nextLine());
        double averageSuccess = Double.parseDouble(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        double scholarship = 0.0;
        double excellentResult = 0.0;

        if (lv <= salary && averageSuccess > 4.50) {
            scholarship = salary * 0.35;
            if (averageSuccess >= 5.50) {
                excellentResult = averageSuccess * 25;
            }
            if (scholarship > excellentResult) {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(scholarship));
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentResult));
            }
        } else {
            if (averageSuccess >= 5.50) {
                excellentResult = averageSuccess * 25;
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(excellentResult));
            } else {
                System.out.println("You cannot get a scholarship!");
            }
        }
    }
}