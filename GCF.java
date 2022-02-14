import java.util.*;

public class GCF {
   public static void main (String[] args) {
      System.out.print("Enter two integers, separated by a space: ");
      Scanner sc = new Scanner(System.in);
      StringTokenizer st = new StringTokenizer(sc.nextLine());
      int x = Integer.parseInt(st.nextToken());
      int y = Integer.parseInt(st.nextToken());
      System.out.println("Greatest common factor: " + gcf(x, y));
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