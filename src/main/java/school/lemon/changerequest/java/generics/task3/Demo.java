package school.lemon.changerequest.java.generics.task3;

public class Demo {

    public static void main(String[] args) {
        DoubleNumberGenerator doubleGenerator = new DoubleNumberGenerator();
        Printer<Double> doublePrinter = new Printer<>(doubleGenerator);
        doublePrinter.generateAndPrint();

        IntegerNumberGenerator integerGenerator = new IntegerNumberGenerator();
        Printer<Integer> integerPrinter = new Printer<>(integerGenerator);
        integerPrinter.generateAndPrint();
    }

}
