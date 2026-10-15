package mortgage;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    public static void main(String[] args) {
        int principal = (int) Console.readNumber("principal: ", 1000, 1_000_000);
        double annualInterestRate = Console.readNumber("Annual Interest Rate: ", 1, 10);
        int years = (int) Console.readNumber("Period(Years): ", 1, 30);

        MortgageReport.printMortgage(principal, annualInterestRate, years);
        MortgageReport.printPaymentSchedule(years, principal, annualInterestRate);
    }

}


