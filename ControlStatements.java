// For Loop - syntax and examples
public class ControlStatements {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("---------------------------------");
        System.out.println("FOR LOOP - Syntax and Example");

    //? Incrementing by 1 - Ascending order
    System.out.println("\n\t Increment by 1 - Ascending Order");
    System.out.println("\t--------------------------------------");
    for(int i=0; i<=10; i++){
        System.out.println("\t "+ i);
    }

    //? Incrementing by 2 - Ascending order
    System.out.println("\n\t Increment by 2 - Ascending Order");
    System.out.println("\t--------------------------------------");
    for(int i=0; i<=10; i=i+2){
        System.out.println("\t "+ i);
    }

    //? Decrement by 1 - Decending order
    System.out.println("\n\t Decrement by 1 - Descending Order");
    System.out.println("\t--------------------------------------");
    for(int i=10; i>=0; i--){
        System.out.println("\t "+ i);
    }

    //? Decrement by 2 - Decending order
    System.out.println("\n\t Decrement by 2 - Descending Order");
    System.out.println("\t--------------------------------------");
    for(int i=10; i>=0; i=i-2){
        System.out.println("\t "+ i);
    }

        System.out.println("\n");
    }
}
