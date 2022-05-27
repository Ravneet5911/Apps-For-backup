import java.util.Scanner;
public class SumOfCubesOfRange {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range:");
        System.out.print("Starting Range:- ");
        int strRange = sc.nextInt();
        System.out.print("Ending Range:- ");
        int endRange = sc.nextInt();
        
        int sum = 0;
        for (int i = strRange; i <= endRange; i++) {
            sum = sum + (i*i*i);
        }
        System.out.println("Sum of Cubes is " + sum);
    }
}
