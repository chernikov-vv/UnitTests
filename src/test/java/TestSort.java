import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestSort {
    @Test
    public void sortPositive() {
        int[] arrayToSort = {5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5};
        Sort.sort(arrayToSort);
        Assertions.assertArrayEquals(expectedArray, arrayToSort);
    }

    @Test
    public void sortNegative() {
        int[] arrayToSort = {-2, -1, -5, -4, -3};
        int[] expectedArray = {-5, -4, -3, -2, -1};
        Sort.sort(arrayToSort);
        Assertions.assertArrayEquals(expectedArray, arrayToSort);
    }

    @Test
    public void sortSortedArray() {
        int[] arrayToSort = {1, 4, 5, 7, 8, 10, 15, 19};
        int[] expectedArray = {1, 4, 5, 7, 8, 10, 15, 19};
        Sort.sort(arrayToSort);
        Assertions.assertArrayEquals(expectedArray, arrayToSort);
    }

    @Test
    public void sortPositiveAndNegative() {
        int[] arrayToSort = {-1, 4, 8, -9, 3, 11, 1, -18};
        int[] expectedArray = {-18, -9, -1, 1, 3, 4, 8, 11};
        Sort.sort(arrayToSort);
        Assertions.assertArrayEquals(expectedArray, arrayToSort);
    }

    @Test
    public void sortBigDigit() {
        int[] arrayToSort = {-1000, 300, 980, 121, -5933, 9711, 198, -1801, 500};
        int[] expectedArray = {-5933, -1801, -1000, 121, 198, 300, 500, 980, 9711};
        Sort.sort(arrayToSort);
        Assertions.assertArrayEquals(expectedArray, arrayToSort);
    }

    @Test
    public void sortEmptyArray() {
        int[] arrayToSort = {};
        int[] expectedArray = {};
        Sort.sort(arrayToSort);
        Assertions.assertArrayEquals(expectedArray, arrayToSort);
    }
}
