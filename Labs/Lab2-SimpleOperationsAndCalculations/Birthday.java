package com.company;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lengthOfAquarium = Integer.parseInt(scanner.nextLine());
        int widthOfAquarium = Integer.parseInt(scanner.nextLine());
        int heightOfAquarium = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double volumeOfAquarium = lengthOfAquarium * widthOfAquarium * heightOfAquarium * 0.001;
        double litre = volumeOfAquarium * (1 - percent * 0.01);
        System.out.printf("%.3f",litre);
    }
}