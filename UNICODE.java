// Program to print the UNICODE values of alphabets
public class UNICODE {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("-------------------------");
        System.out.println("UNICODE Values...");

        //? unicode values of A-Z
        System.out.println("\n\t UNICODE Values of A-Z");
        System.out.println("\t----------------------------");
        for(char i='A'; i<='Z'; i++){
            System.out.println("\t" + i +" | "+ (int)(i));
        }

        //? unicode values of a-z
        System.out.println("\n\t UNICODE Values of a-z");
        System.out.println("\t----------------------------");
        for(char i='a'; i<='z'; i++){
            System.out.println("\t" + i +" | "+ (int)(i));
        }

        System.out.println("\n");
    }
}

