package self.codility;

import java.util.Arrays;

public class MaxCounter {
    public int[] solution(int N, int[] A) {

        int[] retVal = new int[N];
        Arrays.fill(retVal, 0);
        int max = 0;
        for (int index = 0; index < A.length; index++) {
            if (A[index] == N + 1) {
                Arrays.fill(retVal , max);
            } else if (A[index] <= N) {
                retVal[A[index] - 1]++;
                if (retVal[A[index] - 1] > max) {
                    max = retVal[A[index] - 1];
                }
            }
        }
        return retVal;
    }

    public static void main(String[] args) {
        MaxCounter sample = new MaxCounter();
        int[] A = {3,4,4,6,1,4,4};
        int N = 5;
        int[] retval = sample.solution(N, A);
    }

}
