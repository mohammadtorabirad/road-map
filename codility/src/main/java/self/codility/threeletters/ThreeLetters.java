package self.codility.threeletters;

public class ThreeLetters {

    public String solution(int A, int B) {

        int bigInput, smallInput;
        char bigChar, smallChar;
        if (A > B) {
            bigInput = A;
            smallInput = B;
            bigChar = 'a';
            smallChar = 'b';
        } else {
            bigInput = B;
            smallInput = A;
            bigChar = 'b';
            smallChar = 'a';
        }

        StringBuilder retVal = new StringBuilder();
        boolean bigNumTurn = true;
        double rate = 0;
        if (smallInput > 1) {
            rate = (double)bigInput / (double)smallInput;
        }
        while (bigInput > 0 && smallInput > 0) {

            if (bigNumTurn) {
                if (bigInput >= 2) {
                    retVal.append(bigChar).append(bigChar);
                    bigInput -= 2;
                } else {
                    retVal.append(bigChar);
                    bigInput -= 1;
                }
                bigNumTurn = false;

            } else {
                if (smallInput >= 2 && rate < 2.0) {
                    retVal.append(smallChar).append(smallChar);
                    smallInput -= 2;
                } else {
                    retVal.append(smallChar);
                    smallInput -= 1;
                }
                bigNumTurn = true;
            }
        }
        while (bigInput > 0) {
            retVal.append(bigChar);
            bigInput--;
        }
        while (smallInput > 0) {
            retVal.append(smallChar);
            smallInput--;
        }

        return retVal.toString();
    }


    public static void main(String[] args) {
        ThreeLetters threeLetters = new ThreeLetters();
        System.out.println(threeLetters.solution(19, 13));
    }

}
