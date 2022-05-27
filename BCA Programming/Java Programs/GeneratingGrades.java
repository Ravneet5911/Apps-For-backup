import java.util.Scanner;
public class GeneratingGrades {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers");
        Double numbers = sc.nextDouble();
        if(numbers > 50 && numbers < 60) {
            System.out.println("Your grades is D");
        }
        else if(numbers > 60 && numbers < 70) {
            System.out.println("Your grades is C");
        }
        else if(numbers > 70 && numbers < 80) {
            System.out.println("Your grades is B");
        }
        else if(numbers > 80 && numbers < 90) {
            System.out.println("Your grades is A");
        }
        else {
            System.out.println("Your grades is A+");
        }

    }
}
