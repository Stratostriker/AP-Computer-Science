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
    result[0] = 1; 
    Random randGen = new Random();
    for (int i = 1; i < length; i++) {
      result[i] = result[i-1] + randGen.nextInt(3);
    }
    return result;
  }
  
  public static int binarySearch(int[] array, int key) {
    return 6;
  }
}