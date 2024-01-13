// Program to Swap Two Variable using a third variable Temp - BEGINNER
import java.util.Scanner;
public class SwapUsingTemp {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("--------------------------------------");
        System.out.println("Swap the values using third Variable(temp)\n");

        Scanner input = new Scanner(System.in);

        //Declare Variables
        int num1, num2, temp;

        System.out.print("Enter the First Number (num1): ");
        num1 = input.nextInt();
        System.out.print("Enter the Second Number (num2): ");
        num2 = input.nextInt();

        //Before Swapping
        System.out.println("\n\t Before Swapping:....");
        System.out.println("\t ----------------------------------------");
        System.out.println("\t First Number (num1): | "+ num1);
        System.out.println("\t Second Number (num2): | "+ num2);

        //Swapping
        temp = num1;
        num1 = num2;
        num2 = temp;
        
        //After Swapping
        System.out.println("\n\t After Swapping:....");
        System.out.println("\t ----------------------------------------");
        System.out.println("\t First Number (num1): | "+ num1);
        System.out.println("\t Second Number (num2): | "+ num2 + "\n");

        input.close();
    }
}
