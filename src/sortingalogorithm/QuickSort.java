package sortingalogorithm;

/**
 *
 * InsertionSort.
 *
 * @version 1.0 2017/5/24
 * @author ALEX-CHUN-YU
 *
 */
   public class QuickSort {

   /**
    * @param data number sequence
    * @param start left
    * @param end right
    * @return return sort number sequence
    */
   public static int[] getQucikSort(final int start, final int end, final  int[] data) {
       if (start >= end) {
           return data;
       }
       int left = start, right = end - 1, pivot = data[end];
       while (right > left) {
           while (data[left] < pivot && right > left) {
               left++;
           }
           while (data[right] > pivot && right > left) {
               right--;
           }
           //swap
           int template = data[left];
           data[left] = data[right];
           data[right] = template;
       }
       if (data[left] >= pivot) {
           //swap
           int template = data[left];
           data[left] = data[end];
           data[end] = template;
       } else {
           //last number
           left++;
       }
       //recursive (pivot left and right)
       getQucikSort(start, left - 1, data);
       getQucikSort(left + 1, end, data);
       return data;
    }
}