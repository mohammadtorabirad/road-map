package self.codility.prefixsum;

public class PassingCars2 {


    public int solution(int[] A){
        var zero = 0;
        var count = 0;

        for (var i = 0; i < A.length; i++) {
            if (A[i] == 0) zero++;
            else {
                count +=  zero;
                if (count > 1000000000) return -1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PassingCars2 passingCars2 = new PassingCars2();
        int[] A = {0,1,0,1,1};
        System.out.println(passingCars2.solution(A));
    }
}
