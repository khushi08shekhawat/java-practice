import java.util.Arrays;
import java.util.Scanner;
public class ArraySwap{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        swap( arr, 0 , 3);

        System.out.println(Arrays.toString(arr));
        
    }
    static void swap(int[]arr, int index0, int index3){
        int temp = arr[index0];
        arr[index0] = arr[index3];
        arr[index3] = temp;
    }
}