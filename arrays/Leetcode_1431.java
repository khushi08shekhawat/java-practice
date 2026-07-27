import java.util.Arrays;
public class Leetcode_1431{
    public static void main(String[]args){
        int candies[]={2,3,5,6,1,3};
        int extraCandies=3;
        boolean[]ans=maxCandies(candies, extraCandies);
        System.out.println(Arrays.toString(ans));
    }
    static boolean[] maxCandies(int candies[],int extraCandies){
    int maxVal = candies[0];//1st loop-start with first candy count
    for(int i=0; i<candies.length;i++){
            if(candies[i]>maxVal){
            maxVal = candies[i];
    
   }
}
    boolean[] result = new boolean[candies.length];//an array to store the result
    //2nd loop to get true false for every kid
    for(int i =0;i<candies.length;i++){
        if(candies[i]+extraCandies>=maxVal){
            result[i] = true;

        }else{
            result[i] = false;
        }
    }
    return result;
        }
    }
