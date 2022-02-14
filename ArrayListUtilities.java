import java.util.*;

public class ArrayListUtilities {
   public static void main(String[] args) {
        //test code
      ArrayList<Integer> nums = new ArrayList<Integer>();
      //nums.add(17);
      //seed(nums, 10, 1, 10);
      //System.out.println(nums);
      //System.out.println("Min: " + min(nums));
      //System.out.println("Max: " + max(nums));
      seed(nums, 10, 0, 10);
      System.out.println(nums);
      sortIAL(nums);
      System.out.println(nums);
      
      ArrayList<Integer> nums2 = new ArrayList<Integer>();
      seed(nums2, 100, -10, 10);
      System.out.println(nums2);
      sortIAL(nums2);
      System.out.println(nums2);
      
      ArrayList<Integer> nums3 = new ArrayList<Integer>();
      seed(nums3, 100000, -20, 20);
      System.out.println(nums3);
      sortIAL(nums3);
      System.out.println(nums3);
   }
   public static void seed(ArrayList<Integer> list, int numElements, int minValue, int maxValue) {
        //iterates through array numElement times
      for(int i = 0; i < numElements; i++) {
            //adds an integer randomly chosen between the minimum value and the maximum value inclusive
         list.add((int)(Math.random() * (maxValue - minValue + 1) + minValue));
      }
   }
   public static int min(ArrayList<Integer> list) {
        //sets minimum to be the first number
      int min = list.get(0);
        //loops through
      for(int i = 1; i < list.size(); i++) {
            //updates min if less
         min = Math.min(min, list.get(i));
      }
      return min;
   }
   public static int max(ArrayList<Integer> list) {
        //sets maximum to be the first number
      int max = list.get(0);
        //loops through
      for(int i = 1; i < list.size(); i++) {
            //updates max if larger
         max = Math.max(max, list.get(i));
      }
      return max;
   }
    //IAL stands for "integer array list"
   public static void sortIAL(ArrayList<Integer> list) {
      ArrayList<Integer> temp = new ArrayList<Integer>();
      while(!list.isEmpty()) {
        //sets minimum to be the first number
         int min = list.get(0);
        //location of minimum number
         int loc = 0;
        //loops through
         for(int i = 1; i < list.size(); i++) {
            //updates min if less and stores location
            if(list.get(i) < min) {
               min = list.get(i);
               loc = i;
            }
         }
         //adds minimum to temp 
         temp.add(min);
         //removes minimum from list
         list.remove(loc);
      }
      //copies all elements in order
      for(Integer value:temp) {
         list.add(value);
      }
   }
}