package self.codility.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxProductionOf3 {

    public int solution(int[] A){

        int tmp;
        int[] top3 ={-1003,-1002,-1001};
        int[] low2 = {1001,1002};
        for (int index = 0 ; index < A.length ; index++){
            if (A[index] > top3[2]){
                tmp = top3[1];
                top3[1] = top3[2];
                top3[2] = A[index];
                top3[0] = tmp;
            } else if (A[index] > top3[1]){
                top3[0] = top3[1];
                top3[1] = A[index];
            } else if (A[index] > top3[0]){
                top3[0] = A[index];
            }

            if (A[index] < low2[0]){
                low2[1] = low2[0];
                low2[0] = A[index];
            }else if (A[index] < low2[1]){
                low2[1] = A[index];
            }
        }
                
        return Math.max(top3[0] * top3[1] * top3[2] , low2[0] * low2[1] * top3[2]);
    }

}
