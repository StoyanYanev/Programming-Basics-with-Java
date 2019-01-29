import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double sideA = Double.parseDouble(scanner.nextLine());
        double area = (width * 100)*(length*100);
        double areaWardrobe = (sideA * 100)*(sideA * 100);
        double areaBench = area / 10;
        double emptySpace = area - areaWardrobe - areaBench;
        double numberOfDancers = emptySpace / (40 + 7000);

        System.out.printf("%.0f",Math.floor(numberOfDancers));
    }
}
