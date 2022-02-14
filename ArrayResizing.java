import java.util.Arrays;

public class ArrayResizing {
   public static void main(String[] args) {
      int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      System.out.println(Arrays.toString(resize(test, test.length + 1)));
      System.out.println(Arrays.toString(resize(test, test.length - 1)));
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
