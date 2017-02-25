package school.lemon.changerequest.java.generics.task3;

public class Printer<T extends Number> {

    private NumberGenerator<T> numberGenerator;
    private SumCalculator<T> sumCalculator;

    public Printer(NumberGenerator<T> numberGenerator) {
        this.numberGenerator = numberGenerator;
        this.sumCalculator = numberGenerator.getSumCalculator();
    }

    public void generateAndPrint() {
        T[] arrayNumbers = numberGenerator.generateNumbers();
        System.out.println(sumCalculator.calculateSum(arrayNumbers));
    }

}
