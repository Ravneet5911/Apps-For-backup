class Static {
    static int i = 0;
    static void fun() {
        System.out.println("Hello World");
    }
}

public class ImplementStatic {
    public static void main(String[] args)
    {
        Static.i = 23;
        System.out.println(Static.i); // Static variable can be called from class name and do not dependent on an object.
        Static.fun(); // As Static variable the methods also don't need to be dependent on an objects and can be invokes from the class name.
    }
}
