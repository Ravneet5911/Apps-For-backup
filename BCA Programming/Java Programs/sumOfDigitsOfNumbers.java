import java.util.Scanner;
public class sumOfDigitsOfNumbers {
    public static void main(String[] args)
    {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        while(num!=0) {
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println(sum);
    }
}
