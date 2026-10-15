package mortgage
import java.text.NumberFormat;
import java.util.Scanner;
public class Mortgage {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    public static void main(String[] args) {
        int principal = (int)readNumber("principal: ", 1000, 1_000_000);
        double annualInterestRate = readNumber("Annual Interest Rate: ", 1, 10);
        int years = (int)readNumber("Period(Years): ", 1, 30);

        printMortgage(principal, annualInterestRate, years);

        printPaymentSchedule(years, principal, annualInterestRate);
    }

    public static void printMortgage(int principal, double annualInterestRate, int years) {
        double mortgage = calculateMortgage(principal, annualInterestRate, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE: ");
        System.out.println("------------------------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(int years, int principal, double annualInterestRate) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE: ");
        System.out.println("-----------------------");
        for(short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(principal, annualInterestRate, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scan = new Scanner(System.in);
        double value;
        while(true){
            System.out.print(prompt);
            value = scan.nextInt();
            if(value >= min && value <= max)
                break;
            System.out.print("Please enter the value between " + min + " and " + max);
        }
        return value;
    }
    public static double calculateBalance(
            int principal,
            double annualInterestRate,
            int years,
            short numberOfPaymentsMade) {

        double monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        double numberOfPayments = years * MONTHS_IN_YEAR;
        return principal
                * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }
    public static double calculateMortgage(int principal, double annualInterestRate, int years) {
        double monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;
        return principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }
}


