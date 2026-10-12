import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(4532.55);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.55);
        System.out.println(result2);

        System.out.print("Please enter the your age: ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println("Your age: " + age);
        if (age < 18){
            System.out.println("You are too young");
        }

        else if (age > 18 && age < 25) {
            System.out.println("You are on fire age");
        }

        else if (age > 25 && age < 35) {
            System.out.println("You are adult.");
        }
        else if (age > 35 && age < 45) {
            System.out.println("You are matured age.");
        }
        else if (age > 45 && age < 75) {
            System.out.println("You are too much.");
        }
        else
            {
            System.out.println("You are too old.");
            }

    }

}
