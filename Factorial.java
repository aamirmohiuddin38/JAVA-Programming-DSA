// To calculate the factorial of a number
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("--------------------------");
        System.out.println("Factorial of a Number");
        Scanner input = new Scanner(System.in);

        int num, fact = 1, temp;
        System.out.print("\nEnter num: | ");
        num = input.nextInt();
        temp = num;

        if(num == 0){
            System.out.println("\n\t Factorial of "+ num + " is "+fact);
        }
        else{
            while(num!=0){
                fact = fact * num;
                num--;
            }
            System.out.println("\n\t Factorial of "+ temp + " is "+fact);
        }
        input.close();
        System.out.println("\n");
    }
}
