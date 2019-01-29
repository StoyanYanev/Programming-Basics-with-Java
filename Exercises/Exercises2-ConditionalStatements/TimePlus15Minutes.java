package com.company;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        minutes = minutes + 15;

        if (minutes > 59) {
            hour++;
            minutes = minutes - 60;
            if (hour == 24) {
                hour = 0;
            }
            if (minutes < 10) {
                System.out.println(hour + ":0" + minutes);
            } else {
                System.out.println(hour + ":" + minutes);
            }
        } else {
            System.out.println(hour + ":" + minutes);
        }
    }
}