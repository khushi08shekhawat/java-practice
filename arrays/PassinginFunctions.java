import java.util.Arrays;
public class PassinginFunctions{
    public static void main(String[] args){
        int[] nums = {33,65,78,93,45};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 99;

    }
    
}