//Program to check whether a number is positive, negative or zero
import java.util.Scanner;
public class PosNegNum {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("-------------------------------");
        System.out.println("Positive | Negative | Zero");
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("\nEnter num1: | ");
        num = input.nextInt();

        System.out.println("\t--------------------------------");
        if(num > 0)
            System.out.println("\t Positive");
        else if (num < 0)
            System.out.println("\t Negative");
        else
            System.out.println("\t Zero");
        System.out.println("\t--------------------------------");

        input.close();
        System.out.println("\n");
    }
}
