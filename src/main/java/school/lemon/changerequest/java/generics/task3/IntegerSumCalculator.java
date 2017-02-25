package school.lemon.changerequest.java.generics.task3;

public class IntegerSumCalculator extends SumCalculator<Integer> {

    @Override
    public Integer calculateSum(Integer[] array) {
        Integer sum = 0;
        for (Integer anArray : array) {
            sum += anArray;
        }
        return sum;
    }

}
