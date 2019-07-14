package com.home;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] intArray = new int[]{25,10, 5, 30, 12};

        int firstUnsortedIndex = 1;
        int newElement = intArray[firstUnsortedIndex];
        while (firstUnsortedIndex > 0 && firstUnsortedIndex != intArray.length){
            for (int arrayIndex =firstUnsortedIndex-1; arrayIndex!=-1;arrayIndex--){
                if(intArray[arrayIndex] > newElement){
                    swap(intArray, arrayIndex);
                }
                else
                    break;
            }
            if(firstUnsortedIndex == intArray.length-1)
            {
                break;
            }
            firstUnsortedIndex++;
            newElement = intArray[firstUnsortedIndex];
        }

        Arrays.stream(intArray).forEach(i-> System.out.println(i));
    }

    private static void swap(int[] intArray, int i) {
        int temp = intArray[i];
        intArray[i] = intArray[i+1];
        intArray[i+1] = temp;
    }
}
