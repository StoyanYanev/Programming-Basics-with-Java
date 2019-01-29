import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceOfWhiskey = Double.parseDouble(scanner.nextLine());
        double litersOfBeer = Double.parseDouble(scanner.nextLine());
        double litersOfWine = Double.parseDouble(scanner.nextLine());
        double litersOfRakia = Double.parseDouble(scanner.nextLine());
        double litersOfWhiskey = Double.parseDouble(scanner.nextLine());

        double priceOfRakia = priceOfWhiskey / 2;
        double priceOfBeer =priceOfRakia - (priceOfRakia * 0.8);
        double priceOfWine = priceOfRakia - (priceOfRakia * 0.4);

        double sumOfRakia = litersOfRakia * priceOfRakia;
        double sumOfWine = litersOfWine * priceOfWine;
        double sumOfBeer = litersOfBeer * priceOfBeer;
        double sumOfWhiskey = litersOfWhiskey * priceOfWhiskey;

        double allSum = sumOfRakia + sumOfWine + sumOfBeer + sumOfWhiskey;

        System.out.printf("%.2f",allSum);
    }
}
