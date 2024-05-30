package org.bankymono;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 6)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int [] ans = {-1,-1};
        ans[0] = bSearchSpecial(nums,target,true);
        if(ans[0] != -1){
            ans[1] = bSearchSpecial(nums,target,false);
        }
        return ans;
    }

    public static int bSearchSpecial(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length -1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(target > nums[mid]){
                start = mid + 1;
            }else if(target < nums[mid]){
                end = mid - 1;
            } else {
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
                ans = mid;
            }
        }
        return ans;
    }
}
