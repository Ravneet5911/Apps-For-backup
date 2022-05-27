class SuperClass {
    int num = 5;
    SuperClass() {
        System.out.println("Welcome in the Contructor of SuperClass");
        System.out.println("The value of the num variable is "+num+" in the SuperClass");
    }
}
class SubClass extends SuperClass {
    SubClass() {
        super();
        super.num = 50;
        System.out.println("The value of the num variable is "+super.num+" in the SubClass");
    }
}
public class ImplementSuper {
    public static void main(String[] args)
    {
        SubClass obj = new SubClass();
    }
}
