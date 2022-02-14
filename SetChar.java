public class SetChar {
   public static void main (String[] args) {
      //test code
      String word = "touch";
      System.out.println(word);
      word = setChar(word, 3, "g");
      System.out.println(word);
      word = setChar(word, 0, 'r');
      System.out.println(word);
      word = setChar(word, 4, (char)(word.charAt(4)-3));
      System.out.println(word);
   }
   public static String setChar(String str, int index, String ch) {
      //calls setChar method while changing the String to a character
      return setChar(str, index, ch.charAt(0));
   }
   public static String setChar(String str, int index, char ch) {
      //changes string to character array
      char[] array = str.toCharArray();
      //changes the character at the index to the new character
      array[index] = ch;
      return new String(array);
   }
}