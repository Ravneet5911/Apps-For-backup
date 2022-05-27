import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        int a[] = {23, 34, 21, 2, 8, 56, 12, 44, 51};
        System.out.println("Enter the element that you want to Search");
        int element = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if(a[i]==element){
                flag = 1;
                System.out.println("The element "+a[i]+" found at "+(i+1)+" position");
                break;
            }
        }
        if (flag==0) {
            System.out.println("Element not found! Try Again");
        }
    }
}
