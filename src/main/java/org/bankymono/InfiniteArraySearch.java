package org.bankymono;

public class InfiniteArraySearch {
//    public static void main(String[] args) {
//
//    }

    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        return 1;
    }


    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if( target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
