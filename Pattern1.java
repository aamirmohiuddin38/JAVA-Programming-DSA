// Printing pattern
public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("------------------------------");
        System.out.println("Pattern 1\n");

        for(int row = 0; row < 10; row++){
            for(int col = 0; col < row; col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("\n");
    }
}
