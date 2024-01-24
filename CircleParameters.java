//Program to Calcuate Circle's - Circumference and Area
import java.util.Scanner;
public class CircleParameters {
    static final float PI = 3.142f;
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
    cir = 2 * PI * rad;
    area = PI * rad * rad;
    
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
/*Java does not directly support the constants. There is an alternative way to define the constants in 
Java by using the non-access modifiers static and final.In Java, to declare any variable as constant, we use static and final modifiers. It is also known as non-access modifiers. 
According to the Java naming convention the identifier name must be in caPItal letters.

    The purpose to use the static modifier is to manage the memory.
    It also allows the variable to be available without loading any instance of the class in which it is defined.
    The final modifier represents that the value of the variable cannot be changed. It also makes the primitive data type immutable or unchangeable.
 */
