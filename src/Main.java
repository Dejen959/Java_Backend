
public class Main {
    public static void main(String[] args){
        var employee = new Wage ();
        employee.baseSalary = 50000;
        employee.hourlyRate = 500;
        int wage = employee.wageCalculator(20);
        System.out.println("Wage is: " + wage);
    }

}
