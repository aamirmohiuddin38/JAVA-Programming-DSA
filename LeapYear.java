//Program to check if a year is leap year or not
import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("------------------------------");
        System.out.println("Leap Year Program...");
        Scanner input = new Scanner(System.in);

        int year;
        System.out.print("\nEnter Year: | ");
        year = input.nextInt();

        System.out.println("\t -------------------------------");
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            System.out.println("\t Leap Year...");
        else
            System.out.println("\t Not a Leap Year...");
        System.out.println("\t -------------------------------");

        System.out.println("\n");
        input.close();
    }
}
