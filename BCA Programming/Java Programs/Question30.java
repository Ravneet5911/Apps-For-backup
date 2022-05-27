class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent class (Exception)
        super(s);
    }
}

public class Question30 {
    public static void main(String args[])
    {
        try {
            throw new MyException("User defined Exception");
        }
        catch (MyException ex) {
            System.out.println("Exception Caught");
            System.out.println(ex.getMessage());
        }
    }
}
