public class SearchInRotatedArray {
    public static void main(String[] args) {

        int[] arr= {40,80,90,5,10,15,16,18,22 };
        int pivotIndex = findPivot(arr);

        System.out.println("and ->" + arr[pivotIndex]);

        int ans = -1;
        int target = 8;

        ans = bs(arr,target,0, pivotIndex);

        if(ans == -1){
            ans = bs(arr,target,pivotIndex + 1, arr.length -1);
        }
    }

    static int bs(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end -start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else
                return mid;
        }

        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

//             case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
//           case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
//            case 3
            if (arr[mid] <= arr[start]) {
               end = mid - 1;
            } else {
                start = mid+1;
            }

        }

        return - 1;
    }

    static int findPivotWithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

//             case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
//           case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }


        }

        return - 1;
    }

}
