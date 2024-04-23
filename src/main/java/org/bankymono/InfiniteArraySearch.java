package org.bankymono;

public class InfiniteArraySearch {
    public static void main(String[] args) {
        int [] arr  = {2,4,6,8,11, 15, 19, 23, 25, 26,30, 34, 41, 45,46};

        int target = 19;

        int index = ans(arr,target);

        System.out.println("index of the arr-> " + index);
    }

    static int ans(int[] arr, int target){

        int[] range = findRange(arr, target);

        return binarySearch(arr,target, range[0], range[1]);
    }

    static int[] findRange(int[] arr, int target){
        int start = 0;
        int end = 1;
        int[] range = {0,1};

        while(target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1)*2;
            start = temp;
        }

        range[0] = start;
        range[1] = end;

        return range;
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
