import java.util.*;

public class BinarySearch {
   public static int[] generate(int length, int low, int high) {
      int[] result = new int[length];
      Random randGen = new Random();
      for (int i = 0; i < length; i++) {
         result[i] = randGen.nextInt(high - low + 1) + low;
      }
      return result;
   }
   
   public static int[] generateSorted(int length) {
      int[] result = new int[length];
      //first element is 1
      result[0] = 1; 
      Random randGen = new Random();
      //pick pseudorandom number from 0-2 inclusive
      for (int i = 1; i < length; i++) {
         result[i] = result[i-1] + randGen.nextInt(3);
      }
      return result;
   }
   
   public static int binarySearch(int[] array, int key) {
      int left = 0, right = array.length - 1;
      while (left <= right) {
         int middle = (left + right)/2;
         //if key is in the middle
         if(array[middle] == key) {
            return middle;
         }
         //if key is greater, search right half
         else if(array[middle] < key) {
            left = middle + 1;
         }
         //if key is less, search left half
         else {
            right = middle - 1;
         }
      }
      //key not found
      return -1;
   }
