import java.util.*;

public class RowStrings {
   public static void main(String[] args) {
      //test code
      char[][] letters = {{'G','r','e','a','t'},
                          {'W','h','i','t','e'},
                          {'S','h','a','r','k'}};
      String[] strings = rowStrings(letters);                     
      for (int i = 0; i < letters.length; i++) {
         System.out.print(strings[i] + " ");
      }
   }
   //precondition: characters contain at least 1 row and 1 column
   public static String[] rowStrings(char[][] characters) {
      String[] result = new String[characters.length];
      //loops through rows
      for (int i = 0; i < characters.length; i++) {
         String word = "";
         //loops through each letter
         for (int j = 0; j < characters[i].length; j++) {
            //adds each letter to the word
            word += characters[i][j];
         }
         //adds the word to the string array
         result[i] = word;
      }
      //returns the string array
      return result;
   }
}