package self.codility.countconformingbitmask;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountConformingBitmasks {

    public int solution(int A, int B, int C) {

        Map<String, Integer> map = new HashMap<>();
        int[] zeroIndex = new int[32];
        Arrays.fill(zeroIndex, -1);
        int zerIndexCounter = 0;
        char[] binaryA = binaryFormat(A).toCharArray();

        for (int index = 0; index < binaryA.length; index++) {
            if (binaryA[index] == '0') {
                zeroIndex[zerIndexCounter] = index;
            }
        }

        char[] cloneBinaryArray = binaryA.clone();
        for (int index = 0; index < zeroIndex.length; index++) {
            if (zeroIndex[index] == -1) {
                break;
            }
            cloneBinaryArray[zeroIndex[index]] = 1;


        }


        return map.keySet().size();
    }

    private String binaryFormat(int A) {

        String retVal = "";
        while (A > 0) {
            int tmpRem = A % 2;
            retVal = String.valueOf(tmpRem).concat(retVal);
            A = A / 2;
        }
        return retVal;
    }

    public static void main(String[] args) {
        CountConformingBitmasks mask = new CountConformingBitmasks();
        mask.solution(1073741631, 0, 0);
    }

}
