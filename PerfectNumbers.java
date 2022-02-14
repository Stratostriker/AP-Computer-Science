public class PerfectNumbers {
   public static boolean isPerfect (int n) {
      //sum of divisors (all include 1)
      int sum = 1; 
      
      //find divisors and add them (loop until square root of n)
      for (int i = 2; i * i <= n; i++) {
         if (n % i == 0) {
            if(i * i == n) {
               sum = sum + i;
            }
            else {
               sum = sum + i + (n / i);
            }
         }
      }
      
      //sum of divisors equal to n or not
      if (sum == n && n != 1) {
         return true;
      }
      else {
         return false;
      }
   }
   public static void main (String[] args) {
      for (int i = 2; i <= 50000000; i++) {
         if (isPerfect(i)) {
            System.out.println(i);
         }
      }
   }
}