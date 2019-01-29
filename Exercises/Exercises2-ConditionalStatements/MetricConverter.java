package com.company;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        String inputUnit = scanner.nextLine();
        String outputUnit = scanner.nextLine();
        double convertUnit = 0.0;

        inputUnit = inputUnit.toLowerCase();
        outputUnit = outputUnit.toLowerCase();

        if (inputUnit.equals("m")) {
            convertUnit = number / 1;
        } else if (inputUnit.equals("mm")) {
            convertUnit = number / 1000;
        } else if (inputUnit.equals("cm")) {
            convertUnit = number / 100;
        } else if (inputUnit.equals("mi")) {
            convertUnit = number / 0.000621371192;
        } else if (inputUnit.equals("in")) {
            convertUnit = number / 39.3700787;
        } else if (inputUnit.equals("km")) {
            convertUnit = number / 0.001;
        } else if (inputUnit.equals("ft")) {
            convertUnit = number / 3.2808399;
        } else {
            convertUnit = number / 1.0936133;
        }

        if (outputUnit.equals("m")) {
            convertUnit = convertUnit * 1;
        } else if (outputUnit.equals("mm")) {
            convertUnit = convertUnit * 1000;
        } else if (outputUnit.equals("cm")) {
            convertUnit = convertUnit * 100;
        } else if (outputUnit.equals("mi")) {
            convertUnit = convertUnit * 0.000621371192;
        } else if (outputUnit.equals("in")) {
            convertUnit = convertUnit * 39.3700787;
        } else if (outputUnit.equals("km")) {
            convertUnit = convertUnit * 0.001;
        } else if (outputUnit.equals("ft")) {
            convertUnit = convertUnit * 3.2808399;
        } else {
            convertUnit = convertUnit * 1.0936133;
        }
        System.out.printf("%.8f", convertUnit);
    }
}