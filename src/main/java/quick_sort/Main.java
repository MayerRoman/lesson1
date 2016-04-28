package quick_sort;

/**
 * Created by Mayer Roman on 28.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        int[] array1 = null;
        QuickSort.quickSort(array1, 0, 10);

        int[] array2 = {3, 3, 3, 3, 3};
        QuickSort.quickSort(array2, 0, 34);

        int[] array3 = {-67, -15, -93, 55, -61, 12, 13, 14, 9, 8, 7, 6, 15, 19, 1, 0, 41, 52, 16};
        QuickSort.quickSort(array3, 0, array3.length-1);
        for (int i : array3) {
            System.out.print(i+" ");
        }
    }
}
