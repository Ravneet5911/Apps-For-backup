import java.util.Scanner;
public class FibbonacciSeries {
    public static void main(String[] args)
    {
        int a=0, b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.print(a+" "+b+" ");
        do{
            int temp;
            temp = a+b;
            System.out.print(temp + " ");
            a=b;
            b=temp;
            num--;
        }while(num!=2);

    }
}
