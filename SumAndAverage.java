//Program to find sum and average of three numbers - BEGINNER LEVEL
import java.util.Scanner;
public class SumAndAverage {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("--------------------------------");
        System.out.println("Sum and Average of Three Numbers \n ");

        //Declaring variables
        int num1, num2, num3, sum, avg;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = input.nextInt();
        System.out.print("Enter Third Number: ");
        num3 = input.nextInt();

        //Sum
        sum = num1 + num2 + num3;
        avg = sum/3;

        //Display Results
        System.out.println("\t Results:....");
        System.out.println("\t ------------------------------------------");
        System.out.println("\t Given Numbers are: | " + num1 + ", "+ num2 + ", " + num3 );
        System.out.println("\t Sum: | "+ sum);
        System.out.println("\t Average: | "+ avg+ "\n");

        input.close();
    }
}
