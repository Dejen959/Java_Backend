import java.text.NumberFormat;
import java.util.Scanner;
public class Mortgage {
    public static void main(String[] args)
    {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the any number not 0 to continue the loop: ");
        int x = input.nextInt();
        while( x != 0) {


            System.out.print("Please enter the principal: ");
            int principal = input.nextInt();

            System.out.print("Please enter the annual interest rate: ");
            double annualInterestRate = input.nextDouble();
            double monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

            System.out.print("Period (Years): ");
            int years = input.nextInt();
            int numberOfPayments = years * MONTHS_IN_YEAR;

            double mortgage = principal
                    * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPayments))
                    / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
            System.out.println("The amount of mortgage: " + mortgageFormatted);
        }

    }
}


