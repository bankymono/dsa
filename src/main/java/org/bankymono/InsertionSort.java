package org.bankymono;

import java.util.Arrays;

import static org.bankymono.SelectionSort.swap;

public class InsertionSort {
//    public static void main(String[] args) {
//        int[] arr  = {16,4,45,12,10,18};
//        insertion(arr);
//        System.out.println(Arrays.toString(arr));
//    }

    private static void insertion(int[] arr) {
        for(int i = 0; i < arr.length - 1; ++i){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }


}
