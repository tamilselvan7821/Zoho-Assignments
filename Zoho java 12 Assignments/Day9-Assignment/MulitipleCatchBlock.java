/*
Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform
division, and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException
and Exception.
*/
import java.util.InputMismatchException;
import java.util.Scanner;
public class MulitipleCatchBlock{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        try{
            System.out.print("Enter the first no : ");
            int a=scan.nextInt();scan.nextLine();
            System.out.print("Enter the second no : ");
            String b=scan.nextLine();
            int c=a/Integer.parseInt(b);
            char result=b.charAt(1);//normally exception handle in index out of bounds 
        }
        catch(InputMismatchException e){
            System.out.println("Input Mis Match Exception");
            e.getMessage();
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException");
            e.getMessage();
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
            e.getMessage();
        }
        catch(Exception e){
            System.out.println("Exception");
            e.getMessage();
        }
    }
}