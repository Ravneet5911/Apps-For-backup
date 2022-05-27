import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args)
    {
        int rem[] = new int[40];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = 0;
        while(num>0){
            rem[temp++] = num%2;
            num = num/2;
        }
        for (int j = temp - 1; j >= 0; j--) {
            System.out.print(rem[j]);
        }
    }

}
