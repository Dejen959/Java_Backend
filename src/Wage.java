public class Wage {
    public static int hourlyRate;
    public static int baseSalary;

    public static int wageCalculator(int extraHour) {
        return (hourlyRate * extraHour) + baseSalary;
    }
}
