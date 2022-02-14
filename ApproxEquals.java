import java.util.*;

public class ApproxEquals {
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter three doubles, separated by spaces. The last will be the tolerance. ");
      double n1 = input.nextDouble();
      double n2 = input.nextDouble();
      double n3 = input.nextDouble();
      System.out.println("The two doubles are approximately equal: " + approxEquals(n1, n2, n3));
      
   }
   public static boolean approxEquals(double a, double b, double tolerance) {
      if (Math.abs(a - b) < tolerance) {
         return true;
      }
      else {
         return false;
      }
   }
}