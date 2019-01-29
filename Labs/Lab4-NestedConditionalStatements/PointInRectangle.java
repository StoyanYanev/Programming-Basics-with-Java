package com.company;

import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double xRectangle = Double.parseDouble(scanner.nextLine());
        double yRectangle = Double.parseDouble(scanner.nextLine());
        double x1Rectangle = Double.parseDouble(scanner.nextLine());
        double y1Rectangle = Double.parseDouble(scanner.nextLine());

        double xPoint = Double.parseDouble(scanner.nextLine());
        double yPoint = Double.parseDouble(scanner.nextLine());

        if ((xPoint >= xRectangle && xPoint <= x1Rectangle) && (yPoint >= yRectangle && yPoint <= y1Rectangle)) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}