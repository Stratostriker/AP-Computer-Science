public class Arrays {
   public static int max(int[] array) {
      //sets max to first number
      int result = array[0];
      //loops through rest of numbers
      for (int i = 1; i < array.length; i++) {
         //"king of the hill" - sets result to larger number
         result = Math.max(result, array[i]);
      }
      return result;
   }
   public static int min(int[] array) {
      //sets min to first number
      int result = array[0];
      //loops through rest of numbers
      for (int i = 1; i < array.length; i++) {
         //"king of the hill" - sets result to smaller number
         result = Math.min(result, array[i]);
      }
      return result;
   }
   public static int range(int[] array) {
      //largest number minus smallest number
      int result = max(array) - min(array);
      return result;
   }
   public static void main(String[] args) {
      //testing code
      int[] nums1 = {-3, 8, 2, 17, 9, -3, 12, 0, 4, 11};
      int[] nums2 = {8, 0, 6, 7, 1, 2, 9, 3, 5, 4, 11, -100, -88, 55};
      
      System.out.println("Max: " + max(nums1) + " Min: " + min(nums1) + " Range: " + range(nums1));
      System.out.println("Max: " + max(nums2) + " Min: " + min(nums2) + " Range: " + range(nums2));
   }
}