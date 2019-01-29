package com.company;

import java.util.Scanner;

public class WaterDispenser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        String buttons;
        int currentVolume = 0;
        int tapped = 0;
        while (currentVolume < volume) {
            buttons = scanner.nextLine();
            if (buttons.equals("Easy") == true) {
                currentVolume = currentVolume + 50;
            } else if (buttons.equals("Medium")== true) {
                currentVolume = currentVolume + 100;
            } else {
                currentVolume = currentVolume + 200;
            }
            tapped++;
        }
        if (currentVolume <= volume) {
            System.out.printf("The dispenser has been tapped %d times.", tapped);
        } else {
            System.out.printf("%dml has been spilled.", currentVolume - volume);
        }
    }
}