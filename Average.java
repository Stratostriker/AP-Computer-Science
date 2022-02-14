import java.io.*;
import java.util.*;

public class Average {
   public static void main (String[] args) {
      System.out.print("Enter three integers: ");
      Scanner sc = new Scanner(System.in);
      StringTokenizer st = new StringTokenizer(sc.nextLine());
      double total = 0;
      for (int i = 0; i < 3; i++) {
         int num = Integer.parseInt(st.nextToken());
         total += num;
      }
      total = total / 3;
      System.out.printf("The average is %.3f %n", total);
   } 
}