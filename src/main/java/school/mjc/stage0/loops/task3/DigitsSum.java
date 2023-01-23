package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int l = (int) Math.abs(t);
        String abc = Integer.toString(l);
        int sum = 0;
        for (int i = 0; i < abc.length(); i++){
            sum = sum + (l%10);
            l /= 10;
        }
        System.out.println(sum);
    }
}
