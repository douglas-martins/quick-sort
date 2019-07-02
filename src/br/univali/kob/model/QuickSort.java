package br.univali.kob.model;

import java.util.List;

/**
 * Base class for hold static methods to sort a array with the Quick Sort technique.
 */
public class QuickSort {

    /**
     * The main function that implements QuickSort()
     * @param array: T [] that will be make sorted.
     * @param low: int with the start index for the array that will be sorted.
     * @param high: int with the end index for the array that will be sorted.
     * @param <T>: Type of the array that will be sorted.
     */
    public static<T> void sort(T[] array, int low, int high) {
        if (low < high) {
            // array[partitionIndex] is now at right place
            int partitionIndex = partition(array, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(array, low, partitionIndex - 1);
            sort(array, partitionIndex + 1, high);
        }
    }

    /**
     * The main function that implements QuickSort()
     * @param list: List<T> that will be make sorted.
     * @param low: int with the start index for the list that will be sorted.
     * @param high: int with the end index for the list that will be sorted.
     * @param <T>: Type of the List that will be sorted.
     */
    public static<T> void sort(List<T> list, int low, int high) {
        if (low < high) {
            // list.get(partitionIndex) is now at right place
            int partitionIndex = partition(list, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(list, low, partitionIndex - 1);
            sort(list, partitionIndex + 1, high);
        }
    }

    /**
     * Print a array.
     * @param array: T [] that wil be printed.
     * @param size: int with the size of the array.
     * @param <T>: Type of the element on the array.
     */
    public static<T> void print(T[] array, int size) {
        System.out.print("Array = [");
        for (int i = 0; i < size;) {
            System.out.print(array[i]);
            i++;
            if (i < size) { System.out.print(" --> "); }
        }
        System.out.println("]");
        System.out.println();
    }

    /**
     * Print a array.
     * @param list: List<T> that wil be printed.
     * @param size: int with the size of the list.
     * @param <T>: Type of the element on the list.
     */
    public static<T> void print(List<T> list, int size) {
        System.out.print("List = [");
        for (int i = 0; i < size;) {
            System.out.print(list.get(i));
            i++;
            if (i < size) { System.out.print(" --> "); }
        }
        System.out.println("]");
        System.out.println();
    }

    /**
     * This function takes last element as pivot, places the pivot element at its correct
     * position in sorted array, and places all smaller (smaller than pivot) to left of
     * pivot and all greater elements to right of pivot.
     * @param array: T [] that will be make sort on the partition.
     * @param low: int with the low element index on the array partition that will be sorted.
     * @param high: int with the higher element index on the array partition that will be sorted.
     * @param <T>: Type of the array that will be manipulated.
     * @return int with the index of the lower element on the partition.
     */
    private static<T> int partition(T[] array, int low, int high) {
        T pivot = array[high];
        int lowerIndex = (low - 1); // index of smaller element

        for (int i = low; i < high; i++) {
            // If current element is smaller than or equal to pivot
            if (array[i].hashCode() <= pivot.hashCode()) {
                lowerIndex++;

                // swap array[lowerIndex] and array[i]
                T temp = array[lowerIndex];
                array[lowerIndex] = array[i];
                array[i] = temp;
            }
        }

        // swap array[lowerIndex + 1] and array[high] (or pivot)
        T temp = array[lowerIndex + 1];
        array[lowerIndex + 1] = array[high];
        array[high] = temp;

        return lowerIndex + 1;
    }

    /**
     * This function takes last element as pivot, places the pivot element at its correct
     * position in sorted list, and places all smaller (smaller than pivot) to left of
     * pivot and all greater elements to right of pivot.
     * @param list: List<T> that will be make sort on the partition.
     * @param low: int with the low element index on the list partition that will be sorted.
     * @param high: int with the higher element index on the list partition that will be sorted.
     * @param <T>: Type of the array that will be manipulated.
     * @return int with the index of the lower element on the partition.
     */
    private static<T> int partition(List<T> list, int low, int high) {
        T pivot = list.get(high);
        int lowerIndex = (low - 1); // index of smaller element

        for (int i = low; i < high; i++) {
            // If current element is smaller than or equal to pivot
            if (list.get(i).hashCode() <= pivot.hashCode()) {
                lowerIndex++;

                // swap list.get(lowerIndex) and list.get(i)
                T temp = list.get(lowerIndex);
                list.set(lowerIndex, list.get(i));
                list.set(i, temp);
            }
        }

        // swap list.get(lowerIndex +_1) and list.get(high) (or pivot)
        T temp = list.get(lowerIndex + 1);
        list.set(lowerIndex + 1, list.get(high));
        list.set(high, temp);

        return lowerIndex + 1;
    }
}
