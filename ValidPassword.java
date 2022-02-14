public class ValidPassword { 
   public static void main(String[] args) {
      System.out.println(isValidPassword("abcABC123!!!"));
      System.out.println(isValidPassword("abcABC123"));
      System.out.println(isValidPassword("abcdefghijklmnopqrstuvwxyzABC123"));
   }
   public static boolean isValidPassword(String password) {
      //checks if the password is between 6 to 16 characters long
      if (password.length() < 6 || password.length() > 16) {
         return false;
      }
      //changes the string to a character array
      char[] pass = password.toCharArray();
      //counters for the conditions: capital, lowercase, digit, any other
      int capital = 0, lowercase = 0, digit = 0, other = 0;
      //loops through the character array
      for (int i = 0; i < password.length(); i++) {
         //checks for spaces
         if (Character.isWhitespace(pass[i])) {
            return false;
         }
         //counts uppercase
         else if (Character.isUpperCase(pass[i])) {
            capital++;
         }
         //counts lowercase
         else if (Character.isLowerCase(pass[i])) {
            lowercase++;
         }
         //counts digits
         else if (Character.isDigit(pass[i])) {
            digit++;
         }
         //counts other
         else {
            other++;
         }
      }
      //checks if each condition is fulfilled 3 times
      if (capital < 3 || lowercase < 3 || digit < 3 || other < 3) {
         return false;
      }
      //if all conditions are met, return true
      return true;
   }
}