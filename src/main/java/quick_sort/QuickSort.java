package quick_sort;

/**
 * Created by Mayer Roman on 27.04.2016.
 */
public class QuickSort {

    public static void quickSort(int[] array, int fromIndex, int toIndex){
        boolean approvedForSorting = QuickSort.inputControl(array, fromIndex, toIndex);
        if (approvedForSorting) {
            sort(array, fromIndex, toIndex);
        }
    };

    private static boolean inputControl(int[] array, int fromIndex, int toIndex) {
        if (array == null || array.length == 0) {
            System.out.println("Переданный массив не существует или пуст");
            return false;
        }

        if (fromIndex < 0 || fromIndex > array.length - 2 ||
                toIndex <= fromIndex || toIndex > array.length - 1) {
            System.out.println("Введены неверные границы сортировки");
            return false;
        }
        return true;
    };

    private static void sort(int[] array, int fromIndex, int toIndex) {

        int left = fromIndex;
        int right = toIndex;
        int splitter = array[toIndex];
        int temp;

        while (left <= right) {
            while (array[left] < splitter) {
                left++;
            }
            while (splitter < array[right]) {
                right--;
            }
            if (left <= right) {
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        if (fromIndex < right) {
            sort(array, fromIndex, right);
        }
        if (left < toIndex) {
            sort(array, left, toIndex);
        }
    }
}