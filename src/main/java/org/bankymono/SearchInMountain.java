package org.bankymono;

public class SearchInMountain {

//    public static void main(String[] args) {
//
//    }

    static int ans(int[] arr, int target){
        int index = -1;

        int peakIndex = theAns(arr);
        int solIndex = orderAgnosticBS(arr,target, 0, peakIndex);
        if(solIndex != -1){
            return solIndex;
        }
        int anotherIndex = orderAgnosticBS(arr,target,peakIndex,arr.length -1);
        return anotherIndex;
    }

    public static int theAns(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
        }

        return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end){

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
