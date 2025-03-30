public class Main {

    public static void main(String[] args) {
        int s = 32;
        int i = 48;
        double startTime = System.nanoTime();
        var result = gcd(s,i);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1000000;
        System.out.println("Result: " + result);
        System.out.println("Time taken:"+ duration+ " milliseconds");

    }
    private static int gcd(int s,int i) {
         return Solutions.gcd(s,i);
    }
}