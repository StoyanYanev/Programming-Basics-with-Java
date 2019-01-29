package com.company;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        if (hour == 0) {
            hour = 24;
        }
        if (minutes == 0) {
            minutes = 60;
        }
        if (arrivalHour == 0) {
            arrivalHour = 24;
        }
        if (arrivalMinutes == 0) {
            arrivalMinutes = 60;
        }


        if ((arrivalHour - hour) <= 0 && (minutes - arrivalMinutes) >= 0 && (minutes - arrivalMinutes) <= 30) {
            System.out.println("On time");
            if (Math.abs(minutes - arrivalMinutes) != 0) {
                System.out.printf("%d minutes before the start", Math.abs(minutes - arrivalMinutes));
                /*if (minutes - arrivalMinutes < 10) {
                    System.out.printf("0%d minutes before the start", minutes - arrivalMinutes);
                } else {
                    System.out.printf("%d minutes before the start", minutes - arrivalMinutes);
                }*/
            }
        } else if (hour - arrivalHour <= 0) {
            System.out.println("Late");
            if (hour - arrivalHour != 0) {
                System.out.printf("%d:", arrivalHour - hour);
            }
            if (Math.abs(minutes - arrivalMinutes) < 10) {
                System.out.printf("0%d hours after the start", Math.abs(minutes - arrivalMinutes));
            } else {
                System.out.printf("%d hours after the start", Math.abs(minutes - arrivalMinutes));
            }
        } else {
            System.out.println("Early");
            if (hour - arrivalHour != 0) {
                System.out.printf("%d:", hour - arrivalHour);
            }
            if (minutes - arrivalMinutes < 10) {
                System.out.printf("0%d hours before the start", Math.abs(minutes - arrivalMinutes));
            } else {
                System.out.printf("%d hours before the start", Math.abs(minutes - arrivalMinutes));
            }
        }
    }
}