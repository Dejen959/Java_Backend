package mortgage;
import java.util.Scanner;

public class Console {
    public static double readNumber(String prompt, double min, double max) {
        Scanner scan = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scan.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.print("Please enter the value between " + min + " and " + max);
        }
        return value;
    }
}
