package com.home;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
in place algorithm
stable algorithm
O (n2)
 */
public class InsertionSort {

    public static void main(String[] args) {

        //insertionSortSecondWay();
    }

    private static void insertionSortSecondWay() {
        int[] intArray = new int[]{25, 10, 5, 30, 12};

        int firstUnsortedIndex = 1;
        int newElement = intArray[firstUnsortedIndex];
        while (firstUnsortedIndex > 0) {
            for (int arrayIndex = firstUnsortedIndex - 1; arrayIndex != -1; arrayIndex--) {
                if (intArray[arrayIndex] > newElement) {
                    swap(intArray, arrayIndex);
                } else
                    break;
            }
            if (firstUnsortedIndex == intArray.length - 1) {
                break;
            }
            firstUnsortedIndex++;
            newElement = intArray[firstUnsortedIndex];
        }

        Arrays.stream(intArray).forEach(i -> System.out.println(i));
    }

    private static void swap(int[] intArray, int i) {
        int temp = intArray[i];
        intArray[i] = intArray[i + 1];
        intArray[i + 1] = temp;
    }

    public static void insertionSort() {

        int[] a = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < a.length; firstUnsortedIndex++) {
            int newElement = a[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && a[i - 1] > newElement; i--) {
                a[i] = a[i - 1];
            }
            a[i] = newElement;
        }
    }
}
