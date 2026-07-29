public class IsPalindrome {
    public static void main(String[]args){
        int n =12321;
        if(palindrome(n)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
    static boolean palindrome(int n){
            int original = n;
        int reverse =0;
        int digit =0;
        while(n>0){
        digit= n%10;//eg 1%10
        reverse = reverse*10+digit;//0+1
        n = n / 10;//1232
    
    }
    return original  == reverse;
}
}