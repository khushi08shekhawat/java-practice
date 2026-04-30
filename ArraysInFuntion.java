import java.util.Arrays;
public class ArraysInFunction{
    public static void main(String[]args){
        int[] nums = { 3,5,8,2};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    tatic void change (int[] arr){
        arr[3] = 69;
    }
    }
