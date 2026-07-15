import java.util.ArrayList;
public class Leetcode_1389{
    public static void main(String[]args){
        int[]nums={0,1,2,3,4};
        int[]index={0,1,2,2,1};
    ArrayList<Integer> target = new ArrayList<>();
    for(int i=0;i<nums.length;i++){
        target.add(index[i], nums[i]);
    }
        System.out.println(target);
}
}