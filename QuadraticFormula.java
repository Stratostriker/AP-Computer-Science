//Project Euler problem 2

import java.io.*;

public class QuadraticFormula {
   public static void main (String[] args) throws IOException {
      PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
      int a = 1, b = 2, c = 3;
      int total = 0;
      while (a <= 4000000) {
         if (a % 2 == 0) {
            total += a;
         }
         a = b;
         b = c;
         c = a + b;
      }
      pw.print(total);
      pw.close();
   }
}