public class Secondsmallest {
    public static void main(String[]args){
        int[]arr={1,2,4,7,7,5};
        int min = Integer.MAX_VALUE;

        int secondmin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[i]<min){
                    min=arr[j];
                    if(arr[j+1]<secondmin && arr[j+1]!=min){
                    secondmin=arr[j+1];
                }
            }
        }
        }
        System.out.println("Min number is " +min);
        System.out.println("Second Min number is " +secondmin);
}
}
