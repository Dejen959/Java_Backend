import java.text.NumberFormat;
import java.util.Scanner;
public class Mortgage {
    public static void main(String[] args)
    {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal;
        double annualInterestRate;
        int years;
        int numberOfPayments;
        double monthlyInterestRate;
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Please enter the principal: ");
            principal = input.nextInt();
            if(principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.print("Please enter the principal between 1k and 1m: ");
        }

        while(true) {
            System.out.print("Please enter the annual interest rate: ");
            annualInterestRate = input.nextDouble();
            monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
            if(annualInterestRate >0 && annualInterestRate <= 4)
                break;
            System.out.println("Please enter the annual interest rate between 1 and 4.");

        }

        while(true) {
            System.out.print("Period (Years): ");
            years = input.nextInt();
            numberOfPayments = years * MONTHS_IN_YEAR;
            if (years >= 1 && years <=30)
                break;
            System.out.println("Please enter the years between 1 and 30.");
        }
        double mortgage = principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("The amount of mortgage: " + mortgageFormatted);
    }

}


