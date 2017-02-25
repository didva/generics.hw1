package school.lemon.changerequest.java.generics.task3;

import java.util.Random;

public class DoubleNumberGenerator extends NumberGenerator<Double> {

    private Random random = new Random();

    @Override
    public Double[] generateNumbers() {
        Double[] arrayDouble = new Double[NUMBERS_COUNT];
        for (int i = 0; i < NUMBERS_COUNT; i++) {
            arrayDouble[i] = random.nextDouble();
        }
        return arrayDouble;
    }

    @Override
    public DoubleSumCalculator getSumCalculator() {
        return new DoubleSumCalculator();
    }

}
