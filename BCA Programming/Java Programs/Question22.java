class Area {
    public void area(){

    }
}
class AreaOfRectangle {
    public void area() {
        double length=5, width=8, area;
        area = length*width;
        System.out.println("Area of Rectangle is "+area);
    }
}
class AreaOfCircle {
    public void area() {
        double pi=3.14, r=6, area;
        area = pi*r*r;
        System.out.println("Area of Circle is "+area);
    }
}
public class Question22 {
    public static void main(String[] args)
    {
        AreaOfRectangle rect = new AreaOfRectangle();
        AreaOfCircle cir = new AreaOfCircle();
        rect.area();
        cir.area();
    }
}
