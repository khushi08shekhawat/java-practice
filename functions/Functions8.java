import java.util.Scanner;
public class Functions8{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length");
        int length = in.nextInt();
        System.out.println("Enter breadth");

        int breadth = in.nextInt();
        System.out.println("Area of rectangle is :" + Area(length,breadth));
    }

    static int Area(int length, int breadth){
        int num;
        int area = 0;
        area = length * breadth;

        return area;
    }
}