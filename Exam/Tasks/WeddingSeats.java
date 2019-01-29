package com.company;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sek = scanner.nextLine();
        char sektor = sek.charAt(0);
        int numberOfRow = Integer.parseInt(scanner.nextLine());
        int numberOfOddRow = Integer.parseInt(scanner.nextLine());

        int numberOfSeats = 0;
        int count = 0;

        for (char i = 'A'; i <= sektor; i++) {
            for (int j = 1; j <= numberOfRow; j++) {
                if (j % 2 != 0) {
                    count = numberOfOddRow;
                    for (char k = 'a'; k <= 'z'; k++) {
                        if (count <= 0) break;
                        System.out.println("" + i + "" + j + "" + k);
                        numberOfSeats++;
                        count--;
                    }
                }
                else {
                    count = numberOfOddRow + 2;
                    for (char k = 'a'; k <= 'z'; k++) {
                        if (count <= 0) break;
                        System.out.println("" + i + "" + j + "" + k);
                        numberOfSeats++;
                        count--;
                    }
                }
            }
            numberOfRow++;

        }
        System.out.println(numberOfSeats);
    }
}