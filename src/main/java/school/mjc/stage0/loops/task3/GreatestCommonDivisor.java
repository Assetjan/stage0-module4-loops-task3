package school.mjc.stage0.loops.task3;

import javax.imageio.stream.ImageInputStream;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int arr[] = new int[second];
        int j = 0;
        for (int i = 1; i <= second; i++) {
            if (first % i == 0 && second % i == 0) {
                arr[j] = i;
            }
            j++;
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
