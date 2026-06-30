import java.util.Arrays;
public class Arrays2{
    public static void main(String[]args){
        int[]nums = {3,2,1};
        int[] ans = getArray(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] getArray (int[] nums){
        int[] ans = new int[2*nums.length];
        for(int i =0;i <nums.length;i++){
        ans[i] = nums[i];
        ans[i+nums.length] = nums[i];
        }
        return ans;
    
    }

 }