import java.util.Arrays;
public class SortedMatrix {
    public static void main(String[]args){
        int[][]arr = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}

    };
    System.out.println(Arrays.toString(search(arr, 8)));
}
    // search in row provided b/w the col which are there
    static int[] binarysearch(int[][]arr,int target,int row,int cStart,int cEnd){
        while(cStart<= cEnd){
            int mid = cStart+(cEnd-cStart)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            if(arr[row][mid]<target){
                cStart = mid+1;
            }
            else{
                  cEnd = mid-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        if (rows == 0) {
            return new int[]{-1, -1};
        }
        int cols = arr[0].length; // be cautious, matrix may be empty
        if (rows == 1) {
            return binarysearch(arr, target, 0, 0, cols - 1);
        }
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;
        //run loop till 2 rows are remaing
       while(rStart< (rEnd-1)){
        //while this is tru it will have more than 2 rows
        int mid = rStart + (rEnd - rStart) / 2;
        if (arr[mid][cMid] == target) {
        return new int[]{mid,cMid};
    }
    if (arr[mid][cMid]<target) {
    rStart = mid;
    } else {
    rEnd =mid;

}
}
// now we have two rows
// check whether the target is in the col of 2 rows
        if (arr[rStart][cMid] == target) {
        return new int[]{rStart, cMid};
        }
    
    if(arr[rStart + 1][cMid] == target) {
        return new int[]{rStart + 1, cMid};
        }
        // search in 1st half if
        if(target <= arr[rStart][cMid - 1]) {
        return binarysearch(arr, target, rStart, 0, cMid-1);
    }
        // search in 2nd half
        if(target >= arr[rStart][cMid + 1]&& target<= arr[rStart][cols-1]){
            return binarysearch(arr, target, rStart, cMid+1, cols-1);
    }

        // search in 3rd half
        if(target <= arr[rStart+1][cMid - 1]) {
            return binarysearch(arr, target, rStart+1, 0, cMid-1);
    }
    else{
        return binarysearch(arr, target, rStart+1, cMid+1, cols-1);
    }
    }
    
}