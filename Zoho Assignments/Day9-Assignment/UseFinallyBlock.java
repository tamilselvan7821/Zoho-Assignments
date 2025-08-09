/*
Create a program where the try block contains a return statement. Ensure that the finally block executes before the
method returns. Show this with output
*/
public class UseFinallyBlock{
    private static int sentMethod(int value){
        try {
            System.out.println("try block ");
            value/=0;
            return value;
        } catch (Exception e) {
            return value;
        }
        finally{
            System.out.println("finally block");
        }
    }
    public static void main(String[] args) {
        int value=100;
        System.out.println("Result is : "+sentMethod(value));
    }
}