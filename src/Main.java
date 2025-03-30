public class Main {

    public static void main(String[] args) {
        int s = 7;
        int i = 3;
        double startTime = System.nanoTime();
        var result = binomialCoefficient(s,i);
        double endTime = System.nanoTime();

        double duration = (endTime - startTime) / 1000000;
        System.out.println("Result: " + result);
        System.out.println("Time taken:"+ duration+ " milliseconds");

    }
    private static int binomialCoefficient(int s,int i) {
         return Solutions.binomialCoefficient(s,i);
    }
}