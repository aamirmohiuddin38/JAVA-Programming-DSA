// Printing pyramid pattern
public class PatternPyramid {
    public static void main(String[] args) {
        System.out.println("\033\143");
        System.out.println("Java | Programmingn");
        System.out.println(("------------------------"));
        System.out.println("Pyramid Pattern\n");

        int spaces = 10;
        for(int row = 0; row < 10; row++){
            //spaces
            for(int space = 1; space<spaces; space++){
                System.out.print(" ");
            }
            for(int col = 0; col < row; col++){
                System.out.print("* ");
            }
            System.out.print("\n");
            spaces--;
        }
        System.out.println("\n");
    }
}
