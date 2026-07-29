public class SumofNnumber {
 public static void main(String[]args){
    int n =8;
    System.out.println(Sum(n));
    
 } 
 static int Sum(int n){
    int sum =0;
    for(int i =1; i<=n;i++){
        sum =sum+i;
    }
    return sum;
 }  
 
}
