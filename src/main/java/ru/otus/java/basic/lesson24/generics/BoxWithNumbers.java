package ru.otus.java.basic.lesson24.generics;

public class BoxWithNumbers<N extends Number> {
    private N[] numbers;

    public BoxWithNumbers(N... numbers) {
        this.numbers = numbers;
    }

    public boolean compareByAvg(BoxWithNumbers<?> another) {
        return Math.abs(this.avg() - another.avg()) < 0.0001;
    }

    public double avg() {
        double result = 0.0;
        for (N n : numbers) {
            result += n.doubleValue();
        }
        return result / numbers.length;
    }
}
