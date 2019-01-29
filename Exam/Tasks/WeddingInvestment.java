package com.company;

import java.util.Scanner;

public class WeddingInvestment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String type = scanner.nextLine();
        String cacke = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double allSum = 0;
        if (command.equals("one")) {
            if (type.equals("Small")) {
                allSum += 9.98;
                if (cacke.equals("yes")) {
                    allSum += 5.50;
                }
            } else if (type.equals("Middle")) {
                allSum += 18.99;
                if (cacke.equals("yes")) {
                    allSum += 4.35;
                }
            } else if (type.equals("Large")) {
                allSum += 25.98;
                if (cacke.equals("yes")) {
                    allSum += 4.35;
                }
            } else {
                allSum += 35.99;
                if (cacke.equals("yes")) {
                    allSum += 3.85;
                }
            }
        } else {
            if (type.equals("Small")) {
                allSum += 8.58;
                if (cacke.equals("yes")) {
                    allSum += 5.50;
                }
            } else if (type.equals("Middle")) {
                allSum += 17.09;
                if (cacke.equals("yes")) {
                    allSum += 4.35;
                }
            } else if (type.equals("Large")) {
                allSum += 23.59;
                if (cacke.equals("yes")) {
                    allSum += 4.35;
                }
            } else {
                allSum += 31.79;
                if (cacke.equals("yes")) {
                    allSum += 3.85;
                }
            }
        }
        allSum = allSum * days;
        if (command.equals("two")) {
            allSum = allSum - allSum * 0.0375;
        }
        System.out.printf("%.2f lv.", allSum);
    }
}