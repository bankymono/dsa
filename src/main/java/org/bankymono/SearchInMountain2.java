package org.bankymono;

public class SearchInMountain2 {
//    public static void main(String[] args) {
//
//        int[] arr = {1,2,3,4,5,3,1};
//        System.out.println(search(arr,5));
//
//    }

    public static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);

        int firstTry = orderAgnosticbinarySearch(arr,target,0,peak);

        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticbinarySearch(arr,target,peak + 1, arr.length -1);

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

    public static int orderAgnosticbinarySearch(int[] nums, int target, int start, int end) {

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
}
