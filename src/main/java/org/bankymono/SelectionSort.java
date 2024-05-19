package org.bankymono;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr  = {16,4,45,12,10,18};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int [] arr) {
        for(int i = 0; i < arr.length; ++i){
            int lastIndex = arr.length - i  - 1;
            int indexOfMax = getMaxIndex(arr,0, lastIndex);
            swap(arr, indexOfMax, lastIndex);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i <= end; ++i){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;


    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
