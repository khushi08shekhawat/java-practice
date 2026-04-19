import java.util.Arrays;
public class ChangeValue{
    public static void main(String[] args) {
        //create a array i.e., collection of int values
        int[] arr = {0,1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
}
        static void change(int[]nums){
            nums[0]=99;// if any changes is made in this by a ref var, main objext
            //will also be changed because 
            //both are pointing to the same object in heap memory      
        }
}