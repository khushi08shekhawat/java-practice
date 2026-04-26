import java.util.Scanner;
public class LargestNum{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter an integer number");
    int num = in.nextInt();
    int max = num;

    while(num!=0){ 
        if(num > max)
        {
            max = num;
        } 
        System.out.println("Enter an integer number");
    num = in.nextInt(); 
    }
    System.out.println(" MAX "+ max );

}
}