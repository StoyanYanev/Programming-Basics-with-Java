import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tables = Integer.parseInt(scanner.nextLine());
        double lengthOfTables = Double.parseDouble(scanner.nextLine());
        double widthOfTables = Double.parseDouble(scanner.nextLine());

        double cover = tables * (lengthOfTables + 2*0.30) * (widthOfTables + 2 * 0.30);
        double kare = tables * (lengthOfTables / 2) * (lengthOfTables / 2);

        double usd = 7 * cover + 9 * kare;
        double bgn = usd * 1.85;

        System.out.printf("%.2f %s \n",usd,"USD");
        System.out.printf("%.2f %s",bgn,"BGN");
    }
}
