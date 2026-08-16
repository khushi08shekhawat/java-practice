public class Leetcode_153 {
    public static void main(String[]args){
        int[] arr = {4,5,6,7,0,1,2};
        int ans = binarysearch(arr);
        System.out.println(ans);
    }
    static int binarysearch(int[]arr){
        int start =0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[end]){
                end = mid;
            }
            else{
                end =mid-1;
            }
        }
        
        return start;
    
}
}

