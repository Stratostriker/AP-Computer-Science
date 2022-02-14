public class ArraySearching1 {
   public static void main(String[] args) {
      int[] test = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
      System.out.println(search(test, 4));
      System.out.println(search(test, 7));
      System.out.println(search(test, 3));
      System.out.println(search(test, 5, 0));
      System.out.println(search(test, 5, 6));
      System.out.println(search(test, 9, 6));
   }
   public static int search(int[] array, int key) {
      //loops through array 
      for(int i = 0; i < array.length; i++) {
         //returns index of first occurence of key
         if (array[i] == key) {
            return i;
         }
      }
      //if key is not in array
      return -1;
   }
   public static int search(int[] array, int key, int startIndex) {
      //loops through array starting at startIndex
      for(int i = startIndex; i < array.length; i++) {
         //returns index of first occurence of key
         if (array[i] == key) {
            return i;
         }
      }
      //if key is not in array
      return -1;
   }
   
}