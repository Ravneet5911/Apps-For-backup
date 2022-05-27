public class InsertionSort {
    public static void main(String[] args)
    {
        int a[] = {23, 34, 21, 2, 8, 56, 12, 44, 51};
        int temp, j;
        for(int i=1; i<a.length; i++)
        {
            temp = a[i];
            j=i;
            while(j>0 && a[j-1]>temp)
            {
                a[j] = a[j-1];
                j -= 1;
            }
            a[j] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
