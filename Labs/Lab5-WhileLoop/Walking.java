package com.company;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command;
        int stepsForDay = 10000;
        int steps;
        int stepsToGoHome;
        int allSteps = 0;
        while (allSteps < stepsForDay) {
            command = scanner.nextLine();
            if (command.equals("Going home") == true) {
                stepsToGoHome = Integer.parseInt(scanner.nextLine());
                allSteps = allSteps + stepsToGoHome;
                break;
            }
            steps = Integer.parseInt(command);
            allSteps = allSteps + steps;
        }
        if (allSteps >= stepsForDay) {
            System.out.println("Goal reached! Good job!");
        } else {
            System.out.printf("%d more steps to reach goal.", stepsForDay - allSteps);
        }
    }
}