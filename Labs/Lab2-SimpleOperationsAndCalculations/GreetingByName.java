package com.company;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String myName = scanner.nextLine();
        System.out.println("Hello, " + myName + "!");
    }
}
