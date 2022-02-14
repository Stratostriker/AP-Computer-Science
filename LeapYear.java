import java.util.Scanner;

public class LeapYear {
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a year: ");
      int n1 = input.nextInt();
      System.out.println("The year entered is a leap year: " + isLeapYear(n1));
   }
   public static boolean isLeapYear(int year) {
      boolean result = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
      return result;
   }
}