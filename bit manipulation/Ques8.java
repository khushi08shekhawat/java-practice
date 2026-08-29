public class Ques8 {
    public static void main(String[]args){
        int[] arr={2, 2, 3, 2, 7, 7,8, 7,8,8 };
        int ans =0;
         for (int i = 0; i < 32; i++) {
        int count =0;
        for(int num =0;num<arr.length;num++){
            if((arr[num] &(1<<i))!=0){
                count++;
            }
        }
            if(count %3!=0){
                ans =ans | (1<<i);

            }
        
    }
            System.out.println(ans);
    
}
}