package com.company;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temperatureCelsius = Double.parseDouble(scanner.nextLine());
        double temperatureFahrenheit = temperatureCelsius * (9.00/5.00) + 32.00;
        System.out.printf("%.2f",temperatureFahrenheit);
    }
}
