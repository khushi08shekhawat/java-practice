public class MaxRange{
    public static void main(String[] args){
        int[] arr = {23,44,56,176,123};
        System.out.println(maxRangeq(arr,0,4));

    }
    static int maxRange(int[]arr, int start , int end){
        int maxVal = arr[start];
        for(int i = 1; i <= end; i++ ){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
