package com.company;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sideOfTriangle = Double.parseDouble(scanner.nextLine());
        double heightOfTriangle = Double.parseDouble(scanner.nextLine());
        double areaOfTriangle = (sideOfTriangle * heightOfTriangle) / 2.00;
        System.out.println("Triangle area = " + areaOfTriangle);
    }
}
