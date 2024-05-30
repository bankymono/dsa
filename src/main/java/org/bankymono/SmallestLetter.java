package org.bankymono;

public class SmallestLetter {
//    public static void main(String[] args) {
//        char [] arr = {'c', 'f', 'j'};
//        System.out.println("ceiling -> " +arr[ceiling(arr,'c') % arr.length]);
//    }

    private static int ceiling(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;


        while (start<= end){
            int mid = start + (end - start)/2;
            if(target >= arr[mid]){
                start = mid + 1;
            }else {
                end = mid - 1;
            }

        }

        if(start >= arr.length){
            return 0;
        }

        return start;
    }

}
