package com.company;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double sec = Double.parseDouble(scanner.nextLine());

        double swimmingSeconds = metres * sec;
        double slowdown = Math.floor(metres / 15) * 12.5;
        double allTime = swimmingSeconds + slowdown;

        if (allTime >= worldRecord) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", allTime - worldRecord);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", allTime);
        }
    }
}