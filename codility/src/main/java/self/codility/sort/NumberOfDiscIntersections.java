package self.codility.sort;

public class NumberOfDiscIntersections {

    public int solution(int[] A) {

        long[][] circleArray = new long [A.length][3];
        for (int index = 0; index < A.length; index++) {
             circleArray[index][0] = index;
             circleArray[index][1] = (long)index - (long) A[index];
             circleArray[index][2] = (long)index + (long)A[index];
        }

        int retVal = 0;
        for (int index = 0 ; index  < A.length - 1 ; index++){
            for (int jIndex = index + 1 ; jIndex < A.length ; jIndex ++){
                if (!(circleArray[index][2] < circleArray[jIndex][1] || circleArray[jIndex][2] < circleArray[index][1])){
                    retVal++;
                }
            }
        }
        return retVal;
    }


    public static void main(String[] args) {
        NumberOfDiscIntersections num = new NumberOfDiscIntersections();
        int[] a ={1,5,2,1,4,0};
        System.out.println(num.solution(a));
    }

}
