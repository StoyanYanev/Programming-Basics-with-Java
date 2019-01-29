package com.company;

import java.util.Scanner;

public class SquareArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sideOfSquare = Double.parseDouble(scanner.nextLine());
        double area = sideOfSquare * sideOfSquare;
        System.out.println(area);
    }
}
