public class Main {

    public static void main(String[] args) {
        String s = "1s23";
        int i = 0;
        double startTime = System.nanoTime();
        var result = isAllDigits(s,i);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1000000;
        System.out.println("Result: " + result);
        System.out.println("Time taken:"+ duration+ " milliseconds");

    }
    private static boolean isAllDigits(String s,int i) {
         return Solutions.isAllDigits(s,i);
    }
}