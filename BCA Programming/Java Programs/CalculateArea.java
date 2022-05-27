package Circle;
public class CalculateArea {
    
    public static void main(String[] args)
    {
        CalculateArea obj = new CalculateArea();
        obj.Area(4);
    }

    public double Area(double r) {
        double area = 3.14*r*r;
        return area;
    }
}
