public class Ques9 {
        public static void main(String[] args) {
        int[] arr = {2,2,2,2,9,2,2};
        System.out.println(findPivotWithDuplicates(arr));
    }

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