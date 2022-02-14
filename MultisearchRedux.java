import java.util.Arrays;

public class MultisearchRedux {
   public static void main(String[] args) {
      int[] test = new int[1000000];
      System.out.println(Arrays.toString(multiSearch(test, 0)));
   }
   public static int[] multiSearch(int[] array, int key) {
      //new array and counter
      int[] result = new int[0];
      int counter = 0;
      //loops through array 
      for (int i = 0; i < array.length; i++) {
         //finds the key
         if (array[i] == key) {
            //resizes the new array
            result = resize(result, result.length + 1);
            //adds the index of the key
            result[counter] = array[i];
            counter++;
         }
      }
      return result;
   }
   public static int[] resize(int[] array, int newLength) {
      //instantiate new array
      int[] result = new int[newLength];
      //fill new array with values from original array, stopping at the shorter length of the two arrays
      for (int i = 0; i < Math.min(array.length, newLength); i++) {
         result[i] = array[i];
      }
      //return the newly filled array
      return result;
   }
}