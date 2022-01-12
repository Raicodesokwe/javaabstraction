package abstraction;

public class Rectangle extends Shape {
    double length, width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    double area(){
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle color" + super.color+
                " And area of rectangle is " + area();
    }

    public static void main(String[] args) {
        Rectangle farm=new Rectangle("Green",41,34.5);
        System.out.println(farm.toString());
    }
}

