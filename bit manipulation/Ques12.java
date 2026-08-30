public class Ques12 {
     public static void main(String[]args){
        int n = 64;
        if((n & (n - 1)) == 0){
            System.out.println("The number is a power of 2");
        }else{
            System.out.println("The number is not a power of 2");
        }
        
}
}