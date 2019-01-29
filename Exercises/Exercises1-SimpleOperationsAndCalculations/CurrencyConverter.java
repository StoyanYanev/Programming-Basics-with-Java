import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double currency = Double.parseDouble(scanner.nextLine());
        String inputCurrency = scanner.nextLine();
        String outputCurrency = scanner.nextLine();

        if ( inputCurrency.equals("USD"))
        {
            currency = currency * 1.79549 ;
        }
        else if (inputCurrency.equals("EUR"))
        {
            currency = currency * 1.95583;
        }
        else if (inputCurrency.equals("GBP"))
        {
            currency = currency * 2.53405;
        }


        if (outputCurrency.equals("USD"))
        {
            currency = currency / 1.79549;
        }
        else if (outputCurrency.equals("EUR"))
        {
            currency = currency / 1.95583;
        }
        else if (outputCurrency.equals("GBP"))
        {
            currency = currency / 2.53405;
        }

        System.out.printf("%.2f %s",currency,inputCurrency);
    }
}