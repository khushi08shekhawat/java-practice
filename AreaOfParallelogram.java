import java.util.Scanner;
public class AreaOfParallelogram{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of base");
        float base = in.nextFloat();
        System.out.println("Enter the value of height");
        float height = in.nextFloat();
        float area = base*height;
        System.out.println("Area Of Parallelogram " + area);
    }
}