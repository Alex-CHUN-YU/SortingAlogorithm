package sortingalogorithm;

/**
 *
 * InsertionSort.
 *
 * @version 1.0 2017/05/24
 * @author ALEX-CHUN-YU
 *
 */
public class InsertionSort {

   /**
    * it is a insertion number.
    */
   private static int insertionNum;

   /**
    * @param data number sequence
    * @return return sort number sequence
    */
   public static int[] getInsertionSort(final int[] data) {
       int j;
       for (int i = 1; i < data.length; i++) {
           insertionNum = data[i];
           for (j = i - 1; j >= 0 && data[j] >= insertionNum; j--) {
               data[j + 1] = data[j];
           }
           // insertionNumber
           data[j + 1] = insertionNum;
       }
       return data;
   }
}


