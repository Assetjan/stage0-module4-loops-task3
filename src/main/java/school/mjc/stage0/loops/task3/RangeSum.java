package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        int j = firstBoarder+1;
        for (int i = firstBoarder; i < secondBoarder; i++){
            sum = sum + j;
            j++;
        }
        System.out.println(sum);
    }
}
