import java.util.Scanner;
public class VolumeofPrism{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of Length");
        double length = in.nextDouble();
        System.out.println("Enter the value of Breadth");
        double breadth = in.nextDouble();
        System.out.println("Enter the value of Height");
        double height = in.nextDouble();
        double volume = length*breadth*height;
        System.out.println("Volume of Prism is " + volume);


    }
}