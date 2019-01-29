package com.company;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGrades = Integer.parseInt(scanner.nextLine());
        String nameOfTask;
        int grade;

        double averageScore = 0;
        int numberOfProblems = 0;
        int numberOfLowGrades = 0;
        String previousNameOfTask = "";

        while (numberOfLowGrades < numberOfGrades) {
            nameOfTask = scanner.nextLine();
            if (nameOfTask.equals("Enough") == true) break;
            previousNameOfTask = nameOfTask;
            grade = Integer.parseInt(scanner.nextLine());
            averageScore = averageScore + grade;
            numberOfProblems++;
            if (grade <= 4) {
                numberOfLowGrades++;
            }
        }

        if (numberOfLowGrades == numberOfGrades) {
            System.out.printf("You need a break, %d poor grades.", numberOfGrades);
        } else {
            System.out.printf("Average score: %.2f", averageScore / numberOfProblems);
            System.out.println();
            System.out.printf("Number of problems: %d", numberOfProblems);
            System.out.println();
            System.out.printf("Last problem: %s", previousNameOfTask);
        }
    }
}