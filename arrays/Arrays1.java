import java.util.Arrays;
public class Arrays1{
    public static void main(String[]args){
        int[] nums = {0,2,4,3,5,1};
        System.out.println(Arrays.toString(ans(nums)));
    }
    static int[] ans(int[]nums){
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length;i++){
        ans[i] = nums[nums[i]];
        }
        return ans;
    }
}