class Student {
    private String name;
    private int age, id;

    public void getValues(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void Display() {
        System.out.println("Values of Given Data is");
        System.out.println("Name:- "+name);
        System.out.println("Age:- "+age);
        System.out.println("Id:- "+id);
    }
}

public class ImplementThis {
    public static void main(String[] args)
    {
        Student obj = new Student();
        obj.getValues("Ravneet", 20, 3);
        obj.Display();
    }
}
