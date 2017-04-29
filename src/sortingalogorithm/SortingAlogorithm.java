package sortingalogorithm;

/**
 *
 * MainFunction Test.
 *
 * @version 1.0 2017年4月28日
 * @author ALEX-CHUN-YU
 *
 */
public class SortingAlogorithm {

    /**
     * insertionSort.
     */
    @SuppressWarnings("unused")
    private static InsertionSort insertionSort;

    /**
     * selectionSort.
     */
    @SuppressWarnings("unused")
    private static SelectionSort selectionSort;

   /**
    * @param args system define
    */
   public static void main(final String[] args) {
       //InsertionSort
       int[] data = {12, 52, 65, 66, 2, 45, 85, 9, 11};
       data = InsertionSort.getInsertionSort(data);
       System.out.print("InsertionSort: ");
       for (int i = 0; i < data.length; i++) {
           System.out.print(data[i] + " ");
       }
       System.out.println();
       //SelectionSort
       int[] data1 = {12, 65, 52, 2, 66, 85, 45, 11, 9};
       data1 = SelectionSort.getSelectionSort(data1);
       System.out.print("SelectionSort: ");
       for (int i = 0; i < data1.length; i++) {
           System.out.print(data1[i] + " ");
       }
       System.out.println();
       //QuickSort
       int[] data2 = {65, 52, 66, 45, 2, 85, 9, 11, 12};
       data2 = QuickSort.getQucikSort(0, data2.length - 1, data2);
       System.out.print("QuickSort:     ");
       for (int i = 0; i < data2.length; i++) {
           System.out.print(data2[i] + " ");
       }

    }
}


