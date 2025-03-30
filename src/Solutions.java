import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;

public class Solutions {
    /**Problem 1.
     * This method calculates the smallest number from given array
     * Time complexity:O(n),where n is the length of the array
     * It uses a linear approach
     * @param arr,n
     * arr = array
     * n = length of the array
     * @return
     * the smallest number from array
    */
    public static int getMin(int[] arr,int n){
        int min = arr[0];
        for(int i=1;i<n;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    /**Problem 2.
     Time complexity:O(n),where n is the length of the array
     You are given a number “n” and an array of “n” elements,
     write the function that returns average of them.
     */
    public static double getAverage(int[] arr,int n){
        double sum = arr[0];
        for(int i=1;i<n;i++){
            sum+=arr[i];
        }
        return sum/n;
    }


}
