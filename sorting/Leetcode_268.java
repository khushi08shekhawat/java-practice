import java.util.Arrays;

public class Leetcode_268{
    public static void main(String[]args){
        int[]arr={9,6,4,2,3,5,7,0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int sort(int[] arr){
        int i =0;
        while(i<arr.length){

            int correct =arr[i];
            if(arr[i]<arr.length && arr[i]!= arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    
    //search for missing number
    for(int index =0;index<arr.length;index++){
     if(arr[index]!=index){
        return index;
     }
    }
//when N is not there
    return arr.length;
}
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}