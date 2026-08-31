public class Ques14 {
 public static void main(String[]args) {
    int count=0;
    int n=248; // Example value, replace with actual input
    System.out.println(Integer.toBinaryString(n));
    while(n>0){
        count++;
        n=n&(n-1);
    }
    System.out.println(count);
 }
}
