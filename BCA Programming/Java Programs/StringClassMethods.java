public class StringClassMethods {
    public static void main(String[] args)
    {
        String course = "Bachelors of Computer Application";
        System.out.println("Character at position 5 is " + course.charAt(5));
        System.out.println("Unicode of the Character at Position 5 is " + course.codePointAt(5));
        System.out.println("Number of Characters in the String is " + course.length());
        System.out.println("Converted String to Lower Case Characters is " + course.toLowerCase());
        System.out.println("Converted String to Upper Case Characters is " + course.toUpperCase());
    }
}
