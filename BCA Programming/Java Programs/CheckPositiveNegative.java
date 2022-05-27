import java.util.Scanner;

import java.util.Scanner;
public class CheckPositiveNegative {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num>0 && num%2==0) {
            System.out.println("Positive Even");
        }
        else if(num<0 && num%2!=0) {
            System.out.println("Negative odd");
        }
        else if(num>0 && num%2!=0) {
            System.out.println("Positive odd");
        }
        else {
            System.out.println("Negative Even");
        }
    }
}
