import java.util.Scanner;
public class WelcomeMessage {
    public static void main(String[] args)
    {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Welcome "+name);
    }
}