public class MagicSquares {
   public static void main (String[] args) {
      //test code
      //is a magic square
      int[][] square1 = {{8, 1, 6},
                        {3, 5, 7},
                        {4, 9, 2}};
      //is not a magic square
      int[][] square2 = {{8, 8, 8},
                        {8, 8, 7},
                        {8, 8, 8}};
      //is a magic square
      int[][] square3 = {{30, 39, 48, 1, 10, 19, 28},
                        {38, 47, 7, 9, 18, 27, 29},
                        {46, 6, 8, 17, 26, 35, 37},
                        {5, 14, 16, 25, 34, 36, 45},
                        {13, 15, 24, 33, 42, 44, 4},
                        {21, 23, 32, 41, 43, 3, 12},
                        {22, 31, 40, 49, 2, 11, 20}};                  
      //is not a magic square
      int[][] square4 = {{1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 0},
                        {7, 3, 4, 1, 5}};
      //should be true, false, true, false
      System.out.println(isMagicSquare(square1));
      System.out.println(isMagicSquare(square2));
      System.out.println(isMagicSquare(square3));
      System.out.println(isMagicSquare(square4));
   }
   public static boolean isMagicSquare(int[][] grid) {
      //checks if number of rows is equal to number of columns
      if (grid.length != grid[0].length) {
         return false;
      }
      int diag1 = 0, diag2 = 0;
      for (int i = 0; i < grid.length; i++) {
         //diagonal top left to bottom right
         diag1 += grid[i][i];
         //diagonal top right to bottom left
         diag2 += grid[i][grid.length - 1 - i];
      }
      //checks if diagonals are equal
      if (diag1 != diag2) {
         return false;
      }
      // checks if sum of rows is equal to sum of colums and equal to diagonals
      for (int i = 0; i < grid.length; i++) {
         int rowSum = 0, colSum = 0;
         for (int j = 0; j < grid[0].length; j++) {
            rowSum += grid[i][j];
            colSum += grid[j][i];
         }
         if (rowSum != colSum || rowSum != diag1) {
            return false;
         }
      }
      //if rows, colums, and diagonals are equal, return true
      return true;
   }
}