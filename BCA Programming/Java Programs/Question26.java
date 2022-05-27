abstract class Figure {
    abstract double Area(double length, double breadth);
}
class Rectangle extends Figure {
    
    @Override
    double Area(double length, double breadth) {
        return length*breadth;
    }
}
class Triangle extends Figure {

    @Override
    double Area(double base, double height) {
        return base * height;
    }
}

public class Question26 {
    public static void main(String[] args)
    {
        Figure obj = new Rectangle();
        Figure obj1 = new Triangle();
        System.out.println("The area of Rectangle is "+obj.Area(3, 4)); 
        System.out.println("The area of Triangle is "+obj1.Area(5, 6));
    }
}
