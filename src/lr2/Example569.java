package lr2;

import java.lang.Math;



interface IArea {
    public double area();
}

interface IPerimeter {
    public double perimeter();
}


abstract class Shape implements IArea, IPerimeter {}


class _Rectangle extends Shape {
    protected double _width;
    protected double _height;
    
    public _Rectangle(double width, double height) {
        this._width = width;
        this._height = height;
    }
    
    public double area() {
        return this._width * this._height;
    }
    
    public double perimeter() {
        return (this._width + this._height) * 2;
    }

    public double getWidth() {
        return this._width;
    }
    
    public double getHeight() {
        return this._height;
    }

}


class Rectangle extends _Rectangle {
    public Rectangle(double width, double height) {
        super(width, height);
    }

    public void setWidth(double width) {
        this._width = width;
    }

    public void setHeight(double height) {
        this._height = height;
    }

}


class Square extends _Rectangle {
    public Square(double sideSize) {
        super(sideSize, sideSize);
    }
}

class Triangle extends Shape {
    private double _l1;
    private double _l2;
    private double _l3;
    
    public Triangle(double l1, double l2, double l3) {
        this._l1 = l1;
        this._l2 = l2;
        this._l3 = l3;
    }
    
    public double area() {
        double halfPerimeter = this.perimeter() / 2;
        double calculate = halfPerimeter*(halfPerimeter - this._l1)*(halfPerimeter - this._l2)*(halfPerimeter - this._l3);
        return Math.sqrt(calculate);
    }
    
    public double perimeter() {
        return this._l1 + this._l2 + this._l3;
    }
    
}



class Circle extends Shape {
    private double _radius;
    
    public Circle(double radius) {
        this._radius = radius;
    }
    
    public double area() {
        return Math.PI * Math.pow(this._radius, 2);
    }
    
    public double perimeter() {
        return 2 * Math.PI * this._radius;
    }
}


public class Example569
{
	public static void main(String[] args) {

        Rectangle rect = new Rectangle(34.0, 45.0);
        System.out.printf("Rectangle - area: %f, perimeter: %f\n", rect.area(), rect.perimeter());
        rect.setHeight(9);
        rect.setWidth(9);
        System.out.printf("Height: %f. Width: %f\n", rect.getHeight(), rect.getWidth());


        Square square = new Square(34.0);
        System.out.printf("Rectangle - area: %f, perimeter: %f\n", square.area(), square.perimeter());

        Triangle triangle = new Triangle(34.0, 45.0, 56.0);
        System.out.printf("Rectangle - area: %f, perimeter: %f\n", triangle.area(), triangle.perimeter());

        Circle circle = new Circle(34.0);
        System.out.printf("Rectangle - area: %f, perimeter: %f\n", circle.area(), circle.perimeter());
    }
}