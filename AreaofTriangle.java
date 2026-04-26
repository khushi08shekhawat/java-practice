import java.util.Scanner;
public class AreaofTriangle{
    public static void main(String []args){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the value of base");
        float base = in.nextFloat();
        System.out.println("Enter the vale of height");
        float height = in.nextFloat();
        float area = (base*height);
        System.out.println("Area of Triangle is " + area);
    }
}