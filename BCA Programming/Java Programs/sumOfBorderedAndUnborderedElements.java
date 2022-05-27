public class sumOfBorderedAndUnborderedElements {
    public static void main(String[] args)
    {
        int BorderedSum = 0, innerSum = 0;
        int a[][] = {{23, 34, 54}, 
                     {21, 42, 55}, 
                     {29, 63, 76}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i==0 || i==a.length - 1 || j==0 || j==a.length-1) {
                    BorderedSum = BorderedSum + a[i][j];
                }
                else {
                    innerSum = innerSum + a[i][j];
                }
            }
        }
        System.out.println("Sum of Bordered Elements is " + BorderedSum);
        System.out.println("Sum of Non Bordered Elements is " + innerSum);
    }
}
