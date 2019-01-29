package com.company;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String book = scanner.nextLine();
        int capacity = Integer.parseInt(scanner.nextLine());
        String nextBook;
        int index = 0;
        while (index < capacity) {
            nextBook = scanner.nextLine();
            if (book.equals(nextBook) == true) break;
            index++;
        }
        if (index < capacity) {
            System.out.printf("You checked %d books and found it.", index);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", capacity);
        }
    }
}