import java.util.*;

public class ValidDate {
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the month, date, and year in order separated by a space: ");
      StringTokenizer st = new StringTokenizer(input.nextLine());
      int n1 = Integer.parseInt(st.nextToken());
      int n2 = Integer.parseInt(st.nextToken());
      int n3 = Integer.parseInt(st.nextToken());
      System.out.println("The date is a valid date: " + isValidDate(n1, n2, n3));
   }
   public static boolean isLeapYear(int year) {
      boolean result = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
      return result;
   }
   public static boolean isValidDate(int month, int day, int year) {
      boolean result;
      if ((month % 2 == 1 && day < 32) || (month % 2 == 0 && day < 31) && (month != 2)) {
         result = month > 0 && month < 13 && year >= 0;
      }
      else if (month == 2) {
         result = (isLeapYear(year) && day < 30) || day < 29;
      }
      else {
         result = false;
      }
      result = day >= 0 && month >= 0 && year >= 0;
      return result;
   }
}