public class Main {

    public static void main(String[] args) {
        int[] arr = {3,2,4,1,6};
        double startTime = System.nanoTime();
        reverseArray();
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;


        System.out.println("Time taken:"+ duration+ " milliseconds");

    }
    private static void reverseArray() {
         Solutions.reverseArray(5);
    }
}