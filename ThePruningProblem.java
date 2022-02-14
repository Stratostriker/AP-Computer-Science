import java.util.*;

public class ThePruningProblem {
   public static void main(String[] args) {
      //test code
      ArrayList<String> list = new ArrayList<String>();
      String sentence = "To be or not to be that is the question";
      String[] words = sentence.split(" ");
      for(String s: words) {
         list.add(s);
      }
      removeWithLength(list, 2);
      System.out.println(list);
   }
   public static void removeWithLength(ArrayList<String> list, int length) {
      //loops through ArrayList
      for (int i = 0; i < list.size();) {
         //removes string if its length matches the length to be removed
         if (list.get(i).length() == length) {
            list.remove(i);
         }
         //continues looping if no string is removed
         else {
            i++;
         }
      }
   }
}