package org.bankymono;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};

        int firstTry= -1;
        int pivot = findPivot(arr);
        if(pivot == -1){
            firstTry = bs(arr,0,0, pivot);
        }

        firstTry = bs(arr,0,0, pivot);
        if(firstTry == -1) {
            firstTry = bs(arr,0,pivot + 1,arr.length - 1);
        }
        System.out.println(firstTry);
    }

    static int bs(int[] nums, int target, int start, int end){
        boolean isAsc = start < end;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(target == nums[mid]){
                return mid;
            }

            if(isAsc){
                if (target > nums[mid]) {
                    start = mid + 1;
                } else if (target < nums[mid]) {
                    end = mid - 1;
                }
            }else {
                if (target < nums[mid]) {
                    start = mid + 1;
                } else if (target > nums[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
