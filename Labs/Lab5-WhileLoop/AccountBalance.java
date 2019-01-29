package com.company;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int payment = Integer.parseInt(scanner.nextLine());
        double amountPaid;
        double sum = 0;
        while (payment > 0) {
            amountPaid = Double.parseDouble(scanner.nextLine());
            if (amountPaid < 0){
                System.out.println("Invalid operation!");
                break;
            }
            sum = sum + amountPaid;
            System.out.printf("Increase: %.2f", amountPaid);
            System.out.println();
            payment--;
        }
            System.out.printf("Total: %.2f", sum);
            System.out.println();
    }
}