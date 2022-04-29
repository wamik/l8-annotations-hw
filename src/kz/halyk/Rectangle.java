package kz.halyk;

public class Rectangle extends Shape {

    private double width;

    public Rectangle(double length, double width) {
        super(length);
        this.width = width;
    }

    public void square(){
        System.out.println(super.getLength() * width);
    }

}
