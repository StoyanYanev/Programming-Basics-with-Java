package com.company;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  inputPassword = scanner.nextLine();
        String originalPassword = "s3cr3t!P@ssw0rd";

        if (originalPassword.equals(inputPassword)){
            System.out.println("Welcome");
        }else {
            System.out.println("Wrong password!");
        }
    }
}