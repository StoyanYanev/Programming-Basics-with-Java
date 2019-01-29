package com.company;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());

        type = type.toLowerCase();

        double premiere = 12.00;
        double normal = 7.50;
        double discount = 5.00;

        double allSum = 0.0;

        if (type.equals("premiere")) {
            allSum = row * col * premiere;
        } else if (type.equals("normal")) {
            allSum = row * col * normal;
        } else {
            allSum = row * col * discount;
        }
        System.out.printf("%.2f", allSum);
    }
}