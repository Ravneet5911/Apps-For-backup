import java.util.Scanner;
public class SumOfTheArray {
    public static void main(String[] args)
    {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements of the array");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of the elements of the array is " + sum);
    }
}
