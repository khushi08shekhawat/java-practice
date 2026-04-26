import java.util.Scanner;
public class IntegerInputs{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int sum =0;
    System.out.println("Enter an integer number");
    int num = in.nextInt();

    while(num!=0){
    sum = sum + num;
    System.out.println("Enter an integer number");
    num = in.nextInt();   
    }
    System.out.println("Sum of the digits " + sum);

}
}