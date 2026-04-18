import java.util.Scanner;

public class Sum {
    public static void main (String[]args){
       int ans = sum();// this function when called will give the value whatever is
        // written inside this function 
        System.out.println("ans =" + ans);

    }// we will return the value now so we will not use void we 
    // will use int to return the integer value
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number 1:");
        int num1 = in.nextInt();
        System.out.println("Enter a number 2:");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;// whenever this statement comes the code is
        // completed
    }
}