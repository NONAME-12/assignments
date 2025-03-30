public class Main {

    public static void main(String[] args) {
        int[] arr = {3,2,4,1,6};
        double startTime = System.nanoTime();
        var result = fibonacci(7);
        double endTime = System.nanoTime();
        System.out.println(result);
        double duration = (endTime - startTime) / 1000000;


        System.out.println("Time taken:"+ duration+ " milliseconds");

    }
    private static int fibonacci(int n) {
        return Solutions.fibonacci(n);
    }
}