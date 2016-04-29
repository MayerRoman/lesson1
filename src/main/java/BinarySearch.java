/**
 * Created by Mayer Roman on 27.04.2016.
 */
public class BinarySearch {
    public static int binarySearch(int[] array, int elementToFind) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int start = 0;
        int end = array.length-1;
        int middle;

        while (start <= end) {
            middle = (end + start) / 2;

            if (array[middle] == elementToFind) {
                while (middle > 0 && array[middle - 1] == elementToFind) {
                    middle--;
                }
                return middle;

            } else if (array[middle] < elementToFind) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = null;
        System.out.println(binarySearch(array1, 10));

        int[] array2 = {3, 3, 3};
        System.out.println(binarySearch(array2, 3));

        int[] array3 = {-55, -44, -33, -25, -11, -2, 15, 28, 28, 38, 49};
        System.out.println(binarySearch(array3, 28));
    }
}
