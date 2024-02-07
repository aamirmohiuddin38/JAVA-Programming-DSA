import java.util.Scanner;

public class SwitchCaseCalc {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("------------------------------");
        System.out.println("Switch Case Program - Calc");
        Scanner input = new Scanner(System.in);

        int num1, num2, choice;
        System.out.print("\nEnter num1: | ");
        num1 = input.nextInt();
        System.out.print("Enter num2: | ");
        num2 = input.nextInt();

    System.out.println("\n\t Menu Options...");
    System.out.println("\t --------------------------");
    System.out.println("\t 1. Add");
    System.out.println("\t 2. Sub");
    System.out.println("\t 3. Multiply");
    System.out.println("\t 4. Divide");
    System.out.println("\t 5. Exit");

    System.out.print("\n\t Enter Option: | ");
    choice = input.nextInt();
    System.out.println("\n\t RESULT....");
    System.out.println("\t ---------------------------------------------");
    switch(choice){
        case 1:
            System.out.println("\t Add: num1 + num2 = " + (num1 + num2));
            break;
        case 2:
            System.out.println("\t Sub: num1 - num2 = " +  (num1 - num2));
            break;
        case 3:
            System.out.println("\t Add: num1 * num2 = " +  (num1 * num2));
            break;
        case 4:
            System.out.println("\t Divide | Quotient: num1 / num2 =  "+ (num1 / num2));
            System.out.println("\t Divide | Remainder: num1 %% num2 = " +  (num1 % num2));
            break;
        case 5:
            System.out.println("\t Thank You....");
            break;
        default:
            System.out.println("\t Invalid option entered...");
            break;
    }
    System.out.println("\t ---------------------------------------------");
    input.close();
}
}
