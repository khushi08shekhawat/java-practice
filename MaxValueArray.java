public class MaxValueArray{
    public static void main(String[]args){
        int[] arr = { 1,2,6,4,8,5};
        System.out.println(maxRange(arr, 1, 3));

    }
    // when array is not empty of empty then we wil write INTEGER MIN_VALUE
    // static int max(int []arr){
    //     int maxVal = arr[0];
    //     for (int i = 1; i < arr.length; i++) {
    //         if (arr[i] > maxVal) {
    //             maxVal = arr[i];

    static int maxRange(int[]arr, int start, int end ){
        int maxVal = arr[start];
        for (int i = 1; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
}
}
    return maxVal;
    }
}