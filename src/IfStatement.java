import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your role: ");
        String role = sc.nextLine();
        switch (role){
            case "Admin":
                System.out.println("You are admin.");
                break;
            case "Moderator":
                System.out.println("You are moderator.");
                break;
           default:
               System.out.println("You are guest");

        }

    }
}
