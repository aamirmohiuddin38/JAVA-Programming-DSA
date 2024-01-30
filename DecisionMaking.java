//Decision Making in java - if else if
import java.util.Scanner;
public class DecisionMaking {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("-------------------------------");
        System.out.println("Decsion Making Statements...");
        Scanner input = new Scanner(System.in);

        int a;
        System.out.print("\n Enter a: | ");
        a = input.nextInt();

        // IF Statement - checking whether a number is even
        System.out.println("\n\t ----------------------------------");
        System.out.println("\t IF Statement...");
        System.out.println("\t ----------------------------------");
        if (a % 2 == 0){
            System.out.println("\t 'a' in Even");
        }

        System.out.println("\n");
        input.close();
    }
}
