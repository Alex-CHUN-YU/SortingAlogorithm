package sortingalogorithm;

/**
 *
 * SelectionSort.
 *
 * @version 1.0 2017年4月28日
 * @author ALEX-CHUN-YU
 *
 */
   public class SelectionSort {

   /**
    * @param data number sequence
    * @return return sort number sequence
    */
   public static int[] getSelectionSort(final int[] data) {
       int min;
       for (int i = 0; i < data.length; i++) {
          min = i;
          for (int j = i; j < data.length; j++) {
              if (data[j] <= data[min]) {
                  min = j;
              }
          }
          //swap
          int template = data[min];
          data[min] = data[i];
          data[i] = template;
      }
       return data;
    }
}

