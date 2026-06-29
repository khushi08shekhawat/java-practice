import java.util.Arrays;
import java.util.Scanner;
public class ArrayReverse{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {55,44,99,22,11};
        reverse(arr);

        System.out.println(Arrays.toString(arr));
        
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[]arr, int index0, int index3){
        int temp = arr[index0];
        arr[index0] = arr[index3];
        arr[index3] = temp;
    }
}