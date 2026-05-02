import java.util.Scanner;
public class CompoundInterest{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principal value");
        float p = in.nextFloat();
        System.out.println("Enter Time");
        float t = in.nextFloat();
        System.out.println("Enter Annual Interest Rate");
        float r = in.nextFloat();
        System.out.println("Enter Compounding Frequency");
        float n = in.nextFloat();
        float ci = (float)(p * Math.pow((1 + r/n), 2));     
        System.out.println("Compound Interest is " + ci);

    }
}