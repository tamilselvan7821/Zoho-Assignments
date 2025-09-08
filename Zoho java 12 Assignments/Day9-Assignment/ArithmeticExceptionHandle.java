/*
int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution
*/
public class ArithmeticExceptionHandle{
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 0, 7};
        int quotient;
        try{
            quotient = arr[7] / arr[4];
            //you print the quotient throw the runtime exception
            System.out.println("Result is : "+quotient);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //try and catch to handles any unexpected situations that may arise during execution
    }
}