package com.company;

import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output;
        for (int i = input.length() - 1; i >= 0; i--) {
            int num = Integer.parseInt(Character.toString(input.charAt(i)));
            char codeChar = (char) (num + 33);
            String codeStr = Character.toString(codeChar);
            if (num == 0) {
                output = "ZERO";
            } else {
                output = "";
                for (int j = 0; j < num; j++) {
                    output += codeStr;
                }
            }
            System.out.println(output);
        }
    }
}