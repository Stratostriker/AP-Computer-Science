public class SelectionSort {
  public static void selectionSort(int[] array) {
    for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            // find minimum element and its index
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // swap minimum element and first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
  }
  public static void selectionSort(String[] array) {
    for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            String min = array[i];
            // find minimum element and its index
            for (int j = i+1; j < array.length; j++) {
                if (array[j].compareToIgnoreCase(min) < 0) {
                  min = array[j];  
                  minIndex = j;
                }
            }
            // swap minimum element and first element
            String temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
  }
  
}
