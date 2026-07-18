import java.util.Arrays;
public class BubbleSort{
    public static void main(String[]args){
        int[]arr={5,4,3,2,1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[]arr){
        boolean swapped;
 //we are using void becoz no new array is being created 
 //reun the steps n-1 times
    for(int i =0;i<arr.length;i++){
        swapped=false;
    for(int j =1;j<arr.length-i;j++){
        //swap if the item is smaller than the previous one
        if(arr[j]<arr[j-1]){

            //swap
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            swapped=true;
        }
    }
    //if you did not swap for  particular value of i , it means the arr is sorted hence stop the program
    if(swapped==false){
        break;//not false =true
    
}

}
}
}