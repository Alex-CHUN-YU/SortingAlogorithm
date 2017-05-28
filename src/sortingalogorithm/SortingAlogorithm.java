package sortingalogorithm;

import java.util.Scanner;

/**
 *
 * MainFunction Test.
 *
 * @version 1.0 2017/05/24
 * @author ALEX-CHUN-YU
 *
 */
public class SortingAlogorithm {

   /**
    * @param args system define
    */
   public static void main(final String[] args) {

       //Scanner Your Input
       System.out.println("Please Input Number(size = 6)");
       @SuppressWarnings("resource")
       Scanner scanner = new Scanner(System.in);
       String inputList = scanner.nextLine();
       String[] strData = inputList.split(" ");
       int[] data = new int[6];
       int[] data1 = new int[6];
       int[] data2 = new int[6];

       //Input Size Error
       while (strData.length != 6) {
           System.out.println("Please Input Number(size = 6)");
           scanner = new Scanner(System.in);
           inputList = scanner.nextLine();
           strData = inputList.split(" ");
           data = new int[6];
           data1 = new int[6];
           data2 = new int[6];
           }
       for (int i = 0; i < strData.length; i++) {
           data[i] = Integer.parseInt(strData[i]);
           data1[i] = Integer.parseInt(strData[i]);
           data2[i] = Integer.parseInt(strData[i]);
           }
       System.out.println();

       //InsertionSort
       data = InsertionSort.getInsertionSort(data);
       System.out.print("InsertionSort: ");
       for (int i = 0; i < data.length; i++) {
           System.out.print(data[i] + " ");
       }
       System.out.println();

       //SelectionSort
       data1 = SelectionSort.getSelectionSort(data1);
       System.out.print("SelectionSort: ");
       for (int i = 0; i < data1.length; i++) {
           System.out.print(data1[i] + " ");
       }
       System.out.println();

       //QuickSort
       data2 = QuickSort.getQucikSort(0, data2.length - 1, data2);
       System.out.print("QuickSort:     ");
       for (int i = 0; i < data2.length; i++) {
           System.out.print(data2[i] + " ");
       }

   }
}


