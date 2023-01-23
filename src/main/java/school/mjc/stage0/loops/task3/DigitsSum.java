package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String abc = Integer.toString(t);
        int sum = 0;
        for (int i = 0; i < abc.length(); i++){
            sum = sum + (t%10);
            t /= 10;
        }
        System.out.println(sum);
    }
}
