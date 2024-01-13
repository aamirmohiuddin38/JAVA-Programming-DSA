// Program to reverse a five digit integer no. - Basic BEGINNER LEVEL
import java.util.Scanner;
public class ReverseFiveDigitNo {
    public static void main(String[] args) {
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("-------------------------------------");
        System.out.println("Reverse a Five Digit Integer Number\n");

        Scanner input = new Scanner(System.in);

        //Variables
        int num, rem, rev=0;
        System.out.print("Enter the five digit integer number: ");
        num = input.nextInt();

        //Step 1
        rem = num % 10;
        rev = rev + (rem * 10000);
        num = num / 10;
        System.out.println("\n\t Quotient: "+ num + " | Remainder: "+ rem + " | Reverse: "+ rev);

        //Step 2
        rem = num % 10;
        rev = rev + (rem * 1000);
        num = num / 10;
        System.out.println("\t Quotient: "+ num + " | Remainder: "+ rem + " | Reverse: "+ rev);

        //Step 3
        rem = num % 10;
        rev = rev + (rem * 100);
        num = num / 10;
        System.out.println("\t Quotient: "+ num + " | Remainder: "+ rem + " | Reverse: "+ rev);

        //Step 4
        rem = num % 10;
        rev = rev + (rem * 10);
        num = num / 10;
        System.out.println("\t Quotient: "+ num + " | Remainder: "+ rem + " | Reverse: "+ rev);

        //Step 5
        rem = num % 10;
        rev = rev + (rem * 1);
        num = num / 10;
        System.out.println("\t Quotient: "+ num + " | Remainder: "+ rem + " | Reverse: "+ rev);


        System.out.println("\t -------------------------------------------------");
        System.out.println("\t Reversed Number: "+ rev);
        System.out.println("\t----------------------------------------------------\n");

        input.close();
    }
}
