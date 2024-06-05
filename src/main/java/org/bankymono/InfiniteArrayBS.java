package org.bankymono;

import java.util.Arrays;

public class InfiniteArrayBS {
    public static void main(String[] args) {
        int[] nums = {5,7,9,11,13,15,18,25,28,30,35,36,39,40,42,44,46,50,55,56,57,58,59,60};
        System.out.println(findingRange(nums,21));
    }

    static int findingRange(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end + 1;

            end = end + (end - start + 1)*2;

            start = newStart;
        }

        return infiniteArrBs(arr, target, start,end);

    }


    public static int infiniteArrBs(int[] nums, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
