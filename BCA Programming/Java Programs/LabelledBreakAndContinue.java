public class LabelledBreakAndContinue {
    public static void main(String[] args)
    {
        first:
        for (int i = 0; i < 3; i++) {  //i=2
        // Second label
        second:
            for (int j = 0; j < 3; j++) {  //j=1
                if (i == 1 && j == 1) {
                    // Using break statement with label
                    break first;
                }

                if(i==2){
                    // Using continue statement with label
                    continue second;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
