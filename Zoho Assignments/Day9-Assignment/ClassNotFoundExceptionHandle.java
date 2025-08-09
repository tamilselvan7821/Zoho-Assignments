/*
Write a program to illustrate how to throw a ClassNotFoundException.
*/
public class ClassNotFoundExceptionHandle{
    public static void main(String[] args) {
        try {
            //compile time your file name type wrongly throw FileNotFoundException
            Class.forName("Myclass");
        } catch (ClassNotFoundException e) {
            System.out.println("throw class not found exception");
        }
    }
}