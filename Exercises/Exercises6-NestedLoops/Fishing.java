package com.company;

import java.util.Scanner;

public class Fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kvota = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int sum = 0;
        double taksa = 0;
        double totalSum = 0;
        int countTo3 = 0;

        while (true) {
            String fish = scanner.nextLine();

            if (fish.equals("Stop")) {
                break;
            }
            double teglo = Double.parseDouble(scanner.nextLine());
            count++;
            countTo3++;

            for (int i = 0; i < (fish.length()); i++) {
                char symbol = fish.charAt(i);
                sum += symbol;
            }
            taksa = sum / teglo;
            sum = 0;

            if (countTo3 < 3) {
                totalSum -= taksa;

            } else {
                totalSum += taksa;
                countTo3 = 0;
            }
            if (count == kvota) {
                System.out.println("Lyubo fulfilled the quota!");
                break;

            }
        }
        if (totalSum >= 0) {
            System.out.printf("Lyubo's profit from %d fishes is %.2f leva.", count, totalSum);
        } else {
            System.out.printf("Lyubo lost %.2f leva today.", Math.abs(totalSum));

        }
    }
}