public class Ques2 {
    public static void main(String[]args){
        int[]arr={2,3,4,2,3,6,4};
         System.out.println(ans(arr));
    }
        static int ans(int[]arr){
        int num =0;
        for(int n :arr){
        num^=n;
        }
    return num;
}
}
