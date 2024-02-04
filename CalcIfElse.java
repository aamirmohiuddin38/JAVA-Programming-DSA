//Menu driven calc using if else statements
import java.util.Scanner;
public class CalcIfElse {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("------------------------------");
        System.out.println("Menu Driven Calc");
        Scanner input = new Scanner(System.in);

        int num1, num2, choice;
        System.out.print("\nEnter num1: | ");
        num1 = input.nextInt();
        System.out.print("Enter num2: | ");
        num2 = input.nextInt();

        //choices
        System.out.println("\n\t-------------------------");
        System.out.println("\t Choose Option: ");
        System.out.println("\t-------------------------");
        System.out.println("\t 1. Add");
        System.out.println("\t 2. Subtract");
        System.out.println("\t 3. Multiply");
        System.out.println("\t 4. Divide");
        System.out.println("\t 5. Exit");
        System.out.println("\t--------------------------");
        System.out.print("\t Enter Choice: | ");
        choice = input.nextInt();

        //calculation
        System.out.println("\t ---------------------------");
        if(choice == 1) System.out.println("\t Result | num1 + num2 = " + (num1 + num2));
        else if (choice == 2) System.out.println("\t Result | num1 - num2 = " + (num1 - num2));
        else if (choice == 3) System.out.println("\t Result | num1 * num2 = " + (num1 * num2));
        else if (choice == 4) System.out.println("\t Result | \n\t num1 / num2 (quotient) = " + (num1 / num2) + "\n\t num1 % num2 (remainer) = " + (num1 % num2));
        else if (choice == 5) System.out.println("\t Thank You....\n");
        else System.out.println("\t Invalid Option.. \n");
        System.out.println("\t -----------------------------\n");


        System.out.print("\n");
        input.close();
    }
}
