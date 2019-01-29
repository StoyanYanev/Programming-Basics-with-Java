package com.company;

import java.util.Scanner;

public class TrapeziodArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sideA = Double.parseDouble(scanner.nextLine());
        double sideB = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double areaOfTrapeziod = (sideA + sideB) * height / 2.00;
        System.out.println(areaOfTrapeziod);
    }
}
