package com.home;

import java.util.Arrays;

/*
in place algorithm
O(n2)
unstable algorithm

 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = new int[]{25, 12, 44, 11, 55, 2};

        int lastUnsortedIndex = intArray.length - 1;
        while (lastUnsortedIndex > 0) {
            int largestIndex = 0;
            for (int i = 1; i < lastUnsortedIndex; i++) {
                if (intArray[largestIndex] < intArray[i]) {
                    largestIndex = i;
                }
            }
            swap(intArray, lastUnsortedIndex, largestIndex);
            lastUnsortedIndex--;
        }
        Arrays.stream(intArray).forEach(System.out::println);
    }

    private static void swap(int[] intArray, int i, int j) {
        int temp = intArray[j];
        intArray[j] = intArray[i];
        intArray[i] = temp;
    }
}
