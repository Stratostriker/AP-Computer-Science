public class FormattedTable {
   public static void main(String[] args) {
      //test code
      int[][] table = {{23, 0, 425, -25},
              {1856, 24601, 7, 92},
              {-3, 18, -2053, 13}};
      printTable(table);
   }
   public static void printTable(int[][] table)
   {
      // Find out what the maximum number of columns is in any row
      int maxColumns = 0;
      for (int i = 0; i < table.length; i++) {
         maxColumns = Math.max(table[i].length, maxColumns);
      }

      // Find the maximum length of a string in each column
      int[] lengths = new int[maxColumns];
      for (int i = 0; i < table.length; i++) {
         for (int j = 0; j < table[i].length; j++) {
            lengths[j] = Math.max(String.valueOf(table[i][j]).length(), lengths[j]);
         }
      }

      // Generate a format string for each column
      String[] formats = new String[lengths.length];
      for (int i = 0; i < lengths.length; i++) {
         formats[i] = "%1$" + lengths[i] + "s" + (i + 1 == lengths.length ? "\n" : " ");
      }

      // Print table out
      for (int i = 0; i < table.length; i++) {
         for (int j = 0; j < table[i].length; j++) {
            System.out.printf(formats[j], table[i][j]);
         }
      }
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
