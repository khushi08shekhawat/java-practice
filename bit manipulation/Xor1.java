public class Xor1{
    public static void main(String[]args){
        int[]arr={2, 3, 4, 2, 3};
        int ans =0;
        for(int i =0;i<arr.length;i++){
            ans = ans^arr[i];
            
        }
        System.out.println(ans);
    }
}