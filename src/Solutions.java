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
    /**Problem 3.
     Time complexity:O(n),where n is the number
     You are given a number “n”, write the function for checking
     whether“n” is prime.
     */
    public static boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    /**Problem 4.
     Time complexity:O(n),where n is the number
     You are given a number “n”, write the program using recursion for
     finding “n!”
     */
    public static int factorial(int n){
        if(n==1 || n==0 )
            return 1;
        return n*factorial(n-1);
    }
    /**Problem 5.
     Time Complexity: O(2^n):O(n),where n is the number
     You are given a number “n”, write the function for finding n-th
     elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2).
     F0= 0, F1 = 1.
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**Problem 6.
     Time complexity:O(n),where n is the number
     */
    public static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
    /**Problem 7.
     Time complexity:O(n),where n is the number
     You are given a number “n” and an array of “n” elements,
     write the program that returns given array in reverse order
     without using array data structure.
     */
    public static void reverseArray(int n) {
        if(n == 0)
            return;
        var scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        reverseArray(n-1);
        System.out.print(number+" ");
    }

}
