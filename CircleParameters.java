//Program to Calcuate Circle's - Circumference and Area
import java.util.Scanner;
public class CircleParameters {
    static final float pi = 3.142f;
    public static void main(String args[]){
    System.out.println("\033\143");
    System.out.println("Java | Programming");
    System.out.println("-------------------------------------");
    System.out.println("Circle - Circumference and Area\n");
    
    //Declaring variables
    
    float rad, dia, cir, area;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Radius: ");
    rad = input.nextFloat();

    //Calculations
    dia = 2 * rad;
    cir = 2 * pi * rad;
    area = pi * rad * rad;
    
    //Display results
    System.out.println("\n\t Results...");
    System.out.println("\t ----------------------------------");
    System.out.println("\t Radius: \t | "+ String.format("%8.2f", rad));
    System.out.println("\t Diameter: \t | "+ String.format("%8.2f", dia));
    System.out.println("\t Circumference:\t | "+ String.format("%8.2f", cir));
    System.out.println("\t Area: \t\t | "+ String.format("%8.2f", area)+"\n");
    
    input.close();
    }
}
