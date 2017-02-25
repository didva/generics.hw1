package school.lemon.changerequest.java.generics.task3;

import java.util.Random;

public class IntegerNumberGenerator extends NumberGenerator<Integer> {

    private Random random = new Random();

    @Override
    public Integer[] generateNumbers() {
        Integer[] arrayInt = new Integer[NUMBERS_COUNT];
        for (int i = 0; i < NUMBERS_COUNT; i++) {
            arrayInt[i] = random.nextInt();
        }
        return arrayInt;
    }

    @Override
    public IntegerSumCalculator getSumCalculator() {
        return new IntegerSumCalculator();
    }
}
