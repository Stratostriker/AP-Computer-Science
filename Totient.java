import java.util.*;

public class Totient {
   public static void main (String[] args) {
      System.out.print("Enter an integer: ");
      Scanner sc = new Scanner(System.in);
      StringTokenizer st = new StringTokenizer(sc.nextLine());
      int x = Integer.parseInt(st.nextToken());
      System.out.println("Totient of " + x + ": " + totient(x));
   }
   //precondition: n > 0
   public static int totient (int n) {
      int counter = 0;
      //cycles through the numbers less than the input
      for (int i = 1; i <= n; i++) {
         //adds 1 to a counter if the numbers are relatively prime
         if (gcf(n, i) == 1) {
            counter++;
         }
      }
      return counter;
   }
   //precondition: a > 0, b > 0
   public static int gcf (int a, int b) {
      //euclid's algorithm
      //when smaller divides larger, smaller is gcf
      //keep substracting smaller from larger until gcf (remainder is the gcf)
      if (b == 0) {
         return a;
      }
      return gcf(b, a % b);
   }
}