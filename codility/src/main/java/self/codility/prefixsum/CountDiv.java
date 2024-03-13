package self.codility.prefixsum;

public class CountDiv {

    public int solution(int A , int B , int K){
        long tmpA = (long)A;
        long tmpB = (long)B;
        long tmpK = (long)K;

        int count = 0;
        for (long index = A ; index <= B ; index++){
            if (index % tmpK == 0){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        CountDiv countDiv = new CountDiv();
        int A = 0; int B = 2000000000; int K = 200;
        System.out.println(countDiv.solution(A,B,K));
    }

}
