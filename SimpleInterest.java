import java.util.Scanner;
public class SimpleInterest{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principal value");
        float p = in.nextFloat();
        System.out.println("Enter Time");
        float t = in.nextFloat();
        System.out.println("Enter rate of interest");
        float r = in.nextFloat();
        float si = (p*r*t/100);
        System.out.println("Simple Interest is" + si);

    }
}