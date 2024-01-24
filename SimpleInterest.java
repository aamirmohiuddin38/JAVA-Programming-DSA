//Program to calculate the Simple Interest
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("----------------------------------");
        System.out.println("Simple Interest...\n");
        Scanner input = new Scanner(System.in);

        //Declare variables
        float p, r, t, si, tds, amount;
        System.out.print("Enter Principle:\t| ");
        p = input.nextFloat();
        System.out.print("Rate of Interest:\t| ");
        r = input.nextFloat();
        System.out.print("Time(Years):\t\t| ");
        t = input.nextFloat();

        //Calculations
        si = p * r * t / 100;
        tds = 0.1f * si;
        amount = p + si - tds;

        //Display results
        System.out.println("\n\t ------------------------------------");
        System.out.println("\t Simple Interest...");
        System.out.println("\t ------------------------------------");
        System.out.println("\t Principle: \t\t | "+ String.format("%8.0f", p));
        System.out.println("\t Rate of Interest: \t | "+ String.format("%8.0f", r));
        System.out.println("\t Time in years: \t | "+ String.format("%8.0f", t));
        System.out.println("\t Simple Interest: \t | "+ String.format("%8.0f", si));
        System.out.println("\t TDS(10$ of SI): \t | "+ String.format("%8.0f", tds));
        System.out.println("\t Interest After Tax: \t | "+ String.format("%8.0f", (si-tds)));
        System.out.println("\t ------------------------------------");
        System.out.println("\t Final Amount: \t\t | "+ String.format("%8.0f", amount));
        System.out.println("\t ------------------------------------");

        System.out.println("\n");
        input.close();
    }
    
}
