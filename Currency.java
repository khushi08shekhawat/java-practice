import java.util.Scanner;
public class Currency{
    public static void main (String[]args){

    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter amount in rupees:");
    float rupees = in.nextFloat();
    float dollars = rupees/80;
    System.out.println("Amount in dollars: " + dollars);
}
}