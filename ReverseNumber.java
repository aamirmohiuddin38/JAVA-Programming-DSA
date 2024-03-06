// Program to reverse a number
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("---------------------------");
        System.out.println("REVERSE a number\n");
        Scanner input = new Scanner(System.in);

        // Read a number
        int rev = 0, rem;
        System.out.print("Enter num: | ");
        int num = input.nextInt();
        int temp = num;

        //reverse
        while(num!=0){
            rem = num % 10;
            rev = rem + (rev*10);
            num = num / 10;
        }

        System.out.println("\t --------------------------------------");
        System.out.println("\t REVERSE of " + temp + " is : | "+rev);
        System.out.println("\t --------------------------------------");

        //Check for pallindrome
        if(temp == rev){
            System.out.println("\t PALINDROME\n");
        }
        else{
            System.out.println("\t Not a Palindrome\n");
        }

        input.close();
        System.out.println("\n");
    }
}
