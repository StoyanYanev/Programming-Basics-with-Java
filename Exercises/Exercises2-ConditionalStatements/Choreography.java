package com.company;

import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = Integer.parseInt(scanner.nextLine());
        int dancers = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        double stepsForDay = steps / days;
        double percent = Math.ceil((stepsForDay / steps) * 100);
        double percentForEveryDancer = percent / dancers;

        if (percent <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f", percentForEveryDancer);
            System.out.println("%.");
        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f", percentForEveryDancer);
            System.out.println("% steps to be learned per day.");
        }
    }
}