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

        //Int - Float compatibility
        float fa, fb;
        int a; //int b;
        a = 2;
        fa = a;
        fb = fa * 2;
        //b = fb; //we cannot assign float to int
        System.out.println("\n\tInt-Float Compatibility...");
        System.out.println("\t---------------------------------");
        System.out.println("\t a = "+ a);
        System.out.println("\t fa = "+ fa);
        System.out.println("\t fb = "+ fb);
        // System.out.println("\t b = "+ b);

        // FLOOR, CEIL and ROUND
        System.out.println("\n\tFLOOR,CEIL and ROUND methods...");
        System.out.println("\t----------------------------------");
        System.out.println("\t Default fnum: "+fnum);
        System.out.println("\t Floor fnum: "+ Math.floor(fnum));
        System.out.println("\t Ceil fnum: "+ Math.ceil(fnum));
        System.out.println("\t Round fnum: "+ Math.round(fnum));
        System.out.println("\t Truncate fnum: "+ (int)(fnum)); //truncate by casting

        
        System.out.println();
        input.close();
    }
}
