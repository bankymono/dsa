package org.bankymono;

import java.util.ArrayList;
import java.util.Arrays;

public class SmallestSubArrayWithGivenSum {

    public static int[] findSmallestSubArraySum(int givenSum, int [] arr){
        int minWindowSize = Integer.MAX_VALUE;
        int currentWindowSum = 0;
        int windowStart = 0;
        int [] ans = null;

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
            currentWindowSum +=arr[windowEnd];
            while(currentWindowSum >= givenSum){
                minWindowSize = Integer.min(minWindowSize,windowEnd - windowStart+1);
                ans = Arrays.copyOfRange(arr,windowStart,windowEnd+1);
                currentWindowSum -= arr[windowStart];
                ++windowStart;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findSmallestSubArraySum(8, new int[]{4, 2, 1, 7, 8, 1, 2, 8, 1, 0})));
    }
}
