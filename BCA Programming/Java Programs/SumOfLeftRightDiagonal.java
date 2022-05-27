public class SumOfLeftRightDiagonal {
    public static void main(String[] args)
    {
        int leftDiagonalSum = 0, rightDiagonalSum = 0;
        int a[][] = {{23, 34, 54}, 
                     {21, 42, 55}, 
                     {29, 63, 76}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i==j) {
                    leftDiagonalSum = leftDiagonalSum + a[i][j];
                }
                if(i+j == a.length-1) {
                    rightDiagonalSum = rightDiagonalSum + a[i][j];
                }
            }
        }
        System.out.println("Sum of Right Diagonal matrix is "+rightDiagonalSum);
        System.out.println("Sum of Left Diagonal matrix is "+leftDiagonalSum);
    }
}
