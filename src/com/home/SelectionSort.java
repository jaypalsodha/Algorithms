package com.home;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] intArray = new int[]{25,12,44,11,55,2};

        int lastUnsortedIndex = intArray.length - 1;
        while (lastUnsortedIndex > 0){
            int largestIndex = 0;
            for (int i =1; i<lastUnsortedIndex;i++){
                if(intArray[largestIndex] < intArray[i]){
                    largestIndex =i;
                }
            }
            int temp = intArray[largestIndex];
            intArray[largestIndex] = intArray[lastUnsortedIndex];
            intArray[lastUnsortedIndex] = temp;

            lastUnsortedIndex --;
        }
        Arrays.stream(intArray).forEach(i -> System.out.println(i));
    }
}
