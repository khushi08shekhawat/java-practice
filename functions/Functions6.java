import java.util.Scanner;
public class Functions6{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 =in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Sum of two numbers :" + Sum(num1,num2));


    }

    static int Sum(int num1,int num2){
        int num;
        int sum = 0;
        sum = num1+ num2;

    
    return sum;

}
}