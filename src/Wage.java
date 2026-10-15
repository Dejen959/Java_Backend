public class Wage {
    public static void main(String[] args) {
        int hourlyRate = 120;
        int extraHour = 13;
        int baseSalary = 20000;
        int wage = wageCalculate(hourlyRate, extraHour, baseSalary);
        System.out.println("Wage: " + wage);
    }
    public static int wageCalculate(int hourlyRate, int extraHours, int baseSalary) {
        return (hourlyRate * extraHours) + baseSalary;
    }
}
