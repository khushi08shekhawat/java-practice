public class Pattern07 {
    public static void main(String[] args) {
    int n =5;
    //spaces
    for(int row=1;row<=n;row++){
         System.out.print(" ");

            //stars
        for(int col=1;col<=2*row-1;col++)
        System.out.print("* ");

            //spaces
    for(int col=1;col<=n-row-1;col++){
        System.out.print(" ");
        }
        System.out.println();
    }
    }
}
