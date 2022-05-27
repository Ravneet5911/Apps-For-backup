import java.io.IOException;


public class implementTryCatchEtc {
    public static void main(String[] args) throws IOException
    {
       try {
           throw new IOException();
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
       finally {
           System.out.println("The Exception is Handled");
       }
    }
    
}
