package self.codility.cyclicrotation;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] a, int k) {

        int[] tmp = Arrays.copyOf(a, a.length);

        for (int index = 0; index < a.length; index++) {
            tmp[rotateIndex(index, k, a.length)] = a[index];
        }

        return tmp;
    }

    private int rotateIndex(int index, int rotateSize, int length) {
        int newIndex = index + rotateSize;
        while (newIndex >= length) {
            newIndex -= length;
        }
        System.out.println(newIndex);
        return newIndex;
    }

}
