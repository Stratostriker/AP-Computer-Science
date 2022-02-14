import java.util.Arrays;

public class ArraySearching2 {
   public static int[] multiSearch(int[] array, int key) {
      int indices = 0;
      //finds occurences of key within array
      for (int i = 0; i < array.length; i++) {
         if (array[i] == key) {
            indices++;
         }
      }
      //instantiate the array
      int[] result = new int[indices];
      int counter = 0;
      //adds the indices of the key to a new array
      for (int i = 0; i < array.length; i++) {
         if (array[i] == key) {
            result[counter] = i;
            counter++;
         }
      }
      //returns the array containing the indices of the key
      return result;
   }
   public static void main(String[] args) {
      //test code
      int[] nums = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
      System.out.println(Arrays.toString(multiSearch(nums, 4)));
      System.out.println(Arrays.toString(multiSearch(nums, 3)));
      System.out.println(Arrays.toString(multiSearch(nums, 1)));
      System.out.println(Arrays.toString(multiSearch(nums, 5)));
      System.out.println(Arrays.toString(multiSearch(nums, 7)));
   }
}