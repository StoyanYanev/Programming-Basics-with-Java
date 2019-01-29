package com.company;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFigure = scanner.nextLine();
        typeOfFigure = typeOfFigure.toLowerCase();
        double area = 0.0;
        if (typeOfFigure.equals("square")){
            double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
            System.out.printf("%.3f",area);
        }else if(typeOfFigure.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
            System.out.printf("%.3f",area);
        } else if(typeOfFigure.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            area = r * r * Math.PI;
            System.out.printf("%.3f",area);
        }else{
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            area = (a * h) / 2;
            System.out.printf("%.3f",area);
        }
    }
}