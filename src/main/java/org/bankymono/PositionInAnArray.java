package org.bankymono;

import java.util.Arrays;
import java.util.List;

public class PositionInAnArray {
//    public static void main(String[] args) {
//       int[] nums = {1,5,7,7,8,8,10};
//       int target = 7;
//
//        System.out.println(Arrays.toString(positionOfTarget(target, nums)));
//
//    }

    static int[] positionOfTarget(int target, int[] arr){
        int[] ans = {-1,-1};
        Employee emp = new Employee();
        emp.getSalary();
        ans[0] = findTarget(arr, target, true);
        ans[1] = findTarget(arr, target, false);
        return ans;
    }



    private static int findTarget(int[] arr, int target, boolean startPosition) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;


        while (start <= end) {
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
               end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                ans = mid;
                if(startPosition){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
