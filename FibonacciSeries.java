// Program to generate Fibonacci Series
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("-------------------------");
        System.out.println("Fibonacci Series\n");
        Scanner input = new Scanner(System.in);

        int a = 0, b = 1, c, limit;
        System.out.print("Enter limit: | ");
        limit = input.nextInt();

        System.out.println("\n\t Fibonacci Series till : | "+ limit);
        System.out.println("\t------------------------------------");
        System.out.print("\t 0, 1, ");
        c = a + b;
        while (c <= limit) {
            System.out.print(c+", ");
            a = b;
            b = c;
            c = a + b;
        }

        input.close();
        System.out.println("\n");
    }
}
