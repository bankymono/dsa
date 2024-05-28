package org.bankymono;

public class CeilingOfANumber {
//    public static void main(String[] args) {
////        target = 24
////        [2,  4,   7,  9,  10,   13,   25,   26,   29,   31]
////         0   1    2   3   4     5     6     7     8     9
////         s                m                             e
////        [2,  4,   7,  9,  10,   13,   25,   26,   29,   31]
////        s    m        e         s           m           e
////        [2,  4,   7,  9,  10,   13,   25,   26,   29,   31]
////                  s,m e        s,m   e
////        [2,  4,   7,  9,  10,   13,   25,   26,   29,   31]
////                                     s,me
////        [2,  4,   7,  9,  10,   13,   25,   26,   29,   31]
////                                 e     s
//        int [] arr = {2, 3, 5, 11, 25, 30,35};
//        System.out.println("ceiling ->" +arr[ceiling(arr,6)] +": floor->" + arr[floor(arr,6)]);
//
//    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return end;
    }
}
