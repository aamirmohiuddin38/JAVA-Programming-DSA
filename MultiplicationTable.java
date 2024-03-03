// Generate the multiplication table of a given number upto given limit
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("---------------------------");
        System.out.println("Multiplication Table...\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num: | ");
        int num = input.nextInt();
        System.out.print("Enter limit: | ");
        int limit = input.nextInt();

        System.out.println("\n\tMuliplication table of "+ num +" till | "+ limit + ":");
        System.out.println("\t------------------------------------");
        for(int i=0; i<limit; i++){
            System.out.println("\t" + num + " * "+String.format("%2d",(i+1))+" = "+String.format("%3d",(num*(i+1))));
        }

        input.close();
        System.out.println("\n");
    }
}
