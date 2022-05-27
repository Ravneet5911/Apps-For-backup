import java.util.Scanner;
public class NameClassAge {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Enter your Age");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your Class");
        String Standard = sc.nextLine();
        System.out.println("Enter your Designation");
        String designation = sc.nextLine();
        System.out.println("Your Details:- ");
        System.out.println("Name:- "+name+"\nAge:- "+age+"\nClass:- "+Standard+"\nDesignation:- "+designation);
    }
}
