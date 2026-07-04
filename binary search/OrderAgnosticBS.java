// public class OrderAgnosticBS {
//     public static void main(String[]args){
//         int[] arr = {-81,-19,3,6,9,25,37,48,59,60};
//         int target = 48;
//         int ans = orderagnostic(arr,target);
//         System.out.println(ans);
//     }
//     static int orderagnostic(int[]arr, int target){
//         int start =0;
//         int end = arr.length-1;

//         boolean isAsc = arr[start] < arr[end];
        

//         while(start<=end){
//             int mid = start+(end-start)/2;
//             if (arr [mid] == target) {
//             return mid;
//         }
//             if (isAsc) {

//             if (target <arr [mid]) {
//             end = mid - 1;
//             } else {
//             if(target> arr[mid]){
//                 end = mid+1;

//             }else{
//             start = mid + 1;

//             }
//         }
//     }
    
//         }
//         return -1;
//     }
// }


public class OrderAgnosticBS {

    public static void main(String[] args) {

        int[] arr = {-81, -19, 3, 6, 9, 25, 37, 48, 59, 60};
        int target = 48;

        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // Check whether the array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {

                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }

        return -1;
    }
}