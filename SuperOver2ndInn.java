// Cricket score status of 2nd innings of super over
import java.util.Scanner;
public class SuperOver2ndInn {
    public static void main(String[] args) {
        System.out.println("\033\143");
        System.out.println("Java | Programming");
        System.out.println("-------------------------------");
        System.out.println("SUPER OVER: 2nd Innings\n");
        Scanner input = new Scanner(System.in);

        int score = 0, runs, toWin, max= 0, ballsLeft=6;
        float rr, avg;

        System.out.print("Enter runs to win: | ");
        toWin = input.nextInt();
        
        for(float ball = 0.1f; ball<0.7 && toWin>0; ball = ball + 0.1f){
            System.out.print("\n Ball: "+ball+" | ");
            System.out.print("Enter runs scored: | ");
            runs = input.nextInt();
            score += runs;
            if(runs>max) max = runs;
            toWin -= runs;
            ballsLeft--;
            avg = score / (ball*10);
            if(ballsLeft==0) rr = toWin;
            else rr = toWin / ballsLeft;
            System.out.println("\t-------------------------------------------");
            System.out.println("\t|| SCORE: "+score+" | AVG: "+avg+" | RR: "+rr+" | Max: "+max+ " ||");
            System.out.println("\t-------------------------------------------");
            if(toWin>0){
                System.out.println("\t IND need "+toWin+" runs to win with "+ballsLeft+" balls remaining");
            }
        }

        if(toWin<=0){
            System.out.println("\t IND need 0 runs to win with "+ballsLeft+" balls remaining");
            System.out.println("\nIND WIN...");
        }
        else if(toWin>2){
            System.out.println("\nIND LOST THE MATCH...");
        }
        else{
            System.out.println("\nMATCH TIED...");
        }

        input.close();
        System.out.println("\n");
    }
}
