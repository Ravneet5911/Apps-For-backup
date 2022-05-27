import java.util.Scanner;
public class Fibbonacci {
    public static void main(String[] args)
    {
        int result = 1;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do {
            result = result * num;
            num--;
        }while(num!=0);
        System.out.println(result);
    }
}
