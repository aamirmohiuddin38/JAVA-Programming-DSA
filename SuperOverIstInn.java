// Cricket Score status of first innings of suuper over
import java.util.Scanner;
public class SuperOverIstInn {
    public static void main(String[] args) {
        System.out.println("\033\143");
        System.out.println("Java | Progrmming");
        System.out.println("----------------------------");
        System.out.println("SUPER OVER...Ist Innings");

        Scanner input = new Scanner(System.in);
        int score=0, runs, max=0;
        float avg;

        for(float ball=0.1f; ball<=0.7; ball = ball + 0.1f){
            System.out.print("\nBall : "+ball+" | ");
            System.out.print("Enter runs scored: | ");
            runs = input.nextInt();
            score += runs;
            avg = score/(ball*10);
            if(runs>max) max = runs;
            System.out.println("\t-----------------------------------");
            System.out.println("\t SCORE: "+score+"| AVG: "+avg+" | MAX: "+max);
            System.out.println("\t------------------------------------");
        }

        System.out.println("\n Runs to Win: | "+ (score+1));

        input.close();
        System.out.println("\n");
    }
}

/* The loop appears to be running until 0.6 instead of 0.7 due to floating-point precision issues.

In Java (and many other programming languages), floating-point numbers are represented internally using
binary fractions, which can sometimes lead to rounding errors. When you increment ball by 0.1f
 in each iteration of the loop, the exact value of ball may not be exactly 0.7 due to these rounding errors. */