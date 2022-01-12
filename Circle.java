package abstraction;

import java.awt.geom.Area;

public class Circle extends Shape{
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius= radius;
    }
    double area(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle color is "+super.color+
                " Area is "+ area;
    }

    public static void main(String[] args) {
        Circle yanu = new Circle("red", 9);

        yanu.getColor();
        System.out.println(yanu.toString());
    }
}
