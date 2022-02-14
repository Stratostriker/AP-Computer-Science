import java.util.*;


public class PrimeFactorization {
   public static void main (String[] args) {
      System.out.print("Enter an integer: ");
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();
      System.out.println(primeFactor(input));
   }
   //precondition n >= 2
   public static String primeFactor (int n) {
      String result = "";
      //number of 2s that are factors
      while (n % 2 == 0) {
         result += "2 ";
         //divide n by 2
         n /= 2;
      }
      //n is odd since all the 2s are factored out
      for (int i = 3; i * i <= n; i += 2) {
         while (n % i == 0) {
            result += i + " ";
            //divide n by i
            n /= i;
         }
      }
      //prime number greater than 2
      if (n > 2) {
         result += n;
      }
      //remove whitespace
      result = result.trim();
      return result;
   }
}
