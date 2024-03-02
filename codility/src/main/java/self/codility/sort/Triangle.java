package self.codility.sort;

import java.util.Arrays;

public class Triangle {

    public int solution(int[] A) {
        int retVal = 0;
        Arrays.sort(A);
        for (int index = A.length - 1; index >= 2; index--) {
            long tmp = (long)A[index - 2] + (long) A[index - 1];
            if (tmp > A[index]) {
                retVal = 1;
                break;
            }
        }
        return retVal;
    }

}
