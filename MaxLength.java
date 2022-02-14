public class MaxLength {
   public static void main(String[] args) {
      //test code
      int[][] table = {{23, 0, 425, -25},
                       {1856, 24601, 7, 92},
                       {-3, 18, -2053, 13}};
      System.out.println(maxLength(table));
   }
   //Returns the length (in characters) of the longest number in table
   //precondition: table contains at least one element
   public static int maxLength(int[][] table) {
      int counter = 0;
      //loops through the table
      for(int i = 0; i < table.length; i++) {
         for(int j = 0; j < table[i].length; j++) {
            //saves longest number
            counter = Math.max(counter, String.valueOf(table[i][j]).length());
         }
      }
      //returns longest number
      return counter;
   }
}