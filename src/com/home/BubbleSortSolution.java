package com.home;

import java.util.Arrays;
import java.util.Scanner;

/*
Stable sort
quadratic algorithm
O (n2)
 */
public class BubbleSortSolution {

    public static void main(String[] args) {

        //sort the integer array given
        bubbleSort(intArray());
    }

    private static int[] intArray() {
        System.out.println("Enter number of element to sort :");
        Scanner input = new Scanner(System.in);// User input
        int array[] = new int[input.nextInt()];
        System.out.println("Enter  the element one by one");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    private static void bubbleSort(int[] intArray) {
        int unsortedPartitionedIndex = intArray.length - 1;
        while (unsortedPartitionedIndex > 0) {
            for (int i = 0; i < unsortedPartitionedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i);
                }
            }
            unsortedPartitionedIndex--;
        }
        Arrays.stream(intArray).forEach(System.out::println);
    }

    private static void swap(int[] intArray, int i) {
        int temp = intArray[i];
        intArray[i] = intArray[i + 1];
        intArray[i + 1] = temp;
    }
}

/*
    Description of an algorithm

    It is an in place algorithm.

    Time Complexity O(n2) Quadratic. as we can see  two loops are running in the algorithm.

    It will take 100 steps to sort 10 items.

    Algorithm degrades quickly.
 */