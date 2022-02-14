import java.util.*;

public class MonteCarlo {
   public static void main (String[] args) {
      System.out.print("Enter the number of trials: ");
      Scanner sc = new Scanner(System.in);
      int trials = sc.nextInt();
      double wins = 0.0;
      for (int i = 0; i < trials; i++) {
         if (rollEm() == true) {
            wins++;
         }
      }
      System.out.println("Theoretical probability: 625/1296 or about 0.482");
      System.out.println("Experimental probability: " + (wins / trials));
   }
   public static int roll() {
      //random int from 1-6
      return (int)Math.floor(Math.random()*7);
   }
   public static boolean rollEm() {
      boolean result = true;
      //4 rolls
      for (int i = 0; i < 4; i++) {
         int die = roll();
         //if roll 6, lose game
         if (die == 6) {
            result = false;
         }
      }
      //if no 6s are rolled, win game
      return result;
   }
}