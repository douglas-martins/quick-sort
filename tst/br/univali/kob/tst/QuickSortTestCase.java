package br.univali.kob.tst;

import br.univali.kob.model.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortTestCase {

    public static void main(String[] args) {
        QuickSortTestCase quickSortTestCase = new QuickSortTestCase();

        quickSortTestCase.simulate();
    }

    public void simulate() {
        System.out.println("######################### QUICK SORT TEST CASE #########################");

        ArrayList<Integer> listTest = new ArrayList<>(Arrays.asList(12, 25, 48, 52369, 351, 74529, 9, 12, 54, 688, 999, 88, 30));
        Integer [] arrayTest = { 10, 20, 46, 34879, 873, 89347, 19, 20, 83, 276, 498, 90, 29 };

        System.out.println("Array before sort:");
        QuickSort.print(arrayTest, arrayTest.length);
        System.out.println("Array after sort: ");
        QuickSort.sort(arrayTest, 0, (arrayTest.length - 1));
        QuickSort.print(arrayTest, arrayTest.length);

        System.out.println("===========================================================================");
        System.out.println();

        System.out.println("List before sort: ");
        QuickSort.print(listTest, (listTest.size() - 1));
        System.out.println("List after sort: ");
        QuickSort.sort(listTest, 0, (listTest.size() - 1));
        QuickSort.print(listTest, listTest.size());

        System.out.println("######################### QUICK SORT TEST CASE #########################");
    }
}
