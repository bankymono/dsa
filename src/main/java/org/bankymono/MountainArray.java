package org.bankymono;

public class MountainArray {
    public static void main(String[] args) {

    }

    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length;

        while (start < end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
