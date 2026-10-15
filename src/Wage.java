public class Wage {
    private static int hourlyRate;
    private static int baseSalary;

    public static int wageCalculator(int extraHour) {
        return getHourlyRate() * extraHour + baseSalary;
    }
    public Wage (int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public static int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate can't be 0 or less.");
        this.hourlyRate = hourlyRate;
    }

    public void setBaseSalary(int baseSalary){
        if (baseSalary < 0){
            throw new IllegalArgumentException("Base salary cannot be less than 0");
        }
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary(){
        return baseSalary;
    }
}
