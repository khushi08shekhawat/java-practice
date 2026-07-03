public class SearchEven{
    public static void main(String[]args){
        int [] nums ={12,345,2,6, 7896} ;
        System.out.println(findNumber(nums));
    }
    static int findNumber(int[] nums){
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;

    }
    static boolean even(int num){
        if (digits(num)%2==0){
            return true;
        }
        return false;

    }
    static int digits(int num){
    int count =0;
        while(num>0){
            count++;
            num = num/10;
            
        }
        return count;
    }
}