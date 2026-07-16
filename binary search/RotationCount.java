public class RotationCount{
    public static void main(String[]args){
        int []arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }
    static int countRotations(int[]arr){
        int pivot = findPivot(arr);
        return pivot+1;
    }
    //use this for non duplicates
    static int findPivot(int[]arr){
        int start =0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            //4 cases here
            if(mid < end && arr[mid]> arr[mid+1]){//&& is used because if the first condition is true then only further condition will execute
                return mid;
            }
            if(mid> start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<= arr[start]){
                end = mid-1;

            }else{
                start = mid +1;
            }

        }
        return -1;
    }
// use this when array has duplicates
     static int findPivotWithDuplicates(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // If elements at start, mid and end are equal
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {

                // Check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // Check if end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            // Left side is sorted, so pivot must be on the right
            else if (arr[start] < arr[mid] ||
                    (arr[start] == arr[mid] && arr[mid] > arr[end])) {

                start = mid + 1;
            }

            // Right side is sorted, pivot on the left
            else {
                end = mid - 1;
            }
        }

        return -1;
    }
}