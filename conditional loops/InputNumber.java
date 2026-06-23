import java.util.Scanner;
public class InputNumber{
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number");
    int num = in.nextInt();
    int sum = 0;
    while(num!=0){
        sum = num+sum;
        num = in.nextInt();
    }
            System.out.println("sum is "+sum);

}
}