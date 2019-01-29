package com.company;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
        double areaOfCircle = r*r*Math.PI;
        double perimeterOfCircle = 2 * Math.PI * r;
        System.out.println("Area = " + areaOfCircle);
        System.out.println("Perimeter = " + perimeterOfCircle);
    }
}
