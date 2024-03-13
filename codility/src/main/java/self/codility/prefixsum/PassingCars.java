package self.codility.prefixsum;

import self.codility.cyclicrotation.Solution;

import java.util.*;

public class PassingCars {

    public int solution(int[] A) {

        int retVal = 0;
        List<Point> list = new ArrayList<>();
        for (int index = 0; index < A.length; index++) {
            if (A[index] == 1) {
                list.add(new Point(A[index], index , true));
            } else {
                list.add(new Point(A[index], index , false));
            }
        }

        Collections.sort(list, new PointComparator());
        int firstOneIndex = 0;
        for (int index = 0 ; index < list.size() ;index++){
            if (list.get(index).isFirst1Occure()){
                firstOneIndex = index;
                break;
            }
        }


        int index = 0;
        Point curPoint;
        do  {

            curPoint = list.get(index);
            if (curPoint.getValue() == 1){
                break;
            }

            for (int sIndex = firstOneIndex ; sIndex < list.size(); sIndex++) {
                if (list.get(sIndex).getValue() == 1 && list.get(sIndex).getIndex() > list.get(index).getIndex()) {
                    retVal++;
                }
            }

            if (retVal > 1000000000) {
                retVal = -1;
                break;
            }

            index++;

        } while (index < list.size());

        return retVal;
    }

    public static void main(String[] args) {
        PassingCars solution = new PassingCars();
        int [] A = {1};
        System.out.println(solution.solution(A));
    }

}

class Point {
    private int value;
    private int index;

    private boolean first1Occure;

    public Point(int value, int index, boolean first1Occure) {
        this.value = value;
        this.index = index;
        this.first1Occure = first1Occure;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isFirst1Occure() {
        return first1Occure;
    }

    public void setFirst1Occure(boolean first1Occure) {
        this.first1Occure = first1Occure;
    }
}

class PointComparator implements Comparator<Point> {
    @Override
    public int compare(Point obj1, Point obj2) {
        return obj1.getValue() - obj2.getValue();
    }
}