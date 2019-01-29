package com.company;

import java.util.Scanner;

public class WeddingHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double metre = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double heightOfBar = Double.parseDouble(scanner.nextLine());


        double area = metre * height;
        double bar = heightOfBar * heightOfBar;
        double a = (metre * height) * 0.19;
        double freeSpace = area - bar - a;
        double numberOfGuests = freeSpace / 3.2;

        System.out.printf("%.0f", Math.ceil(numberOfGuests));
    }
}