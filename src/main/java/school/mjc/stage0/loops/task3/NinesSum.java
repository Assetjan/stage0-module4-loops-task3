package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        String nine = "";
        String nines[] = new String[Math.abs(lengthOfLastNumber)];
        for (int i = 0; i < lengthOfLastNumber; i++){
            nine += "9";
            nines[i] = nine;
        }
        int sum = 0;
        int k;
        for (int i = 0; i < nines.length; i++){
            k = Integer.parseInt(nines[i]);
            sum = sum + k;
        }
        System.out.println(sum);
    }
}
