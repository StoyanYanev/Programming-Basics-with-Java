import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int numberOfConfectioners = Integer.parseInt(scanner.nextLine());
        int numberOfCakes = Integer.parseInt(scanner.nextLine());
        int numberOfWaffles = Integer.parseInt(scanner.nextLine());
        int numberOfPancakes = Integer.parseInt(scanner.nextLine());
        double sumForOneDay = (numberOfCakes * 45 + numberOfWaffles * 5.80 + numberOfPancakes * 3.20) * numberOfConfectioners;
        double allSum = sumForOneDay * days;
        double expenses = allSum - allSum * 0.125;

        System.out.printf("%.2f",expenses);
    }
}
