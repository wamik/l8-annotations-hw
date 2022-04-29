package kz.halyk;

import kz.halyk.annotations.ArithmeticAnnotation;
import kz.halyk.enums.Operation;

public class ShapeInfo {

    public void getSquareOf(Shape shape) {

        Class<? extends Shape> shapeClass = shape.getClass();

        if (shapeClass.isAnnotationPresent(ArithmeticAnnotation.class)) {
            ArithmeticAnnotation annotation = shapeClass.getAnnotation(ArithmeticAnnotation.class);

            if (!annotation.isCorrect()) {
                Operation operation = annotation.correctOperationToApply();
                var correctArea = operation.action(shape.getLength(), 10);

                System.out.println("Area: " + correctArea);
            } else
                shape.square();
        } else
            shape.square();
    }

    public static void main(String[] args) {
        Shape shape = new Shape(2);
        Rectangle rectangle = new Rectangle(2, 5);

        ShapeInfo shapeInfo = new ShapeInfo();

        shapeInfo.getSquareOf(shape);
        shapeInfo.getSquareOf(rectangle);
    }
}
