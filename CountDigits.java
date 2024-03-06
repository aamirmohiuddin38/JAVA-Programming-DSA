// Program to count a digit in a number
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("-----------------------------");
        System.out.println("Count a Digit in a Number\n");
        Scanner input = new Scanner(System.in);

        int num, digit, temp, rem, count=0;
        System.out.print("Enter num: | ");
        num = input.nextInt();
        temp = num;
        System.out.print("Enter digit to count: | ");
        digit = input.nextInt();

        while(num!=0){
            rem = num % 10;
            if(rem == digit) count++;
            num = num / 10;
        }

        System.out.println("\n\t The "+ digit + " occurs "+ count +" times in "+temp);

        input.close();
        System.out.println("\n");
    }
}
