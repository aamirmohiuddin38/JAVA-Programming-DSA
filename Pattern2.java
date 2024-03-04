// Printing pattern of type 2
public class Pattern2 {
    public static void main(String args[]){
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("-------------------------");
        System.out.println("Pattern 2 \n");

        for(int row = 10; row > 0; row--){
            for(int col = 0; col < row; col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("\n");
    }
}
