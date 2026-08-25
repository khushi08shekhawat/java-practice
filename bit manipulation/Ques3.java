public class Ques3 {
    public static void main(String[]args){
        int num = 10110110;
        int n = 2;
        if((num &(1<<(n-1)))!=0){
            System.out.println("set bit");
        }else{
            System.out.println("unset bit");
        }
        }
    }
