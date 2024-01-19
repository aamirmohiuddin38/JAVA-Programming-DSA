// Floating Point Numbers - Beginner
import java.text.NumberFormat;
import java.util.Scanner;
public class FloatingPointNumber {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("-------------------------------------");
        System.out.println(" Floating Point Numbers \n");

        Scanner input = new Scanner(System.in);
        float fnum;
        System.out.print("Enter fnum: ");
        fnum = input.nextFloat();

        // Displaying in various formats
        System.out.println("\n\tResults...");
        System.out.println("\t-----------------------------------------");
        System.out.println("\tDefault Format: = "+ fnum);
        System.out.println("\t Type 1: = " + String.format("%4.2f", fnum));
        System.out.println("\t Type 2: = " + String.format("%.5f", fnum));
        System.out.println("\t Type 3: = " + NumberFormat.getInstance().format(fnum));

        System.out.println();
        input.close();
    }
}
