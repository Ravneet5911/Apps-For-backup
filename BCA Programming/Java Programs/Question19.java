class Dimension {
    private float length, width, height;

    Dimension() {
        System.out.println("Welcome To The Program");
    }

    Dimension(float l, float w, float h) {
        length = l;
        width = w;
        height = h;
    }

    public float calculateVolume() {
        float volume = length * width * height;
        return volume;
    }

    public float calculateVolume(float l, float w, float h) {
        float volume = l * w * h;
        return volume;
    }
}

public class Question19 {
    public static void main(String[] args)
    {
        Dimension obj = new Dimension();
        Dimension obj1 = new Dimension(5, 6, 7);
        System.out.println("Volume is "+obj1.calculateVolume()+" and Calculated with non Parameterized method"); 
        System.out.println("Volume is "+obj.calculateVolume(2, 3, 8)+" and Calculated with Paramenterized method");
    }
}
