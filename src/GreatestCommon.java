import java.util.Scanner;

public class GreatestCommon {
    
    public static void main(String[] args) {
        System.out.println("Greatest Common Divisor Finder\n");
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter your first number: ");
            int x = sc.nextInt();
            System.out.print("Enter your second number: ");
            int y = sc.nextInt();
            while (x != 0) {
                while (y >= x) y -= x;
                
                int divide = x;
                x = y;
                y = divide;
                
            }
            System.out.println("Greatest common divisor: " + y);
            System.out.print("\nContinue? (y/n): ");
            choice = sc.next();
        }
        sc.close();
        System.out.println("Bye!");
    }
}