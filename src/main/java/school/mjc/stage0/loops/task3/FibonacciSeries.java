package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int j = 1;
        int k = -1;
        int sum = 0;
        for (int i = 0; i < lastFibonacci; i++){
            sum = j+k;
            k = j;
            j = sum;
            System.out.println(sum);
        }
    }
}
