package org.bankymono;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 11, 25, 30,35};

        System.out.println(orderAgnosticbs(arr, 25));
    }

    public static int orderAgnosticbs(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }
            } else {
                if(target < arr[mid]){
                    start = mid + 1;
                }else if(target > arr[mid]){
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
