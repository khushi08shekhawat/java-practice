import java.util.Scanner;
public class Functions7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 =in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Product of two numbers :" + Product(num1,num2));


    }

    static int Product(int num1,int num2){
        int num;
        int product = 0;
        product = num1 *num2;

    
    return product;

}
}