// Printing mulitple patterns
public class Pattern3 {
    public static void main(String[] args) {
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("--------------------------");
        System.out.println("Multiple Patterns");

        for(int row = 0; row < 10; row++){
            for(int col = 0; col < row; col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for(int row = 10; row > 0; row--){
            for(int col = 0; col < row; col++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("\n");
    }
}
