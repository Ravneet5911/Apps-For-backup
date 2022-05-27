
final class Final {     //We can not change the content of this class by inheriting the class.
    final public void fun() { //We can not change the content of this method by overriding it.
        final int i = 2; // We can not change the value of this variable
        System.out.println("This Program is to implement the Final Keyword");
    }
}

public class ImplementFinal {
    public static void main(String[] args)
    {
        Final obj = new Final();
        obj.fun();
    }
}
