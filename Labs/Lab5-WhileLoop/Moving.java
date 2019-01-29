package com.company;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String command;
        int cubicMetersOfRoom = width * length * height;
        int cubicMetersOfBoxs = 0;
        while (cubicMetersOfBoxs < cubicMetersOfRoom) {
            command = scanner.nextLine();
            if (command.equals("Done") == true) break;
            cubicMetersOfBoxs = cubicMetersOfBoxs + Integer.parseInt(command);
        }
        if (cubicMetersOfBoxs <= cubicMetersOfRoom) {
            System.out.printf("%d Cubic meters left.", cubicMetersOfRoom - cubicMetersOfBoxs);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", cubicMetersOfBoxs - cubicMetersOfRoom);
        }
    }
}