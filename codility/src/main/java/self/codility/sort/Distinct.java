package self.codility.sort;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Distinct {

    public int solution(int[] A){

        Map<Integer,Integer> map = new HashMap<>();
        for (int index = 0 ; index < A.length ; index ++){

            map.put(A[index] , A[index]);
        }
        return map.keySet().size();

    }
    
}
