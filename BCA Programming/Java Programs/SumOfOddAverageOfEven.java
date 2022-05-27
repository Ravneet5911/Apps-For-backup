import java.util.Scanner;
public class SumOfOddAverageOfEven {
    public static void main(String[] args)
    {
        int arr[] = new int[10];
        double average = 0, noOfEven = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the Array:- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]%2 == 0) {
                average = average + arr[j];
                noOfEven++;
            }
            else {
                sum = sum + arr[j];
            }
        }
        double finalAverage = average/noOfEven;
        System.out.println("Average of Even numbers is:- "+finalAverage);
        System.out.println("Sum of odd numbers is:- "+sum);
    }
}
