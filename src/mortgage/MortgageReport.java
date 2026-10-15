package mortgage;
import java.text.NumberFormat;

public class MortgageReport {
    public static void printMortgage(int principal, double annualInterestRate, int years) {
        double mortgage = MortgageCalculator.calculateMortgage(principal, annualInterestRate, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("      MORTGAGE: ");
        System.out.println("------------------------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public static void printPaymentSchedule(int years, int principal, double annualInterestRate) {
        System.out.println();
        System.out.println("   PAYMENT SCHEDULE: ");
        System.out.println("-----------------------");
        for (short month = 1; month <= years * Main.MONTHS_IN_YEAR; month++) {
            double balance = MortgageCalculator.calculateBalance(principal, annualInterestRate, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}
