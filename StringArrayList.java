public class StringArrayList implements StringList {
   //instance variables
   private String[] array;
   int size;
   
   public StringArrayList() {
      //create new StringArrayList with default length of 10
      this(10);
   }
   public StringArrayList(int initLength) {
     //create new StringArrayList
      array = new String[initLength];
      size = 0;
   }
   public String toString() {
      //returns string representation of the list
      String result = "[";
      if (size > 0) {
         result = result + array[0];
      }
      for (int i = 1; i < size; i++) {
         result = result + ", " + array[i];
      }
      result = result + "]";
      return result;
   }
   private void resize(int newLength) {
      //create new array of newLength
      String[] tempArray = new String[newLength];
      //copies elements of original array
      for (int i = 0; i < size; i++) {
         tempArray[i] = array[i];
      }
      //point instance variable to new array
      array = tempArray;
   }
   public void add(String str) {
      //add str to end of list
      add(size, str);
   }
   public void add(int index, String str) {
      //checks for validity of index
      if (index > size) {
         throw new IndexOutOfBoundsException();
      }
      //check for need to resize array
      else if (index == size) {
         //double array size
         resize(array.length * 2);
      }
      //shifts items to right
      for (int i = size; i > index; i--) {
         array[i] = array[i-1];
      }
      array[index] = str;
      //increases size
      size++;
   }
   public int size() {
     //returns size of the list
      return size;
   }
   public boolean isEmpty() {
      //checks if the list has elements
      return size == 0;
   }
   public String get(int index) {
      //checks if index does not exist in the list
      if (index > size - 1) {
         throw new IndexOutOfBoundsException();
      }
      //return string at given index
      return array[index];
   }
   public String set(int index, String newStr) {
      //checks if index does not exist in the list
      if (index > size - 1) {
         throw new IndexOutOfBoundsException();
      }
      //stores string to be replaced
      String tempStr = array[index];
      //replaces string with newStr
      array[index] = newStr;
      //return string replaced
      return tempStr;
   }
   public String remove(int index) {
      //checks if index does not exist in the list
      if (index > size - 1) {
         throw new IndexOutOfBoundsException();
      }
      //stores string to be removed
      String removed = array[index];
      // shift items to right of index left one position
      for (int i = index; i < size - 1; i++) {
         array[i] = array[i+1];
      }
      // store null in vacated position and reduce size
      array[size - 1] = null;
      //reduces size
      size--;
      //return string removed
      return removed;
   }
}