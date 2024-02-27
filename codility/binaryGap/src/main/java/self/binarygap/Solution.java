package self.binarygap;


public class Solution {


    public int solution(int n) {

        int result = 0;
        int[] binaryRepresent = binaryRepresent(n);
        for (int index = 0; index < binaryRepresent.length; ) {
            int tempLen = 0;
            if (binaryRepresent[index] == 0) {
                while (index < binaryRepresent.length && binaryRepresent[index] != 1) {
                    tempLen++;
                    index++;
                }
                if (index < binaryRepresent.length && tempLen > result) {
                    result = tempLen;
                }
            }else {
                index++;
            }

        }

        return result;
    }

    int[] binaryRepresent(int n) {
        int arrayLen = log2(n);
        int[] binaryPresent = new int[arrayLen];
        arrayLen--;
        while (n > 0) {
            binaryPresent[arrayLen] = n % 2;
            n = n / 2;
            arrayLen--;
        }
        return binaryPresent;
    }

    private int log2(int n) {
        int retVal = 0;
        while (n > 0) {
            retVal++;
            n = n / 2;
        }
        return retVal;
    }

}
