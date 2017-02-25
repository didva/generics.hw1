package school.lemon.changerequest.java.generics.task3;

public abstract class NumberGenerator<T extends Number> {

    protected static int NUMBERS_COUNT = 10;

    public abstract T[] generateNumbers();

    public abstract SumCalculator<T> getSumCalculator();

}
