package com.company;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        String input;
        int cakeSize = width * length;
        while (cakeSize >= 0) {
            input = scanner.nextLine();
            if (input.equals("STOP")) break;
            cakeSize -= Integer.parseInt(input);
        }
        if (cakeSize >= 0){
            System.out.printf("%d pieces are left.", cakeSize);
        }else{
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeSize));
        }
    }
}