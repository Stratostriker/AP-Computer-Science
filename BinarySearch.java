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
  }
  
  public static int binarySearch(int[] array, int key) {
    return 6;
  }
  
  public static void main(String[] args) {
    int[] test1 = generate(10, 0 , 10);
    int[] test2 = generateSorted(10);
    for(int i = 0; i < 10; i++) {
      System.out.print(test1[i] + " ");
    }
    System.out.println("");
    for(int i = 0; i < 10; i++) {
      System.out.print(test2[i] + " ");
    }
  }
}