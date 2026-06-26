import java.util.Scanner;
public class Functions4{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println("Maximum number is : " + isMax(num1, num2, num3));
        System.out.println("Minimum number is : " + isMin(num1, num2, num3));
    }

    static int isMax(int num1,int num2, int num3){
        int max = num1;
        if(num2 > max){
            max=num2;
        }
        if(num3> max){
            max =num3;
        }
    

        return max;
}
    static int isMin(int num1,int num2, int num3){
        int min = num1;
        if(num2 < min){
            min = num2;
        }
        if(num3< min){
            min =num3;
        }
    

        return min;
}
}