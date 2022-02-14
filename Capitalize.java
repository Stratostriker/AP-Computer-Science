public class Capitalize {
   public static void main(String[] args) {
      System.out.println(capitalize("bobby"));
      System.out.println(capitalize("ILENE"));
      System.out.println(capitalize("yOU-tUbER"));
      System.out.println(capitalize("l33t haXXor"));
      System.out.println(capitalize("3-Point shot"));
   }
   public static String capitalize(String str) {
      //changes first character to uppercase and changes rest to lowercase
      return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
   }
}