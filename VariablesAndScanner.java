import java.util.Scanner;

public class VariablesAndScanner {
    public static void main(String[] args) {
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("-----------------------------");
        System.out.println("Variables | Scanner Class\n");
        
        //Scanner Object
        Scanner input = new Scanner(System.in);

        //Declaring variables in java
        int intNum;
        float floatNum;
        double doubleNum;

        //Scanning values from User
        System.out.print("Enter an Integer Number:");
        intNum = input.nextInt();

        System.out.print("Enter a float Number:");
        floatNum = input.nextFloat();

        System.out.print("Enter a double Number:");
        doubleNum = input.nextDouble();

        //Results:
        System.out.println("\tResults:...");
        System.out.println("\t-----------------------\n");
        System.out.println("\tValue of intNum "+ intNum);
        System.out.println("\tValue of floatNum "+ floatNum);
        System.out.println("\tValue of doubleNum "+ doubleNum+"\n");

        input.close();
    }
}
