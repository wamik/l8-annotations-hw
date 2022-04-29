package kz.halyk;


import kz.halyk.annotations.ArithmeticAnnotation;
import kz.halyk.enums.Operation;

@ArithmeticAnnotation(isCorrect = false, correctOperationToApply = Operation.MULTIPLY)
public class Shape {
    private double length;

    public Shape(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void square() {
        System.out.println(length * 2);
    }
}
