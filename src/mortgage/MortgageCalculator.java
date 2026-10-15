package mortgage;

public class MortgageCalculator {

    public static double calculateBalance(
            int principal,
            double annualInterestRate,
            int years,
            short numberOfPaymentsMade) {

        double monthlyInterestRate = annualInterestRate / Main.PERCENT / Main.MONTHS_IN_YEAR;
        double numberOfPayments = years * Main.MONTHS_IN_YEAR;
        return principal
                * (Math.pow(1 + monthlyInterestRate, numberOfPayments) - Math.pow(1 + monthlyInterestRate, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }

    public static double calculateMortgage(int principal, double annualInterestRate, int years) {
        double monthlyInterestRate = annualInterestRate / Main.PERCENT / Main.MONTHS_IN_YEAR;
        int numberOfPayments = years * Main.MONTHS_IN_YEAR;
        System.out.println();
        System.out.println("    MONTHS:");
        System.out.println("-------------------");
        System.out.println("Number of Payments: " + numberOfPayments);
        return principal
                * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);
    }
}
