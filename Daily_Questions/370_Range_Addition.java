import java.util.*;
public class Range_Addition{
    public static void main(String[] args){
        int length = 5;
        int[][] arr = {{1,3,2},{2,4,3},{0,2,-2}};
        int ans[] = new int[length];
        for(int i = 0 ; i < arr.length; i++){
            int si = arr[i][0];
            int ei = arr[i][1];
            int val = arr[i][2];
            int [] rangeAddition = new int[length];
            // Arrays.fill(rangeAddition, 0);
            rangeAddition[si] += val;
            if (ei < length - 1) {

                rangeAddition[ei+1] -= val;
            }
            for (int j = 1; j < rangeAddition.length; j++) {
               rangeAddition[j] = rangeAddition[j] + rangeAddition[j - 1];
           }
           for (int j = 0; j < rangeAddition.length; j++) {
               // System.out.print(rangeAddition[j] + " ");
               ans[j] = rangeAddition[j] + ans[j];
           }
            // int sum = 0;
            // for(int k = 0 ; k < length; k++){
            //     sum+=rangeAddition[k];
            //     rangeAddition[k]=sum;
            // }
            
        }
        for(int j = 0 ; j < ans.length; j++){
            System.out.print(ans[j]+" ");
        }
    }
}
