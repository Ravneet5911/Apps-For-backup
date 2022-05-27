class Box {
    int height=5, width=6;
}

class BoxWeight extends Box {
    int weight=4;
    public void volume(){
        int volume = height*weight*width;
        System.out.println("The volume of the Box is "+volume);
    }
}
public class VolumeOfTheBox {
    public static void main(String[] args)
    {
        BoxWeight obj = new BoxWeight();
        obj.volume();
    }
}
