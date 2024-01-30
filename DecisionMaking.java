//Decision Making in java - if else if
import java.util.Scanner;
public class DecisionMaking {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("-------------------------------");
        System.out.println("Decsion Making Statements...");
        Scanner input = new Scanner(System.in);

        int a, b, max;
        System.out.print("\n Enter a: | ");
        a = input.nextInt();
        System.out.print(" Enter b: | ");
        b = input.nextInt();

        // IF Statement - checking whether a number is even
        System.out.println("\n\t ----------------------------------");
        System.out.println("\t IF Statement...");
        System.out.println("\t ----------------------------------");
        if (a % 2 == 0){
            System.out.println("\t 'a' in Even");
        }

        // IF-ELSE Statement - checking whether a number is even or odd
        System.out.println("\n\t ----------------------------------");
        System.out.println("\t IF-ELSE Statement...");
        System.out.println("\t ----------------------------------");
        if (a % 2 == 0){
            System.out.println("\t 'a' in Even");
        }
        else{
            System.out.println("\t 'a' is ODD");
        }

        // IF-ELSE IF - ELSE Statement - comparing two numbers whether they are less, greater or equal
        System.out.println("\n\t ----------------------------------");
        System.out.println("\t IF-ELSE IF - ELSE Statement...");
        System.out.println("\t ----------------------------------");
        if (a > b){
            System.out.println("\t 'a' is GREATER");
        }
        else if (a < b){
            System.out.println("\t 'b' is GREATER");
        }
        else{
            System.out.println("\t 'a' and 'b' are equal");
        }

        // IF-ELSE Statement - ONELINER
        System.out.println("\n\t ----------------------------------");
        System.out.println("\t IF-ELSE in ONELINE...");
        System.out.println("\t ----------------------------------");
        if(a % 2 == 0) System.out.println("\t 'a' is EVEN");
        else System.out.println("\t 'a' is ODD");

        // TERNERY IF-ELSE Statement
        System.out.println("\n\t ----------------------------------");
        System.out.println("\t TERNERY IF-ELSE...");
        System.out.println("\t ----------------------------------");
        max = (a > b) ? a : b;
        System.out.println("\t max = " + max);
        // (a > b) ? System.out.println("\t max is " + a) : System.out.println("\t max is " + b);
        
        /* the ternary operator will only work with an 
        assignemt on the left hand side and isn´t meant for pure execution operations */

        // IF - ELSE IF-ELSE STATEMENT - comparing two numbers whether they are less, greater or equal
        System.out.println("\n\t ----------------------------------");
        System.out.println("\t IF-ELSE | Comparison Operators...");
        System.out.println("\t ----------------------------------");
        if(a<b) System.out.println("\t a<b is true");
        if(a<=b) System.out.println("\t a<=b is true");
        if(a==b) System.out.println("\t a==b is true");
        if(a>b) System.out.println("\t a>b is true");
        if(a>=b) System.out.println("\t a>=b is true");
        if(a!=b) System.out.println("\t a!=b is true");
        /* When JAVAC DOES ANY OF THE ABOVE COMPARISONS, IT RETURNS A boolean 'true', if the condition is TRUE and boolean 'false' if the condition
    is FALSE (here 1 and 0 is not considered as true or false) */

        System.out.println("\n");
        input.close();
    }
}
