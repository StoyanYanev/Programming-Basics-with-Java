package com.company;

        import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        day = day.toLowerCase();

        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") ||
                day.equals("thursday") || day.equals("friday")) {
            switch (fruit) {
                case "banana":
                    System.out.println(quantity * 2.50);
                    break;
                case "apple":
                    System.out.println(quantity * 1.20);
                    break;
                case "orange":
                    System.out.println(quantity * 0.85);
                    break;
                case "grapefruit":
                    System.out.println(quantity * 1.45);
                    break;
                case "kiwi":
                    System.out.println(quantity * 2.70);
                    break;
                case "pineapple":
                    System.out.println(quantity * 5.50);
                    break;
                case "grapes":
                    System.out.println(quantity * 3.85);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (day.equals("saturday") || day.equals("sunday")) {
            switch (fruit) {
                case "banana":
                    System.out.println(quantity * 2.70);
                    break;
                case "apple":
                    System.out.println(quantity * 1.25);
                    break;
                case "orange":
                    System.out.println(quantity * 0.90);
                    break;
                case "grapefruit":
                    System.out.println(quantity * 1.60);
                    break;
                case "kiwi":
                    System.out.println(quantity * 3.00);
                    break;
                case "pineapple":
                    System.out.println(quantity * 5.60);
                    break;
                case "grapes":
                    System.out.println(quantity * 4.20);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else {
            System.out.println("error");
        }
    }
}